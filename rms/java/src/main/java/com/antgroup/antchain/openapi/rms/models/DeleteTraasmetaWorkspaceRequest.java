// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteTraasmetaWorkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    public static DeleteTraasmetaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraasmetaWorkspaceRequest self = new DeleteTraasmetaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTraasmetaWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteTraasmetaWorkspaceRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
