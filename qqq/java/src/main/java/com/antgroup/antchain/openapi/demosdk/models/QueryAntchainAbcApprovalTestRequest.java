// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class QueryAntchainAbcApprovalTestRequest extends TeaModel {
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

    public static QueryAntchainAbcApprovalTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAbcApprovalTestRequest self = new QueryAntchainAbcApprovalTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAbcApprovalTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAbcApprovalTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAbcApprovalTestRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public QueryAntchainAbcApprovalTestRequest setDelete(String delete) {
        this.delete = delete;
        return this;
    }
    public String getDelete() {
        return this.delete;
    }

}
