// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ScaleRiskTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险任务ID
    @NameInMap("risk_task_id")
    @Validation(required = true)
    public String riskTaskId;

    // 延期时间
    @NameInMap("deadline_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deadlineTime;

    // comment描述
    @NameInMap("comment")
    public String comment;

    public static ScaleRiskTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleRiskTaskRequest self = new ScaleRiskTaskRequest();
        return TeaModel.build(map, self);
    }

    public ScaleRiskTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ScaleRiskTaskRequest setRiskTaskId(String riskTaskId) {
        this.riskTaskId = riskTaskId;
        return this;
    }
    public String getRiskTaskId() {
        return this.riskTaskId;
    }

    public ScaleRiskTaskRequest setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
        return this;
    }
    public String getDeadlineTime() {
        return this.deadlineTime;
    }

    public ScaleRiskTaskRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
