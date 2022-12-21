// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteIotbasicDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备所属用户
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 设备did签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static DeleteIotbasicDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIotbasicDeviceRequest self = new DeleteIotbasicDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIotbasicDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteIotbasicDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteIotbasicDeviceRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public DeleteIotbasicDeviceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteIotbasicDeviceRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
