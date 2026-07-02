// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderLogisticInfo extends TeaModel {
    // 物流单号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("logistic_order_id")
    public String logisticOrderId;

    // 物流状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("logistic_status")
    public String logisticStatus;

    public static OrderLogisticInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderLogisticInfo self = new OrderLogisticInfo();
        return TeaModel.build(map, self);
    }

    public OrderLogisticInfo setLogisticOrderId(String logisticOrderId) {
        this.logisticOrderId = logisticOrderId;
        return this;
    }
    public String getLogisticOrderId() {
        return this.logisticOrderId;
    }

    public OrderLogisticInfo setLogisticStatus(String logisticStatus) {
        this.logisticStatus = logisticStatus;
        return this;
    }
    public String getLogisticStatus() {
        return this.logisticStatus;
    }

}
