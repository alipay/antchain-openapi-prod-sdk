// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotsuccessProductKnowledgebaseRequest extends TeaModel {
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

    // 实例ID，非必填，可用于产品实例间知识库隔离。
    @NameInMap("instance_id")
    public String instanceId;

    public static CreateIotsuccessProductKnowledgebaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIotsuccessProductKnowledgebaseRequest self = new CreateIotsuccessProductKnowledgebaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateIotsuccessProductKnowledgebaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIotsuccessProductKnowledgebaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIotsuccessProductKnowledgebaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIotsuccessProductKnowledgebaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIotsuccessProductKnowledgebaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
