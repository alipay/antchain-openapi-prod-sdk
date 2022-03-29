// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Filter extends TeaModel {
    // 过滤列
    @NameInMap("dim")
    @Validation(required = true)
    public UniqueDim dim;

    // 过滤目标值列表
    @NameInMap("values")
    @Validation(required = true)
    public java.util.List<String> values;

    public static Filter build(java.util.Map<String, ?> map) throws Exception {
        Filter self = new Filter();
        return TeaModel.build(map, self);
    }

    public Filter setDim(UniqueDim dim) {
        this.dim = dim;
        return this;
    }
    public UniqueDim getDim() {
        return this.dim;
    }

    public Filter setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
