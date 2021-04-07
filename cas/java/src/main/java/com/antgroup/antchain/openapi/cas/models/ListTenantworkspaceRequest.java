// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListTenantworkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // status
    @NameInMap("status")
    public String status;

    public static ListTenantworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTenantworkspaceRequest self = new ListTenantworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListTenantworkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTenantworkspaceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
