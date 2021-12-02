// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class DeleteModelAttributeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的模型字段所属模型的唯一标识
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 要删除的模型字段的唯一标识
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    public static DeleteModelAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelAttributeRequest self = new DeleteModelAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelAttributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteModelAttributeRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public DeleteModelAttributeRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
