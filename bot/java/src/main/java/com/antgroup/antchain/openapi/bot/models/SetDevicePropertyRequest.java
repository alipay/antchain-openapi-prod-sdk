// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SetDevicePropertyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // json格式属性信息，由标识符与属性值（key:value）构成，多个属性用英文逗号隔开。
    @NameInMap("property")
    @Validation(required = true)
    public String property;

    // 签名，用设备秘钥进行签名，只对deviceDid加签
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static SetDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePropertyRequest self = new SetDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetDevicePropertyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDevicePropertyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetDevicePropertyRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public SetDevicePropertyRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public SetDevicePropertyRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
