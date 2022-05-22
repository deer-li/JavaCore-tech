package com.think1.java08.genericReflection;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
/**
 * @Classname TypeLiterals
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/29 18:14
 * @Created by deer-li
 */
public class TypeLiterals {
    public static void main(String[] args) throws IllegalAccessException {
        Formatter formatter = new Formatter();
        formatter.forType(new TypeLiteral<ArrayList<Integer>>(){},
            lst->join("",lst));
        formatter.forType(new TypeLiteral<ArrayList<Character>>(){},
            lst->"\""+join("",lst)+"\"");
        System.out.println(formatter.formatFields(new Sample()));
    }
    public static class Sample{
        ArrayList<Integer> nums;
        ArrayList<Character> chars;
        ArrayList<String> strings;
        public Sample(){
            nums=new ArrayList<>();
            nums.add(42);
            nums.add(1729);
            chars=new ArrayList<>();
            chars.add('H');
            chars.add('i');
            strings=new ArrayList<>();
            strings.add("Hello");
            strings.add("World");
        }
    }
    private static <T> String join(String separator,ArrayList<T> elements){
        StringBuilder result = new StringBuilder();
        for (T e:elements){
            if (result.length()>0){
                result.append(separator);
            }
            result.append(e.toString());
        }
        return  result.toString();
    }
}
class Formatter{
    private Map<TypeLiteral<?>,Function<?,String>> rules=new HashMap<>();
    public <T> void forType(TypeLiteral<T> type,Function<T,String> formatterForType){
        rules.put(type,formatterForType);
    }
    public String formatFields(Object obj) throws IllegalAccessException {
        StringBuilder result = new StringBuilder();
        for (Field f: obj.getClass().getDeclaredFields()){
            result.append(f.getName());
            result.append("=");
            f.setAccessible(true);
            Function<?,String> formatterForType=rules.get(TypeLiteral.of(f.getGenericType()));
            if (formatterForType !=null){
                @SuppressWarnings("unchecked")
                Function<Object,String> objectFormatter=(Function<Object,String>)formatterForType;
                result.append(objectFormatter.apply(f.get(obj)));
            }else {
                result.append(f.get(obj).toString());
            }
            result.append("\n");
        }
        return  result.toString();
    }
}
class TypeLiteral<T>{
    private Type type;
    public TypeLiteral() {
        Type parentType = getClass().getGenericSuperclass();
        if (parentType instanceof ParameterizedType){
            type=((ParameterizedType)parentType).getActualTypeArguments()[0];
        }else {
            throw new UnsupportedOperationException("Construct as new TypeLiteral<...>(){}");
        }
    }
    private TypeLiteral(Type type){
        this.type=type;
    }
    public static TypeLiteral<?> of(Type type){
        return  new TypeLiteral<Object>(type);
    }
    public String toString(){
        if (type instanceof Class){
            return  ((Class<?>) type).getName();
        }else{
            return  type.toString();
        }
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof TypeLiteral && type.equals(((TypeLiteral<?>)obj).type);
    }
    public int hashcode(){
        return type.hashCode();
    }
}
