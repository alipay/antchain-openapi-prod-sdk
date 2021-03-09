// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListRegionAccessibleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static ListRegionAccessibleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionAccessibleRequest self = new ListRegionAccessibleRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionAccessibleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
