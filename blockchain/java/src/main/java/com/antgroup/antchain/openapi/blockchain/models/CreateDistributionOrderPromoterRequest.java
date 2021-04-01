// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDistributionOrderPromoterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 购买用户id
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 佣金
    @NameInMap("commission")
    @Validation(required = true)
    public String commission;

    // 佣金比例 10表示10%
    @NameInMap("commission_rate")
    @Validation(required = true)
    public String commissionRate;

    // 推广订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单金额
    @NameInMap("order_price")
    @Validation(required = true)
    public String orderPrice;

    // 推广人上级ID
    @NameInMap("prev_promoter_id")
    @Validation(required = true)
    public String prevPromoterId;

    // 推广人上级分佣金额
    @NameInMap("prev_promoter_price")
    @Validation(required = true)
    public String prevPromoterPrice;

    // 商品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 推广人id
    @NameInMap("promoter_id")
    @Validation(required = true)
    public String promoterId;

    public static CreateDistributionOrderPromoterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionOrderPromoterRequest self = new CreateDistributionOrderPromoterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionOrderPromoterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributionOrderPromoterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributionOrderPromoterRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public CreateDistributionOrderPromoterRequest setCommission(String commission) {
        this.commission = commission;
        return this;
    }
    public String getCommission() {
        return this.commission;
    }

    public CreateDistributionOrderPromoterRequest setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
        return this;
    }
    public String getCommissionRate() {
        return this.commissionRate;
    }

    public CreateDistributionOrderPromoterRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDistributionOrderPromoterRequest setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public String getOrderPrice() {
        return this.orderPrice;
    }

    public CreateDistributionOrderPromoterRequest setPrevPromoterId(String prevPromoterId) {
        this.prevPromoterId = prevPromoterId;
        return this;
    }
    public String getPrevPromoterId() {
        return this.prevPromoterId;
    }

    public CreateDistributionOrderPromoterRequest setPrevPromoterPrice(String prevPromoterPrice) {
        this.prevPromoterPrice = prevPromoterPrice;
        return this;
    }
    public String getPrevPromoterPrice() {
        return this.prevPromoterPrice;
    }

    public CreateDistributionOrderPromoterRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateDistributionOrderPromoterRequest setPromoterId(String promoterId) {
        this.promoterId = promoterId;
        return this;
    }
    public String getPromoterId() {
        return this.promoterId;
    }

}
