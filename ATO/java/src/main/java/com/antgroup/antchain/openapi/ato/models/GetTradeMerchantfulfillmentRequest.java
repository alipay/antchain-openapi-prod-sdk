// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetTradeMerchantfulfillmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    // 履约期数，不填返回为所有履约期的履约信息
    // - 如果有填写，返回当前期数的履约信息，列表长度为1
    @NameInMap("term_idx")
    public Long termIdx;

    public static GetTradeMerchantfulfillmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTradeMerchantfulfillmentRequest self = new GetTradeMerchantfulfillmentRequest();
        return TeaModel.build(map, self);
    }

    public GetTradeMerchantfulfillmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTradeMerchantfulfillmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTradeMerchantfulfillmentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetTradeMerchantfulfillmentRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public GetTradeMerchantfulfillmentRequest setTermIdx(Long termIdx) {
        this.termIdx = termIdx;
        return this;
    }
    public Long getTermIdx() {
        return this.termIdx;
    }

}
