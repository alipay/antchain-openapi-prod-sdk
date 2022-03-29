// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaHostmachineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AllTraasmetaHostmachineRequest build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaHostmachineRequest self = new AllTraasmetaHostmachineRequest();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaHostmachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
