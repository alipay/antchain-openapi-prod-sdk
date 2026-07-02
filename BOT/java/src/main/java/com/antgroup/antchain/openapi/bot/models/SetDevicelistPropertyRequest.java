// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SetDevicelistPropertyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did列表
    @NameInMap("device_did_list")
    @Validation(required = true)
    public java.util.List<String> deviceDidList;

    // json格式属性信息，由标识符与属性值（key:value）构成，多个属性用英文逗号隔开。
    @NameInMap("property")
    @Validation(required = true)
    public String property;

    // 签名，用预置秘钥进行签名，只对deviceDidList加签
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static SetDevicelistPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDevicelistPropertyRequest self = new SetDevicelistPropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetDevicelistPropertyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDevicelistPropertyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetDevicelistPropertyRequest setDeviceDidList(java.util.List<String> deviceDidList) {
        this.deviceDidList = deviceDidList;
        return this;
    }
    public java.util.List<String> getDeviceDidList() {
        return this.deviceDidList;
    }

    public SetDevicelistPropertyRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public SetDevicelistPropertyRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
