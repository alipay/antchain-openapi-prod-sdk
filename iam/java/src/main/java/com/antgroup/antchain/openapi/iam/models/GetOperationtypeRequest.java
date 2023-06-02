// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetOperationtypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 操作类型名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static GetOperationtypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationtypeRequest self = new GetOperationtypeRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationtypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOperationtypeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
