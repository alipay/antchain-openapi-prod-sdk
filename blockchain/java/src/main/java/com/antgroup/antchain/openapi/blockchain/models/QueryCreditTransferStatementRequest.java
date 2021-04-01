// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCreditTransferStatementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 查询起始时间
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    public static QueryCreditTransferStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditTransferStatementRequest self = new QueryCreditTransferStatementRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditTransferStatementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditTransferStatementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditTransferStatementRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditTransferStatementRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryCreditTransferStatementRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditTransferStatementRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditTransferStatementRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditTransferStatementRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
