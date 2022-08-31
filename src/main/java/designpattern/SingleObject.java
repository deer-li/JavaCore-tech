package designpattern;

/**
 * @Classname SingleObject
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/3/11 10:01
 * @Created by deer-li
 * @author deer-li
 */

public class SingleObject {
    public static SingleObject instance=new SingleObject();


    private SingleObject(){

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
