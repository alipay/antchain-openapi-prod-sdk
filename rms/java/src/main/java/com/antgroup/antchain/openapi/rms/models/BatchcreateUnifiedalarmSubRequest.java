// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateUnifiedalarmSubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 通知对象 可能有多个
    @NameInMap("alarm_subs")
    @Validation(required = true)
    public java.util.List<UnifiedAlarmSubDTO> alarmSubs;

    // 告警规则id集合
    @NameInMap("alarm_rule_ids")
    public java.util.List<Long> alarmRuleIds;

    // 是否全部订阅
    @NameInMap("sub_all")
    public Boolean subAll;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 订阅成员是新增吗？新增时，不做旧的订阅关系做覆盖
    @NameInMap("is_append")
    public Boolean isAppend;

    public static BatchcreateUnifiedalarmSubRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateUnifiedalarmSubRequest self = new BatchcreateUnifiedalarmSubRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateUnifiedalarmSubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateUnifiedalarmSubRequest setAlarmSubs(java.util.List<UnifiedAlarmSubDTO> alarmSubs) {
        this.alarmSubs = alarmSubs;
        return this;
    }
    public java.util.List<UnifiedAlarmSubDTO> getAlarmSubs() {
        return this.alarmSubs;
    }

    public BatchcreateUnifiedalarmSubRequest setAlarmRuleIds(java.util.List<Long> alarmRuleIds) {
        this.alarmRuleIds = alarmRuleIds;
        return this;
    }
    public java.util.List<Long> getAlarmRuleIds() {
        return this.alarmRuleIds;
    }

    public BatchcreateUnifiedalarmSubRequest setSubAll(Boolean subAll) {
        this.subAll = subAll;
        return this;
    }
    public Boolean getSubAll() {
        return this.subAll;
    }

    public BatchcreateUnifiedalarmSubRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public BatchcreateUnifiedalarmSubRequest setIsAppend(Boolean isAppend) {
        this.isAppend = isAppend;
        return this;
    }
    public Boolean getIsAppend() {
        return this.isAppend;
    }

}
