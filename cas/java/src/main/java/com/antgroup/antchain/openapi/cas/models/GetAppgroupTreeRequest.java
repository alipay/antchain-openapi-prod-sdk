// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppgroupTreeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static GetAppgroupTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppgroupTreeRequest self = new GetAppgroupTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetAppgroupTreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
