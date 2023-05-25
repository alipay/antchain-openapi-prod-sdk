// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class RiskTask extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 风险名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 优先级
    @NameInMap("priority")
    @Validation(required = true)
    public String priority;

    // 当前状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 风险类型
    @NameInMap("risk_type")
    @Validation(required = true)
    public String riskType;

    // 负责人
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // 到期时间
    @NameInMap("deadline_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deadlineTime;

    // 创建时间
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 响应阶段
    @NameInMap("respond_phase")
    @Validation(required = true)
    public String respondPhase;

    // 风险关注者
    @NameInMap("followers")
    @Validation(required = true)
    public java.util.List<String> followers;

    // 安全工程师
    @NameInMap("sec_owner")
    @Validation(required = true)
    public String secOwner;

    // 到期天数
    @NameInMap("days_left")
    @Validation(required = true)
    public Long daysLeft;

    // 风险ID
    @NameInMap("risk_id")
    @Validation(required = true)
    public String riskId;

    public static RiskTask build(java.util.Map<String, ?> map) throws Exception {
        RiskTask self = new RiskTask();
        return TeaModel.build(map, self);
    }

    public RiskTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RiskTask setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RiskTask setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public RiskTask setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public RiskTask setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public RiskTask setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public RiskTask setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
        return this;
    }
    public String getDeadlineTime() {
        return this.deadlineTime;
    }

    public RiskTask setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public RiskTask setRespondPhase(String respondPhase) {
        this.respondPhase = respondPhase;
        return this;
    }
    public String getRespondPhase() {
        return this.respondPhase;
    }

    public RiskTask setFollowers(java.util.List<String> followers) {
        this.followers = followers;
        return this;
    }
    public java.util.List<String> getFollowers() {
        return this.followers;
    }

    public RiskTask setSecOwner(String secOwner) {
        this.secOwner = secOwner;
        return this;
    }
    public String getSecOwner() {
        return this.secOwner;
    }

    public RiskTask setDaysLeft(Long daysLeft) {
        this.daysLeft = daysLeft;
        return this;
    }
    public Long getDaysLeft() {
        return this.daysLeft;
    }

    public RiskTask setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

}
