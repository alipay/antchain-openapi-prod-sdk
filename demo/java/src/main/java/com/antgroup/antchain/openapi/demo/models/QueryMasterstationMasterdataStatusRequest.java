// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryMasterstationMasterdataStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 工号
    @NameInMap("work_no")
    @Validation(required = true)
    public String workNo;

    public static QueryMasterstationMasterdataStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMasterstationMasterdataStatusRequest self = new QueryMasterstationMasterdataStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryMasterstationMasterdataStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMasterstationMasterdataStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMasterstationMasterdataStatusRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

}
