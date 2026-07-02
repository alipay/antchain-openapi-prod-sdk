// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SignMerchantLeaseConfig extends TeaModel {
    // 商户商品spuId
    /**
     * <strong>example:</strong>
     * <p>s123123123</p>
     */
    @NameInMap("merchant_product_id")
    public String merchantProductId;

    // 商户品牌
    /**
     * <strong>example:</strong>
     * <p>品牌</p>
     */
    @NameInMap("merchant_brand")
    public String merchantBrand;

    // logo
    /**
     * <strong>example:</strong>
     * <p>filekey</p>
     */
    @NameInMap("merchant_logo")
    public String merchantLogo;

    // logo
    /**
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("large_merchant_logo")
    public String largeMerchantLogo;

    // 是否置灰
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("grayed")
    public Boolean grayed;

    // 租赁方案
    @NameInMap("rental_plan")
    public java.util.List<String> rentalPlan;

    // 租赁方案说明
    /**
     * <strong>example:</strong>
     * <p>说明</p>
     */
    @NameInMap("rental_plan_intro")
    public String rentalPlanIntro;

    // 租赁周期
    @NameInMap("rental_period")
    public java.util.List<Long> rentalPeriod;

    // 可续租
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("support_renew")
    public Boolean supportRenew;

    // 可买断
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("support_buyout")
    public Boolean supportBuyout;

    // 租赁价格方案列表
    @NameInMap("lease_price_plan_list")
    public java.util.List<LeasePricePlan> leasePricePlanList;

    // 寄出是否包邮
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("free_shipping_out")
    public Boolean freeShippingOut;

    // 寄回是否包邮
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("free_shipping_back")
    public Boolean freeShippingBack;

    // 发货时效
    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("shipping_duration_type")
    public String shippingDurationType;

    // 增值服务介绍
    /**
     * <strong>example:</strong>
     * <p>介绍</p>
     */
    @NameInMap("value_added_service_intro")
    public String valueAddedServiceIntro;

    // 详情页介绍
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("detail_page_intro")
    public String detailPageIntro;

    // 服务承诺
    @NameInMap("service_promise_intro")
    public java.util.List<String> servicePromiseIntro;

    public static SignMerchantLeaseConfig build(java.util.Map<String, ?> map) throws Exception {
        SignMerchantLeaseConfig self = new SignMerchantLeaseConfig();
        return TeaModel.build(map, self);
    }

    public SignMerchantLeaseConfig setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }
    public String getMerchantProductId() {
        return this.merchantProductId;
    }

    public SignMerchantLeaseConfig setMerchantBrand(String merchantBrand) {
        this.merchantBrand = merchantBrand;
        return this;
    }
    public String getMerchantBrand() {
        return this.merchantBrand;
    }

    public SignMerchantLeaseConfig setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
        return this;
    }
    public String getMerchantLogo() {
        return this.merchantLogo;
    }

    public SignMerchantLeaseConfig setLargeMerchantLogo(String largeMerchantLogo) {
        this.largeMerchantLogo = largeMerchantLogo;
        return this;
    }
    public String getLargeMerchantLogo() {
        return this.largeMerchantLogo;
    }

    public SignMerchantLeaseConfig setGrayed(Boolean grayed) {
        this.grayed = grayed;
        return this;
    }
    public Boolean getGrayed() {
        return this.grayed;
    }

    public SignMerchantLeaseConfig setRentalPlan(java.util.List<String> rentalPlan) {
        this.rentalPlan = rentalPlan;
        return this;
    }
    public java.util.List<String> getRentalPlan() {
        return this.rentalPlan;
    }

    public SignMerchantLeaseConfig setRentalPlanIntro(String rentalPlanIntro) {
        this.rentalPlanIntro = rentalPlanIntro;
        return this;
    }
    public String getRentalPlanIntro() {
        return this.rentalPlanIntro;
    }

    public SignMerchantLeaseConfig setRentalPeriod(java.util.List<Long> rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
        return this;
    }
    public java.util.List<Long> getRentalPeriod() {
        return this.rentalPeriod;
    }

    public SignMerchantLeaseConfig setSupportRenew(Boolean supportRenew) {
        this.supportRenew = supportRenew;
        return this;
    }
    public Boolean getSupportRenew() {
        return this.supportRenew;
    }

    public SignMerchantLeaseConfig setSupportBuyout(Boolean supportBuyout) {
        this.supportBuyout = supportBuyout;
        return this;
    }
    public Boolean getSupportBuyout() {
        return this.supportBuyout;
    }

    public SignMerchantLeaseConfig setLeasePricePlanList(java.util.List<LeasePricePlan> leasePricePlanList) {
        this.leasePricePlanList = leasePricePlanList;
        return this;
    }
    public java.util.List<LeasePricePlan> getLeasePricePlanList() {
        return this.leasePricePlanList;
    }

    public SignMerchantLeaseConfig setFreeShippingOut(Boolean freeShippingOut) {
        this.freeShippingOut = freeShippingOut;
        return this;
    }
    public Boolean getFreeShippingOut() {
        return this.freeShippingOut;
    }

    public SignMerchantLeaseConfig setFreeShippingBack(Boolean freeShippingBack) {
        this.freeShippingBack = freeShippingBack;
        return this;
    }
    public Boolean getFreeShippingBack() {
        return this.freeShippingBack;
    }

    public SignMerchantLeaseConfig setShippingDurationType(String shippingDurationType) {
        this.shippingDurationType = shippingDurationType;
        return this;
    }
    public String getShippingDurationType() {
        return this.shippingDurationType;
    }

    public SignMerchantLeaseConfig setValueAddedServiceIntro(String valueAddedServiceIntro) {
        this.valueAddedServiceIntro = valueAddedServiceIntro;
        return this;
    }
    public String getValueAddedServiceIntro() {
        return this.valueAddedServiceIntro;
    }

    public SignMerchantLeaseConfig setDetailPageIntro(String detailPageIntro) {
        this.detailPageIntro = detailPageIntro;
        return this;
    }
    public String getDetailPageIntro() {
        return this.detailPageIntro;
    }

    public SignMerchantLeaseConfig setServicePromiseIntro(java.util.List<String> servicePromiseIntro) {
        this.servicePromiseIntro = servicePromiseIntro;
        return this;
    }
    public java.util.List<String> getServicePromiseIntro() {
        return this.servicePromiseIntro;
    }

}
