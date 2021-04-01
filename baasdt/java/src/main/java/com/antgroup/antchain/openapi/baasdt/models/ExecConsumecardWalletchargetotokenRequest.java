// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardWalletchargetotokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 充值的金额(单位为:元,精确到小数点后2位)
    @NameInMap("charge_amount")
    @Validation(required = true)
    public String chargeAmount;

    public static ExecConsumecardWalletchargetotokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardWalletchargetotokenRequest self = new ExecConsumecardWalletchargetotokenRequest();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardWalletchargetotokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecConsumecardWalletchargetotokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecConsumecardWalletchargetotokenRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ExecConsumecardWalletchargetotokenRequest setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }
    public String getChargeAmount() {
        return this.chargeAmount;
    }

}
