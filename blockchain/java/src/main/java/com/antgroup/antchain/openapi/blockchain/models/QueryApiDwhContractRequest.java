// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryApiDwhContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // biz_id 链id
    @NameInMap("biz_id")
    public String bizId;

    // 合约地址：如果根据合约地址查询，可以填该字段
    @NameInMap("contract")
    public String contract;

    // 结束时间：如果根据时间范围查询创建的合约，可以填写该字段
    @NameInMap("end_timestamp")
    public Long endTimestamp;

    // 页数，分页使用，从1开始默认为1
    @NameInMap("page_no")
    public Long pageNo;

    // 分页大小，取值不能超过100，默认100
    @NameInMap("page_size")
    @Validation(maximum = 100)
    public Long pageSize;

    // 开始时间：如果根据时间范围查询创建的账户，可以填写该字段
    @NameInMap("start_timestamp")
    public Long startTimestamp;

    public static QueryApiDwhContractRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiDwhContractRequest self = new QueryApiDwhContractRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiDwhContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiDwhContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiDwhContractRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryApiDwhContractRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public QueryApiDwhContractRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public QueryApiDwhContractRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryApiDwhContractRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApiDwhContractRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
