// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class GetModelAttributeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 字段所属模型的唯一标识
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 要获取的字段的唯一标识
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    public static GetModelAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelAttributeRequest self = new GetModelAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetModelAttributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetModelAttributeRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public GetModelAttributeRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
