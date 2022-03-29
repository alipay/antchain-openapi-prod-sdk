// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Cal extends TeaModel {
    // 统计功能
    @NameInMap("fun")
    @Validation(required = true)
    public String fun;

    // 值对象
    @NameInMap("val")
    public UniqueDim val;

    // 值对象备份
    @NameInMap("val_bak")
    public UniqueDim valBak;

    // topn
    @NameInMap("topn")
    public Long topn;

    // 所包含的值
    @NameInMap("contain_vals")
    public ContainVals containVals;

    public static Cal build(java.util.Map<String, ?> map) throws Exception {
        Cal self = new Cal();
        return TeaModel.build(map, self);
    }

    public Cal setFun(String fun) {
        this.fun = fun;
        return this;
    }
    public String getFun() {
        return this.fun;
    }

    public Cal setVal(UniqueDim val) {
        this.val = val;
        return this;
    }
    public UniqueDim getVal() {
        return this.val;
    }

    public Cal setValBak(UniqueDim valBak) {
        this.valBak = valBak;
        return this;
    }
    public UniqueDim getValBak() {
        return this.valBak;
    }

    public Cal setTopn(Long topn) {
        this.topn = topn;
        return this;
    }
    public Long getTopn() {
        return this.topn;
    }

    public Cal setContainVals(ContainVals containVals) {
        this.containVals = containVals;
        return this;
    }
    public ContainVals getContainVals() {
        return this.containVals;
    }

}
