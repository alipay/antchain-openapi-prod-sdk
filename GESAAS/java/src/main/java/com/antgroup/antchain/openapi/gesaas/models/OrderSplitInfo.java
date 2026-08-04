// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class OrderSplitInfo extends TeaModel {
    // 主订单分账状态，PROCESSING-处理中,SUCCESS-成功,FAILED-失败
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("order_split_status")
    @Validation(required = true)
    public String orderSplitStatus;

    // 分账账号个数
    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("order_split_account_count")
    @Validation(required = true)
    public Long orderSplitAccountCount;

    // 分账账号详情，针对某一笔分账
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("order_split_detail_list")
    @Validation(required = true)
    public java.util.List<OrderSplitDetailList> orderSplitDetailList;

    public static OrderSplitInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderSplitInfo self = new OrderSplitInfo();
        return TeaModel.build(map, self);
    }

    public OrderSplitInfo setOrderSplitStatus(String orderSplitStatus) {
        this.orderSplitStatus = orderSplitStatus;
        return this;
    }
    public String getOrderSplitStatus() {
        return this.orderSplitStatus;
    }

    public OrderSplitInfo setOrderSplitAccountCount(Long orderSplitAccountCount) {
        this.orderSplitAccountCount = orderSplitAccountCount;
        return this;
    }
    public Long getOrderSplitAccountCount() {
        return this.orderSplitAccountCount;
    }

    public OrderSplitInfo setOrderSplitDetailList(java.util.List<OrderSplitDetailList> orderSplitDetailList) {
        this.orderSplitDetailList = orderSplitDetailList;
        return this;
    }
    public java.util.List<OrderSplitDetailList> getOrderSplitDetailList() {
        return this.orderSplitDetailList;
    }

}
