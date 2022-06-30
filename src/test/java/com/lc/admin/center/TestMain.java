package com.lc.admin.center;

import com.lc.admin.center.util.StringModUtils;

import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.TreeSet;

import enums.ArgsExceptionEnum;
import excp.ArgumentException;

/**
 * @author: lucheng
 * @data: 2021/11/29 14:08
 * @version: 1.0
 */
public class TestMain {
    public static void main(String[] args) {
//        TreeSet<Integer> treeSet = new TreeSet<>(new MyComparator());
//        treeSet.add(1);
//        treeSet.add(4);
//        treeSet.add(3);
//        treeSet.add(2);
//        System.out.println(StringModUtils.validateEmail("L1@12.cn"));
//        System.out.println(StringModUtils.validateEmail("L1@qq.com"));
//        System.out.println(StringModUtils.validateEmail("L1@mail.bnu.edu.cn"));
//        System.out.println(StringModUtils.validateEmail("L1"));

        String var1 = "Lucheng";
        String var2 = "Lc.970313";
        int result = var1 != null ? var1.hashCode() : 0;
        result = 31 * result + (var2 != null ? var2.hashCode() : 0);
        byte[] codeBytes = (var2 + Integer.toHexString(result)).getBytes();

        //byte对数组进行加密
        try {
            new String(codeBytes,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 == null) {
            throw new ArgumentException(ArgsExceptionEnum.NOT_NULL.getMessage());
        }
        return o1.compareTo(o2);

    }
}
