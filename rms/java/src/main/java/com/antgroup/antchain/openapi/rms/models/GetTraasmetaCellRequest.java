// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetTraasmetaCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    public String uuid;

    // workspace_name
    @NameInMap("workspace_name")
    public String workspaceName;

    // name
    @NameInMap("name")
    public String name;

    public static GetTraasmetaCellRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraasmetaCellRequest self = new GetTraasmetaCellRequest();
        return TeaModel.build(map, self);
    }

    public GetTraasmetaCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTraasmetaCellRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GetTraasmetaCellRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetTraasmetaCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
