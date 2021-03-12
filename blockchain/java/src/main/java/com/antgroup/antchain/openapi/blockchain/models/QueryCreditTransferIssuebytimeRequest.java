// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCreditTransferIssuebytimeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需查询对象的分布式数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 查询截止时间
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 是否只返回已发行凭证信息
    @NameInMap("issue_onle")
    @Validation(required = true)
    public Boolean issueOnle;

    // 页数 从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public String pageNum;

    // 每页显示数量
    @NameInMap("page_size")
    @Validation(required = true)
    public String pageSize;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 查询起始时间
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    public static QueryCreditTransferIssuebytimeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditTransferIssuebytimeRequest self = new QueryCreditTransferIssuebytimeRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditTransferIssuebytimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditTransferIssuebytimeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditTransferIssuebytimeRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditTransferIssuebytimeRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryCreditTransferIssuebytimeRequest setIssueOnle(Boolean issueOnle) {
        this.issueOnle = issueOnle;
        return this;
    }
    public Boolean getIssueOnle() {
        return this.issueOnle;
    }

    public QueryCreditTransferIssuebytimeRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public QueryCreditTransferIssuebytimeRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryCreditTransferIssuebytimeRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditTransferIssuebytimeRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
