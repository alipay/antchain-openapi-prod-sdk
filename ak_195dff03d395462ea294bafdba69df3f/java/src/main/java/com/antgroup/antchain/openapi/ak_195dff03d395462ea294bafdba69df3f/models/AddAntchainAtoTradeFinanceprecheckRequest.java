// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class AddAntchainAtoTradeFinanceprecheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // order_id
    @NameInMap("order_id")
    @Validation(required = true, minLength = 1)
    public String orderId;

    // merchant_id
    @NameInMap("merchant_id")
    @Validation(required = true, minLength = 1)
    public String merchantId;

    // ["1","2"]
    @NameInMap("fund_id_list")
    @Validation(required = true)
    public java.util.List<String> fundIdList;

    public static AddAntchainAtoTradeFinanceprecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAntchainAtoTradeFinanceprecheckRequest self = new AddAntchainAtoTradeFinanceprecheckRequest();
        return TeaModel.build(map, self);
    }

    public AddAntchainAtoTradeFinanceprecheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAntchainAtoTradeFinanceprecheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddAntchainAtoTradeFinanceprecheckRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AddAntchainAtoTradeFinanceprecheckRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AddAntchainAtoTradeFinanceprecheckRequest setFundIdList(java.util.List<String> fundIdList) {
        this.fundIdList = fundIdList;
        return this;
    }
    public java.util.List<String> getFundIdList() {
        return this.fundIdList;
    }

}
