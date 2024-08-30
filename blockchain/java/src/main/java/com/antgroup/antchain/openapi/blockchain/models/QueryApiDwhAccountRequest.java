// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryApiDwhAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账户hash ，如果根据账户hash查询账户信息可以填写该字段
    @NameInMap("account_hash")
    public String accountHash;

    // 链id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 结束时间，如果查询时间段创建的账户，可以填写该字段
    @NameInMap("end_timestamp")
    public Long endTimestamp;

    // 页数，分页使用，从1开始
    @NameInMap("page_no")
    public Long pageNo;

    // 分页大小，取值不能超过100，默认100
    @NameInMap("page_size")
    @Validation(maximum = 100)
    public Long pageSize;

    // 开始时间，如果查询时间段创建的账户，可以填写该字段
    @NameInMap("start_timestamp")
    public Long startTimestamp;

    public static QueryApiDwhAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiDwhAccountRequest self = new QueryApiDwhAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiDwhAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiDwhAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiDwhAccountRequest setAccountHash(String accountHash) {
        this.accountHash = accountHash;
        return this;
    }
    public String getAccountHash() {
        return this.accountHash;
    }

    public QueryApiDwhAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryApiDwhAccountRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public QueryApiDwhAccountRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryApiDwhAccountRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApiDwhAccountRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
