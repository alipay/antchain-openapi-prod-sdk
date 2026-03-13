// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAgoraxTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户编号
    @NameInMap("external_id")
    @Validation(required = true)
    public String externalId;

    // 支付类型
    @NameInMap("pay_type")
    @Validation(required = true)
    public String payType;

    // 商户订单号
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 订单总金额（元）
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    // 订单标题
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 描述结算信息
    @NameInMap("settle_info")
    @Validation(required = true)
    public SettleInfo settleInfo;

    // 买家支付宝 openid
    @NameInMap("buyer_open_id")
    public String buyerOpenId;

    // 产品码
    @NameInMap("product_code")
    public String productCode;

    // 支付授权码
    @NameInMap("auth_code")
    public String authCode;

    // 支付场景
    @NameInMap("scene")
    public String scene;

    // 商户实际经营主体的小程序应用的 appid
    @NameInMap("op_app_id")
    public String opAppId;

    // 分账明细信息
    @NameInMap("royalty_parameters")
    public java.util.List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters;

    // 卖家支付宝用户 ID
    @NameInMap("seller_id")
    public String sellerId;

    // 订单包含的商品列表信息
    @NameInMap("goods_details")
    public java.util.List<GoodsDetail> goodsDetails;

    // 订单绝对超时时间
    @NameInMap("time_expire")
    public String timeExpire;

    public static CreateAgoraxTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgoraxTradeRequest self = new CreateAgoraxTradeRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgoraxTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAgoraxTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAgoraxTradeRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public CreateAgoraxTradeRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateAgoraxTradeRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public CreateAgoraxTradeRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public CreateAgoraxTradeRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateAgoraxTradeRequest setSettleInfo(SettleInfo settleInfo) {
        this.settleInfo = settleInfo;
        return this;
    }
    public SettleInfo getSettleInfo() {
        return this.settleInfo;
    }

    public CreateAgoraxTradeRequest setBuyerOpenId(String buyerOpenId) {
        this.buyerOpenId = buyerOpenId;
        return this;
    }
    public String getBuyerOpenId() {
        return this.buyerOpenId;
    }

    public CreateAgoraxTradeRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateAgoraxTradeRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CreateAgoraxTradeRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateAgoraxTradeRequest setOpAppId(String opAppId) {
        this.opAppId = opAppId;
        return this;
    }
    public String getOpAppId() {
        return this.opAppId;
    }

    public CreateAgoraxTradeRequest setRoyaltyParameters(java.util.List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters) {
        this.royaltyParameters = royaltyParameters;
        return this;
    }
    public java.util.List<OpenApiRoyaltyDetailInfoPojo> getRoyaltyParameters() {
        return this.royaltyParameters;
    }

    public CreateAgoraxTradeRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public CreateAgoraxTradeRequest setGoodsDetails(java.util.List<GoodsDetail> goodsDetails) {
        this.goodsDetails = goodsDetails;
        return this;
    }
    public java.util.List<GoodsDetail> getGoodsDetails() {
        return this.goodsDetails;
    }

    public CreateAgoraxTradeRequest setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
        return this;
    }
    public String getTimeExpire() {
        return this.timeExpire;
    }

}
