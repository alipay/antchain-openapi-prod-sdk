// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ApplyIpPackagetradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 买方的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // IP授权交易时传入IP ID；增值服务交易时传入服务ID
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

    // 授权产品范围
    @NameInMap("auth_product_scope")
    public String authProductScope;

    // 授权地域范围
    @NameInMap("auth_area_scope")
    public String authAreaScope;

    // 商品销售渠道
    @NameInMap("sales_channel")
    public String salesChannel;

    // 0 IP交易，1 增值服务交易
    @NameInMap("goods_type")
    public Long goodsType;

    // 增值服务交易绑定的ip授权交易订单，增值服务交易必填
    @NameInMap("related_order_id")
    public String relatedOrderId;

    // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
    @NameInMap("pay_return_url")
    public String payReturnUrl;

    public static ApplyIpPackagetradeRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyIpPackagetradeRequest self = new ApplyIpPackagetradeRequest();
        return TeaModel.build(map, self);
    }

    public ApplyIpPackagetradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyIpPackagetradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyIpPackagetradeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ApplyIpPackagetradeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ApplyIpPackagetradeRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public ApplyIpPackagetradeRequest setOnlyCallBlockchain(Boolean onlyCallBlockchain) {
        this.onlyCallBlockchain = onlyCallBlockchain;
        return this;
    }
    public Boolean getOnlyCallBlockchain() {
        return this.onlyCallBlockchain;
    }

    public ApplyIpPackagetradeRequest setPriceRange(String priceRange) {
        this.priceRange = priceRange;
        return this;
    }
    public String getPriceRange() {
        return this.priceRange;
    }

    public ApplyIpPackagetradeRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ApplyIpPackagetradeRequest setExpectedTotalPrice(String expectedTotalPrice) {
        this.expectedTotalPrice = expectedTotalPrice;
        return this;
    }
    public String getExpectedTotalPrice() {
        return this.expectedTotalPrice;
    }

    public ApplyIpPackagetradeRequest setAuthBeginTime(Long authBeginTime) {
        this.authBeginTime = authBeginTime;
        return this;
    }
    public Long getAuthBeginTime() {
        return this.authBeginTime;
    }

    public ApplyIpPackagetradeRequest setAuthEndTime(Long authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public Long getAuthEndTime() {
        return this.authEndTime;
    }

    public ApplyIpPackagetradeRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ApplyIpPackagetradeRequest setAuthProductScope(String authProductScope) {
        this.authProductScope = authProductScope;
        return this;
    }
    public String getAuthProductScope() {
        return this.authProductScope;
    }

    public ApplyIpPackagetradeRequest setAuthAreaScope(String authAreaScope) {
        this.authAreaScope = authAreaScope;
        return this;
    }
    public String getAuthAreaScope() {
        return this.authAreaScope;
    }

    public ApplyIpPackagetradeRequest setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }
    public String getSalesChannel() {
        return this.salesChannel;
    }

    public ApplyIpPackagetradeRequest setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public Long getGoodsType() {
        return this.goodsType;
    }

    public ApplyIpPackagetradeRequest setRelatedOrderId(String relatedOrderId) {
        this.relatedOrderId = relatedOrderId;
        return this;
    }
    public String getRelatedOrderId() {
        return this.relatedOrderId;
    }

    public ApplyIpPackagetradeRequest setPayReturnUrl(String payReturnUrl) {
        this.payReturnUrl = payReturnUrl;
        return this;
    }
    public String getPayReturnUrl() {
        return this.payReturnUrl;
    }

}
