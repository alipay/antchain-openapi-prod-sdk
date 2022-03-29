// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchdeleteTraasmetaWorkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuids
    @NameInMap("uuids")
    @Validation(required = true)
    public java.util.List<String> uuids;

    public static BatchdeleteTraasmetaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteTraasmetaWorkspaceRequest self = new BatchdeleteTraasmetaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteTraasmetaWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteTraasmetaWorkspaceRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
