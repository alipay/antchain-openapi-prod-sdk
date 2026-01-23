// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("acpmpcore")
    @Validation(required = true)
    public String acpmpcore;

    public static QueryTestTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestTestRequest self = new QueryTestTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestTestRequest setAcpmpcore(String acpmpcore) {
        this.acpmpcore = acpmpcore;
        return this;
    }
    public String getAcpmpcore() {
        return this.acpmpcore;
    }

}
