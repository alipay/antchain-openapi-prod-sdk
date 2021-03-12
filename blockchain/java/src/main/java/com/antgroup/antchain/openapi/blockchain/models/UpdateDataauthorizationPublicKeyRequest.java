// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDataauthorizationPublicKeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公钥列表
    @NameInMap("public_keys")
    @Validation(required = true)
    public java.util.List<PublicKey> publicKeys;

    public static UpdateDataauthorizationPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataauthorizationPublicKeyRequest self = new UpdateDataauthorizationPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataauthorizationPublicKeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDataauthorizationPublicKeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDataauthorizationPublicKeyRequest setPublicKeys(java.util.List<PublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }
    public java.util.List<PublicKey> getPublicKeys() {
        return this.publicKeys;
    }

}
