// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class ZolozAlertTaskBO extends TeaModel {
    // request_id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // decision
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // taskId
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // userId
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // source
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // crrRiskLevel
    @NameInMap("crr_risk_level")
    @Validation(required = true)
    public String crrRiskLevel;

    // createTime
    @NameInMap("create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // updateTime
    @NameInMap("update_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String updateTime;

    // modifier
    @NameInMap("modifier")
    @Validation(required = true)
    public String modifier;

    public static ZolozAlertTaskBO build(java.util.Map<String, ?> map) throws Exception {
        ZolozAlertTaskBO self = new ZolozAlertTaskBO();
        return TeaModel.build(map, self);
    }

    public ZolozAlertTaskBO setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ZolozAlertTaskBO setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public ZolozAlertTaskBO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ZolozAlertTaskBO setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ZolozAlertTaskBO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ZolozAlertTaskBO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ZolozAlertTaskBO setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ZolozAlertTaskBO setCrrRiskLevel(String crrRiskLevel) {
        this.crrRiskLevel = crrRiskLevel;
        return this;
    }
    public String getCrrRiskLevel() {
        return this.crrRiskLevel;
    }

    public ZolozAlertTaskBO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ZolozAlertTaskBO setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ZolozAlertTaskBO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

}
