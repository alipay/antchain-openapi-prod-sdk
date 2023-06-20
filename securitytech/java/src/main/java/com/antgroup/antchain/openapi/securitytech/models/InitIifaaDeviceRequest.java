// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class InitIifaaDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产商code
    @NameInMap("corp_code")
    @Validation(required = true)
    public String corpCode;

    // 设备类型
    @NameInMap("device_type")
    @Validation(required = true)
    public String deviceType;

    // 设备信息
    @NameInMap("device_info")
    @Validation(required = true)
    public String deviceInfo;

    public static InitIifaaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIifaaDeviceRequest self = new InitIifaaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public InitIifaaDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIifaaDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIifaaDeviceRequest setCorpCode(String corpCode) {
        this.corpCode = corpCode;
        return this;
    }
    public String getCorpCode() {
        return this.corpCode;
    }

    public InitIifaaDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public InitIifaaDeviceRequest setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

}
