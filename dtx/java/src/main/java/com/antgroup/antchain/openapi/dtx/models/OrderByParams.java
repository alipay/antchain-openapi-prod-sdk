// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class OrderByParams extends TeaModel {
    // 排序字段
    @NameInMap("order_name")
    @Validation(required = true)
    public String orderName;

    // asc 正序  desc 倒序
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    public static OrderByParams build(java.util.Map<String, ?> map) throws Exception {
        OrderByParams self = new OrderByParams();
        return TeaModel.build(map, self);
    }

    public OrderByParams setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public OrderByParams setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
