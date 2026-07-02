// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateThingsdidTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易唯一ID
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 实体更新访问权限参与方的请求结构体
    @NameInMap("update_tenant_req")
    @Validation(required = true)
    public DidUpdateTenantReq updateTenantReq;

    public static UpdateThingsdidTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingsdidTenantRequest self = new UpdateThingsdidTenantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingsdidTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateThingsdidTenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateThingsdidTenantRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public UpdateThingsdidTenantRequest setUpdateTenantReq(DidUpdateTenantReq updateTenantReq) {
        this.updateTenantReq = updateTenantReq;
        return this;
    }
    public DidUpdateTenantReq getUpdateTenantReq() {
        return this.updateTenantReq;
    }

}
