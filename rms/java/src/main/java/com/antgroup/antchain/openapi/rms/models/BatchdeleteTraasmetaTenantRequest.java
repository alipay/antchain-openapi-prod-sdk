// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchdeleteTraasmetaTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuids
    @NameInMap("uuids")
    @Validation(required = true)
    public java.util.List<String> uuids;

    public static BatchdeleteTraasmetaTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteTraasmetaTenantRequest self = new BatchdeleteTraasmetaTenantRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteTraasmetaTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteTraasmetaTenantRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
