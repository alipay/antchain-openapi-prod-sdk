// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelContractPaysingletradeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能合同id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 被取消的某一期的代扣id
    @NameInMap("cancel_out_order_no")
    @Validation(required = true)
    public String cancelOutOrderNo;

    public static CancelContractPaysingletradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelContractPaysingletradeRequest self = new CancelContractPaysingletradeRequest();
        return TeaModel.build(map, self);
    }

    public CancelContractPaysingletradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelContractPaysingletradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelContractPaysingletradeRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CancelContractPaysingletradeRequest setCancelOutOrderNo(String cancelOutOrderNo) {
        this.cancelOutOrderNo = cancelOutOrderNo;
        return this;
    }
    public String getCancelOutOrderNo() {
        return this.cancelOutOrderNo;
    }

}
