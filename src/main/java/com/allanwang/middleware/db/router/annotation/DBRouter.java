package com.allanwang.middleware.db.router.annotation;

import java.lang.annotation.*;


/**
 * @description: router annotation
 * @date: 2023/9/21 10:00
 * @author Allan
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {

    /** sharding key, default is empty, means use the first parameter as sharding key
     **/
    String key() default "";

}
