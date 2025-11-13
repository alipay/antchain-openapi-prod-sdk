// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerAgreementterminateorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 解约申请ID
    @NameInMap("terminate_apply_id")
    @Validation(required = true)
    public String terminateApplyId;

    public static QueryInnerAgreementterminateorderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerAgreementterminateorderRequest self = new QueryInnerAgreementterminateorderRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerAgreementterminateorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerAgreementterminateorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerAgreementterminateorderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerAgreementterminateorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryInnerAgreementterminateorderRequest setTerminateApplyId(String terminateApplyId) {
        this.terminateApplyId = terminateApplyId;
        return this;
    }
    public String getTerminateApplyId() {
        return this.terminateApplyId;
    }

}
