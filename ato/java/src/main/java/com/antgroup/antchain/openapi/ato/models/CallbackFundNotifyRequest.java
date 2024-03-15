// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CallbackFundNotifyRequest extends TeaModel {
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

    public static CallbackFundNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackFundNotifyRequest self = new CallbackFundNotifyRequest();
        return TeaModel.build(map, self);
    }

    public CallbackFundNotifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackFundNotifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackFundNotifyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CallbackFundNotifyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
