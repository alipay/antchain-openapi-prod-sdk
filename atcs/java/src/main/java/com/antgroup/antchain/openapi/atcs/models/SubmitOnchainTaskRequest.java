// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.atcs.models;

import com.aliyun.tea.*;

public class SubmitOnchainTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体标识
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 凭证标识,如delegate_id
    @NameInMap("credential_id")
    @Validation(required = true)
    public String credentialId;

    // 上链内容，json形式
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    public static SubmitOnchainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitOnchainTaskRequest self = new SubmitOnchainTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitOnchainTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitOnchainTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitOnchainTaskRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SubmitOnchainTaskRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public SubmitOnchainTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
