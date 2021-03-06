package com.think1.java05.objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/**
 * @Classname ObjectAnalyzer
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/11 15:18
 * @Created by deer-li
 */
public class ObjectAnalyzer {
    private ArrayList<Object> visited= new ArrayList<>();
    public String toString(Object obj) throws ReflectiveOperationException{
        if (obj==null){
            return "null";
        }
        if (visited.contains(obj)){
            return "…";
        }
        visited.add(obj);
        Class cl = obj.getClass();
        if (cl==String.class){
            return (String) obj;
        }
        if (cl.isArray()){
            String r=cl.getComponentType()+"[]{";
            for (int i=0;i< Array.getLength(obj);i++){
                if (i>0){
                    r+=",";
                }
                Object val = Array.get(obj, i);
                //getComponentType()返回类元素类型
                //isPrimitive（）判断类中元素类型是不是基本类型
                if (cl.getComponentType().isPrimitive()){
                    r+=val;
                }else {
                    r+=toString(val);
                }
            }
            return r+"}";
        }
        String r=cl.getName();
        do{
            r+="[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);
            for (Field f:fields){
                if (!Modifier.isStatic(f.getModifiers())){
                    if (!r.endsWith("[")){
                        r+=",";
                    }
                    r+=f.getName()+"=";
                    Class t = f.getType();
                    Object val = f.get(obj);
                    if (t.isPrimitive()){
                        r+=val;
                    }else {
                        r+=toString(val);
                    }
                }
            }
            r+="]";
            cl=cl.getSuperclass();
        }while (cl!=null);
        return  r;
    }
}
