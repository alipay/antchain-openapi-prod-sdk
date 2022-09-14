// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RegisterWaasBusinessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景名称
    @NameInMap("biz_name")
    @Validation(required = true)
    public String bizName;

    // 业务场景公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 业务场景运行dcep合约的链id
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 数据资产展示首页
    @NameInMap("index_url")
    @Validation(required = true)
    public String indexUrl;

    // 与waas交互地址，waas服务会推送相关消息至该链接
    @NameInMap("interaction_url")
    @Validation(required = true)
    public String interactionUrl;

    // 业务场景描述
    @NameInMap("business_desc")
    @Validation(required = true)
    public String businessDesc;

    // 扩展字段
    @NameInMap("extension")
    public String extension;

    public static RegisterWaasBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterWaasBusinessRequest self = new RegisterWaasBusinessRequest();
        return TeaModel.build(map, self);
    }

    public RegisterWaasBusinessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterWaasBusinessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterWaasBusinessRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public RegisterWaasBusinessRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public RegisterWaasBusinessRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public RegisterWaasBusinessRequest setIndexUrl(String indexUrl) {
        this.indexUrl = indexUrl;
        return this;
    }
    public String getIndexUrl() {
        return this.indexUrl;
    }

    public RegisterWaasBusinessRequest setInteractionUrl(String interactionUrl) {
        this.interactionUrl = interactionUrl;
        return this;
    }
    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public RegisterWaasBusinessRequest setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
        return this;
    }
    public String getBusinessDesc() {
        return this.businessDesc;
    }

    public RegisterWaasBusinessRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
