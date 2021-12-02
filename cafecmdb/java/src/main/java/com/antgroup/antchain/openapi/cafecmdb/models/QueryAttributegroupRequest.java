// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class QueryAttributegroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // model_id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    public static QueryAttributegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttributegroupRequest self = new QueryAttributegroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttributegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAttributegroupRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
