// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFundMerchantpromiseRequest extends TeaModel {
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
    @Validation(required = true, maxLength = 200, minLength = 1)
    public String merchantId;

    // json字符串,填入「MerchantPromiseReq」的json字符串
    @NameInMap("biz_content")
    @Validation(required = true, minLength = 1)
    public String bizContent;

    public static SyncAntchainAtoFundMerchantpromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFundMerchantpromiseRequest self = new SyncAntchainAtoFundMerchantpromiseRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFundMerchantpromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFundMerchantpromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFundMerchantpromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoFundMerchantpromiseRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncAntchainAtoFundMerchantpromiseRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
