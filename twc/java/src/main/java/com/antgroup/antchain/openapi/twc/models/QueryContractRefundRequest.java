// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退款ID，用户调用退款接口时传入的自定义第三方id
    @NameInMap("refund_id")
    @Validation(required = true)
    public String refundId;

    // 合同流程id
    @NameInMap("flow_id")
    public String flowId;

    // 租赁宝租赁订单号
    @NameInMap("bcl_order_id")
    public String bclOrderId;

    // 	
    // 租赁订单对应的租户id
    @NameInMap("bcl_tenant_id")
    public String bclTenantId;

    public static QueryContractRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractRefundRequest self = new QueryContractRefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractRefundRequest setRefundId(String refundId) {
        this.refundId = refundId;
        return this;
    }
    public String getRefundId() {
        return this.refundId;
    }

    public QueryContractRefundRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryContractRefundRequest setBclOrderId(String bclOrderId) {
        this.bclOrderId = bclOrderId;
        return this;
    }
    public String getBclOrderId() {
        return this.bclOrderId;
    }

    public QueryContractRefundRequest setBclTenantId(String bclTenantId) {
        this.bclTenantId = bclTenantId;
        return this;
    }
    public String getBclTenantId() {
        return this.bclTenantId;
    }

}
