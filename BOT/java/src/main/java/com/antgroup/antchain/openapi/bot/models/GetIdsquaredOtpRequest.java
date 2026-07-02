// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetIdsquaredOtpRequest extends TeaModel {
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

    public static GetIdsquaredOtpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdsquaredOtpRequest self = new GetIdsquaredOtpRequest();
        return TeaModel.build(map, self);
    }

    public GetIdsquaredOtpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetIdsquaredOtpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetIdsquaredOtpRequest setDeviceAuthCode(String deviceAuthCode) {
        this.deviceAuthCode = deviceAuthCode;
        return this;
    }
    public String getDeviceAuthCode() {
        return this.deviceAuthCode;
    }

    public GetIdsquaredOtpRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

}
