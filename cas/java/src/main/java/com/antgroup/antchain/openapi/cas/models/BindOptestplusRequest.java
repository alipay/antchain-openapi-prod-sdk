// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BindOptestplusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // optestplus
    @NameInMap("optestplus")
    @Validation(required = true)
    public String optestplus;

    public static BindOptestplusRequest build(java.util.Map<String, ?> map) throws Exception {
        BindOptestplusRequest self = new BindOptestplusRequest();
        return TeaModel.build(map, self);
    }

    public BindOptestplusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindOptestplusRequest setOptestplus(String optestplus) {
        this.optestplus = optestplus;
        return this;
    }
    public String getOptestplus() {
        return this.optestplus;
    }

}
