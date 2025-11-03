// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UpdateMeiyouAuditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主题ID
    @NameInMap("topic_ids")
    public java.util.List<Long> topicIds;

    // 美柚itag关联状态
    @NameInMap("topic_state")
    public String topicState;

    // 审核记录ID
    @NameInMap("audit_ids")
    public java.util.List<Long> auditIds;

    // 美柚itag关联状态
    @NameInMap("audit_state")
    public String auditState;

    // itag任务ID
    @NameInMap("itag_task_id")
    public Long itagTaskId;

    // itag数据集ID
    @NameInMap("itag_dataset_id")
    public Long itagDatasetId;

    // 数据来源
    @NameInMap("source")
    public String source;

    public static UpdateMeiyouAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeiyouAuditRequest self = new UpdateMeiyouAuditRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeiyouAuditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeiyouAuditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeiyouAuditRequest setTopicIds(java.util.List<Long> topicIds) {
        this.topicIds = topicIds;
        return this;
    }
    public java.util.List<Long> getTopicIds() {
        return this.topicIds;
    }

    public UpdateMeiyouAuditRequest setTopicState(String topicState) {
        this.topicState = topicState;
        return this;
    }
    public String getTopicState() {
        return this.topicState;
    }

    public UpdateMeiyouAuditRequest setAuditIds(java.util.List<Long> auditIds) {
        this.auditIds = auditIds;
        return this;
    }
    public java.util.List<Long> getAuditIds() {
        return this.auditIds;
    }

    public UpdateMeiyouAuditRequest setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public UpdateMeiyouAuditRequest setItagTaskId(Long itagTaskId) {
        this.itagTaskId = itagTaskId;
        return this;
    }
    public Long getItagTaskId() {
        return this.itagTaskId;
    }

    public UpdateMeiyouAuditRequest setItagDatasetId(Long itagDatasetId) {
        this.itagDatasetId = itagDatasetId;
        return this;
    }
    public Long getItagDatasetId() {
        return this.itagDatasetId;
    }

    public UpdateMeiyouAuditRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
