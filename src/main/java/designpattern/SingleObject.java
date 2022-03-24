package designpattern;

/**
 * @Classname SingleObject
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/3/11 10:01
 * @Created by deer-li
 */

public class SingleObject {
    public static SingleObject instance=new SingleObject();

    //构造函数私有化，防止该类被实例化
    private SingleObject(){

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
