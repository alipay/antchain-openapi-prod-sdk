// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CancelAntdigitalWebttsDacWithdrawRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 出金订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID（Maker）
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static CancelAntdigitalWebttsDacWithdrawRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAntdigitalWebttsDacWithdrawRequest self = new CancelAntdigitalWebttsDacWithdrawRequest();
        return TeaModel.build(map, self);
    }

    public CancelAntdigitalWebttsDacWithdrawRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAntdigitalWebttsDacWithdrawRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelAntdigitalWebttsDacWithdrawRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelAntdigitalWebttsDacWithdrawRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public CancelAntdigitalWebttsDacWithdrawRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
