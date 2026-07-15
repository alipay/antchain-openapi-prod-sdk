// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class GetComboOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 套餐订单ID
    @NameInMap("combo_order_id")
    @Validation(required = true)
    public String comboOrderId;

    // 是否包含履约信息
    @NameInMap("include_fulfill_info")
    @Validation(required = true)
    public Boolean includeFulfillInfo;

    public static GetComboOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComboOrderRequest self = new GetComboOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetComboOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetComboOrderRequest setComboOrderId(String comboOrderId) {
        this.comboOrderId = comboOrderId;
        return this;
    }
    public String getComboOrderId() {
        return this.comboOrderId;
    }

    public GetComboOrderRequest setIncludeFulfillInfo(Boolean includeFulfillInfo) {
        this.includeFulfillInfo = includeFulfillInfo;
        return this;
    }
    public Boolean getIncludeFulfillInfo() {
        return this.includeFulfillInfo;
    }

}
