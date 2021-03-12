// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAmlCorporationJoinprepareRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业加入BaaS创建的反洗钱联盟时使用的邮箱地址
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 扩展信息字段
    @NameInMap("extension")
    public String extension;

    // 目前支持ECDSA K1公私密钥对
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 数字身份恢复密钥，支持ECDSA K1曲线的公私密钥对
    @NameInMap("recovery_key")
    public String recoveryKey;

    public static StartAmlCorporationJoinprepareRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAmlCorporationJoinprepareRequest self = new StartAmlCorporationJoinprepareRequest();
        return TeaModel.build(map, self);
    }

    public StartAmlCorporationJoinprepareRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAmlCorporationJoinprepareRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAmlCorporationJoinprepareRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public StartAmlCorporationJoinprepareRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public StartAmlCorporationJoinprepareRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public StartAmlCorporationJoinprepareRequest setRecoveryKey(String recoveryKey) {
        this.recoveryKey = recoveryKey;
        return this;
    }
    public String getRecoveryKey() {
        return this.recoveryKey;
    }

}
