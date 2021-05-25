// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpSkuConfigWithLevel extends TeaModel {
    // 价格区间
    @NameInMap("price_range")
    @Validation(required = true)
    public String priceRange;

    // 单价
    @NameInMap("purchase_price")
    @Validation(required = true)
    public String purchasePrice;

    // 销售数量
    @NameInMap("sale_num")
    @Validation(required = true)
    public Long saleNum;

    // ip等级
    @NameInMap("ip_level")
    @Validation(required = true)
    public Long ipLevel;

    public static IpSkuConfigWithLevel build(java.util.Map<String, ?> map) throws Exception {
        IpSkuConfigWithLevel self = new IpSkuConfigWithLevel();
        return TeaModel.build(map, self);
    }

    public IpSkuConfigWithLevel setPriceRange(String priceRange) {
        this.priceRange = priceRange;
        return this;
    }
    public String getPriceRange() {
        return this.priceRange;
    }

    public IpSkuConfigWithLevel setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
    public String getPurchasePrice() {
        return this.purchasePrice;
    }

    public IpSkuConfigWithLevel setSaleNum(Long saleNum) {
        this.saleNum = saleNum;
        return this;
    }
    public Long getSaleNum() {
        return this.saleNum;
    }

    public IpSkuConfigWithLevel setIpLevel(Long ipLevel) {
        this.ipLevel = ipLevel;
        return this;
    }
    public Long getIpLevel() {
        return this.ipLevel;
    }

}
