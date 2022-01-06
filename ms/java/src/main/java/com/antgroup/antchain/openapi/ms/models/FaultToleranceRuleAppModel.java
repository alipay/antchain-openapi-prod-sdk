// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultToleranceRuleAppModel extends TeaModel {
    // app名称
    @NameInMap("app_name")
    public String appName;

    // 规则数量
    @NameInMap("rules_num")
    public Long rulesNum;

    public static FaultToleranceRuleAppModel build(java.util.Map<String, ?> map) throws Exception {
        FaultToleranceRuleAppModel self = new FaultToleranceRuleAppModel();
        return TeaModel.build(map, self);
    }

    public FaultToleranceRuleAppModel setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public FaultToleranceRuleAppModel setRulesNum(Long rulesNum) {
        this.rulesNum = rulesNum;
        return this;
    }
    public Long getRulesNum() {
        return this.rulesNum;
    }

}
