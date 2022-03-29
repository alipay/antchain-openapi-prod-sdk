// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteUnifiedalarmSubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 通知对象 可能为多个
    @NameInMap("alarm_sub")
    @Validation(required = true)
    public UnifiedAlarmSubDTO alarmSub;

    // 规则id集合
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static DeleteUnifiedalarmSubRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnifiedalarmSubRequest self = new DeleteUnifiedalarmSubRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUnifiedalarmSubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteUnifiedalarmSubRequest setAlarmSub(UnifiedAlarmSubDTO alarmSub) {
        this.alarmSub = alarmSub;
        return this;
    }
    public UnifiedAlarmSubDTO getAlarmSub() {
        return this.alarmSub;
    }

    public DeleteUnifiedalarmSubRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DeleteUnifiedalarmSubRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
