// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddDidDtxPkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待操作的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 待添加公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // keyId
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    public static AddDidDtxPkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDidDtxPkRequest self = new AddDidDtxPkRequest();
        return TeaModel.build(map, self);
    }

    public AddDidDtxPkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDidDtxPkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDidDtxPkRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public AddDidDtxPkRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public AddDidDtxPkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
