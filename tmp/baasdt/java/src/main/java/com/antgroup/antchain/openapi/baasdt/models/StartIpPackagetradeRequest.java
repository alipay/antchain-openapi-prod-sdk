// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class StartIpPackagetradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 买方的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // IP ID
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // true 只上链不走真实支付，false 上链并链下真实支付账单
    @NameInMap("only_call_blockchain")
    @Validation(required = true)
    public Boolean onlyCallBlockchain;

    // 终端商品价格区间
    @NameInMap("price_range")
    @Validation(required = true)
    public String priceRange;

    // 套餐中包含终端商品数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 套餐交易应付金额，单位元，保留两位小数
    @NameInMap("expected_total_price")
    @Validation(required = true)
    public String expectedTotalPrice;

    // 授权合作开始期限（毫秒时间戳）
    @NameInMap("auth_begin_time")
    @Validation(required = true)
    public Long authBeginTime;

    // 授权合作结束期限（毫秒时间戳）
    @NameInMap("auth_end_time")
    @Validation(required = true)
    public Long authEndTime;

    // 备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    public static StartIpPackagetradeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartIpPackagetradeRequest self = new StartIpPackagetradeRequest();
        return TeaModel.build(map, self);
    }

    public StartIpPackagetradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartIpPackagetradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartIpPackagetradeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public StartIpPackagetradeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public StartIpPackagetradeRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public StartIpPackagetradeRequest setOnlyCallBlockchain(Boolean onlyCallBlockchain) {
        this.onlyCallBlockchain = onlyCallBlockchain;
        return this;
    }
    public Boolean getOnlyCallBlockchain() {
        return this.onlyCallBlockchain;
    }

    public StartIpPackagetradeRequest setPriceRange(String priceRange) {
        this.priceRange = priceRange;
        return this;
    }
    public String getPriceRange() {
        return this.priceRange;
    }

    public StartIpPackagetradeRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public StartIpPackagetradeRequest setExpectedTotalPrice(String expectedTotalPrice) {
        this.expectedTotalPrice = expectedTotalPrice;
        return this;
    }
    public String getExpectedTotalPrice() {
        return this.expectedTotalPrice;
    }

    public StartIpPackagetradeRequest setAuthBeginTime(Long authBeginTime) {
        this.authBeginTime = authBeginTime;
        return this;
    }
    public Long getAuthBeginTime() {
        return this.authBeginTime;
    }

    public StartIpPackagetradeRequest setAuthEndTime(Long authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public Long getAuthEndTime() {
        return this.authEndTime;
    }

    public StartIpPackagetradeRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
