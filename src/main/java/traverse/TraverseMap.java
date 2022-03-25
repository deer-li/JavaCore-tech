package traverse;

import java.util.*;

/**
 * @Classname TraverseMap
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/3/25 10:27
 * @Created by deer-li
 */
//遍历map也有几种方式，Map的特点就是数据没顺序，是以键值对的方式来存放数据，取值也是根据key来取值

public class TraverseMap {
    public static void main(String[] args) {
        //Map的三个实现类中，hashMap是无序的，而TreeMap和LinkedHashMap都是有序的
        Map<String, String> map1 = new LinkedHashMap<String, String>();
        map1.put("1","zhang");
        map1.put("2","wang");
        map1.put("3","zhao");
        //①常用的遍历方式,遍历key值
        for (String key:map1.keySet()) {
            System.out.println("key"+key+" :"+map1.get(key));
        }
        //②通过Map.entrySet使用iterator遍历key和value
        Iterator<Map.Entry<String, String>> it = map1.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> en = it.next();
            System.out.println("key="+en.getKey()+" and value="+en.getValue());
        }
        //③ 通过Map.entrySet遍历key和value
        for (Map.Entry<String,String> ens:map1.entrySet()) {
            System.out.println("key="+ens.getKey()+" and value="+ens.getValue());
        }
        //④ 通过Map.values()遍历所有的value，但是不能遍历key
        for (String v:map1.values()) {
            System.out.println("value="+v);
        }

    }

}
