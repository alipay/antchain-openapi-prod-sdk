// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ReplaceTradeUserpromiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // json字符串
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // order_id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 6)
    public String orderId;

    // 订单所属商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 200)
    public String merchantId;

    public static ReplaceTradeUserpromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceTradeUserpromiseRequest self = new ReplaceTradeUserpromiseRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceTradeUserpromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReplaceTradeUserpromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReplaceTradeUserpromiseRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ReplaceTradeUserpromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ReplaceTradeUserpromiseRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
