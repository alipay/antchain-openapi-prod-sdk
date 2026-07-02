// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AddTradeFinanceprecheckRequest extends TeaModel {
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

    public static AddTradeFinanceprecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTradeFinanceprecheckRequest self = new AddTradeFinanceprecheckRequest();
        return TeaModel.build(map, self);
    }

    public AddTradeFinanceprecheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddTradeFinanceprecheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddTradeFinanceprecheckRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AddTradeFinanceprecheckRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AddTradeFinanceprecheckRequest setFundIdList(java.util.List<String> fundIdList) {
        this.fundIdList = fundIdList;
        return this;
    }
    public java.util.List<String> getFundIdList() {
        return this.fundIdList;
    }

}
