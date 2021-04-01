// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationPublicKeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 生成公钥时的关联关系
    @NameInMap("public_key_relations")
    @Validation(required = true)
    public java.util.List<PublicKeyRelation> publicKeyRelations;

    public static ListDataauthorizationPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationPublicKeyRequest self = new ListDataauthorizationPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationPublicKeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataauthorizationPublicKeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataauthorizationPublicKeyRequest setPublicKeyRelations(java.util.List<PublicKeyRelation> publicKeyRelations) {
        this.publicKeyRelations = publicKeyRelations;
        return this;
    }
    public java.util.List<PublicKeyRelation> getPublicKeyRelations() {
        return this.publicKeyRelations;
    }

}
