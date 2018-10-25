package com.example.demo.validateTest.validation.impl;


import com.example.demo.validateTest.validation.ScopeEnum;
import org.springframework.util.ObjectUtils;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * <pre>
 *  created by shaoh on 2018/1/2,11:55
 *  package name:com.dpzx.dcw.common.validation.impl
 *     file name:ScopeEnumValidator
 *  project name:dpzx_dcw
 * </pre>
 *
 * @author shaoh
 * @version 0.1
 * @date 2018/1/2,11:55
 * @description
 */
@SuppressWarnings("all")
public class ScopeEnumValidator implements ConstraintValidator<ScopeEnum, Integer> {

    private boolean required = false;

    private int[] value;

    @Override
    public void initialize(ScopeEnum em) {
        this.value = em.value();
        this.required = em.required();
    }

    @Override
    public boolean isValid(Integer s, ConstraintValidatorContext constraintValidatorContext) {
        if (required && ObjectUtils.isEmpty(s)) {
            return false;
        }

        if (value == null || value.length < 1) {
            return false;
        }

        boolean succ = false;
        if (s != null) {
            for (int i = 0; i < value.length; i++) {
                if (value[i] == (s)) {
                    succ = true;
                    break;
                }
            }
        } else {
            succ = true;
        }

        return succ;
    }
}
