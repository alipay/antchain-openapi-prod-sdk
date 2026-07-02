// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateThingsdidStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易唯一ID
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 状态取如下状态，注册设备身份，默认处于STATUS_REGISTERED，
    // 要更新为STATUS_COMMAND_STOP的设备必须处于STATUS_COMMAND_START，
    // 更新为STATUS_COMMAND_UNREGISTER后，无法更新为其他状态。
    // STATUS_COMMAND_UNREGISTER(注销),
    // STATUS_COMMAND_START(启用),
    // STATUS_COMMAND_STOP(),
    // STATUS_REGISTERED(3),
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 需要更新的实体did
    @NameInMap("thing_did")
    @Validation(required = true)
    public String thingDid;

    public static UpdateThingsdidStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingsdidStatusRequest self = new UpdateThingsdidStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingsdidStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateThingsdidStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateThingsdidStatusRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public UpdateThingsdidStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateThingsdidStatusRequest setThingDid(String thingDid) {
        this.thingDid = thingDid;
        return this;
    }
    public String getThingDid() {
        return this.thingDid;
    }

}
