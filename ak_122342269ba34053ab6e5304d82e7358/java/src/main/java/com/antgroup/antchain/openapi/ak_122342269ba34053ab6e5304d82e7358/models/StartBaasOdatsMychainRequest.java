// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class StartBaasOdatsMychainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 锚定块高
    @NameInMap("anchored_block_height")
    public Long anchoredBlockHeight;

    // 链id
    @NameInMap("bizid")
    public String bizid;

    // 详细描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 链域名
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // {"mychainInfo":{"caCert":" mychain对应的cacert ","consensusNodeInfo":[{"ip":"","port":""},{"ip":"","port":""}]},"mychainAccount":{"account":"使用的链上账户","privateKey":"","privateKeyPwd":"","publicKey":"","recoveryPrivateKey":"","recoveryPrivateKeyPwd":"","recoveryPublicKey":""},"mychainTlsCert":{"cert":"链接链的证书","privateKey":"","privateKeyPwd":""}}
    @NameInMap("mychain_info")
    @Validation(required = true)
    public String mychainInfo;

    public static StartBaasOdatsMychainRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasOdatsMychainRequest self = new StartBaasOdatsMychainRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasOdatsMychainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasOdatsMychainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasOdatsMychainRequest setAnchoredBlockHeight(Long anchoredBlockHeight) {
        this.anchoredBlockHeight = anchoredBlockHeight;
        return this;
    }
    public Long getAnchoredBlockHeight() {
        return this.anchoredBlockHeight;
    }

    public StartBaasOdatsMychainRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public StartBaasOdatsMychainRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartBaasOdatsMychainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public StartBaasOdatsMychainRequest setMychainInfo(String mychainInfo) {
        this.mychainInfo = mychainInfo;
        return this;
    }
    public String getMychainInfo() {
        return this.mychainInfo;
    }

}
