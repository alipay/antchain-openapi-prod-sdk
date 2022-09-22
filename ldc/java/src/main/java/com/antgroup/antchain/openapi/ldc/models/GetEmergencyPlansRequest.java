// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetEmergencyPlansRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 预案id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static GetEmergencyPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmergencyPlansRequest self = new GetEmergencyPlansRequest();
        return TeaModel.build(map, self);
    }

    public GetEmergencyPlansRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetEmergencyPlansRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
