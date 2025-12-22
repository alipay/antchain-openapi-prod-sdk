// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OrderItem extends TeaModel {
    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>戴尔电脑</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 商品品牌
    /**
     * <strong>example:</strong>
     * <p>戴尔</p>
     */
    @NameInMap("commodity_brand")
    @Validation(required = true)
    public String commodityBrand;

    // 商品版本
    /**
     * <strong>example:</strong>
     * <p>戴尔成就3681</p>
     */
    @NameInMap("commodity_version")
    @Validation(required = true)
    public String commodityVersion;

    // 商品规格
    /**
     * <strong>example:</strong>
     * <p>英特尔酷睿i3</p>
     */
    @NameInMap("commodity_specification")
    @Validation(required = true)
    public String commoditySpecification;

    // 商品颜色
    /**
     * <strong>example:</strong>
     * <p>黑色</p>
     */
    @NameInMap("commodity_color")
    public String commodityColor;

    // 商品详情
    /**
     * <strong>example:</strong>
     * <p>戴尔电脑</p>
     */
    @NameInMap("commodity_details")
    public String commodityDetails;

    // 商品官方价格
    /**
     * <strong>example:</strong>
     * <p>6666.00</p>
     */
    @NameInMap("commodity_official_price")
    @Validation(required = true)
    public String commodityOfficialPrice;

    // 租赁物数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("lease_number")
    @Validation(required = true)
    public Long leaseNumber;

    public static OrderItem build(java.util.Map<String, ?> map) throws Exception {
        OrderItem self = new OrderItem();
        return TeaModel.build(map, self);
    }

    public OrderItem setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public OrderItem setCommodityBrand(String commodityBrand) {
        this.commodityBrand = commodityBrand;
        return this;
    }
    public String getCommodityBrand() {
        return this.commodityBrand;
    }

    public OrderItem setCommodityVersion(String commodityVersion) {
        this.commodityVersion = commodityVersion;
        return this;
    }
    public String getCommodityVersion() {
        return this.commodityVersion;
    }

    public OrderItem setCommoditySpecification(String commoditySpecification) {
        this.commoditySpecification = commoditySpecification;
        return this;
    }
    public String getCommoditySpecification() {
        return this.commoditySpecification;
    }

    public OrderItem setCommodityColor(String commodityColor) {
        this.commodityColor = commodityColor;
        return this;
    }
    public String getCommodityColor() {
        return this.commodityColor;
    }

    public OrderItem setCommodityDetails(String commodityDetails) {
        this.commodityDetails = commodityDetails;
        return this;
    }
    public String getCommodityDetails() {
        return this.commodityDetails;
    }

    public OrderItem setCommodityOfficialPrice(String commodityOfficialPrice) {
        this.commodityOfficialPrice = commodityOfficialPrice;
        return this;
    }
    public String getCommodityOfficialPrice() {
        return this.commodityOfficialPrice;
    }

    public OrderItem setLeaseNumber(Long leaseNumber) {
        this.leaseNumber = leaseNumber;
        return this;
    }
    public Long getLeaseNumber() {
        return this.leaseNumber;
    }

}
