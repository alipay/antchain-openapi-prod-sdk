// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SetInnerPlatformproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // skuId
    @NameInMap("merchant_sku_id")
    public String merchantSkuId;

    // 商品规格列表
    @NameInMap("product_spec_option_list")
    public java.util.List<ProductSpecOption> productSpecOptionList;

    // 规格图片
    @NameInMap("spec_image_file_key")
    public String specImageFileKey;

    // 原订单总金额（单位分）
    @NameInMap("origin_total_rent_money")
    public Long originTotalRentMoney;

    // 现订单总金额（单位分）
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
    @NameInMap("renew_price")
    public Long renewPrice;

    // 买断价（单位分）
    @NameInMap("buyout_price")
    public Long buyoutPrice;

    // 是否可售卖
    @NameInMap("for_sale")
    public Boolean forSale;

    public static SetInnerPlatformproductRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInnerPlatformproductRequest self = new SetInnerPlatformproductRequest();
        return TeaModel.build(map, self);
    }

    public SetInnerPlatformproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetInnerPlatformproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetInnerPlatformproductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SetInnerPlatformproductRequest setMerchantSkuId(String merchantSkuId) {
        this.merchantSkuId = merchantSkuId;
        return this;
    }
    public String getMerchantSkuId() {
        return this.merchantSkuId;
    }

    public SetInnerPlatformproductRequest setProductSpecOptionList(java.util.List<ProductSpecOption> productSpecOptionList) {
        this.productSpecOptionList = productSpecOptionList;
        return this;
    }
    public java.util.List<ProductSpecOption> getProductSpecOptionList() {
        return this.productSpecOptionList;
    }

    public SetInnerPlatformproductRequest setSpecImageFileKey(String specImageFileKey) {
        this.specImageFileKey = specImageFileKey;
        return this;
    }
    public String getSpecImageFileKey() {
        return this.specImageFileKey;
    }

    public SetInnerPlatformproductRequest setOriginTotalRentMoney(Long originTotalRentMoney) {
        this.originTotalRentMoney = originTotalRentMoney;
        return this;
    }
    public Long getOriginTotalRentMoney() {
        return this.originTotalRentMoney;
    }

    public SetInnerPlatformproductRequest setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public SetInnerPlatformproductRequest setOriginDailyRentMoney(Long originDailyRentMoney) {
        this.originDailyRentMoney = originDailyRentMoney;
        return this;
    }
    public Long getOriginDailyRentMoney() {
        return this.originDailyRentMoney;
    }

    public SetInnerPlatformproductRequest setDailyRentMoney(Long dailyRentMoney) {
        this.dailyRentMoney = dailyRentMoney;
        return this;
    }
    public Long getDailyRentMoney() {
        return this.dailyRentMoney;
    }

    public SetInnerPlatformproductRequest setStockQuantity(Long stockQuantity) {
        this.stockQuantity = stockQuantity;
        return this;
    }
    public Long getStockQuantity() {
        return this.stockQuantity;
    }

    public SetInnerPlatformproductRequest setRenewPrice(Long renewPrice) {
        this.renewPrice = renewPrice;
        return this;
    }
    public Long getRenewPrice() {
        return this.renewPrice;
    }

    public SetInnerPlatformproductRequest setBuyoutPrice(Long buyoutPrice) {
        this.buyoutPrice = buyoutPrice;
        return this;
    }
    public Long getBuyoutPrice() {
        return this.buyoutPrice;
    }

    public SetInnerPlatformproductRequest setForSale(Boolean forSale) {
        this.forSale = forSale;
        return this;
    }
    public Boolean getForSale() {
        return this.forSale;
    }

}
