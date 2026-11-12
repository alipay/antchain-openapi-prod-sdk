// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class QueryModelbackTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 根据任务唯一id查询
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    public static QueryModelbackTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelbackTaskRequest self = new QueryModelbackTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelbackTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelbackTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryModelbackTaskRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
