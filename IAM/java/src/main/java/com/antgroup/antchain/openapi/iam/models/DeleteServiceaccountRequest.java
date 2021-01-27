// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class DeleteServiceaccountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 服务账号名称
    @NameInMap("name")
    public String name;

    // 服务账号ID
    @NameInMap("service_account_id")
    public String serviceAccountId;

    public static DeleteServiceaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceaccountRequest self = new DeleteServiceaccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteServiceaccountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteServiceaccountRequest setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
        return this;
    }
    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

}
