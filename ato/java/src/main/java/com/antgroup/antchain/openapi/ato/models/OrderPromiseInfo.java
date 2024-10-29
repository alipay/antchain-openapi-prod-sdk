// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderPromiseInfo extends TeaModel {
    // 订单还款策略
    @NameInMap("repay_strategy_list")
    public java.util.List<OrderRepayStrategy> repayStrategyList;

    public static OrderPromiseInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderPromiseInfo self = new OrderPromiseInfo();
        return TeaModel.build(map, self);
    }

    public OrderPromiseInfo setRepayStrategyList(java.util.List<OrderRepayStrategy> repayStrategyList) {
        this.repayStrategyList = repayStrategyList;
        return this;
    }
    public java.util.List<OrderRepayStrategy> getRepayStrategyList() {
        return this.repayStrategyList;
    }

}
