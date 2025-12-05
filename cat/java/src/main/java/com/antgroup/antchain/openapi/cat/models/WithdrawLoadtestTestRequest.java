// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cat.models;

import com.aliyun.tea.*;

public class WithdrawLoadtestTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static WithdrawLoadtestTestRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawLoadtestTestRequest self = new WithdrawLoadtestTestRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawLoadtestTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
