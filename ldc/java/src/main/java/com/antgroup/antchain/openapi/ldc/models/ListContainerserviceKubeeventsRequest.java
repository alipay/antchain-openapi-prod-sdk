// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListContainerserviceKubeeventsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static ListContainerserviceKubeeventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContainerserviceKubeeventsRequest self = new ListContainerserviceKubeeventsRequest();
        return TeaModel.build(map, self);
    }

    public ListContainerserviceKubeeventsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
