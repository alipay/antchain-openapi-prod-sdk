// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class DeleteModelrelationshipRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的模型关联的目标模型的唯一标识
    @NameInMap("destination_model_id")
    @Validation(required = true)
    public String destinationModelId;

    // 要删除的模型关联的源模型的唯一标识
    @NameInMap("source_model_id")
    @Validation(required = true)
    public String sourceModelId;

    public static DeleteModelrelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelrelationshipRequest self = new DeleteModelrelationshipRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelrelationshipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteModelrelationshipRequest setDestinationModelId(String destinationModelId) {
        this.destinationModelId = destinationModelId;
        return this;
    }
    public String getDestinationModelId() {
        return this.destinationModelId;
    }

    public DeleteModelrelationshipRequest setSourceModelId(String sourceModelId) {
        this.sourceModelId = sourceModelId;
        return this;
    }
    public String getSourceModelId() {
        return this.sourceModelId;
    }

}
