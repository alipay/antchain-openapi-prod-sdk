// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadIpAuthtradesalesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 上传记录的用户的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // true 只上链不走真实支付，false 上链并链下真实支付账单
    @NameInMap("only_call_blockchain")
    @Validation(required = true)
    public Boolean onlyCallBlockchain;

    // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
    @NameInMap("pay_return_url")
    public String payReturnUrl;

    // 授权佣金比例
    @NameInMap("auth_rate")
    public String authRate;

    // 定向授权按量付费单价
    @NameInMap("auth_price")
    public String authPrice;

    // 本次结算周期开始时间
    @NameInMap("settlement_begin_time")
    @Validation(required = true)
    public Long settlementBeginTime;

    // 本次结算周期结束时间
    @NameInMap("settlement_end_time")
    @Validation(required = true)
    public Long settlementEndTime;

    // 零售价
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 终端商品销售数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 销售金额
    @NameInMap("sales")
    @Validation(required = true)
    public String sales;

    // 实付金额
    @NameInMap("payment")
    @Validation(required = true)
    public String payment;

    // 终端商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 终端商品图片
    @NameInMap("goods_image")
    public String goodsImage;

    // 终端销售渠道
    @NameInMap("sales_channel")
    public String salesChannel;

    // 终端商品链接
    @NameInMap("goods_url")
    public String goodsUrl;

    // 商品信息
    @NameInMap("goods_info")
    @Validation(required = true)
    public String goodsInfo;

    // 数据上传操作者
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static UploadIpAuthtradesalesRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadIpAuthtradesalesRequest self = new UploadIpAuthtradesalesRequest();
        return TeaModel.build(map, self);
    }

    public UploadIpAuthtradesalesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadIpAuthtradesalesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadIpAuthtradesalesRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UploadIpAuthtradesalesRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UploadIpAuthtradesalesRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public UploadIpAuthtradesalesRequest setOnlyCallBlockchain(Boolean onlyCallBlockchain) {
        this.onlyCallBlockchain = onlyCallBlockchain;
        return this;
    }
    public Boolean getOnlyCallBlockchain() {
        return this.onlyCallBlockchain;
    }

    public UploadIpAuthtradesalesRequest setPayReturnUrl(String payReturnUrl) {
        this.payReturnUrl = payReturnUrl;
        return this;
    }
    public String getPayReturnUrl() {
        return this.payReturnUrl;
    }

    public UploadIpAuthtradesalesRequest setAuthRate(String authRate) {
        this.authRate = authRate;
        return this;
    }
    public String getAuthRate() {
        return this.authRate;
    }

    public UploadIpAuthtradesalesRequest setAuthPrice(String authPrice) {
        this.authPrice = authPrice;
        return this;
    }
    public String getAuthPrice() {
        return this.authPrice;
    }

    public UploadIpAuthtradesalesRequest setSettlementBeginTime(Long settlementBeginTime) {
        this.settlementBeginTime = settlementBeginTime;
        return this;
    }
    public Long getSettlementBeginTime() {
        return this.settlementBeginTime;
    }

    public UploadIpAuthtradesalesRequest setSettlementEndTime(Long settlementEndTime) {
        this.settlementEndTime = settlementEndTime;
        return this;
    }
    public Long getSettlementEndTime() {
        return this.settlementEndTime;
    }

    public UploadIpAuthtradesalesRequest setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public UploadIpAuthtradesalesRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public UploadIpAuthtradesalesRequest setSales(String sales) {
        this.sales = sales;
        return this;
    }
    public String getSales() {
        return this.sales;
    }

    public UploadIpAuthtradesalesRequest setPayment(String payment) {
        this.payment = payment;
        return this;
    }
    public String getPayment() {
        return this.payment;
    }

    public UploadIpAuthtradesalesRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public UploadIpAuthtradesalesRequest setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
        return this;
    }
    public String getGoodsImage() {
        return this.goodsImage;
    }

    public UploadIpAuthtradesalesRequest setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }
    public String getSalesChannel() {
        return this.salesChannel;
    }

    public UploadIpAuthtradesalesRequest setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
        return this;
    }
    public String getGoodsUrl() {
        return this.goodsUrl;
    }

    public UploadIpAuthtradesalesRequest setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
        return this;
    }
    public String getGoodsInfo() {
        return this.goodsInfo;
    }

    public UploadIpAuthtradesalesRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UploadIpAuthtradesalesRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
