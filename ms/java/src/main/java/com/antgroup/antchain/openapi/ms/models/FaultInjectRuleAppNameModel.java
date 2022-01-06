// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultInjectRuleAppNameModel extends TeaModel {
    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 规则数量
    @NameInMap("rule_num")
    public Long ruleNum;

    public static FaultInjectRuleAppNameModel build(java.util.Map<String, ?> map) throws Exception {
        FaultInjectRuleAppNameModel self = new FaultInjectRuleAppNameModel();
        return TeaModel.build(map, self);
    }

    public FaultInjectRuleAppNameModel setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public FaultInjectRuleAppNameModel setRuleNum(Long ruleNum) {
        this.ruleNum = ruleNum;
        return this;
    }
    public Long getRuleNum() {
        return this.ruleNum;
    }

}
