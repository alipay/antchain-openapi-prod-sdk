// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFundFinanceloanresultsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 商家的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 200, minLength = 1)
    public String merchantId;

    // json字符串,填入「FinanceLoanResultsReq」的json字符串
    @NameInMap("biz_content")
    @Validation(required = true, minLength = 1)
    public String bizContent;

    // 资方的社会信用代码
    @NameInMap("fund_id")
    @Validation(maxLength = 64)
    public String fundId;

    public static SyncAntchainAtoFundFinanceloanresultsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFundFinanceloanresultsRequest self = new SyncAntchainAtoFundFinanceloanresultsRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFundFinanceloanresultsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFundFinanceloanresultsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFundFinanceloanresultsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoFundFinanceloanresultsRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncAntchainAtoFundFinanceloanresultsRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public SyncAntchainAtoFundFinanceloanresultsRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

}
