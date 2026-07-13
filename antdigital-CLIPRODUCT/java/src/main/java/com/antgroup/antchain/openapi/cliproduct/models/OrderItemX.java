// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class OrderItemX extends TeaModel {
    // a
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("a")
    @Validation(required = true)
    public String a;

    public static OrderItemX build(java.util.Map<String, ?> map) throws Exception {
        OrderItemX self = new OrderItemX();
        return TeaModel.build(map, self);
    }

    public OrderItemX setA(String a) {
        this.a = a;
        return this;
    }
    public String getA() {
        return this.a;
    }

}
