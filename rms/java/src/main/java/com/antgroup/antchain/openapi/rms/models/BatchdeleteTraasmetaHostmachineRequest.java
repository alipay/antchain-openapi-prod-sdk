// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchdeleteTraasmetaHostmachineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuids
    @NameInMap("uuids")
    @Validation(required = true)
    public java.util.List<String> uuids;

    public static BatchdeleteTraasmetaHostmachineRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteTraasmetaHostmachineRequest self = new BatchdeleteTraasmetaHostmachineRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteTraasmetaHostmachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteTraasmetaHostmachineRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
