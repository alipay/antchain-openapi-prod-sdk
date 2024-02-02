// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class MethodMatchingRule extends TeaModel {
    // 网关api
    @NameInMap("method")
    @Validation(required = true)
    public String method;

    // 匹配规则
    @NameInMap("matching_rule")
    @Validation(required = true)
    public String matchingRule;

    public static MethodMatchingRule build(java.util.Map<String, ?> map) throws Exception {
        MethodMatchingRule self = new MethodMatchingRule();
        return TeaModel.build(map, self);
    }

    public MethodMatchingRule setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public MethodMatchingRule setMatchingRule(String matchingRule) {
        this.matchingRule = matchingRule;
        return this;
    }
    public String getMatchingRule() {
        return this.matchingRule;
    }

}
