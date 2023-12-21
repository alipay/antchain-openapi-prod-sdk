// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class AuthAntchainAtoFundFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单所属商户的统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户的订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 签署的电子合同ID
    @NameInMap("sign_no")
    @Validation(required = true)
    public String signNo;

    // 签署区域的tag，和发起签署流程的机构的tag对应
    @NameInMap("tag")
    @Validation(required = true)
    public String tag;

    public static AuthAntchainAtoFundFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthAntchainAtoFundFlowRequest self = new AuthAntchainAtoFundFlowRequest();
        return TeaModel.build(map, self);
    }

    public AuthAntchainAtoFundFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthAntchainAtoFundFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthAntchainAtoFundFlowRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AuthAntchainAtoFundFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AuthAntchainAtoFundFlowRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public AuthAntchainAtoFundFlowRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
