// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PlatformProductInfoResp extends TeaModel {
    // 申请单状态
    /**
     * <strong>example:</strong>
     * <p>APPROVED</p>
     */
    @NameInMap("apply_status")
    public String applyStatus;

    // 审核原因
    /**
     * <strong>example:</strong>
     * <p>审核原因</p>
     */
    @NameInMap("refuse_reason")
    public String refuseReason;

    // 平台商品id
    /**
     * <strong>example:</strong>
     * <p>20240505151148001384</p>
     */
    @NameInMap("platform_product_id")
    public String platformProductId;

    // 商家商品id
    /**
     * <strong>example:</strong>
     * <p>20240505151148001384</p>
     */
    @NameInMap("merchant_product_id")
    public String merchantProductId;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>商品名称</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 封面首图url链接
    /**
     * <strong>example:</strong>
     * <p>/mer/key</p>
     */
    @NameInMap("first_cover_image_url")
    public String firstCoverImageUrl;

    // 封面首图url链接
    /**
     * <strong>example:</strong>
     * <p><a href="http://merchant/key">http://merchant/key</a></p>
     */
    @NameInMap("large_first_cover_image_url")
    public String largeFirstCoverImageUrl;

    // 商品上架状态
    /**
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("display_status")
    public String displayStatus;

    // 产品规格列表
    @NameInMap("spec_config_list")
    public java.util.List<ProductSpecConfig> specConfigList;

    // 租赁方案
    @NameInMap("rental_plan")
    public java.util.List<String> rentalPlan;

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

    // 最低日租金(单位分)
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lowest_daily_rent_money")
    public Long lowestDailyRentMoney;

    // 最低日租金(单位元)
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("lowest_daily_rent_money_yuan")
    public String lowestDailyRentMoneyYuan;

    // 最高日租金(单位分)
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("highest_daily_rent_money")
    public Long highestDailyRentMoney;

    // 最高日租金(单位元)
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("highest_daily_rent_money_yuan")
    public String highestDailyRentMoneyYuan;

    public static PlatformProductInfoResp build(java.util.Map<String, ?> map) throws Exception {
        PlatformProductInfoResp self = new PlatformProductInfoResp();
        return TeaModel.build(map, self);
    }

    public PlatformProductInfoResp setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public PlatformProductInfoResp setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
        return this;
    }
    public String getRefuseReason() {
        return this.refuseReason;
    }

    public PlatformProductInfoResp setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public PlatformProductInfoResp setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }
    public String getMerchantProductId() {
        return this.merchantProductId;
    }

    public PlatformProductInfoResp setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PlatformProductInfoResp setFirstCoverImageUrl(String firstCoverImageUrl) {
        this.firstCoverImageUrl = firstCoverImageUrl;
        return this;
    }
    public String getFirstCoverImageUrl() {
        return this.firstCoverImageUrl;
    }

    public PlatformProductInfoResp setLargeFirstCoverImageUrl(String largeFirstCoverImageUrl) {
        this.largeFirstCoverImageUrl = largeFirstCoverImageUrl;
        return this;
    }
    public String getLargeFirstCoverImageUrl() {
        return this.largeFirstCoverImageUrl;
    }

    public PlatformProductInfoResp setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }
    public String getDisplayStatus() {
        return this.displayStatus;
    }

    public PlatformProductInfoResp setSpecConfigList(java.util.List<ProductSpecConfig> specConfigList) {
        this.specConfigList = specConfigList;
        return this;
    }
    public java.util.List<ProductSpecConfig> getSpecConfigList() {
        return this.specConfigList;
    }

    public PlatformProductInfoResp setRentalPlan(java.util.List<String> rentalPlan) {
        this.rentalPlan = rentalPlan;
        return this;
    }
    public java.util.List<String> getRentalPlan() {
        return this.rentalPlan;
    }

    public PlatformProductInfoResp setRentalPeriod(java.util.List<Long> rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
        return this;
    }
    public java.util.List<Long> getRentalPeriod() {
        return this.rentalPeriod;
    }

    public PlatformProductInfoResp setSupportRenew(Boolean supportRenew) {
        this.supportRenew = supportRenew;
        return this;
    }
    public Boolean getSupportRenew() {
        return this.supportRenew;
    }

    public PlatformProductInfoResp setSupportBuyout(Boolean supportBuyout) {
        this.supportBuyout = supportBuyout;
        return this;
    }
    public Boolean getSupportBuyout() {
        return this.supportBuyout;
    }

    public PlatformProductInfoResp setLowestDailyRentMoney(Long lowestDailyRentMoney) {
        this.lowestDailyRentMoney = lowestDailyRentMoney;
        return this;
    }
    public Long getLowestDailyRentMoney() {
        return this.lowestDailyRentMoney;
    }

    public PlatformProductInfoResp setLowestDailyRentMoneyYuan(String lowestDailyRentMoneyYuan) {
        this.lowestDailyRentMoneyYuan = lowestDailyRentMoneyYuan;
        return this;
    }
    public String getLowestDailyRentMoneyYuan() {
        return this.lowestDailyRentMoneyYuan;
    }

    public PlatformProductInfoResp setHighestDailyRentMoney(Long highestDailyRentMoney) {
        this.highestDailyRentMoney = highestDailyRentMoney;
        return this;
    }
    public Long getHighestDailyRentMoney() {
        return this.highestDailyRentMoney;
    }

    public PlatformProductInfoResp setHighestDailyRentMoneyYuan(String highestDailyRentMoneyYuan) {
        this.highestDailyRentMoneyYuan = highestDailyRentMoneyYuan;
        return this;
    }
    public String getHighestDailyRentMoneyYuan() {
        return this.highestDailyRentMoneyYuan;
    }

}
