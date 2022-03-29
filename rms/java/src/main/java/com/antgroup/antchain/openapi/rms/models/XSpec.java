// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XSpec extends TeaModel {
    //  
    @NameInMap("target")
    @Validation(required = true)
    public XTarget target;

    //  
    @NameInMap("rule")
    @Validation(required = true)
    public XRule rule;

    public static XSpec build(java.util.Map<String, ?> map) throws Exception {
        XSpec self = new XSpec();
        return TeaModel.build(map, self);
    }

    public XSpec setTarget(XTarget target) {
        this.target = target;
        return this;
    }
    public XTarget getTarget() {
        return this.target;
    }

    public XSpec setRule(XRule rule) {
        this.rule = rule;
        return this;
    }
    public XRule getRule() {
        return this.rule;
    }

}
