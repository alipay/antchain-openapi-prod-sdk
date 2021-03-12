// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateMydidcommunWorkergroupTappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // TAPP部署实例ID
    @NameInMap("tapp_instance_id")
    @Validation(required = true)
    public Long tappInstanceId;

    // TAPP部署公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // TAPP部署在mytf中的版本号
    @NameInMap("tapp_version")
    @Validation(required = true)
    public Long tappVersion;

    // mytf部署后返回的TAPP哈希
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    public static UpdateMydidcommunWorkergroupTappRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMydidcommunWorkergroupTappRequest self = new UpdateMydidcommunWorkergroupTappRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMydidcommunWorkergroupTappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMydidcommunWorkergroupTappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMydidcommunWorkergroupTappRequest setTappInstanceId(Long tappInstanceId) {
        this.tappInstanceId = tappInstanceId;
        return this;
    }
    public Long getTappInstanceId() {
        return this.tappInstanceId;
    }

    public UpdateMydidcommunWorkergroupTappRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public UpdateMydidcommunWorkergroupTappRequest setTappVersion(Long tappVersion) {
        this.tappVersion = tappVersion;
        return this;
    }
    public Long getTappVersion() {
        return this.tappVersion;
    }

    public UpdateMydidcommunWorkergroupTappRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
