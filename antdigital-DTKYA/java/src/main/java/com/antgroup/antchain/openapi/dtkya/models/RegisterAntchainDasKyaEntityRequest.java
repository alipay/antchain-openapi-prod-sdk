// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RegisterAntchainDasKyaEntityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证后绑定的 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // PERSON 或 ENTERPRISE
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    // 个人或企业身份要素
    @NameInMap("identity_elements")
    @Validation(required = true)
    public IdentityElements identityElements;

    // 企业经办人；个人认证留空
    @NameInMap("representative")
    public EntityRepresentative representative;

    public static RegisterAntchainDasKyaEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntchainDasKyaEntityRequest self = new RegisterAntchainDasKyaEntityRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAntchainDasKyaEntityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterAntchainDasKyaEntityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterAntchainDasKyaEntityRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public RegisterAntchainDasKyaEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public RegisterAntchainDasKyaEntityRequest setIdentityElements(IdentityElements identityElements) {
        this.identityElements = identityElements;
        return this;
    }
    public IdentityElements getIdentityElements() {
        return this.identityElements;
    }

    public RegisterAntchainDasKyaEntityRequest setRepresentative(EntityRepresentative representative) {
        this.representative = representative;
        return this;
    }
    public EntityRepresentative getRepresentative() {
        return this.representative;
    }

}
