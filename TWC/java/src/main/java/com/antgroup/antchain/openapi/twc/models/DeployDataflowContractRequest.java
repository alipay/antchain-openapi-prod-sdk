// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DeployDataflowContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信封密钥。存证方本地自行派生一堆非对称密钥，将公钥作为信封密钥。存证方用户后续读取链上信息（如存证密钥、存证数据原文）时，为避免链上明文信息泄漏，会使用该信封密钥对所有链上数据进行加密后再返回，保障数据安全。
    @NameInMap("pubkey")
    @Validation(required = true)
    public String pubkey;

    public static DeployDataflowContractRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployDataflowContractRequest self = new DeployDataflowContractRequest();
        return TeaModel.build(map, self);
    }

    public DeployDataflowContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeployDataflowContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeployDataflowContractRequest setPubkey(String pubkey) {
        this.pubkey = pubkey;
        return this;
    }
    public String getPubkey() {
        return this.pubkey;
    }

}
