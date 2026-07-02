// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class LeasePriceProp extends TeaModel {
    // 商户商品skuId
    /**
     * <strong>example:</strong>
     * <p>20240505151148001384</p>
     */
    @NameInMap("merchant_sku_id")
    public String merchantSkuId;

    // 商品规格列表
    @NameInMap("product_spec_option_list")
    public java.util.List<ProductSpecOption> productSpecOptionList;

    // 规格图片
    /**
     * <strong>example:</strong>
     * <p>[&quot;fileKey&quot;]</p>
     */
    @NameInMap("spec_image_file_key")
    public String specImageFileKey;

    // 规格图片
    /**
     * <strong>example:</strong>
     * <p>[&quot;fileKey&quot;]</p>
     */
    @NameInMap("large_spec_image_file_key")
    public String largeSpecImageFileKey;

    // 原订单总金额（单位分）
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("origin_total_rent_money")
    public Long originTotalRentMoney;

    // 现订单总金额（单位分）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_rent_money")
    public Long totalRentMoney;

    // 原日租金（单位分）
    @NameInMap("origin_daily_rent_money")
    public Long originDailyRentMoney;

    // 现日租金（单位分）
    @NameInMap("daily_rent_money")
    public Long dailyRentMoney;

    // 库存
    @NameInMap("stock_quantity")
    public Long stockQuantity;

    // 续租价（单位分）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("renew_price")
    public Long renewPrice;

    // 买断价（单位分）
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("buyout_price")
    public Long buyoutPrice;

    // 是否可售卖
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("for_sale")
    public Boolean forSale;

    public static LeasePriceProp build(java.util.Map<String, ?> map) throws Exception {
        LeasePriceProp self = new LeasePriceProp();
        return TeaModel.build(map, self);
    }

    public LeasePriceProp setMerchantSkuId(String merchantSkuId) {
        this.merchantSkuId = merchantSkuId;
        return this;
    }
    public String getMerchantSkuId() {
        return this.merchantSkuId;
    }

    public LeasePriceProp setProductSpecOptionList(java.util.List<ProductSpecOption> productSpecOptionList) {
        this.productSpecOptionList = productSpecOptionList;
        return this;
    }
    public java.util.List<ProductSpecOption> getProductSpecOptionList() {
        return this.productSpecOptionList;
    }

    public LeasePriceProp setSpecImageFileKey(String specImageFileKey) {
        this.specImageFileKey = specImageFileKey;
        return this;
    }
    public String getSpecImageFileKey() {
        return this.specImageFileKey;
    }

    public LeasePriceProp setLargeSpecImageFileKey(String largeSpecImageFileKey) {
        this.largeSpecImageFileKey = largeSpecImageFileKey;
        return this;
    }
    public String getLargeSpecImageFileKey() {
        return this.largeSpecImageFileKey;
    }

    public LeasePriceProp setOriginTotalRentMoney(Long originTotalRentMoney) {
        this.originTotalRentMoney = originTotalRentMoney;
        return this;
    }
    public Long getOriginTotalRentMoney() {
        return this.originTotalRentMoney;
    }

    public LeasePriceProp setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public LeasePriceProp setOriginDailyRentMoney(Long originDailyRentMoney) {
        this.originDailyRentMoney = originDailyRentMoney;
        return this;
    }
    public Long getOriginDailyRentMoney() {
        return this.originDailyRentMoney;
    }

    public LeasePriceProp setDailyRentMoney(Long dailyRentMoney) {
        this.dailyRentMoney = dailyRentMoney;
        return this;
    }
    public Long getDailyRentMoney() {
        return this.dailyRentMoney;
    }

    public LeasePriceProp setStockQuantity(Long stockQuantity) {
        this.stockQuantity = stockQuantity;
        return this;
    }
    public Long getStockQuantity() {
        return this.stockQuantity;
    }

    public LeasePriceProp setRenewPrice(Long renewPrice) {
        this.renewPrice = renewPrice;
        return this;
    }
    public Long getRenewPrice() {
        return this.renewPrice;
    }

    public LeasePriceProp setBuyoutPrice(Long buyoutPrice) {
        this.buyoutPrice = buyoutPrice;
        return this;
    }
    public Long getBuyoutPrice() {
        return this.buyoutPrice;
    }

    public LeasePriceProp setForSale(Boolean forSale) {
        this.forSale = forSale;
        return this;
    }
    public Boolean getForSale() {
        return this.forSale;
    }

}
