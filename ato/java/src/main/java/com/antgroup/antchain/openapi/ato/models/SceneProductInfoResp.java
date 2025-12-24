// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SceneProductInfoResp extends TeaModel {
    // 平台商品id
    /**
     * <strong>example:</strong>
     * <p>s123123123123</p>
     */
    @NameInMap("platform_product_id")
    public String platformProductId;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>名称</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 封面首图url链接
    /**
     * <strong>example:</strong>
     * <p>filekey</p>
     */
    @NameInMap("first_cover_image_url")
    public String firstCoverImageUrl;

    // 封面首图url链接
    /**
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("large_first_cover_image_url")
    public String largeFirstCoverImageUrl;

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

    // 最低日租金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lowest_daily_rent_money")
    public Long lowestDailyRentMoney;

    // 最低日租金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lowest_daily_rent_money_yuan")
    public String lowestDailyRentMoneyYuan;

    // 最高日租金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("highest_daily_rent_money")
    public Long highestDailyRentMoney;

    // 最高日租金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("highest_daily_rent_money_yuan")
    public String highestDailyRentMoneyYuan;

    // 添加标志
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("added_flag")
    public Boolean addedFlag;

    // 报名商家列表
    @NameInMap("sign_product_merchant_list")
    public java.util.List<SignProductMerchant> signProductMerchantList;

    // 报名商家数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sign_product_merchant_count")
    public Long signProductMerchantCount;

    // 适用商家列表
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("apply_product_merchant_list")
    public java.util.List<SignProductMerchant> applyProductMerchantList;

    // 适用商家数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("apply_product_merchant_count")
    public Long applyProductMerchantCount;

    // 场景商品上下架状态
    /**
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("display_status")
    public String displayStatus;

    // 推广方式
    /**
     * <strong>example:</strong>
     * <p>PARALLEL</p>
     */
    @NameInMap("delivery_mode")
    public String deliveryMode;

    public static SceneProductInfoResp build(java.util.Map<String, ?> map) throws Exception {
        SceneProductInfoResp self = new SceneProductInfoResp();
        return TeaModel.build(map, self);
    }

    public SceneProductInfoResp setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public SceneProductInfoResp setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public SceneProductInfoResp setFirstCoverImageUrl(String firstCoverImageUrl) {
        this.firstCoverImageUrl = firstCoverImageUrl;
        return this;
    }
    public String getFirstCoverImageUrl() {
        return this.firstCoverImageUrl;
    }

    public SceneProductInfoResp setLargeFirstCoverImageUrl(String largeFirstCoverImageUrl) {
        this.largeFirstCoverImageUrl = largeFirstCoverImageUrl;
        return this;
    }
    public String getLargeFirstCoverImageUrl() {
        return this.largeFirstCoverImageUrl;
    }

    public SceneProductInfoResp setSpecConfigList(java.util.List<ProductSpecConfig> specConfigList) {
        this.specConfigList = specConfigList;
        return this;
    }
    public java.util.List<ProductSpecConfig> getSpecConfigList() {
        return this.specConfigList;
    }

    public SceneProductInfoResp setRentalPlan(java.util.List<String> rentalPlan) {
        this.rentalPlan = rentalPlan;
        return this;
    }
    public java.util.List<String> getRentalPlan() {
        return this.rentalPlan;
    }

    public SceneProductInfoResp setRentalPeriod(java.util.List<Long> rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
        return this;
    }
    public java.util.List<Long> getRentalPeriod() {
        return this.rentalPeriod;
    }

    public SceneProductInfoResp setSupportRenew(Boolean supportRenew) {
        this.supportRenew = supportRenew;
        return this;
    }
    public Boolean getSupportRenew() {
        return this.supportRenew;
    }

    public SceneProductInfoResp setSupportBuyout(Boolean supportBuyout) {
        this.supportBuyout = supportBuyout;
        return this;
    }
    public Boolean getSupportBuyout() {
        return this.supportBuyout;
    }

    public SceneProductInfoResp setLowestDailyRentMoney(Long lowestDailyRentMoney) {
        this.lowestDailyRentMoney = lowestDailyRentMoney;
        return this;
    }
    public Long getLowestDailyRentMoney() {
        return this.lowestDailyRentMoney;
    }

    public SceneProductInfoResp setLowestDailyRentMoneyYuan(String lowestDailyRentMoneyYuan) {
        this.lowestDailyRentMoneyYuan = lowestDailyRentMoneyYuan;
        return this;
    }
    public String getLowestDailyRentMoneyYuan() {
        return this.lowestDailyRentMoneyYuan;
    }

    public SceneProductInfoResp setHighestDailyRentMoney(Long highestDailyRentMoney) {
        this.highestDailyRentMoney = highestDailyRentMoney;
        return this;
    }
    public Long getHighestDailyRentMoney() {
        return this.highestDailyRentMoney;
    }

    public SceneProductInfoResp setHighestDailyRentMoneyYuan(String highestDailyRentMoneyYuan) {
        this.highestDailyRentMoneyYuan = highestDailyRentMoneyYuan;
        return this;
    }
    public String getHighestDailyRentMoneyYuan() {
        return this.highestDailyRentMoneyYuan;
    }

    public SceneProductInfoResp setAddedFlag(Boolean addedFlag) {
        this.addedFlag = addedFlag;
        return this;
    }
    public Boolean getAddedFlag() {
        return this.addedFlag;
    }

    public SceneProductInfoResp setSignProductMerchantList(java.util.List<SignProductMerchant> signProductMerchantList) {
        this.signProductMerchantList = signProductMerchantList;
        return this;
    }
    public java.util.List<SignProductMerchant> getSignProductMerchantList() {
        return this.signProductMerchantList;
    }

    public SceneProductInfoResp setSignProductMerchantCount(Long signProductMerchantCount) {
        this.signProductMerchantCount = signProductMerchantCount;
        return this;
    }
    public Long getSignProductMerchantCount() {
        return this.signProductMerchantCount;
    }

    public SceneProductInfoResp setApplyProductMerchantList(java.util.List<SignProductMerchant> applyProductMerchantList) {
        this.applyProductMerchantList = applyProductMerchantList;
        return this;
    }
    public java.util.List<SignProductMerchant> getApplyProductMerchantList() {
        return this.applyProductMerchantList;
    }

    public SceneProductInfoResp setApplyProductMerchantCount(Long applyProductMerchantCount) {
        this.applyProductMerchantCount = applyProductMerchantCount;
        return this;
    }
    public Long getApplyProductMerchantCount() {
        return this.applyProductMerchantCount;
    }

    public SceneProductInfoResp setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }
    public String getDisplayStatus() {
        return this.displayStatus;
    }

    public SceneProductInfoResp setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
    public String getDeliveryMode() {
        return this.deliveryMode;
    }

}
