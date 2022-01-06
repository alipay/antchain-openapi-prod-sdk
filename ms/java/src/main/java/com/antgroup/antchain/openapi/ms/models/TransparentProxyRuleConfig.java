// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyRuleConfig extends TeaModel {
    // 入方向配置
    @NameInMap("in_bound")
    @Validation(required = true)
    public java.util.List<TransparentProxyBound> inBound;

    // 出方向配置
    @NameInMap("out_bound")
    @Validation(required = true)
    public java.util.List<TransparentProxyBound> outBound;

    public static TransparentProxyRuleConfig build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyRuleConfig self = new TransparentProxyRuleConfig();
        return TeaModel.build(map, self);
    }

    public TransparentProxyRuleConfig setInBound(java.util.List<TransparentProxyBound> inBound) {
        this.inBound = inBound;
        return this;
    }
    public java.util.List<TransparentProxyBound> getInBound() {
        return this.inBound;
    }

    public TransparentProxyRuleConfig setOutBound(java.util.List<TransparentProxyBound> outBound) {
        this.outBound = outBound;
        return this;
    }
    public java.util.List<TransparentProxyBound> getOutBound() {
        return this.outBound;
    }

}
