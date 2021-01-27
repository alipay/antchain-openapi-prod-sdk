// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetIaasaccountBaseinfoRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static GetIaasaccountBaseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIaasaccountBaseinfoRequest self = new GetIaasaccountBaseinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetIaasaccountBaseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
