package com.monkey.monkeyValidator.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Author: LailaiMonkey
 * @Description：验证最小值不能为value值，不包括value
 * @Date：Created in 2020-04-12 15:16
 * @Modified By：
 */
@Documented
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface MonkeyMin {

    /**
     * 提示信息
     * @return
     */
    String message() default "最小不能小于";

    /**
     * 最小值
     * @return
     */
    long value();

    /**
     * 不为Null则校验
     * @return
     */
    boolean nullable() default false;
}
