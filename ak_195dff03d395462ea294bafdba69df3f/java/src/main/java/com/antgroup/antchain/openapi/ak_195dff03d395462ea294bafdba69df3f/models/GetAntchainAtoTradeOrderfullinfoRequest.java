// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class GetAntchainAtoTradeOrderfullinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 49, minLength = 7)
    public String orderId;

    // merchant_id
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 199, minLength = 1)
    public String merchantId;

    // 订单业务类型
    @NameInMap("biz_type")
    @Validation(required = true, minLength = 1)
    public String bizType;

    public static GetAntchainAtoTradeOrderfullinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainAtoTradeOrderfullinfoRequest self = new GetAntchainAtoTradeOrderfullinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAntchainAtoTradeOrderfullinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntchainAtoTradeOrderfullinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAntchainAtoTradeOrderfullinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAntchainAtoTradeOrderfullinfoRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public GetAntchainAtoTradeOrderfullinfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
