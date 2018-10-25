package com.example.demo.validateTest.validation;



import com.example.demo.validateTest.validation.impl.ScopeEnumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <pre>
 *  created by shaoh on 2018/1/2,11:54
 *  package name:com.dpzx.dcw.common.validation
 *     file name:ScopeEnum
 *  project name:dpzx_dcw
 * </pre>
 *
 * @author shaoh
 * @version 0.1
 * @date 2018/1/2,11:54
 * @description
 */
@Target( {METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ScopeEnumValidator.class})
public @interface ScopeEnum {

    //默认错误消息
    String message() default "取值有误";


    //分组
    Class<?>[] groups() default {};


    //是否必须
    boolean required() default false;


    int[] value();


    //负载
    Class<? extends Payload>[] payload() default {};


    //指定多个时使用
    @Target( {FIELD, METHOD, PARAMETER, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List {

        ScopeEnum value();
    }

}