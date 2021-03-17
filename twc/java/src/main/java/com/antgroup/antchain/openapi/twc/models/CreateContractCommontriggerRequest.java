// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractCommontriggerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代扣规则详情
    @NameInMap("repayment_order_info")
    @Validation(required = true)
    public java.util.List<RepaymentOrderRequest> repaymentOrderInfo;

    // 合同id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 用户在智能合同平台的身份
    @NameInMap("user_tuid")
    @Validation(required = true)
    public String userTuid;

    public static CreateContractCommontriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractCommontriggerRequest self = new CreateContractCommontriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractCommontriggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractCommontriggerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractCommontriggerRequest setRepaymentOrderInfo(java.util.List<RepaymentOrderRequest> repaymentOrderInfo) {
        this.repaymentOrderInfo = repaymentOrderInfo;
        return this;
    }
    public java.util.List<RepaymentOrderRequest> getRepaymentOrderInfo() {
        return this.repaymentOrderInfo;
    }

    public CreateContractCommontriggerRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateContractCommontriggerRequest setUserTuid(String userTuid) {
        this.userTuid = userTuid;
        return this;
    }
    public String getUserTuid() {
        return this.userTuid;
    }

}
