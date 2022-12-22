// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAuthDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方在发起授权请求时创建的请求id
    @NameInMap("auth_id")
    @Validation(required = true)
    public String authId;

    // 授权数据类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    public static GetAuthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthDataRequest self = new GetAuthDataRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAuthDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAuthDataRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public GetAuthDataRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
