// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class ExecAntdigitalWebttsDacWhitelistorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 白名单订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 审核结果：PASS/REFUSE
    @NameInMap("checker_result")
    @Validation(required = true)
    public String checkerResult;

    // 备注
    @NameInMap("remark")
    public String remark;

    public static ExecAntdigitalWebttsDacWhitelistorderRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntdigitalWebttsDacWhitelistorderRequest self = new ExecAntdigitalWebttsDacWhitelistorderRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntdigitalWebttsDacWhitelistorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntdigitalWebttsDacWhitelistorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAntdigitalWebttsDacWhitelistorderRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public ExecAntdigitalWebttsDacWhitelistorderRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ExecAntdigitalWebttsDacWhitelistorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecAntdigitalWebttsDacWhitelistorderRequest setCheckerResult(String checkerResult) {
        this.checkerResult = checkerResult;
        return this;
    }
    public String getCheckerResult() {
        return this.checkerResult;
    }

    public ExecAntdigitalWebttsDacWhitelistorderRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
