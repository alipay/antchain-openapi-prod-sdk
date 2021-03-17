// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class QueryRealtytradeSigningRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署流程 ID
    // 
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    public static QueryRealtytradeSigningRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRealtytradeSigningRequest self = new QueryRealtytradeSigningRequest();
        return TeaModel.build(map, self);
    }

    public QueryRealtytradeSigningRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRealtytradeSigningRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRealtytradeSigningRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
