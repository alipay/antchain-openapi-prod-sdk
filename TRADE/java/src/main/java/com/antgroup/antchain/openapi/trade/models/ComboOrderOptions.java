// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ComboOrderOptions extends TeaModel {
    // 是否确认下单，默认false。true：订单状态会从待确认扭转已下单，可直接发起支付。false：不可直接发起支付，需确认后才可发起支付
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("confirm_ordered")
    public Boolean confirmOrdered;

    // 创建订单后未发起支付前是否自动取消订单。false：不会自动取消订单。true：兜底60分钟后自动取消订单
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_cancel_combo_order")
    public Boolean autoCancelComboOrder;

    public static ComboOrderOptions build(java.util.Map<String, ?> map) throws Exception {
        ComboOrderOptions self = new ComboOrderOptions();
        return TeaModel.build(map, self);
    }

    public ComboOrderOptions setConfirmOrdered(Boolean confirmOrdered) {
        this.confirmOrdered = confirmOrdered;
        return this;
    }
    public Boolean getConfirmOrdered() {
        return this.confirmOrdered;
    }

    public ComboOrderOptions setAutoCancelComboOrder(Boolean autoCancelComboOrder) {
        this.autoCancelComboOrder = autoCancelComboOrder;
        return this;
    }
    public Boolean getAutoCancelComboOrder() {
        return this.autoCancelComboOrder;
    }

}
