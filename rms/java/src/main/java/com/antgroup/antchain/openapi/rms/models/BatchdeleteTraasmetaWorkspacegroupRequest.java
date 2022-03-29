// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchdeleteTraasmetaWorkspacegroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuids
    @NameInMap("uuids")
    @Validation(required = true)
    public java.util.List<String> uuids;

    public static BatchdeleteTraasmetaWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteTraasmetaWorkspacegroupRequest self = new BatchdeleteTraasmetaWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteTraasmetaWorkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteTraasmetaWorkspacegroupRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
