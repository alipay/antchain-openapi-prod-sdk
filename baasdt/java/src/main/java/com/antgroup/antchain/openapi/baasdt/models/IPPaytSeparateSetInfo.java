// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPPaytSeparateSetInfo extends TeaModel {
    // 授权品类
    @NameInMap("category")
    public String category;

    // 单件单价
    @NameInMap("unit_price")
    public String unitPrice;

    // 保底商品数量
    @NameInMap("guarantee_goods_number")
    public String guaranteeGoodsNumber;

    public static IPPaytSeparateSetInfo build(java.util.Map<String, ?> map) throws Exception {
        IPPaytSeparateSetInfo self = new IPPaytSeparateSetInfo();
        return TeaModel.build(map, self);
    }

    public IPPaytSeparateSetInfo setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public IPPaytSeparateSetInfo setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public String getUnitPrice() {
        return this.unitPrice;
    }

    public IPPaytSeparateSetInfo setGuaranteeGoodsNumber(String guaranteeGoodsNumber) {
        this.guaranteeGoodsNumber = guaranteeGoodsNumber;
        return this;
    }
    public String getGuaranteeGoodsNumber() {
        return this.guaranteeGoodsNumber;
    }

}
