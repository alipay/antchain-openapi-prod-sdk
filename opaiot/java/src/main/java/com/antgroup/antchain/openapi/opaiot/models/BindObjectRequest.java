// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.opaiot.models;

import com.aliyun.tea.*;

public class BindObjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static BindObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        BindObjectRequest self = new BindObjectRequest();
        return TeaModel.build(map, self);
    }

    public BindObjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
