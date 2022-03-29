// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateUnifiedalarmRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 模板 ID
    @NameInMap("tpl_id")
    @Validation(required = true)
    public Long tplId;

    // 监控对象名称列表
    @NameInMap("alarm_targets")
    @Validation(required = true)
    public java.util.List<AlarmTarget> alarmTargets;

    public static BatchcreateUnifiedalarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateUnifiedalarmRuleRequest self = new BatchcreateUnifiedalarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateUnifiedalarmRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateUnifiedalarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public BatchcreateUnifiedalarmRuleRequest setTplId(Long tplId) {
        this.tplId = tplId;
        return this;
    }
    public Long getTplId() {
        return this.tplId;
    }

    public BatchcreateUnifiedalarmRuleRequest setAlarmTargets(java.util.List<AlarmTarget> alarmTargets) {
        this.alarmTargets = alarmTargets;
        return this;
    }
    public java.util.List<AlarmTarget> getAlarmTargets() {
        return this.alarmTargets;
    }

}
