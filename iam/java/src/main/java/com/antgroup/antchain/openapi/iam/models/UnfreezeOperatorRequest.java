// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class UnfreezeOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作员ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static UnfreezeOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeOperatorRequest self = new UnfreezeOperatorRequest();
        return TeaModel.build(map, self);
    }

    public UnfreezeOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnfreezeOperatorRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
