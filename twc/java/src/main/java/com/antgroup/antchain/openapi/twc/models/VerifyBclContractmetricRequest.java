// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyBclContractmetricRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接口使用场景
    // - RESOURCE_CHECK, 权限与资源量校验
    // - METRIC，签署达到终态，资源量扣减
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 合同流程id，该接口返回的，该流程均为已完成
    @NameInMap("flow_id")
    public String flowId;

    // 合同流程状态
    @NameInMap("flow_status")
    public Long flowStatus;

    // 租赁宝订单id
    @NameInMap("bcl_order_id")
    @Validation(required = true)
    public String bclOrderId;

    // 8位租户英文id
    @NameInMap("contract_tenant_id")
    @Validation(required = true)
    public String contractTenantId;

    // RESOURCE_CHECK必填，代扣总金额,单位为分
    @NameInMap("total_amount")
    public Long totalAmount;

    // 总期数，12
    @NameInMap("total_period")
    public Long totalPeriod;

    public static VerifyBclContractmetricRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBclContractmetricRequest self = new VerifyBclContractmetricRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBclContractmetricRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyBclContractmetricRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyBclContractmetricRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public VerifyBclContractmetricRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public VerifyBclContractmetricRequest setFlowStatus(Long flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public Long getFlowStatus() {
        return this.flowStatus;
    }

    public VerifyBclContractmetricRequest setBclOrderId(String bclOrderId) {
        this.bclOrderId = bclOrderId;
        return this;
    }
    public String getBclOrderId() {
        return this.bclOrderId;
    }

    public VerifyBclContractmetricRequest setContractTenantId(String contractTenantId) {
        this.contractTenantId = contractTenantId;
        return this;
    }
    public String getContractTenantId() {
        return this.contractTenantId;
    }

    public VerifyBclContractmetricRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public VerifyBclContractmetricRequest setTotalPeriod(Long totalPeriod) {
        this.totalPeriod = totalPeriod;
        return this;
    }
    public Long getTotalPeriod() {
        return this.totalPeriod;
    }

}
