// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_039036ceaf344eae826f7a5f2e0c0a1a.models;

import com.aliyun.tea.*;

public class QueryDemoApprovalTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 字符串
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    public static QueryDemoApprovalTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoApprovalTestRequest self = new QueryDemoApprovalTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoApprovalTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoApprovalTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoApprovalTestRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

}
