// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryMeiyouAuditresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审核ID
    @NameInMap("audit_ids")
    public java.util.List<Long> auditIds;

    // 美柚任务审核结果推送状态
    @NameInMap("meiyou_audit_state")
    public String meiyouAuditState;

    // 审核记录状态
    @NameInMap("audit_state")
    public java.util.List<String> auditState;

    // 主题记录状态
    @NameInMap("topic_state")
    public String topicState;

    // 开始时间点
    @NameInMap("create_start")
    public String createStart;

    // 结束时间点
    @NameInMap("create_end")
    public String createEnd;

    // 数据来源
    @NameInMap("source")
    public String source;

    public static QueryMeiyouAuditresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeiyouAuditresultRequest self = new QueryMeiyouAuditresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeiyouAuditresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeiyouAuditresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeiyouAuditresultRequest setAuditIds(java.util.List<Long> auditIds) {
        this.auditIds = auditIds;
        return this;
    }
    public java.util.List<Long> getAuditIds() {
        return this.auditIds;
    }

    public QueryMeiyouAuditresultRequest setMeiyouAuditState(String meiyouAuditState) {
        this.meiyouAuditState = meiyouAuditState;
        return this;
    }
    public String getMeiyouAuditState() {
        return this.meiyouAuditState;
    }

    public QueryMeiyouAuditresultRequest setAuditState(java.util.List<String> auditState) {
        this.auditState = auditState;
        return this;
    }
    public java.util.List<String> getAuditState() {
        return this.auditState;
    }

    public QueryMeiyouAuditresultRequest setTopicState(String topicState) {
        this.topicState = topicState;
        return this;
    }
    public String getTopicState() {
        return this.topicState;
    }

    public QueryMeiyouAuditresultRequest setCreateStart(String createStart) {
        this.createStart = createStart;
        return this;
    }
    public String getCreateStart() {
        return this.createStart;
    }

    public QueryMeiyouAuditresultRequest setCreateEnd(String createEnd) {
        this.createEnd = createEnd;
        return this;
    }
    public String getCreateEnd() {
        return this.createEnd;
    }

    public QueryMeiyouAuditresultRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
