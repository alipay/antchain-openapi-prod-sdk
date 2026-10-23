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
    public java.util.List<Long> auditIds;

    // 美柚itag关联状态
    @NameInMap("audit_state")
    @Validation(required = true)
    public String auditState;

    // 开始时间
    @NameInMap("gmt_create_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreateStart;

    // 结束时间
    @NameInMap("gmt_create_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreateEnd;

    // 最大条数
    @NameInMap("max_num")
    public Long maxNum;

    // 数据来源
    @NameInMap("source")
    public String source;

    // 操作人
    @NameInMap("audit_operators")
    public java.util.List<String> auditOperators;

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

    public QueryMeiyouAuditRequest setGmtCreateStart(String gmtCreateStart) {
        this.gmtCreateStart = gmtCreateStart;
        return this;
    }
    public String getGmtCreateStart() {
        return this.gmtCreateStart;
    }

    public QueryMeiyouAuditRequest setGmtCreateEnd(String gmtCreateEnd) {
        this.gmtCreateEnd = gmtCreateEnd;
        return this;
    }
    public String getGmtCreateEnd() {
        return this.gmtCreateEnd;
    }

    public QueryMeiyouAuditRequest setMaxNum(Long maxNum) {
        this.maxNum = maxNum;
        return this;
    }
    public Long getMaxNum() {
        return this.maxNum;
    }

    public QueryMeiyouAuditRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryMeiyouAuditRequest setAuditOperators(java.util.List<String> auditOperators) {
        this.auditOperators = auditOperators;
        return this;
    }
    public java.util.List<String> getAuditOperators() {
        return this.auditOperators;
    }

}
