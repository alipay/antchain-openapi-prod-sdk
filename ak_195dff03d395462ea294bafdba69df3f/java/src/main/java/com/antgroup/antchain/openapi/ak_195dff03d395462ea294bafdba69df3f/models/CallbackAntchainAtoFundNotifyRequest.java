// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CallbackAntchainAtoFundNotifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ASYNC_UNSIGN_APPLY
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static CallbackAntchainAtoFundNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAntchainAtoFundNotifyRequest self = new CallbackAntchainAtoFundNotifyRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAntchainAtoFundNotifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAntchainAtoFundNotifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackAntchainAtoFundNotifyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CallbackAntchainAtoFundNotifyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
