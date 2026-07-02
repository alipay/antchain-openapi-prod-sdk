// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncFundFinanceloanresultsRequest extends TeaModel {
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

    public static SyncFundFinanceloanresultsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFundFinanceloanresultsRequest self = new SyncFundFinanceloanresultsRequest();
        return TeaModel.build(map, self);
    }

    public SyncFundFinanceloanresultsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFundFinanceloanresultsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFundFinanceloanresultsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncFundFinanceloanresultsRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncFundFinanceloanresultsRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public SyncFundFinanceloanresultsRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

}
