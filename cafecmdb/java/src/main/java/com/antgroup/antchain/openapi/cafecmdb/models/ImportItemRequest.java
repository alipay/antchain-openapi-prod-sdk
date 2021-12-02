// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class ImportItemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // model_id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    public static ImportItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportItemRequest self = new ImportItemRequest();
        return TeaModel.build(map, self);
    }

    public ImportItemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportItemRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
