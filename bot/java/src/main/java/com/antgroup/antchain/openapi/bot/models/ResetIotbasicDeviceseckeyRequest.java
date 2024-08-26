// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ResetIotbasicDeviceseckeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 签名，使用设备密钥对设备did进行签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static ResetIotbasicDeviceseckeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetIotbasicDeviceseckeyRequest self = new ResetIotbasicDeviceseckeyRequest();
        return TeaModel.build(map, self);
    }

    public ResetIotbasicDeviceseckeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetIotbasicDeviceseckeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetIotbasicDeviceseckeyRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public ResetIotbasicDeviceseckeyRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
