// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class NotifyThirddeviceMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备信息同步命令
    @NameInMap("command")
    @Validation(required = true)
    public String command;

    // 设备签名，用设备pri_key 进行签名，只对deviceDid加签
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static NotifyThirddeviceMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyThirddeviceMessageRequest self = new NotifyThirddeviceMessageRequest();
        return TeaModel.build(map, self);
    }

    public NotifyThirddeviceMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyThirddeviceMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyThirddeviceMessageRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public NotifyThirddeviceMessageRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public NotifyThirddeviceMessageRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
