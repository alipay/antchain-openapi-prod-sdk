// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.atcs.models;

import com.aliyun.tea.*;

public class QueryOnchainBusinessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体标识
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 分布式身份唯一标识
    @NameInMap("did")
    public String did;

    // 业务凭据标识
    @NameInMap("credential_id")
    @Validation(required = true)
    public String credentialId;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    public static QueryOnchainBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOnchainBusinessRequest self = new QueryOnchainBusinessRequest();
        return TeaModel.build(map, self);
    }

    public QueryOnchainBusinessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOnchainBusinessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOnchainBusinessRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public QueryOnchainBusinessRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryOnchainBusinessRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public QueryOnchainBusinessRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
