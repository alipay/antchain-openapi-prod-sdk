// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class StartSignFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号，须为商户名下短租订单且已建签约单
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 91XXXXXXXXXXXXXXXX9W
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    public static StartSignFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSignFlowRequest self = new StartSignFlowRequest();
        return TeaModel.build(map, self);
    }

    public StartSignFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartSignFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartSignFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public StartSignFlowRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
