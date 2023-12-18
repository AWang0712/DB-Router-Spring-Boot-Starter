package com.allanwang.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * @description: DBRouterStrategy
 * @date: 2023/9/14 11:07
 * @version: V1.0
 * @author Allan
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;

}