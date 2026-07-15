// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SupplierLogisticInfo extends TeaModel {
    // 采购平台的物流单号
    /**
     * <strong>example:</strong>
     * <p>SF1234567890</p>
     */
    @NameInMap("logistic_order_id")
    @Validation(required = true)
    public String logisticOrderId;

    public static SupplierLogisticInfo build(java.util.Map<String, ?> map) throws Exception {
        SupplierLogisticInfo self = new SupplierLogisticInfo();
        return TeaModel.build(map, self);
    }

    public SupplierLogisticInfo setLogisticOrderId(String logisticOrderId) {
        this.logisticOrderId = logisticOrderId;
        return this;
    }
    public String getLogisticOrderId() {
        return this.logisticOrderId;
    }

}
