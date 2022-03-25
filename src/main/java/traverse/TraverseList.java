package traverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname TraverseList
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/3/25 10:27
 * @Created by deer-li
 */
//遍历list的几种方式
//list的特点就是集合中元素有顺序，然后可以重复，元素索引从0开始
public class TraverseList {
    public static void main(String[] args) {
        //创建一个arrayList对象，并上溯到list接口，这样声明的list1对象可以使用
        //list中特有的方法，但是不能用arraylist中有而list中没有的方法
        //抽象类的引用不能调用子类独有的方法
        List<String> list1 = new ArrayList<String>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        for (String a:list1) {//①for-each
            System.out.println(a);
        }
        //②先把list转换成数组
        String[] listString = new String[list1.size()];
        String[] listString2 = list1.toArray(listString);
        for (String str:listString2){
            System.out.println(str);
        }
        //③ 使用迭代器去遍历
        Iterator<String> item = list1.iterator();
        while (item.hasNext()){
            System.out.println(item.next());
        }
    }
}
