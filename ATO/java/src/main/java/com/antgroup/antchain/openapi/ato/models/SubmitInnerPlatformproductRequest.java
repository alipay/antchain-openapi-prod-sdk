// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerPlatformproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 操作类型：edit/submit
    @NameInMap("operate_type")
    public String operateType;

    // 平台商品Id
    @NameInMap("platform_product_id")
    public String platformProductId;

    // 商户商品spuId
    @NameInMap("merchant_product_id")
    public String merchantProductId;

    // 租赁方案
    @NameInMap("rental_plan")
    public java.util.List<String> rentalPlan;

    // 租赁周期
    @NameInMap("rental_period")
    public java.util.List<Long> rentalPeriod;

    // 可续租
    @NameInMap("support_renew")
    public Boolean supportRenew;

    // 可买断
    @NameInMap("support_buyout")
    public Boolean supportBuyout;

    // 租赁价格方案列表
    @NameInMap("lease_price_plan_list")
    public java.util.List<LeasePricePlan> leasePricePlanList;

    // 寄出是否包邮
    @NameInMap("free_shipping_out")
    public Boolean freeShippingOut;

    // 寄回是否包邮
    @NameInMap("free_shipping_back")
    public Boolean freeShippingBack;

    // 发货时效
    @NameInMap("shipping_duration_type")
    public String shippingDurationType;

    // 增值服务介绍
    @NameInMap("value_added_service_intro")
    public String valueAddedServiceIntro;

    // 详情页介绍
    @NameInMap("detail_page_intro")
    public String detailPageIntro;

    // 服务承诺
    @NameInMap("service_promise_intro")
    public java.util.List<String> servicePromiseIntro;

    // 租赁方案说明
    @NameInMap("rental_plan_intro")
    public String rentalPlanIntro;

    public static SubmitInnerPlatformproductRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerPlatformproductRequest self = new SubmitInnerPlatformproductRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerPlatformproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerPlatformproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerPlatformproductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitInnerPlatformproductRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SubmitInnerPlatformproductRequest setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public SubmitInnerPlatformproductRequest setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }
    public String getMerchantProductId() {
        return this.merchantProductId;
    }

    public SubmitInnerPlatformproductRequest setRentalPlan(java.util.List<String> rentalPlan) {
        this.rentalPlan = rentalPlan;
        return this;
    }
    public java.util.List<String> getRentalPlan() {
        return this.rentalPlan;
    }

    public SubmitInnerPlatformproductRequest setRentalPeriod(java.util.List<Long> rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
        return this;
    }
    public java.util.List<Long> getRentalPeriod() {
        return this.rentalPeriod;
    }

    public SubmitInnerPlatformproductRequest setSupportRenew(Boolean supportRenew) {
        this.supportRenew = supportRenew;
        return this;
    }
    public Boolean getSupportRenew() {
        return this.supportRenew;
    }

    public SubmitInnerPlatformproductRequest setSupportBuyout(Boolean supportBuyout) {
        this.supportBuyout = supportBuyout;
        return this;
    }
    public Boolean getSupportBuyout() {
        return this.supportBuyout;
    }

    public SubmitInnerPlatformproductRequest setLeasePricePlanList(java.util.List<LeasePricePlan> leasePricePlanList) {
        this.leasePricePlanList = leasePricePlanList;
        return this;
    }
    public java.util.List<LeasePricePlan> getLeasePricePlanList() {
        return this.leasePricePlanList;
    }

    public SubmitInnerPlatformproductRequest setFreeShippingOut(Boolean freeShippingOut) {
        this.freeShippingOut = freeShippingOut;
        return this;
    }
    public Boolean getFreeShippingOut() {
        return this.freeShippingOut;
    }

    public SubmitInnerPlatformproductRequest setFreeShippingBack(Boolean freeShippingBack) {
        this.freeShippingBack = freeShippingBack;
        return this;
    }
    public Boolean getFreeShippingBack() {
        return this.freeShippingBack;
    }

    public SubmitInnerPlatformproductRequest setShippingDurationType(String shippingDurationType) {
        this.shippingDurationType = shippingDurationType;
        return this;
    }
    public String getShippingDurationType() {
        return this.shippingDurationType;
    }

    public SubmitInnerPlatformproductRequest setValueAddedServiceIntro(String valueAddedServiceIntro) {
        this.valueAddedServiceIntro = valueAddedServiceIntro;
        return this;
    }
    public String getValueAddedServiceIntro() {
        return this.valueAddedServiceIntro;
    }

    public SubmitInnerPlatformproductRequest setDetailPageIntro(String detailPageIntro) {
        this.detailPageIntro = detailPageIntro;
        return this;
    }
    public String getDetailPageIntro() {
        return this.detailPageIntro;
    }

    public SubmitInnerPlatformproductRequest setServicePromiseIntro(java.util.List<String> servicePromiseIntro) {
        this.servicePromiseIntro = servicePromiseIntro;
        return this;
    }
    public java.util.List<String> getServicePromiseIntro() {
        return this.servicePromiseIntro;
    }

    public SubmitInnerPlatformproductRequest setRentalPlanIntro(String rentalPlanIntro) {
        this.rentalPlanIntro = rentalPlanIntro;
        return this;
    }
    public String getRentalPlanIntro() {
        return this.rentalPlanIntro;
    }

}
