// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CancelComboRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 套餐订单ID
    @NameInMap("combo_order_id")
    @Validation(required = true)
    public String comboOrderId;

    // 租户ID，用于校验订单归属和操作权限
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CancelComboRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelComboRequest self = new CancelComboRequest();
        return TeaModel.build(map, self);
    }

    public CancelComboRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelComboRequest setComboOrderId(String comboOrderId) {
        this.comboOrderId = comboOrderId;
        return this;
    }
    public String getComboOrderId() {
        return this.comboOrderId;
    }

    public CancelComboRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
