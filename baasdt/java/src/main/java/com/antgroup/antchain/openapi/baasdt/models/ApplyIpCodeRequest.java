// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ApplyIpCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // IP商家的链上账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 套餐交易/授权交易的订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 申请数量
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 占用预申请的起始编码--仅使用码池时有效
    @NameInMap("start_index")
    public Long startIndex;

    // 占用预申请的截止编码--仅使用码池时有效
    @NameInMap("end_index")
    public Long endIndex;

    public static ApplyIpCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyIpCodeRequest self = new ApplyIpCodeRequest();
        return TeaModel.build(map, self);
    }

    public ApplyIpCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyIpCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyIpCodeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ApplyIpCodeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ApplyIpCodeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ApplyIpCodeRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ApplyIpCodeRequest setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ApplyIpCodeRequest setEndIndex(Long endIndex) {
        this.endIndex = endIndex;
        return this;
    }
    public Long getEndIndex() {
        return this.endIndex;
    }

}
