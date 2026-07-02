// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RetryInsurePayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户的订单号，后续用作和保单结果交互
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    // 保险公司产品（险种）类型
    @NameInMap("insure_product_type")
    @Validation(required = true, maxLength = 64)
    public String insureProductType;

    public static RetryInsurePayRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryInsurePayRequest self = new RetryInsurePayRequest();
        return TeaModel.build(map, self);
    }

    public RetryInsurePayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryInsurePayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryInsurePayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RetryInsurePayRequest setInsureProductType(String insureProductType) {
        this.insureProductType = insureProductType;
        return this;
    }
    public String getInsureProductType() {
        return this.insureProductType;
    }

}
