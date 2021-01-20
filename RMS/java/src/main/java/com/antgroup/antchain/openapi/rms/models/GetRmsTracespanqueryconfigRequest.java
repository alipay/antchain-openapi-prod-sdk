// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetRmsTracespanqueryconfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static GetRmsTracespanqueryconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRmsTracespanqueryconfigRequest self = new GetRmsTracespanqueryconfigRequest();
        return TeaModel.build(map, self);
    }

    public GetRmsTracespanqueryconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
