// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpSkuInfo extends TeaModel {
    // ip的链上id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // ip的渠道名字
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 售卖的商品价格范围
    @NameInMap("price_range")
    @Validation(required = true)
    public String priceRange;

    // ip售卖单价
    @NameInMap("purchase_price")
    @Validation(required = true)
    public String purchasePrice;

    // 套餐中ip的数量
    @NameInMap("sale_num")
    @Validation(required = true)
    public String saleNum;

    public static IpSkuInfo build(java.util.Map<String, ?> map) throws Exception {
        IpSkuInfo self = new IpSkuInfo();
        return TeaModel.build(map, self);
    }

    public IpSkuInfo setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public IpSkuInfo setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public IpSkuInfo setPriceRange(String priceRange) {
        this.priceRange = priceRange;
        return this;
    }
    public String getPriceRange() {
        return this.priceRange;
    }

    public IpSkuInfo setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
    public String getPurchasePrice() {
        return this.purchasePrice;
    }

    public IpSkuInfo setSaleNum(String saleNum) {
        this.saleNum = saleNum;
        return this;
    }
    public String getSaleNum() {
        return this.saleNum;
    }

}
