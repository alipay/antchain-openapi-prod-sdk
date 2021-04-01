// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardWalletredeemtokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 期望要回退的金额(单位:元,精确到分)
    @NameInMap("redeem_amount")
    public String redeemAmount;

    public static ExecConsumecardWalletredeemtokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardWalletredeemtokenRequest self = new ExecConsumecardWalletredeemtokenRequest();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardWalletredeemtokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecConsumecardWalletredeemtokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecConsumecardWalletredeemtokenRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ExecConsumecardWalletredeemtokenRequest setRedeemAmount(String redeemAmount) {
        this.redeemAmount = redeemAmount;
        return this;
    }
    public String getRedeemAmount() {
        return this.redeemAmount;
    }

}
