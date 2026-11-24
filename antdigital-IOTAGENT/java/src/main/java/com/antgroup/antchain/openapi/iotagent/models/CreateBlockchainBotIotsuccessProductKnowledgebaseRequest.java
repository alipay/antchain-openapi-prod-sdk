// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class CreateBlockchainBotIotsuccessProductKnowledgebaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("description")
    public String description;

    public static CreateBlockchainBotIotsuccessProductKnowledgebaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainBotIotsuccessProductKnowledgebaseRequest self = new CreateBlockchainBotIotsuccessProductKnowledgebaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainBotIotsuccessProductKnowledgebaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainBotIotsuccessProductKnowledgebaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainBotIotsuccessProductKnowledgebaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBlockchainBotIotsuccessProductKnowledgebaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
