// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class FreezeOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作员ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static FreezeOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeOperatorRequest self = new FreezeOperatorRequest();
        return TeaModel.build(map, self);
    }

    public FreezeOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FreezeOperatorRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
