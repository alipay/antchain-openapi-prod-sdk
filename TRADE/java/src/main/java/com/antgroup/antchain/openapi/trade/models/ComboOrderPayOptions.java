// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ComboOrderPayOptions extends TeaModel {
    // 支付中的订单是否自动取消。false：不会自动取消；true：自动取消(兜底时间=支付链接超时时间+3m)
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_cancel_paying_order")
    public Boolean autoCancelPayingOrder;

    public static ComboOrderPayOptions build(java.util.Map<String, ?> map) throws Exception {
        ComboOrderPayOptions self = new ComboOrderPayOptions();
        return TeaModel.build(map, self);
    }

    public ComboOrderPayOptions setAutoCancelPayingOrder(Boolean autoCancelPayingOrder) {
        this.autoCancelPayingOrder = autoCancelPayingOrder;
        return this;
    }
    public Boolean getAutoCancelPayingOrder() {
        return this.autoCancelPayingOrder;
    }

}
