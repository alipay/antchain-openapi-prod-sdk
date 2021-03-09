// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ExistApplevelRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用等级名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ExistApplevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistApplevelRequest self = new ExistApplevelRequest();
        return TeaModel.build(map, self);
    }

    public ExistApplevelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistApplevelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
