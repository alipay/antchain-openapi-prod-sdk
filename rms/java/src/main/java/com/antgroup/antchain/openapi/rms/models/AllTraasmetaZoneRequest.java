// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaZoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AllTraasmetaZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaZoneRequest self = new AllTraasmetaZoneRequest();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaZoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
