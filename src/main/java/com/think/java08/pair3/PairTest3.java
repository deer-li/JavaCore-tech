package com.think.java08.pair3;

import com.think.java05.equals.Employee;
import com.think.java05.equals.Manager;
import com.think.java08.pair1.Pair;

/**
 * @Classname PairTest3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/24 16:20
 * @Created by deer-li
 */
public class PairTest3 {
    public static void main(String[] args) {
        Manager ceo = new Manager("deer", 90000, 2000, 11, 10);
        Manager cfo = new Manager("deer-li", 90000, 2000, 11, 11);
        Pair<Manager> buddies = new Pair<Manager>(ceo,cfo);
        printBuddies(buddies);

        ceo.setBonus(100000);
        cfo.setBonus(5000000);
        Manager[] managers={ceo,cfo};
        Pair<Employee> result = new Pair<>();
        minmax(managers,result);
        System.out.println("first "+result.getFirst().getName()+",second:"+result.getSecond().getName());
        maxminBonus(managers,result);
        System.out.println("first "+result.getFirst().getName()+",second:"+result.getSecond().getName());

    }

    private static void maxminBonus(Manager[] managers, Pair<? super Manager> result) {
        minmax(managers,result);
        PairAlg.swapHelper(result);
    }

    private static void minmax(Manager[] managers, Pair<? super Manager> result) {
        if (managers.length==0) return;
        Manager min=managers[0];
        Manager max=managers[0];
        for (int i=1;i<managers.length;i++){
            if (min.getBonus()>managers[i].getBonus()) min=managers[i];
            if (max.getBonus()<managers[i].getBonus()) max=managers[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }
    private static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName()+" and "+second.getName()+" are buddies");
    }

}
class PairAlg{
    public static boolean hasNulls(Pair<?> p){
        return p.getFirst()==null||p.getSecond()==null;
    }
    public static void swap(Pair<?> p){
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p) {
        T t=p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
