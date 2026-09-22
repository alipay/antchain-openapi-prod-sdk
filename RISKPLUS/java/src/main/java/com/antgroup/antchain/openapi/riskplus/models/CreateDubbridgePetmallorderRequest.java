// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateDubbridgePetmallorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道编码
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 流量平台
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 买家用户id
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 商户入驻id
    @NameInMap("merchant_id")
    public String merchantId;

    // 商城订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 关联交易单号，储值卡来源 trade_no，储值卡金额只能消耗该 trade_no 下的余额
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商品标价，单位：元
    @NameInMap("product_amount")
    @Validation(required = true)
    public String productAmount;

    // 储值卡支付结算金额，用于冻结/出账/分账的基数，单位元，两位小数
    @NameInMap("point_amount")
    @Validation(required = true)
    public String pointAmount;

    public static CreateDubbridgePetmallorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDubbridgePetmallorderRequest self = new CreateDubbridgePetmallorderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDubbridgePetmallorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDubbridgePetmallorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDubbridgePetmallorderRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public CreateDubbridgePetmallorderRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public CreateDubbridgePetmallorderRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public CreateDubbridgePetmallorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateDubbridgePetmallorderRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public CreateDubbridgePetmallorderRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public CreateDubbridgePetmallorderRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public CreateDubbridgePetmallorderRequest setProductAmount(String productAmount) {
        this.productAmount = productAmount;
        return this;
    }
    public String getProductAmount() {
        return this.productAmount;
    }

    public CreateDubbridgePetmallorderRequest setPointAmount(String pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }
    public String getPointAmount() {
        return this.pointAmount;
    }

}
