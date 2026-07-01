// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.txmzspu.models;

import com.aliyun.tea.*;

public class GetBlockchainBotIdsquaredOtpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备侧鉴权码
    @NameInMap("device_auth_code")
    @Validation(required = true)
    public String deviceAuthCode;

    // API接口版本号
    @NameInMap("api_version")
    @Validation(required = true)
    public String apiVersion;

    public static GetBlockchainBotIdsquaredOtpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainBotIdsquaredOtpRequest self = new GetBlockchainBotIdsquaredOtpRequest();
        return TeaModel.build(map, self);
    }

    public GetBlockchainBotIdsquaredOtpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBlockchainBotIdsquaredOtpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetBlockchainBotIdsquaredOtpRequest setDeviceAuthCode(String deviceAuthCode) {
        this.deviceAuthCode = deviceAuthCode;
        return this;
    }
    public String getDeviceAuthCode() {
        return this.deviceAuthCode;
    }

    public GetBlockchainBotIdsquaredOtpRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

}
