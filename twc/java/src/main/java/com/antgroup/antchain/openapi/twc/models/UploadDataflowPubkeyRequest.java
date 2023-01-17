// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UploadDataflowPubkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信封公钥内容
    @NameInMap("pubkey")
    @Validation(required = true)
    public String pubkey;

    // 存证方的租户ID
    @NameInMap("from_tenant")
    @Validation(required = true)
    public String fromTenant;

    public static UploadDataflowPubkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDataflowPubkeyRequest self = new UploadDataflowPubkeyRequest();
        return TeaModel.build(map, self);
    }

    public UploadDataflowPubkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadDataflowPubkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadDataflowPubkeyRequest setPubkey(String pubkey) {
        this.pubkey = pubkey;
        return this;
    }
    public String getPubkey() {
        return this.pubkey;
    }

    public UploadDataflowPubkeyRequest setFromTenant(String fromTenant) {
        this.fromTenant = fromTenant;
        return this;
    }
    public String getFromTenant() {
        return this.fromTenant;
    }

}
