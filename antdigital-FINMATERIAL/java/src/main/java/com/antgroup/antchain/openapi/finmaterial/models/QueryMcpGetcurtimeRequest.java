// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class QueryMcpGetcurtimeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryMcpGetcurtimeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMcpGetcurtimeRequest self = new QueryMcpGetcurtimeRequest();
        return TeaModel.build(map, self);
    }

    public QueryMcpGetcurtimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMcpGetcurtimeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
