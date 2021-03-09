// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateApplevelRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用等级id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 应用等级名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static UpdateApplevelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplevelRequest self = new UpdateApplevelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplevelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApplevelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateApplevelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
