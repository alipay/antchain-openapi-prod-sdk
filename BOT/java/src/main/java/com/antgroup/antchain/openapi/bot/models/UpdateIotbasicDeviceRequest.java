// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateIotbasicDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备名称
    @NameInMap("device_name")
    public String deviceName;

    // 安装位置
    @NameInMap("location")
    public String location;

    // 设备扩展信息
    @NameInMap("device_ext")
    public String deviceExt;

    // 设备标签
    @NameInMap("nick_name")
    public String nickName;

    // 设备签名
    @NameInMap("device_signature")
    @Validation(required = true)
    public String deviceSignature;

    public static UpdateIotbasicDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIotbasicDeviceRequest self = new UpdateIotbasicDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIotbasicDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIotbasicDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIotbasicDeviceRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public UpdateIotbasicDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UpdateIotbasicDeviceRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateIotbasicDeviceRequest setDeviceExt(String deviceExt) {
        this.deviceExt = deviceExt;
        return this;
    }
    public String getDeviceExt() {
        return this.deviceExt;
    }

    public UpdateIotbasicDeviceRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public UpdateIotbasicDeviceRequest setDeviceSignature(String deviceSignature) {
        this.deviceSignature = deviceSignature;
        return this;
    }
    public String getDeviceSignature() {
        return this.deviceSignature;
    }

}
