// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AppNameCountModel extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 规则数
    @NameInMap("rule_num")
    public Long ruleNum;

    public static AppNameCountModel build(java.util.Map<String, ?> map) throws Exception {
        AppNameCountModel self = new AppNameCountModel();
        return TeaModel.build(map, self);
    }

    public AppNameCountModel setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppNameCountModel setRuleNum(Long ruleNum) {
        this.ruleNum = ruleNum;
        return this;
    }
    public Long getRuleNum() {
        return this.ruleNum;
    }

}
