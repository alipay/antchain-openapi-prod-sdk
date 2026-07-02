// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class InsertPurchaseOrderFailInfo extends TeaModel {
    // 订单ID
    /**
     * <strong>example:</strong>
     * <p>safsafafafa</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单保存失败的原因
    /**
     * <strong>example:</strong>
     * <p>fasfasfasfa</p>
     */
    @NameInMap("fail_reason")
    @Validation(required = true)
    public String failReason;

    public static InsertPurchaseOrderFailInfo build(java.util.Map<String, ?> map) throws Exception {
        InsertPurchaseOrderFailInfo self = new InsertPurchaseOrderFailInfo();
        return TeaModel.build(map, self);
    }

    public InsertPurchaseOrderFailInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public InsertPurchaseOrderFailInfo setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
