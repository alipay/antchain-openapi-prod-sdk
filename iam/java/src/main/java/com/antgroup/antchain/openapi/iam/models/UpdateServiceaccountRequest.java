// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class UpdateServiceaccountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 服务账号别名
    @NameInMap("alias")
    public String alias;

    // 服务账号描述
    @NameInMap("description")
    public String description;

    // 服务账号名称，与服务账号ID任选其一传入
    @NameInMap("name")
    public String name;

    // 服务账号ID
    @NameInMap("service_account_id")
    public String serviceAccountId;

    public static UpdateServiceaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceaccountRequest self = new UpdateServiceaccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateServiceaccountRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public UpdateServiceaccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateServiceaccountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateServiceaccountRequest setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
        return this;
    }
    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

}
