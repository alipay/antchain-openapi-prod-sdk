// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class CreateItemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // model_id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 注意，data_json是一个MAP<String,Object>，但OP不支持MAP，，用户需要用Json序列化成字符串。不正确的格式将会报错
    @NameInMap("data_json")
    @Validation(required = true)
    public String dataJson;

    public static CreateItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateItemRequest self = new CreateItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateItemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateItemRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateItemRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateItemRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateItemRequest setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }
    public String getDataJson() {
        return this.dataJson;
    }

}
