// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CreatePoiMallorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 商户入驻主体ID（商城主体）
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商城积分消费订单号，由商城生成保证唯一（幂等键）
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 预充值来源订单号（某笔支付订单的order_id，内部反查trade_no）
    @NameInMap("source_order_id")
    @Validation(required = true)
    public String sourceOrderId;

    // 订单类型：PET_PACKAGE/PET/GOODS/MEMBER
    @NameInMap("product_mode")
    @Validation(required = true)
    public String productMode;

    // 商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 结算金额（元，两位小数，≤point_amount）
    @NameInMap("product_amount")
    @Validation(required = true)
    public String productAmount;

    // 冻结金额（元，两位小数，冻结/出账/分账基数）
    @NameInMap("point_amount")
    @Validation(required = true)
    public String pointAmount;

    public static CreatePoiMallorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePoiMallorderRequest self = new CreatePoiMallorderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePoiMallorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreatePoiMallorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreatePoiMallorderRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public CreatePoiMallorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreatePoiMallorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreatePoiMallorderRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public CreatePoiMallorderRequest setProductMode(String productMode) {
        this.productMode = productMode;
        return this;
    }
    public String getProductMode() {
        return this.productMode;
    }

    public CreatePoiMallorderRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public CreatePoiMallorderRequest setProductAmount(String productAmount) {
        this.productAmount = productAmount;
        return this;
    }
    public String getProductAmount() {
        return this.productAmount;
    }

    public CreatePoiMallorderRequest setPointAmount(String pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }
    public String getPointAmount() {
        return this.pointAmount;
    }

}
