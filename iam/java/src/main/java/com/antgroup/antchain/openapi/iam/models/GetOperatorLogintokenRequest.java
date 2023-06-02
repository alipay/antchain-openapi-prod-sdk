// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetOperatorLogintokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetOperatorLogintokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperatorLogintokenRequest self = new GetOperatorLogintokenRequest();
        return TeaModel.build(map, self);
    }

    public GetOperatorLogintokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
