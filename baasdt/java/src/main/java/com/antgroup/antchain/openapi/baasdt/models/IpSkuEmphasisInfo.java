// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpSkuEmphasisInfo extends TeaModel {
    // 价格区间，不做校验
    @NameInMap("price_range")
    @Validation(required = true)
    public String priceRange;

    // 单价
    @NameInMap("purchase_price")
    @Validation(required = true)
    public String purchasePrice;

    // 套餐数量
    @NameInMap("sale_num")
    @Validation(required = true)
    public String saleNum;

    public static IpSkuEmphasisInfo build(java.util.Map<String, ?> map) throws Exception {
        IpSkuEmphasisInfo self = new IpSkuEmphasisInfo();
        return TeaModel.build(map, self);
    }

    public IpSkuEmphasisInfo setPriceRange(String priceRange) {
        this.priceRange = priceRange;
        return this;
    }
    public String getPriceRange() {
        return this.priceRange;
    }

    public IpSkuEmphasisInfo setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
    public String getPurchasePrice() {
        return this.purchasePrice;
    }

    public IpSkuEmphasisInfo setSaleNum(String saleNum) {
        this.saleNum = saleNum;
        return this;
    }
    public String getSaleNum() {
        return this.saleNum;
    }

}
