// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestForLimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 2
    @NameInMap("exec_num")
    @Validation(required = true)
    public Long execNum;

    public static QueryTestForLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestForLimitRequest self = new QueryTestForLimitRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestForLimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestForLimitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestForLimitRequest setExecNum(Long execNum) {
        this.execNum = execNum;
        return this;
    }
    public Long getExecNum() {
        return this.execNum;
    }

}
