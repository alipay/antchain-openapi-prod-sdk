// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class UpdateRiskTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险共担ID
    @NameInMap("risk_task_id")
    @Validation(required = true)
    public String riskTaskId;

    // 风险工单状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 风险责任人
    @NameInMap("owner")
    public String owner;

    // 安全责任人
    @NameInMap("sec_owner")
    public String secOwner;

    // 风险关注人员列表
    @NameInMap("followers")
    public java.util.List<String> followers;

    // 风险解决方案ID
    @NameInMap("risk_solution_id")
    public String riskSolutionId;

    public static UpdateRiskTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskTaskRequest self = new UpdateRiskTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRiskTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRiskTaskRequest setRiskTaskId(String riskTaskId) {
        this.riskTaskId = riskTaskId;
        return this;
    }
    public String getRiskTaskId() {
        return this.riskTaskId;
    }

    public UpdateRiskTaskRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateRiskTaskRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateRiskTaskRequest setSecOwner(String secOwner) {
        this.secOwner = secOwner;
        return this;
    }
    public String getSecOwner() {
        return this.secOwner;
    }

    public UpdateRiskTaskRequest setFollowers(java.util.List<String> followers) {
        this.followers = followers;
        return this;
    }
    public java.util.List<String> getFollowers() {
        return this.followers;
    }

    public UpdateRiskTaskRequest setRiskSolutionId(String riskSolutionId) {
        this.riskSolutionId = riskSolutionId;
        return this;
    }
    public String getRiskSolutionId() {
        return this.riskSolutionId;
    }

}
