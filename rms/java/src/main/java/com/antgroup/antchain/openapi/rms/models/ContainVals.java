// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ContainVals extends TeaModel {
    // 包含值列表
    @NameInMap("vals")
    public java.util.List<String> vals;

    public static ContainVals build(java.util.Map<String, ?> map) throws Exception {
        ContainVals self = new ContainVals();
        return TeaModel.build(map, self);
    }

    public ContainVals setVals(java.util.List<String> vals) {
        this.vals = vals;
        return this;
    }
    public java.util.List<String> getVals() {
        return this.vals;
    }

}
