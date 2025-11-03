// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class PagequeryMeiyouAuditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键id
    @NameInMap("id")
    public Long id;

    // 页面
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 审核记录ID
    @NameInMap("audit_id")
    public Long auditId;

    // 大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 主题ID
    @NameInMap("topic_id")
    public Long topicId;

    // 内容文本
    @NameInMap("content")
    public String content;

    // 一级业务
    @NameInMap("primary_business")
    public String primaryBusiness;

    // 二级业务
    @NameInMap("secondary_business")
    public String secondaryBusiness;

    // 审核结果
    @NameInMap("audit_result")
    public String auditResult;

    // 审核原因
    @NameInMap("audit_reason")
    public String auditReason;

    // 创建时间-start
    @NameInMap("gmt_create_start")
    public String gmtCreateStart;

    // 创建时间-end
    @NameInMap("gmt_create_end")
    public String gmtCreateEnd;

    // 数据来源
    @NameInMap("source")
    public String source;

    public static PagequeryMeiyouAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryMeiyouAuditRequest self = new PagequeryMeiyouAuditRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryMeiyouAuditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryMeiyouAuditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryMeiyouAuditRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PagequeryMeiyouAuditRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryMeiyouAuditRequest setAuditId(Long auditId) {
        this.auditId = auditId;
        return this;
    }
    public Long getAuditId() {
        return this.auditId;
    }

    public PagequeryMeiyouAuditRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryMeiyouAuditRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public PagequeryMeiyouAuditRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PagequeryMeiyouAuditRequest setPrimaryBusiness(String primaryBusiness) {
        this.primaryBusiness = primaryBusiness;
        return this;
    }
    public String getPrimaryBusiness() {
        return this.primaryBusiness;
    }

    public PagequeryMeiyouAuditRequest setSecondaryBusiness(String secondaryBusiness) {
        this.secondaryBusiness = secondaryBusiness;
        return this;
    }
    public String getSecondaryBusiness() {
        return this.secondaryBusiness;
    }

    public PagequeryMeiyouAuditRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public PagequeryMeiyouAuditRequest setAuditReason(String auditReason) {
        this.auditReason = auditReason;
        return this;
    }
    public String getAuditReason() {
        return this.auditReason;
    }

    public PagequeryMeiyouAuditRequest setGmtCreateStart(String gmtCreateStart) {
        this.gmtCreateStart = gmtCreateStart;
        return this;
    }
    public String getGmtCreateStart() {
        return this.gmtCreateStart;
    }

    public PagequeryMeiyouAuditRequest setGmtCreateEnd(String gmtCreateEnd) {
        this.gmtCreateEnd = gmtCreateEnd;
        return this;
    }
    public String getGmtCreateEnd() {
        return this.gmtCreateEnd;
    }

    public PagequeryMeiyouAuditRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
