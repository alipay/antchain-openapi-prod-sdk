// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class StartIpAuthtradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 采购者的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // IP ID
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 收费模式：0 销售抽佣, 1 按量付费
    @NameInMap("charge_type")
    public Long chargeType;

    // 授权计费比例
    @NameInMap("auth_rate")
    public String authRate;

    // 按量付费的收费单价（按量付费模式必填）
    @NameInMap("auth_price")
    public String authPrice;

    // 授权合作开始期限（毫秒时间戳）
    @NameInMap("auth_begin_time")
    @Validation(required = true)
    public Long authBeginTime;

    // 授权合作结束期限（毫秒时间戳）
    @NameInMap("auth_end_time")
    @Validation(required = true)
    public Long authEndTime;

    // 合同（文件URL）
    @NameInMap("contract")
    @Validation(required = true)
    public String contract;

    // 设计稿（文件URL）
    @NameInMap("design_draft")
    public String designDraft;

    // 授权产品范围
    @NameInMap("auth_product_scope")
    public String authProductScope;

    // 授权地域范围
    @NameInMap("auth_area_scope")
    public String authAreaScope;

    // 商品销售渠道
    @NameInMap("sales_channel")
    public String salesChannel;

    // 备注消息(不超过256个字符)
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 是否有保底金
    @NameInMap("guaranteed")
    @Validation(required = true)
    public Boolean guaranteed;

    // 支付的保底金金额
    @NameInMap("guaranteed_fund")
    public String guaranteedFund;

    // 保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
    @NameInMap("guaranteed_goods_amount")
    public Long guaranteedGoodsAmount;

    // 保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
    @NameInMap("guaranteed_sales")
    public String guaranteedSales;

    // 0 IP交易，1 增值服务交易
    @NameInMap("goods_type")
    public Long goodsType;

    // 增值服务交易绑定的ip授权交易订单，增值服务交易必填
    @NameInMap("related_order_id")
    public String relatedOrderId;

    // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
    @NameInMap("pay_return_url")
    public String payReturnUrl;

    public static StartIpAuthtradeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartIpAuthtradeRequest self = new StartIpAuthtradeRequest();
        return TeaModel.build(map, self);
    }

    public StartIpAuthtradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartIpAuthtradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartIpAuthtradeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public StartIpAuthtradeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public StartIpAuthtradeRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public StartIpAuthtradeRequest setChargeType(Long chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public Long getChargeType() {
        return this.chargeType;
    }

    public StartIpAuthtradeRequest setAuthRate(String authRate) {
        this.authRate = authRate;
        return this;
    }
    public String getAuthRate() {
        return this.authRate;
    }

    public StartIpAuthtradeRequest setAuthPrice(String authPrice) {
        this.authPrice = authPrice;
        return this;
    }
    public String getAuthPrice() {
        return this.authPrice;
    }

    public StartIpAuthtradeRequest setAuthBeginTime(Long authBeginTime) {
        this.authBeginTime = authBeginTime;
        return this;
    }
    public Long getAuthBeginTime() {
        return this.authBeginTime;
    }

    public StartIpAuthtradeRequest setAuthEndTime(Long authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public Long getAuthEndTime() {
        return this.authEndTime;
    }

    public StartIpAuthtradeRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public StartIpAuthtradeRequest setDesignDraft(String designDraft) {
        this.designDraft = designDraft;
        return this;
    }
    public String getDesignDraft() {
        return this.designDraft;
    }

    public StartIpAuthtradeRequest setAuthProductScope(String authProductScope) {
        this.authProductScope = authProductScope;
        return this;
    }
    public String getAuthProductScope() {
        return this.authProductScope;
    }

    public StartIpAuthtradeRequest setAuthAreaScope(String authAreaScope) {
        this.authAreaScope = authAreaScope;
        return this;
    }
    public String getAuthAreaScope() {
        return this.authAreaScope;
    }

    public StartIpAuthtradeRequest setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }
    public String getSalesChannel() {
        return this.salesChannel;
    }

    public StartIpAuthtradeRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public StartIpAuthtradeRequest setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }
    public Boolean getGuaranteed() {
        return this.guaranteed;
    }

    public StartIpAuthtradeRequest setGuaranteedFund(String guaranteedFund) {
        this.guaranteedFund = guaranteedFund;
        return this;
    }
    public String getGuaranteedFund() {
        return this.guaranteedFund;
    }

    public StartIpAuthtradeRequest setGuaranteedGoodsAmount(Long guaranteedGoodsAmount) {
        this.guaranteedGoodsAmount = guaranteedGoodsAmount;
        return this;
    }
    public Long getGuaranteedGoodsAmount() {
        return this.guaranteedGoodsAmount;
    }

    public StartIpAuthtradeRequest setGuaranteedSales(String guaranteedSales) {
        this.guaranteedSales = guaranteedSales;
        return this;
    }
    public String getGuaranteedSales() {
        return this.guaranteedSales;
    }

    public StartIpAuthtradeRequest setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public Long getGoodsType() {
        return this.goodsType;
    }

    public StartIpAuthtradeRequest setRelatedOrderId(String relatedOrderId) {
        this.relatedOrderId = relatedOrderId;
        return this;
    }
    public String getRelatedOrderId() {
        return this.relatedOrderId;
    }

    public StartIpAuthtradeRequest setPayReturnUrl(String payReturnUrl) {
        this.payReturnUrl = payReturnUrl;
        return this;
    }
    public String getPayReturnUrl() {
        return this.payReturnUrl;
    }

}
