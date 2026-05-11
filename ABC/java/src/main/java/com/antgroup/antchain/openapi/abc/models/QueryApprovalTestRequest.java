// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class QueryApprovalTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入参
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    // 新增字段
    @NameInMap("delete")
    @Validation(required = true)
    public String delete;

    public static QueryApprovalTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApprovalTestRequest self = new QueryApprovalTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryApprovalTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApprovalTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApprovalTestRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public QueryApprovalTestRequest setDelete(String delete) {
        this.delete = delete;
        return this;
    }
    public String getDelete() {
        return this.delete;
    }

}
