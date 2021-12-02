// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class UpdateItemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // model_id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 同创建的data
    @NameInMap("data_json")
    @Validation(required = true)
    public String dataJson;

    public static UpdateItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateItemRequest self = new UpdateItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateItemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateItemRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateItemRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateItemRequest setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }
    public String getDataJson() {
        return this.dataJson;
    }

}
