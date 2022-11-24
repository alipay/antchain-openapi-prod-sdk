// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ExecContractPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 每期代扣的唯一编号
    @NameInMap("pay_index")
    @Validation(required = true)
    public String payIndex;

    public static ExecContractPayRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractPayRequest self = new ExecContractPayRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractPayRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ExecContractPayRequest setPayIndex(String payIndex) {
        this.payIndex = payIndex;
        return this;
    }
    public String getPayIndex() {
        return this.payIndex;
    }

}
