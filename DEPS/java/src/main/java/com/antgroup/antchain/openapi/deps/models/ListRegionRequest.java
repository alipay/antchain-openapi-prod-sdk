// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListRegionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static ListRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionRequest self = new ListRegionRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
