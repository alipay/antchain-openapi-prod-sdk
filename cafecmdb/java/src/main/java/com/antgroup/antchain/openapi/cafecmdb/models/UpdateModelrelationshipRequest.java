// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class UpdateModelrelationshipRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要更新的模型关联的目标模型的唯一标识
    @NameInMap("destination_model_id")
    @Validation(required = true)
    public String destinationModelId;

    // 要更新的模型关联的源模型的唯一标识
    @NameInMap("source_model_id")
    @Validation(required = true)
    public String sourceModelId;

    // 描述
    @NameInMap("description")
    public String description;

    public static UpdateModelrelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelrelationshipRequest self = new UpdateModelrelationshipRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelrelationshipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateModelrelationshipRequest setDestinationModelId(String destinationModelId) {
        this.destinationModelId = destinationModelId;
        return this;
    }
    public String getDestinationModelId() {
        return this.destinationModelId;
    }

    public UpdateModelrelationshipRequest setSourceModelId(String sourceModelId) {
        this.sourceModelId = sourceModelId;
        return this;
    }
    public String getSourceModelId() {
        return this.sourceModelId;
    }

    public UpdateModelrelationshipRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
