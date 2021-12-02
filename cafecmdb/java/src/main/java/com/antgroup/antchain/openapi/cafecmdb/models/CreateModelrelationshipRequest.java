// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class CreateModelrelationshipRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 目标模型的唯一标识
    @NameInMap("destination_model_id")
    @Validation(required = true)
    public String destinationModelId;

    // 源模型的唯一标识（目标模型内唯一）
    @NameInMap("source_model_id")
    @Validation(required = true)
    public String sourceModelId;

    // 描述
    @NameInMap("description")
    public String description;

    // 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
    @NameInMap("relation_type")
    @Validation(required = true)
    public String relationType;

    public static CreateModelrelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelrelationshipRequest self = new CreateModelrelationshipRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelrelationshipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateModelrelationshipRequest setDestinationModelId(String destinationModelId) {
        this.destinationModelId = destinationModelId;
        return this;
    }
    public String getDestinationModelId() {
        return this.destinationModelId;
    }

    public CreateModelrelationshipRequest setSourceModelId(String sourceModelId) {
        this.sourceModelId = sourceModelId;
        return this;
    }
    public String getSourceModelId() {
        return this.sourceModelId;
    }

    public CreateModelrelationshipRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelrelationshipRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

}
