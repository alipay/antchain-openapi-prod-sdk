// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryMeiyouItagrelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键id
    @NameInMap("id")
    public Long id;

    // 审核记录ID
    @NameInMap("audit_id")
    public Long auditId;

    // 主题ID
    @NameInMap("topic_id")
    public Long topicId;

    // itag任务ID
    @NameInMap("itag_task_id")
    public Long itagTaskId;

    // itag数据集ID
    @NameInMap("itag_dataset_id")
    public Long itagDatasetId;

    // itag数据ID
    @NameInMap("itag_data_id")
    public Long itagDataId;

    // 美柚任务审核结果推送状态
    @NameInMap("meiyou_audit_state")
    public String meiyouAuditState;

    // 审核记录状态
    @NameInMap("audit_state")
    public String auditState;

    // 主题记录状态
    @NameInMap("topic_state")
    public String topicState;

    // 更新时间-start
    @NameInMap("gmt_modified_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModifiedStart;

    // 更新时间-end 
    @NameInMap("gmt_modified_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModifiedEnd;

    // 操作人
    @NameInMap("audit_operator")
    public String auditOperator;

    // 数据来源
    @NameInMap("source")
    public String source;

    public static QueryMeiyouItagrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeiyouItagrelationRequest self = new QueryMeiyouItagrelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeiyouItagrelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeiyouItagrelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeiyouItagrelationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryMeiyouItagrelationRequest setAuditId(Long auditId) {
        this.auditId = auditId;
        return this;
    }
    public Long getAuditId() {
        return this.auditId;
    }

    public QueryMeiyouItagrelationRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public QueryMeiyouItagrelationRequest setItagTaskId(Long itagTaskId) {
        this.itagTaskId = itagTaskId;
        return this;
    }
    public Long getItagTaskId() {
        return this.itagTaskId;
    }

    public QueryMeiyouItagrelationRequest setItagDatasetId(Long itagDatasetId) {
        this.itagDatasetId = itagDatasetId;
        return this;
    }
    public Long getItagDatasetId() {
        return this.itagDatasetId;
    }

    public QueryMeiyouItagrelationRequest setItagDataId(Long itagDataId) {
        this.itagDataId = itagDataId;
        return this;
    }
    public Long getItagDataId() {
        return this.itagDataId;
    }

    public QueryMeiyouItagrelationRequest setMeiyouAuditState(String meiyouAuditState) {
        this.meiyouAuditState = meiyouAuditState;
        return this;
    }
    public String getMeiyouAuditState() {
        return this.meiyouAuditState;
    }

    public QueryMeiyouItagrelationRequest setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public QueryMeiyouItagrelationRequest setTopicState(String topicState) {
        this.topicState = topicState;
        return this;
    }
    public String getTopicState() {
        return this.topicState;
    }

    public QueryMeiyouItagrelationRequest setGmtModifiedStart(String gmtModifiedStart) {
        this.gmtModifiedStart = gmtModifiedStart;
        return this;
    }
    public String getGmtModifiedStart() {
        return this.gmtModifiedStart;
    }

    public QueryMeiyouItagrelationRequest setGmtModifiedEnd(String gmtModifiedEnd) {
        this.gmtModifiedEnd = gmtModifiedEnd;
        return this;
    }
    public String getGmtModifiedEnd() {
        return this.gmtModifiedEnd;
    }

    public QueryMeiyouItagrelationRequest setAuditOperator(String auditOperator) {
        this.auditOperator = auditOperator;
        return this;
    }
    public String getAuditOperator() {
        return this.auditOperator;
    }

    public QueryMeiyouItagrelationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
