// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncTradePromoorderinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 63, minLength = 1)
    public String merchantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 49, minLength = 7)
    public String orderId;

    // 营销id
    @NameInMap("promotion_id")
    @Validation(required = true, maxLength = 63, minLength = 1)
    public String promotionId;

    // 订单创建时间
    @NameInMap("order_create_time")
    @Validation(required = true, maxLength = 20, minLength = 1)
    public String orderCreateTime;

    // 买断价，单位为分
    @NameInMap("buy_out_price")
    @Validation(required = true)
    public Long buyOutPrice;

    // 代扣履约总金额，单位为分
    @NameInMap("order_promise_total_money")
    @Validation(required = true, minimum = 1)
    public Long orderPromiseTotalMoney;

    // 商户公司的名字
    @NameInMap("merchant_name")
    @Validation(required = true, maxLength = 199, minLength = 1)
    public String merchantName;

    public static SyncTradePromoorderinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTradePromoorderinfoRequest self = new SyncTradePromoorderinfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncTradePromoorderinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTradePromoorderinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncTradePromoorderinfoRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncTradePromoorderinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncTradePromoorderinfoRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public SyncTradePromoorderinfoRequest setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public SyncTradePromoorderinfoRequest setBuyOutPrice(Long buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }
    public Long getBuyOutPrice() {
        return this.buyOutPrice;
    }

    public SyncTradePromoorderinfoRequest setOrderPromiseTotalMoney(Long orderPromiseTotalMoney) {
        this.orderPromiseTotalMoney = orderPromiseTotalMoney;
        return this;
    }
    public Long getOrderPromiseTotalMoney() {
        return this.orderPromiseTotalMoney;
    }

    public SyncTradePromoorderinfoRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

}
