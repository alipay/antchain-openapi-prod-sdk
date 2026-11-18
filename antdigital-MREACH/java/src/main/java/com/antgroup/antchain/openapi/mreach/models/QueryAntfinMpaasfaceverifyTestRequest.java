// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QueryAntfinMpaasfaceverifyTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryAntfinMpaasfaceverifyTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntfinMpaasfaceverifyTestRequest self = new QueryAntfinMpaasfaceverifyTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntfinMpaasfaceverifyTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntfinMpaasfaceverifyTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
