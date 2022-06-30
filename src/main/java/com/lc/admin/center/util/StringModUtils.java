package com.lc.admin.center.util;

import org.springframework.util.StringUtils;

/**
 * @author: lucheng
 * @data: 2021/12/21 15:05
 * @version: 1.0
 */
public class StringModUtils {
    // 登陆字符串的格式：仅包含字母和数字,长度范围为 3-64
    private static final String USERNAME_PATTERN = "^[a-z0-9A-Z]{3,64}$";
    /**
     * 邮箱格式
     * \w+@ : @前可以有若干个大小写字母和数字,长度为1-16
     * @([a-z]+\.){1,3} : 表示@后至少有一个、至多有三个 ‘小写字母.’ 的格式，且每一个小写字母串长度不超过16
     *                   例如 username@mail.com uname@mail.qq.com uname@mail.qq.ed.com
     * c(om|n)$: 必须以com或cn结尾
     */
    private static final String EMAIL_PATTERN = "^\\w{1,16}@([a-z]{1,16}\\.){1,3}c(om|n)$"; //"^[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}$ ";

    /**
     * 校验字符串 str 中仅包含数组 和字母
     * @param str
     * @return
     */
    public static boolean validateEnglish(String str) {
        if(StringUtils.hasLength(str)) {
            return str.matches(USERNAME_PATTERN);
        }
        return false;
    }

    public static boolean validateEmail(String email) {
        if(StringUtils.hasLength(email)) {
            return email.matches(EMAIL_PATTERN);
        }
        return false;
    }
}
