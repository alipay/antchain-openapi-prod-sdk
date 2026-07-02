// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerAgreementterminateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户 id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单 id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 解约申请号
    @NameInMap("terminate_apply_id")
    @Validation(required = true)
    public String terminateApplyId;

    public static DetailInnerAgreementterminateRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerAgreementterminateRequest self = new DetailInnerAgreementterminateRequest();
        return TeaModel.build(map, self);
    }

    public DetailInnerAgreementterminateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailInnerAgreementterminateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailInnerAgreementterminateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DetailInnerAgreementterminateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DetailInnerAgreementterminateRequest setTerminateApplyId(String terminateApplyId) {
        this.terminateApplyId = terminateApplyId;
        return this;
    }
    public String getTerminateApplyId() {
        return this.terminateApplyId;
    }

}
