// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class QueryArkassetgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // {"Id":"group-20240514212750-b5e9m","ProjectName":"default"}
    @NameInMap("request_body")
    @Validation(required = true)
    public String requestBody;

    public static QueryArkassetgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryArkassetgroupRequest self = new QueryArkassetgroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryArkassetgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryArkassetgroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryArkassetgroupRequest setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

}
