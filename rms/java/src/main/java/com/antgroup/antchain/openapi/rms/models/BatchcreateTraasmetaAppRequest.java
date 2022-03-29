// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // apps
    @NameInMap("apps")
    @Validation(required = true)
    public java.util.List<TraasAppDto> apps;

    public static BatchcreateTraasmetaAppRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaAppRequest self = new BatchcreateTraasmetaAppRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaAppRequest setApps(java.util.List<TraasAppDto> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<TraasAppDto> getApps() {
        return this.apps;
    }

}
