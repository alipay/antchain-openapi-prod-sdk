// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class AcceptanceDetail extends TeaModel {
    // 客户名称
    @NameInMap("name")
    public String name;

    // 客户价格
    @NameInMap("price")
    public String price;

    public static AcceptanceDetail build(java.util.Map<String, ?> map) throws Exception {
        AcceptanceDetail self = new AcceptanceDetail();
        return TeaModel.build(map, self);
    }

    public AcceptanceDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AcceptanceDetail setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

}
