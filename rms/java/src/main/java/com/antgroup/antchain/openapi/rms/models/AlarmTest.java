// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmTest extends TeaModel {
    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 告警规则id 
    @NameInMap("alarm_rule_id")
    @Validation(required = true)
    public Long alarmRuleId;

    public static AlarmTest build(java.util.Map<String, ?> map) throws Exception {
        AlarmTest self = new AlarmTest();
        return TeaModel.build(map, self);
    }

    public AlarmTest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public AlarmTest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

}
