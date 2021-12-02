// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class CreateModelcategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 唯一标识（全局唯一）
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    // 名称（全局唯一）
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static CreateModelcategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelcategoryRequest self = new CreateModelcategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelcategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateModelcategoryRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CreateModelcategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
