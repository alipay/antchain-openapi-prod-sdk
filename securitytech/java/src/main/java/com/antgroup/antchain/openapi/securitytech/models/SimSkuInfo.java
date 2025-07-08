// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimSkuInfo extends TeaModel {
    // sku对外id
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    // sku名称
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sku_name")
    @Validation(required = true)
    public String skuName;

    // sku官方指导价：单位为元
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // sku门店优惠价：单位为元
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("store_price")
    @Validation(required = true)
    public String storePrice;

    // 车型
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("vehicle_model")
    @Validation(required = true)
    public String vehicleModel;

    // 续航里程
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("range_km")
    @Validation(required = true)
    public String rangeKm;

    // 关键词，逗号分隔
    /**
     * <strong>example:</strong>
     * <p>A,B,C</p>
     */
    @NameInMap("keywords")
    @Validation(required = true)
    public String keywords;

    // 颜色，逗号分隔
    /**
     * <strong>example:</strong>
     * <p>A,B,C</p>
     */
    @NameInMap("colors")
    @Validation(required = true)
    public String colors;

    // 配件信息，逗号分隔
    /**
     * <strong>example:</strong>
     * <p>A,B,C</p>
     */
    @NameInMap("accessories")
    @Validation(required = true)
    public String accessories;

    // 图片url json
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("images")
    @Validation(required = true)
    public String images;

    // 门店id
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 车型描述
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sku_description")
    public String skuDescription;

    public static SimSkuInfo build(java.util.Map<String, ?> map) throws Exception {
        SimSkuInfo self = new SimSkuInfo();
        return TeaModel.build(map, self);
    }

    public SimSkuInfo setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public SimSkuInfo setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public SimSkuInfo setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public SimSkuInfo setStorePrice(String storePrice) {
        this.storePrice = storePrice;
        return this;
    }
    public String getStorePrice() {
        return this.storePrice;
    }

    public SimSkuInfo setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }
    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public SimSkuInfo setRangeKm(String rangeKm) {
        this.rangeKm = rangeKm;
        return this;
    }
    public String getRangeKm() {
        return this.rangeKm;
    }

    public SimSkuInfo setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public SimSkuInfo setColors(String colors) {
        this.colors = colors;
        return this;
    }
    public String getColors() {
        return this.colors;
    }

    public SimSkuInfo setAccessories(String accessories) {
        this.accessories = accessories;
        return this;
    }
    public String getAccessories() {
        return this.accessories;
    }

    public SimSkuInfo setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public SimSkuInfo setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public SimSkuInfo setSkuDescription(String skuDescription) {
        this.skuDescription = skuDescription;
        return this;
    }
    public String getSkuDescription() {
        return this.skuDescription;
    }

}
