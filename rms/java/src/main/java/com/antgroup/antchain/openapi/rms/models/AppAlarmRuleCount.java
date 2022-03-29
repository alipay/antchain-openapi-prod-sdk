// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AppAlarmRuleCount extends TeaModel {
    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用告警规则总数
    @NameInMap("alarm_rule_count")
    @Validation(required = true)
    public Long alarmRuleCount;

    public static AppAlarmRuleCount build(java.util.Map<String, ?> map) throws Exception {
        AppAlarmRuleCount self = new AppAlarmRuleCount();
        return TeaModel.build(map, self);
    }

    public AppAlarmRuleCount setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppAlarmRuleCount setAlarmRuleCount(Long alarmRuleCount) {
        this.alarmRuleCount = alarmRuleCount;
        return this;
    }
    public Long getAlarmRuleCount() {
        return this.alarmRuleCount;
    }

}
