package com.lc.admin.center;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author: lucheng
 * @data: 2021/11/29 14:08
 * @version: 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new MyComparator());
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);
    }

}
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
