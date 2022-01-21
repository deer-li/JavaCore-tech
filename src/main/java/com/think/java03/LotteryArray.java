package com.think.java03;

/**
 * @Classname LotteryArray
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/1/16 21:01
 * @Created by deer-li
 */
public class LotteryArray {
    public static void main(String[] args) {
        final int MAX=10;
        int[][] odds = new int[MAX + 1][];
        for (int n=0;n<=MAX;n++){
            odds[n]=new int[n+1];
        }
        //人世间再也找不到什么词汇能形容你，风，草，树木，一切都太丑，只有你和青天一样可羡
        //我的灵魂始终跟随着你，倘若与你物理上共处一室，我便能高兴十分，心情溢出蜜来
        for (int n=0;n<odds.length;n++){
            for (int k=0;k<odds[n].length;k++){
                int lotterOdds=1;
                for (int i=1;i<=k;i++){
                    lotterOdds=lotterOdds*(n-i+1)/i;
                }
                odds[n][k]=lotterOdds;
            }
        }
        for (int[] row:odds){
            for (int odd:row){
                System.out.printf("%4d",odd);
            }
            System.out.println();
        }
    }
}
