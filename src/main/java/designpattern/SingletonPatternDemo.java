package designpattern;

/**
 * @Classname SingletonPatternDemo
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/3/11 10:00
 * @Created by deer-li
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
