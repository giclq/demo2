package com.example.demo.validateTest;



import com.example.demo.validateTest.validation.ScopeEnum;

import javax.validation.constraints.NotNull;

/**
 * <pre>
 *  created by shaoh on 2018/1/16,16:11
 *  package name:com.dpzx.dcw.common.param
 *     file name:CumulativeActivityParam
 *  project name:dpzx_dcw
 * </pre>
 *
 * @author shaoh
 * @version 0.1
 * @date 2018/1/16,16:11
 * @description
 */
@SuppressWarnings("all")
public class CumulativeActivityParam {

    @NotNull(message = "model不能为NULL")
    @ScopeEnum(value={1,2,3},message = "model取值1,2,3")
    private Integer model;

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }
}
