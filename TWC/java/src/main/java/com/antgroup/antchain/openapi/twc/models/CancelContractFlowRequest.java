// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelContractFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 撤销合同的流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 区块链合同撤销理由
    @NameInMap("revoke_reason")
    public String revokeReason;

    // 用户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 发起人账户id，如不传默认由对接平台发起
    @NameInMap("operator_id")
    public String operatorId;

    public static CancelContractFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelContractFlowRequest self = new CancelContractFlowRequest();
        return TeaModel.build(map, self);
    }

    public CancelContractFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelContractFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelContractFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CancelContractFlowRequest setRevokeReason(String revokeReason) {
        this.revokeReason = revokeReason;
        return this;
    }
    public String getRevokeReason() {
        return this.revokeReason;
    }

    public CancelContractFlowRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CancelContractFlowRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
