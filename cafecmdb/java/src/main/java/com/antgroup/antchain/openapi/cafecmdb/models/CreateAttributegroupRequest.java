// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class CreateAttributegroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // display_name
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // model_id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    public static CreateAttributegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAttributegroupRequest self = new CreateAttributegroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAttributegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAttributegroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAttributegroupRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
