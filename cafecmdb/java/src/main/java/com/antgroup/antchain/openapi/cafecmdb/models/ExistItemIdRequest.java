// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class ExistItemIdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // model_id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static ExistItemIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistItemIdRequest self = new ExistItemIdRequest();
        return TeaModel.build(map, self);
    }

    public ExistItemIdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistItemIdRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ExistItemIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
