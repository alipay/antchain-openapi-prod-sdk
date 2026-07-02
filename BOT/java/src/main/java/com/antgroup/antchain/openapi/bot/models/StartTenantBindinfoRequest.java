// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartTenantBindinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参考结构体
    @NameInMap("bind_info_req")
    @Validation(required = true)
    public TenantBindInfoReq bindInfoReq;

    // 交易唯一ID
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static StartTenantBindinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTenantBindinfoRequest self = new StartTenantBindinfoRequest();
        return TeaModel.build(map, self);
    }

    public StartTenantBindinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartTenantBindinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartTenantBindinfoRequest setBindInfoReq(TenantBindInfoReq bindInfoReq) {
        this.bindInfoReq = bindInfoReq;
        return this;
    }
    public TenantBindInfoReq getBindInfoReq() {
        return this.bindInfoReq;
    }

    public StartTenantBindinfoRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
