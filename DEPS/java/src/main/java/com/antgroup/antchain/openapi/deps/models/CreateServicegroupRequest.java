// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateServicegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // append
    @NameInMap("append")
    public Boolean append;

    // service_group_id
    @NameInMap("id")
    public String id;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CreateServicegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServicegroupRequest self = new CreateServicegroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateServicegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateServicegroupRequest setAppend(Boolean append) {
        this.append = append;
        return this;
    }
    public Boolean getAppend() {
        return this.append;
    }

    public CreateServicegroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateServicegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
