// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class SwitchUnifiedalarmRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 告警开始时间
    @NameInMap("suspend_start_time")
    public Long suspendStartTime;

    // 告警结束时间
    @NameInMap("suspended_end_time")
    public Long suspendedEndTime;

    // 告警暂停原因
    @NameInMap("suspended_reason")
    public String suspendedReason;

    // 启停状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 工作空间名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 批量暂停与恢复
    @NameInMap("ids")
    public java.util.List<Long> ids;

    public static SwitchUnifiedalarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchUnifiedalarmRuleRequest self = new SwitchUnifiedalarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public SwitchUnifiedalarmRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SwitchUnifiedalarmRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SwitchUnifiedalarmRuleRequest setSuspendStartTime(Long suspendStartTime) {
        this.suspendStartTime = suspendStartTime;
        return this;
    }
    public Long getSuspendStartTime() {
        return this.suspendStartTime;
    }

    public SwitchUnifiedalarmRuleRequest setSuspendedEndTime(Long suspendedEndTime) {
        this.suspendedEndTime = suspendedEndTime;
        return this;
    }
    public Long getSuspendedEndTime() {
        return this.suspendedEndTime;
    }

    public SwitchUnifiedalarmRuleRequest setSuspendedReason(String suspendedReason) {
        this.suspendedReason = suspendedReason;
        return this;
    }
    public String getSuspendedReason() {
        return this.suspendedReason;
    }

    public SwitchUnifiedalarmRuleRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SwitchUnifiedalarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public SwitchUnifiedalarmRuleRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
