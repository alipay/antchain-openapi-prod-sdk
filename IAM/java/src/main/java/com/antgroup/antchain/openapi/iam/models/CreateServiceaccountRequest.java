// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class CreateServiceaccountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 服务账号描述
    @NameInMap("description")
    public String description;

    // 服务账号别名
    @NameInMap("alias")
    @Validation(required = true)
    public String alias;

    public static CreateServiceaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceaccountRequest self = new CreateServiceaccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateServiceaccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateServiceaccountRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}
