// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class FailOrderInfo extends TeaModel {
    // 退保失败订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 失败原因
    @NameInMap("fail_reason")
    @Validation(required = true)
    public String failReason;

    public static FailOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        FailOrderInfo self = new FailOrderInfo();
        return TeaModel.build(map, self);
    }

    public FailOrderInfo setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public FailOrderInfo setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
