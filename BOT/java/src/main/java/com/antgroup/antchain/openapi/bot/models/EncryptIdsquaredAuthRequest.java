// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EncryptIdsquaredAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待加密原文
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // productSource
    @NameInMap("product_source")
    public Long productSource;

    // 客户端鉴权码
    @NameInMap("device_auth_code")
    @Validation(required = true)
    public String deviceAuthCode;

    // deviceExtra
    @NameInMap("device_extra")
    public String deviceExtra;

    // apiVersion
    @NameInMap("api_version")
    public String apiVersion;

    // productKey
    @NameInMap("product_key")
    public String productKey;

    // deviceChallenge客户端挑战码
    @NameInMap("device_challenge")
    public String deviceChallenge;

    // serverExtra
    @NameInMap("server_extra")
    public String serverExtra;

    // id2
    @NameInMap("id2")
    @Validation(required = true)
    public String id2;

    public static EncryptIdsquaredAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptIdsquaredAuthRequest self = new EncryptIdsquaredAuthRequest();
        return TeaModel.build(map, self);
    }

    public EncryptIdsquaredAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EncryptIdsquaredAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EncryptIdsquaredAuthRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EncryptIdsquaredAuthRequest setProductSource(Long productSource) {
        this.productSource = productSource;
        return this;
    }
    public Long getProductSource() {
        return this.productSource;
    }

    public EncryptIdsquaredAuthRequest setDeviceAuthCode(String deviceAuthCode) {
        this.deviceAuthCode = deviceAuthCode;
        return this;
    }
    public String getDeviceAuthCode() {
        return this.deviceAuthCode;
    }

    public EncryptIdsquaredAuthRequest setDeviceExtra(String deviceExtra) {
        this.deviceExtra = deviceExtra;
        return this;
    }
    public String getDeviceExtra() {
        return this.deviceExtra;
    }

    public EncryptIdsquaredAuthRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public EncryptIdsquaredAuthRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public EncryptIdsquaredAuthRequest setDeviceChallenge(String deviceChallenge) {
        this.deviceChallenge = deviceChallenge;
        return this;
    }
    public String getDeviceChallenge() {
        return this.deviceChallenge;
    }

    public EncryptIdsquaredAuthRequest setServerExtra(String serverExtra) {
        this.serverExtra = serverExtra;
        return this;
    }
    public String getServerExtra() {
        return this.serverExtra;
    }

    public EncryptIdsquaredAuthRequest setId2(String id2) {
        this.id2 = id2;
        return this;
    }
    public String getId2() {
        return this.id2;
    }

}
