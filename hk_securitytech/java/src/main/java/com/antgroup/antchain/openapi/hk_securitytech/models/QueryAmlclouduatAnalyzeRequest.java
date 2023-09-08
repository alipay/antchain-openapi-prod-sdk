// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class QueryAmlclouduatAnalyzeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryAmlclouduatAnalyzeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAmlclouduatAnalyzeRequest self = new QueryAmlclouduatAnalyzeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAmlclouduatAnalyzeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAmlclouduatAnalyzeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
