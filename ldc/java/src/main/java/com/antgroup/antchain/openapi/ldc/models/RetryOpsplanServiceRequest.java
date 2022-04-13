// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RetryOpsplanServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务发布id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 操作人账号，lks1.23.0才支持
    @NameInMap("operator")
    public String operator;

    public static RetryOpsplanServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryOpsplanServiceRequest self = new RetryOpsplanServiceRequest();
        return TeaModel.build(map, self);
    }

    public RetryOpsplanServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryOpsplanServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RetryOpsplanServiceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
