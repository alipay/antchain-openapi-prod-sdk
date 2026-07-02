// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerPlatformproductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 平台商品ID
    @NameInMap("platform_product_id")
    public String platformProductId;

    // 商户商品ID
    @NameInMap("merchant_product_id")
    public String merchantProductId;

    // 一级分类
    @NameInMap("primary_category")
    public String primaryCategory;

    // 二级分类
    @NameInMap("secondary_category")
    public String secondaryCategory;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 商品成色
    @NameInMap("product_condition")
    public String productCondition;

    // 商品描述
    @NameInMap("product_description")
    public String productDescription;

    // 商品封面图
    @NameInMap("cover_image_url_list")
    public java.util.List<String> coverImageUrlList;

    // 商品封面图-完整链接
    @NameInMap("large_cover_image_url_list")
    public java.util.List<String> largeCoverImageUrlList;

    // 商品详情图
    @NameInMap("detail_image_url_list")
    public java.util.List<String> detailImageUrlList;

    // 商品详情图-完整链接
    @NameInMap("large_detail_image_url_list")
    public java.util.List<String> largeDetailImageUrlList;

    // 商品规格
    @NameInMap("spec_config_list")
    public java.util.List<ProductSpecConfig> specConfigList;

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

    // 平台配置的字段key列表（仅包含租赁销售属性/其他属性中的字段
    @NameInMap("platform_config_param_list")
    public java.util.List<String> platformConfigParamList;

    // 允许的租户列表
    @NameInMap("allow_apply_tenant_id_list")
    public java.util.List<String> allowApplyTenantIdList;

    // 提报状态
    @NameInMap("apply_status")
    public String applyStatus;

    // 审核理由
    @NameInMap("refuse_reason")
    public String refuseReason;

    // 租赁方案说明
    @NameInMap("rental_plan_intro")
    public String rentalPlanIntro;

    public static DetailInnerPlatformproductResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerPlatformproductResponse self = new DetailInnerPlatformproductResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerPlatformproductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerPlatformproductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerPlatformproductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerPlatformproductResponse setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public DetailInnerPlatformproductResponse setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }
    public String getMerchantProductId() {
        return this.merchantProductId;
    }

    public DetailInnerPlatformproductResponse setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
        return this;
    }
    public String getPrimaryCategory() {
        return this.primaryCategory;
    }

    public DetailInnerPlatformproductResponse setSecondaryCategory(String secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
        return this;
    }
    public String getSecondaryCategory() {
        return this.secondaryCategory;
    }

    public DetailInnerPlatformproductResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DetailInnerPlatformproductResponse setProductCondition(String productCondition) {
        this.productCondition = productCondition;
        return this;
    }
    public String getProductCondition() {
        return this.productCondition;
    }

    public DetailInnerPlatformproductResponse setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    public String getProductDescription() {
        return this.productDescription;
    }

    public DetailInnerPlatformproductResponse setCoverImageUrlList(java.util.List<String> coverImageUrlList) {
        this.coverImageUrlList = coverImageUrlList;
        return this;
    }
    public java.util.List<String> getCoverImageUrlList() {
        return this.coverImageUrlList;
    }

    public DetailInnerPlatformproductResponse setLargeCoverImageUrlList(java.util.List<String> largeCoverImageUrlList) {
        this.largeCoverImageUrlList = largeCoverImageUrlList;
        return this;
    }
    public java.util.List<String> getLargeCoverImageUrlList() {
        return this.largeCoverImageUrlList;
    }

    public DetailInnerPlatformproductResponse setDetailImageUrlList(java.util.List<String> detailImageUrlList) {
        this.detailImageUrlList = detailImageUrlList;
        return this;
    }
    public java.util.List<String> getDetailImageUrlList() {
        return this.detailImageUrlList;
    }

    public DetailInnerPlatformproductResponse setLargeDetailImageUrlList(java.util.List<String> largeDetailImageUrlList) {
        this.largeDetailImageUrlList = largeDetailImageUrlList;
        return this;
    }
    public java.util.List<String> getLargeDetailImageUrlList() {
        return this.largeDetailImageUrlList;
    }

    public DetailInnerPlatformproductResponse setSpecConfigList(java.util.List<ProductSpecConfig> specConfigList) {
        this.specConfigList = specConfigList;
        return this;
    }
    public java.util.List<ProductSpecConfig> getSpecConfigList() {
        return this.specConfigList;
    }

    public DetailInnerPlatformproductResponse setRentalPlan(java.util.List<String> rentalPlan) {
        this.rentalPlan = rentalPlan;
        return this;
    }
    public java.util.List<String> getRentalPlan() {
        return this.rentalPlan;
    }

    public DetailInnerPlatformproductResponse setRentalPeriod(java.util.List<Long> rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
        return this;
    }
    public java.util.List<Long> getRentalPeriod() {
        return this.rentalPeriod;
    }

    public DetailInnerPlatformproductResponse setSupportRenew(Boolean supportRenew) {
        this.supportRenew = supportRenew;
        return this;
    }
    public Boolean getSupportRenew() {
        return this.supportRenew;
    }

    public DetailInnerPlatformproductResponse setSupportBuyout(Boolean supportBuyout) {
        this.supportBuyout = supportBuyout;
        return this;
    }
    public Boolean getSupportBuyout() {
        return this.supportBuyout;
    }

    public DetailInnerPlatformproductResponse setLeasePricePlanList(java.util.List<LeasePricePlan> leasePricePlanList) {
        this.leasePricePlanList = leasePricePlanList;
        return this;
    }
    public java.util.List<LeasePricePlan> getLeasePricePlanList() {
        return this.leasePricePlanList;
    }

    public DetailInnerPlatformproductResponse setFreeShippingOut(Boolean freeShippingOut) {
        this.freeShippingOut = freeShippingOut;
        return this;
    }
    public Boolean getFreeShippingOut() {
        return this.freeShippingOut;
    }

    public DetailInnerPlatformproductResponse setFreeShippingBack(Boolean freeShippingBack) {
        this.freeShippingBack = freeShippingBack;
        return this;
    }
    public Boolean getFreeShippingBack() {
        return this.freeShippingBack;
    }

    public DetailInnerPlatformproductResponse setShippingDurationType(String shippingDurationType) {
        this.shippingDurationType = shippingDurationType;
        return this;
    }
    public String getShippingDurationType() {
        return this.shippingDurationType;
    }

    public DetailInnerPlatformproductResponse setValueAddedServiceIntro(String valueAddedServiceIntro) {
        this.valueAddedServiceIntro = valueAddedServiceIntro;
        return this;
    }
    public String getValueAddedServiceIntro() {
        return this.valueAddedServiceIntro;
    }

    public DetailInnerPlatformproductResponse setDetailPageIntro(String detailPageIntro) {
        this.detailPageIntro = detailPageIntro;
        return this;
    }
    public String getDetailPageIntro() {
        return this.detailPageIntro;
    }

    public DetailInnerPlatformproductResponse setServicePromiseIntro(java.util.List<String> servicePromiseIntro) {
        this.servicePromiseIntro = servicePromiseIntro;
        return this;
    }
    public java.util.List<String> getServicePromiseIntro() {
        return this.servicePromiseIntro;
    }

    public DetailInnerPlatformproductResponse setPlatformConfigParamList(java.util.List<String> platformConfigParamList) {
        this.platformConfigParamList = platformConfigParamList;
        return this;
    }
    public java.util.List<String> getPlatformConfigParamList() {
        return this.platformConfigParamList;
    }

    public DetailInnerPlatformproductResponse setAllowApplyTenantIdList(java.util.List<String> allowApplyTenantIdList) {
        this.allowApplyTenantIdList = allowApplyTenantIdList;
        return this;
    }
    public java.util.List<String> getAllowApplyTenantIdList() {
        return this.allowApplyTenantIdList;
    }

    public DetailInnerPlatformproductResponse setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public DetailInnerPlatformproductResponse setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
        return this;
    }
    public String getRefuseReason() {
        return this.refuseReason;
    }

    public DetailInnerPlatformproductResponse setRentalPlanIntro(String rentalPlanIntro) {
        this.rentalPlanIntro = rentalPlanIntro;
        return this;
    }
    public String getRentalPlanIntro() {
        return this.rentalPlanIntro;
    }

}
