// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuebyidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信用流转发行批次号
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 是否只返回已发行凭证信息
    @NameInMap("issued_only")
    @Validation(required = true)
    public Boolean issuedOnly;

    // 信用流转发行凭证Id
    @NameInMap("issue_id")
    public String issueId;

    // 页数 从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示数量 不超过100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id 
    // A模式：PRODUCT_MYBANK，
    // A+模式：PRODUCT_MYBANK_A_PLUS，
    // B模式：PRODUCT_MYBANK_B
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static QueryCreditIssuebyidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuebyidRequest self = new QueryCreditIssuebyidRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuebyidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditIssuebyidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditIssuebyidRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryCreditIssuebyidRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditIssuebyidRequest setIssuedOnly(Boolean issuedOnly) {
        this.issuedOnly = issuedOnly;
        return this;
    }
    public Boolean getIssuedOnly() {
        return this.issuedOnly;
    }

    public QueryCreditIssuebyidRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public QueryCreditIssuebyidRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditIssuebyidRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditIssuebyidRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditIssuebyidRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
