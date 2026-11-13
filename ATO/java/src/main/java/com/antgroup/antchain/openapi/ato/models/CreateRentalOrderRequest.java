// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateRentalOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号，商家自行传入，同租户下唯一
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 订单信息，JSON字符串，RentalOrderInfoRequest定义
    @NameInMap("order_info")
    @Validation(required = true)
    public String orderInfo;

    public static CreateRentalOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRentalOrderRequest self = new CreateRentalOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateRentalOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRentalOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRentalOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateRentalOrderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateRentalOrderRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateRentalOrderRequest setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public String getOrderInfo() {
        return this.orderInfo;
    }

}
