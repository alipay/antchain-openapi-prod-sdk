// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetTraasmetaHostmachineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    public String uuid;

    // workspace_name
    @NameInMap("workspace_name")
    public String workspaceName;

    // ip
    @NameInMap("ip")
    public String ip;

    // workspace_uuid
    @NameInMap("workspace_uuid")
    public String workspaceUuid;

    public static GetTraasmetaHostmachineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraasmetaHostmachineRequest self = new GetTraasmetaHostmachineRequest();
        return TeaModel.build(map, self);
    }

    public GetTraasmetaHostmachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTraasmetaHostmachineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GetTraasmetaHostmachineRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetTraasmetaHostmachineRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetTraasmetaHostmachineRequest setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

}
