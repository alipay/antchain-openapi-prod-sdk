// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.txmzspu.models;

import com.aliyun.tea.*;

public class EncryptBlockchainBotIdsquaredAuthRequest extends TeaModel {
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

    public static EncryptBlockchainBotIdsquaredAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptBlockchainBotIdsquaredAuthRequest self = new EncryptBlockchainBotIdsquaredAuthRequest();
        return TeaModel.build(map, self);
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setProductSource(Long productSource) {
        this.productSource = productSource;
        return this;
    }
    public Long getProductSource() {
        return this.productSource;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setDeviceAuthCode(String deviceAuthCode) {
        this.deviceAuthCode = deviceAuthCode;
        return this;
    }
    public String getDeviceAuthCode() {
        return this.deviceAuthCode;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setDeviceExtra(String deviceExtra) {
        this.deviceExtra = deviceExtra;
        return this;
    }
    public String getDeviceExtra() {
        return this.deviceExtra;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setDeviceChallenge(String deviceChallenge) {
        this.deviceChallenge = deviceChallenge;
        return this;
    }
    public String getDeviceChallenge() {
        return this.deviceChallenge;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setServerExtra(String serverExtra) {
        this.serverExtra = serverExtra;
        return this;
    }
    public String getServerExtra() {
        return this.serverExtra;
    }

    public EncryptBlockchainBotIdsquaredAuthRequest setId2(String id2) {
        this.id2 = id2;
        return this;
    }
    public String getId2() {
        return this.id2;
    }

}
