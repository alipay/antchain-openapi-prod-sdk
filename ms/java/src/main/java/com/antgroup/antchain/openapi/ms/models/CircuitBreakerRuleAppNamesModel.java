// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CircuitBreakerRuleAppNamesModel extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 规则个数
    @NameInMap("rules_num")
    @Validation(required = true)
    public Long rulesNum;

    public static CircuitBreakerRuleAppNamesModel build(java.util.Map<String, ?> map) throws Exception {
        CircuitBreakerRuleAppNamesModel self = new CircuitBreakerRuleAppNamesModel();
        return TeaModel.build(map, self);
    }

    public CircuitBreakerRuleAppNamesModel setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CircuitBreakerRuleAppNamesModel setRulesNum(Long rulesNum) {
        this.rulesNum = rulesNum;
        return this;
    }
    public Long getRulesNum() {
        return this.rulesNum;
    }

}
