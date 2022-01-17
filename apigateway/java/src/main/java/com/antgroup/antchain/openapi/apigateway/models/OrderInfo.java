// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class OrderInfo extends TeaModel {
    // 要排序的字段
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 升序or降序
    @NameInMap("order")
    @Validation(required = true)
    public String order;

    public static OrderInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderInfo self = new OrderInfo();
        return TeaModel.build(map, self);
    }

    public OrderInfo setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public OrderInfo setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
