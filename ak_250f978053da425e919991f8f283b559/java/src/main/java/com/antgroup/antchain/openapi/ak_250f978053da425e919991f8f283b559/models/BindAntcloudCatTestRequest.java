// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_250f978053da425e919991f8f283b559.models;

import com.aliyun.tea.*;

public class BindAntcloudCatTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static BindAntcloudCatTestRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAntcloudCatTestRequest self = new BindAntcloudCatTestRequest();
        return TeaModel.build(map, self);
    }

    public BindAntcloudCatTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
