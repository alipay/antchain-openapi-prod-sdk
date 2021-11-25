// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class DeleteContractSignerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署人ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    public static DeleteContractSignerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContractSignerRequest self = new DeleteContractSignerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContractSignerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteContractSignerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteContractSignerRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeleteContractSignerRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
