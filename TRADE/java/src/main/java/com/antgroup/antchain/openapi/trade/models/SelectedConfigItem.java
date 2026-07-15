// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class SelectedConfigItem extends TeaModel {
    // 商品主数据内码（L5内码）
    /**
     * <strong>example:</strong>
     * <p>BSTAFM01234567</p>
     */
    @NameInMap("offer_inner_code")
    @Validation(required = true)
    public String offerInnerCode;

    // 商品销售码（带 OU 属性）
    /**
     * <strong>example:</strong>
     * <p>BSTAFSZL70139xxxx</p>
     */
    @NameInMap("offer_sale_code")
    @Validation(required = true)
    public String offerSaleCode;

    // 购买时长；预付费根据实际时长填写，后付费填 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("duration")
    @Validation(required = true)
    public Long duration;

    // 购买时长单位； month / year
    /**
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("pricing_cycle")
    @Validation(required = true)
    public String pricingCycle;

    // 购买实例的数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    @Validation(required = true)
    public Long quantity;

    // 该子商品使用的优惠券ID
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("coupon_id")
    public String couponId;

    // 要购买的产品规格配件值,JSON格式
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("components_map")
    public String componentsMap;

    public static SelectedConfigItem build(java.util.Map<String, ?> map) throws Exception {
        SelectedConfigItem self = new SelectedConfigItem();
        return TeaModel.build(map, self);
    }

    public SelectedConfigItem setOfferInnerCode(String offerInnerCode) {
        this.offerInnerCode = offerInnerCode;
        return this;
    }
    public String getOfferInnerCode() {
        return this.offerInnerCode;
    }

    public SelectedConfigItem setOfferSaleCode(String offerSaleCode) {
        this.offerSaleCode = offerSaleCode;
        return this;
    }
    public String getOfferSaleCode() {
        return this.offerSaleCode;
    }

    public SelectedConfigItem setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public SelectedConfigItem setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public SelectedConfigItem setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public SelectedConfigItem setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public SelectedConfigItem setComponentsMap(String componentsMap) {
        this.componentsMap = componentsMap;
        return this;
    }
    public String getComponentsMap() {
        return this.componentsMap;
    }

}
