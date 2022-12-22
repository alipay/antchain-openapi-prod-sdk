// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的请求id，需保证唯一
    @NameInMap("auth_id")
    @Validation(required = true)
    public String authId;

    // 调用方请求的数据类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权结果通知调用方的方式
    @NameInMap("callback_type")
    @Validation(required = true)
    public String callbackType;

    // 授权结果通知调用方的地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    public static StartAuthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthDataRequest self = new StartAuthDataRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthDataRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public StartAuthDataRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public StartAuthDataRequest setCallbackType(String callbackType) {
        this.callbackType = callbackType;
        return this;
    }
    public String getCallbackType() {
        return this.callbackType;
    }

    public StartAuthDataRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

}
