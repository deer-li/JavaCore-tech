package com.think1.java02;

//展示打印出从命令行获得的三个参数。为此，现需要确定命令行数组中String的下标
//命令行就是再java编译和运行的时候加进去的，如
// javac SystemIn.java
// javac SystemIn tes1,tes2,tes3(三个参数)
public class SystemIn {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
    }
    }
}
