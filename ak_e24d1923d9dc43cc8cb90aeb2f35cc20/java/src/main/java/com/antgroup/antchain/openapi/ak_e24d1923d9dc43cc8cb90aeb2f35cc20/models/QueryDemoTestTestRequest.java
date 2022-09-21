// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_e24d1923d9dc43cc8cb90aeb2f35cc20.models;

import com.aliyun.tea.*;

public class QueryDemoTestTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("acpmpcore")
    @Validation(required = true)
    public String acpmpcore;

    public static QueryDemoTestTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestTestRequest self = new QueryDemoTestTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoTestTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoTestTestRequest setAcpmpcore(String acpmpcore) {
        this.acpmpcore = acpmpcore;
        return this;
    }
    public String getAcpmpcore() {
        return this.acpmpcore;
    }

}
