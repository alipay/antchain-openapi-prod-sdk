// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AllTraasmetaCellRequest build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaCellRequest self = new AllTraasmetaCellRequest();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
