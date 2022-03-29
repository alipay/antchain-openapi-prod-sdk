// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaWorkspacegroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AllTraasmetaWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaWorkspacegroupRequest self = new AllTraasmetaWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaWorkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
