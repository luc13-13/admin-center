package com.lc.admin.center.util;

import org.apache.ibatis.javassist.bytecode.ByteArray;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.util.StringUtils;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * @author: lucheng
 * @data: 2021/12/12 15:23
 * @version: 1.0
 */
public class Md5Utils {
    private static final String ENCODING_TYPE = "UTF-8";

    /**
     * 将两个字符串进行拼接再加密，加密方式为md5
     * @param var1 默认为 userName
     * @param var2 默认为 pwd
     * @return
     */
    public static String encrypt(String var1, String var2) {
        //TODO 将var1和var2通过md5方式加密
        if(!StringUtils.hasText(var1)) {
            throw new IllegalArgumentException("userName cannot be null or empty");
        } else {
            if (!(StringUtils.hasText(var2))) {
                throw new IllegalArgumentException("pwd cannot be null or empty");
            }
        }
        // 1)将username和pwd的hashcode进行一次运算得到result
        int result = var1 != null ? var1.hashCode() : 0;
        result = 31 * result + (var2 != null ? var2.hashCode() : 0);

        // 2)将result(整数)，pwd(字符串)，选择加密类型进行加密，得到char数组
        byte[] codeBytes = (var2 + Integer.toHexString(result)).getBytes();
        return new String(encode(codeBytes,ENCODING_TYPE));
    }

    private static char[] encode(byte[] bytes,String charsetName) {
        int l = bytes.length;
        char[] out = new char[l];
        // 将 byte[] 数组转为 char[] 数组，并对char[i]*12
        // 1)设置编码格式
        Charset cs = Charset.forName(charsetName);
        // 2)将创建byteBuffer并将bytes放入byteBuffer中
        ByteBuffer bb = ByteBuffer.allocate(l);
        bb.put(bytes).flip();
        CharBuffer cb = cs.decode(bb);
        out = cb.array();
        for(int var3 = 0; var3 < l; var3 ++) {
            //TODO 升级更安全的加密方式
            out[var3] = (char) (out[var3] + 16);
        }
        return out;
    }
}
