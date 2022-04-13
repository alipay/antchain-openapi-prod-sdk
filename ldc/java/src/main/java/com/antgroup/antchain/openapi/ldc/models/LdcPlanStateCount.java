// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LdcPlanStateCount extends TeaModel {
    // 发布单状态类型
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 数量
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static LdcPlanStateCount build(java.util.Map<String, ?> map) throws Exception {
        LdcPlanStateCount self = new LdcPlanStateCount();
        return TeaModel.build(map, self);
    }

    public LdcPlanStateCount setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public LdcPlanStateCount setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
