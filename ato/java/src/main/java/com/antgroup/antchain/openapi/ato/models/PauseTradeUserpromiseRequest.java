// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PauseTradeUserpromiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, minLength = 1)
    public String orderId;

    // 社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, minLength = 1)
    public String merchantId;

    // 理由
    @NameInMap("reason")
    @Validation(required = true, minLength = 1)
    public String reason;

    public static PauseTradeUserpromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseTradeUserpromiseRequest self = new PauseTradeUserpromiseRequest();
        return TeaModel.build(map, self);
    }

    public PauseTradeUserpromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PauseTradeUserpromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PauseTradeUserpromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PauseTradeUserpromiseRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public PauseTradeUserpromiseRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
