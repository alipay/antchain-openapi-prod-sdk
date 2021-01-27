// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class UpdateOperatorStatusRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作员ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 要更新到的状态，FROZEN为冻结，NORMAL为正常
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static UpdateOperatorStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperatorStatusRequest self = new UpdateOperatorStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOperatorStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateOperatorStatusRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateOperatorStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
