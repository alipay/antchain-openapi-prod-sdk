// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceOrderResult extends TeaModel {
    // 上链id
    @NameInMap("antchain_id")
    @Validation(required = true)
    public String antchainId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static DeviceOrderResult build(java.util.Map<String, ?> map) throws Exception {
        DeviceOrderResult self = new DeviceOrderResult();
        return TeaModel.build(map, self);
    }

    public DeviceOrderResult setAntchainId(String antchainId) {
        this.antchainId = antchainId;
        return this;
    }
    public String getAntchainId() {
        return this.antchainId;
    }

    public DeviceOrderResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
