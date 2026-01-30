// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class BatchcancelOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 批次号
    @NameInMap("batch_order_bsn_no")
    @Validation(required = true)
    public String batchOrderBsnNo;

    // 租户Id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static BatchcancelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcancelOrderRequest self = new BatchcancelOrderRequest();
        return TeaModel.build(map, self);
    }

    public BatchcancelOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcancelOrderRequest setBatchOrderBsnNo(String batchOrderBsnNo) {
        this.batchOrderBsnNo = batchOrderBsnNo;
        return this;
    }
    public String getBatchOrderBsnNo() {
        return this.batchOrderBsnNo;
    }

    public BatchcancelOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
