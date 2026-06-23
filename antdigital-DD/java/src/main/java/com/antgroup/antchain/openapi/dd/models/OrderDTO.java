// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class OrderDTO extends TeaModel {
    // 订单编号
    /**
     * <strong>example:</strong>
     * <p>ORD001</p>
     */
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static OrderDTO build(java.util.Map<String, ?> map) throws Exception {
        OrderDTO self = new OrderDTO();
        return TeaModel.build(map, self);
    }

    public OrderDTO setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public OrderDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
