// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateTenantProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易唯一ID
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 参考结构体
    @NameInMap("project_create_req")
    @Validation(required = true)
    public TenantProjectCreateReq projectCreateReq;

    public static CreateTenantProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantProjectRequest self = new CreateTenantProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTenantProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateTenantProjectRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public CreateTenantProjectRequest setProjectCreateReq(TenantProjectCreateReq projectCreateReq) {
        this.projectCreateReq = projectCreateReq;
        return this;
    }
    public TenantProjectCreateReq getProjectCreateReq() {
        return this.projectCreateReq;
    }

}
