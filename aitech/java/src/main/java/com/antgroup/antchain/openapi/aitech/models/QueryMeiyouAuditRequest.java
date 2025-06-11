// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryMeiyouAuditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审核记录ID
    @NameInMap("audit_ids")
    @Validation(required = true)
    public java.util.List<Long> auditIds;

    // 美柚itag关联状态
    @NameInMap("audit_state")
    @Validation(required = true)
    public String auditState;

    public static QueryMeiyouAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeiyouAuditRequest self = new QueryMeiyouAuditRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeiyouAuditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeiyouAuditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeiyouAuditRequest setAuditIds(java.util.List<Long> auditIds) {
        this.auditIds = auditIds;
        return this;
    }
    public java.util.List<Long> getAuditIds() {
        return this.auditIds;
    }

    public QueryMeiyouAuditRequest setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

}
