// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class VerifyRiskTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险工单ID
    @NameInMap("risk_task_id")
    @Validation(required = true)
    public String riskTaskId;

    // 评论
    @NameInMap("comment")
    public String comment;

    public static VerifyRiskTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRiskTaskRequest self = new VerifyRiskTaskRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRiskTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyRiskTaskRequest setRiskTaskId(String riskTaskId) {
        this.riskTaskId = riskTaskId;
        return this;
    }
    public String getRiskTaskId() {
        return this.riskTaskId;
    }

    public VerifyRiskTaskRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
