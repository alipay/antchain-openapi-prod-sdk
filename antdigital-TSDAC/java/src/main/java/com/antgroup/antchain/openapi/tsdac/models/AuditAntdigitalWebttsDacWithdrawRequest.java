// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class AuditAntdigitalWebttsDacWithdrawRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID（Checker）
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 审核结果：PASS/REFUSE
    @NameInMap("checker_result")
    @Validation(required = true)
    public String checkerResult;

    // checker审批备注
    @NameInMap("checker_remark")
    public String checkerRemark;

    public static AuditAntdigitalWebttsDacWithdrawRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditAntdigitalWebttsDacWithdrawRequest self = new AuditAntdigitalWebttsDacWithdrawRequest();
        return TeaModel.build(map, self);
    }

    public AuditAntdigitalWebttsDacWithdrawRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuditAntdigitalWebttsDacWithdrawRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuditAntdigitalWebttsDacWithdrawRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public AuditAntdigitalWebttsDacWithdrawRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AuditAntdigitalWebttsDacWithdrawRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AuditAntdigitalWebttsDacWithdrawRequest setCheckerResult(String checkerResult) {
        this.checkerResult = checkerResult;
        return this;
    }
    public String getCheckerResult() {
        return this.checkerResult;
    }

    public AuditAntdigitalWebttsDacWithdrawRequest setCheckerRemark(String checkerRemark) {
        this.checkerRemark = checkerRemark;
        return this;
    }
    public String getCheckerRemark() {
        return this.checkerRemark;
    }

}
