// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecDeviceThingserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 服务调用标识符
    @NameInMap("service_identifier")
    @Validation(required = true)
    public String serviceIdentifier;

    // 服务调用参数
    // key-value，json字符串
    @NameInMap("service_args")
    public String serviceArgs;

    public static ExecDeviceThingserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDeviceThingserviceRequest self = new ExecDeviceThingserviceRequest();
        return TeaModel.build(map, self);
    }

    public ExecDeviceThingserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDeviceThingserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDeviceThingserviceRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public ExecDeviceThingserviceRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public ExecDeviceThingserviceRequest setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
        return this;
    }
    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    public ExecDeviceThingserviceRequest setServiceArgs(String serviceArgs) {
        this.serviceArgs = serviceArgs;
        return this;
    }
    public String getServiceArgs() {
        return this.serviceArgs;
    }

}
