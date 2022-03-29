// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaAppgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AllTraasmetaAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaAppgroupRequest self = new AllTraasmetaAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
