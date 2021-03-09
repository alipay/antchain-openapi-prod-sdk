// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class DeleteOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作员唯一id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static DeleteOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOperatorRequest self = new DeleteOperatorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteOperatorRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
