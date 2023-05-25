// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class CreateRiskTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 风险来源，image/benchmark/runtime
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 风险唯一标识
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 风险等级
    @NameInMap("priority")
    public String priority;

    // 风险任务显示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 响应阶段，默认是日常阶段
    @NameInMap("respond_phase")
    public String respondPhase;

    // 风险责任人
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // 安全责任人
    @NameInMap("sec_owner")
    @Validation(required = true)
    public String secOwner;

    // 风险关注者
    @NameInMap("followers")
    @Validation(required = true)
    public java.util.List<String> followers;

    // 到期时间
    @NameInMap("deadline_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deadlineTime;

    // 环境标识ID
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    public static CreateRiskTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRiskTaskRequest self = new CreateRiskTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRiskTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRiskTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRiskTaskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateRiskTaskRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateRiskTaskRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateRiskTaskRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateRiskTaskRequest setRespondPhase(String respondPhase) {
        this.respondPhase = respondPhase;
        return this;
    }
    public String getRespondPhase() {
        return this.respondPhase;
    }

    public CreateRiskTaskRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateRiskTaskRequest setSecOwner(String secOwner) {
        this.secOwner = secOwner;
        return this;
    }
    public String getSecOwner() {
        return this.secOwner;
    }

    public CreateRiskTaskRequest setFollowers(java.util.List<String> followers) {
        this.followers = followers;
        return this;
    }
    public java.util.List<String> getFollowers() {
        return this.followers;
    }

    public CreateRiskTaskRequest setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
        return this;
    }
    public String getDeadlineTime() {
        return this.deadlineTime;
    }

    public CreateRiskTaskRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
