// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateThingsdidDevicespaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参考结构体定义
    @NameInMap("update_device_space_req")
    @Validation(required = true)
    public UpdateDeviceSpaceReq updateDeviceSpaceReq;

    // 交易唯一ID
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static UpdateThingsdidDevicespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingsdidDevicespaceRequest self = new UpdateThingsdidDevicespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingsdidDevicespaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateThingsdidDevicespaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateThingsdidDevicespaceRequest setUpdateDeviceSpaceReq(UpdateDeviceSpaceReq updateDeviceSpaceReq) {
        this.updateDeviceSpaceReq = updateDeviceSpaceReq;
        return this;
    }
    public UpdateDeviceSpaceReq getUpdateDeviceSpaceReq() {
        return this.updateDeviceSpaceReq;
    }

    public UpdateThingsdidDevicespaceRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
