// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class QueryModelAttributeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属模型的唯一标识
    @NameInMap("model_id")
    public String modelId;

    public static QueryModelAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelAttributeRequest self = new QueryModelAttributeRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelAttributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelAttributeRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
