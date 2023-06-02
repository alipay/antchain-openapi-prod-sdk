// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class BatchqueryOperatorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户id列表
    @NameInMap("operator_ids")
    public java.util.List<String> operatorIds;

    public static BatchqueryOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryOperatorRequest self = new BatchqueryOperatorRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryOperatorRequest setOperatorIds(java.util.List<String> operatorIds) {
        this.operatorIds = operatorIds;
        return this;
    }
    public java.util.List<String> getOperatorIds() {
        return this.operatorIds;
    }

}
