// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEpayauthVerifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 打款金额，只支持两位小数点的正数，单位：元
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 支付币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 打款验证ID 打款验证受理后生成的一个唯一标识
    @NameInMap("verify_id")
    @Validation(required = true)
    public String verifyId;

    public static QueryEpayauthVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEpayauthVerifyRequest self = new QueryEpayauthVerifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryEpayauthVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEpayauthVerifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEpayauthVerifyRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public QueryEpayauthVerifyRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryEpayauthVerifyRequest setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

}
