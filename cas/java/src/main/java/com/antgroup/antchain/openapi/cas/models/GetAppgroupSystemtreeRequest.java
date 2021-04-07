// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppgroupSystemtreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetAppgroupSystemtreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppgroupSystemtreeRequest self = new GetAppgroupSystemtreeRequest();
        return TeaModel.build(map, self);
    }

    public GetAppgroupSystemtreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
