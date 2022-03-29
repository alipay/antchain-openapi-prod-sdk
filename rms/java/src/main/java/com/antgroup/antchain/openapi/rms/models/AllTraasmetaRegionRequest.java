// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaRegionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AllTraasmetaRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaRegionRequest self = new AllTraasmetaRegionRequest();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaRegionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
