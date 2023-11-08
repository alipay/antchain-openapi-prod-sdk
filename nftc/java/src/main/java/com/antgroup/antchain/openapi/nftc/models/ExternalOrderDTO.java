// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class ExternalOrderDTO extends TeaModel {
    // 订单的状态
    // PAID 已支付
    // PENDING 待支付
    // NOT_EXIST 不存在
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 只有在PAID状态下，此字段才会有值
    // 由于当前一笔订单只会购买一个资产，因此当前list中只会有一个值
    @NameInMap("order_item_list")
    public java.util.List<ExternalOrderItemDTO> orderItemList;

    public static ExternalOrderDTO build(java.util.Map<String, ?> map) throws Exception {
        ExternalOrderDTO self = new ExternalOrderDTO();
        return TeaModel.build(map, self);
    }

    public ExternalOrderDTO setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ExternalOrderDTO setOrderItemList(java.util.List<ExternalOrderItemDTO> orderItemList) {
        this.orderItemList = orderItemList;
        return this;
    }
    public java.util.List<ExternalOrderItemDTO> getOrderItemList() {
        return this.orderItemList;
    }

}
