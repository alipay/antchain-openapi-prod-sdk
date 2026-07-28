// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class CallbackRespackageCountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 预留id
    @NameInMap("reserve_id")
    @Validation(required = true)
    public String reserveId;

    public static CallbackRespackageCountRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackRespackageCountRequest self = new CallbackRespackageCountRequest();
        return TeaModel.build(map, self);
    }

    public CallbackRespackageCountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackRespackageCountRequest setReserveId(String reserveId) {
        this.reserveId = reserveId;
        return this;
    }
    public String getReserveId() {
        return this.reserveId;
    }

}
