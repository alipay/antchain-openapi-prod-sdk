// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCreditTransferIssuebyidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信用流转发行批次号，与issueId信用流转发行结果查询号不可同时为空
    @NameInMap("batch_id")
    public String batchId;

    // 货主分布式数字身份
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 信用流转发行凭证Id，与batchId信用流转发行批次号不可同时为空
    @NameInMap("issue_id")
    public String issueId;

    // 是否只返回已发行凭证信息
    @NameInMap("issue_only")
    @Validation(required = true)
    public Boolean issueOnly;

    // 页数 从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    public static QueryCreditTransferIssuebyidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditTransferIssuebyidRequest self = new QueryCreditTransferIssuebyidRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditTransferIssuebyidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditTransferIssuebyidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditTransferIssuebyidRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryCreditTransferIssuebyidRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public QueryCreditTransferIssuebyidRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public QueryCreditTransferIssuebyidRequest setIssueOnly(Boolean issueOnly) {
        this.issueOnly = issueOnly;
        return this;
    }
    public Boolean getIssueOnly() {
        return this.issueOnly;
    }

    public QueryCreditTransferIssuebyidRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditTransferIssuebyidRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditTransferIssuebyidRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
