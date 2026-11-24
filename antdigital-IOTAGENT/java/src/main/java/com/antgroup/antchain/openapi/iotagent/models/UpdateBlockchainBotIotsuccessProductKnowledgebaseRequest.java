// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    @NameInMap("name")
    public String name;

    @NameInMap("description")
    public String description;

    public static UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest self = new UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
