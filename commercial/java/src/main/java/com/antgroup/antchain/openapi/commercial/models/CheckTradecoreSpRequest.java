// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CheckTradecoreSpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 服务商id
    @NameInMap("sp_id")
    @Validation(required = true)
    public String spId;

    public static CheckTradecoreSpRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTradecoreSpRequest self = new CheckTradecoreSpRequest();
        return TeaModel.build(map, self);
    }

    public CheckTradecoreSpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckTradecoreSpRequest setSpId(String spId) {
        this.spId = spId;
        return this;
    }
    public String getSpId() {
        return this.spId;
    }

}
