// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ProvisionOption extends TeaModel {
    // 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
    /**
     * <strong>example:</strong>
     * <p>2025-08-22T07:05:49.441Z</p>
     */
    @NameInMap("order_start_time")
    public String orderStartTime;

    public static ProvisionOption build(java.util.Map<String, ?> map) throws Exception {
        ProvisionOption self = new ProvisionOption();
        return TeaModel.build(map, self);
    }

    public ProvisionOption setOrderStartTime(String orderStartTime) {
        this.orderStartTime = orderStartTime;
        return this;
    }
    public String getOrderStartTime() {
        return this.orderStartTime;
    }

}
