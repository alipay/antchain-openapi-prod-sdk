// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourcemetaAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // app_names
    @NameInMap("app_names")
    public java.util.List<String> appNames;

    public static QueryResourcemetaAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcemetaAppserviceRequest self = new QueryResourcemetaAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourcemetaAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourcemetaAppserviceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryResourcemetaAppserviceRequest setAppNames(java.util.List<String> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

}
