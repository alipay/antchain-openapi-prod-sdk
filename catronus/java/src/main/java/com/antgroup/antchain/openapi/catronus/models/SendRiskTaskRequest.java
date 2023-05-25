// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class SendRiskTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险工单ID
    @NameInMap("risk_task_id")
    @Validation(required = true)
    public String riskTaskId;

    // 责任人
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // 评论
    @NameInMap("comment")
    public String comment;

    public static SendRiskTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SendRiskTaskRequest self = new SendRiskTaskRequest();
        return TeaModel.build(map, self);
    }

    public SendRiskTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendRiskTaskRequest setRiskTaskId(String riskTaskId) {
        this.riskTaskId = riskTaskId;
        return this;
    }
    public String getRiskTaskId() {
        return this.riskTaskId;
    }

    public SendRiskTaskRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public SendRiskTaskRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
