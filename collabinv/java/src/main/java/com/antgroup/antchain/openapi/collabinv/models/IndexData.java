// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class IndexData extends TeaModel {
    // 月份
    // 
    /**
     * <strong>example:</strong>
     * <p>月份</p>
     */
    @NameInMap("month")
    @Validation(required = true)
    public String month;

    // 高低线
    /**
     * <strong>example:</strong>
     * <p>高</p>
     */
    @NameInMap("city_tier")
    @Validation(required = true)
    public String cityTier;

    // 省份编码
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("province_code")
    @Validation(required = true)
    public String provinceCode;

    // 总交易笔数指数
    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("total_cnt")
    @Validation(required = true)
    public String totalCnt;

    // 总交易金额指数
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("total_amt")
    @Validation(required = true)
    public String totalAmt;

    // 总店铺数指数
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("total_shop")
    @Validation(required = true)
    public String totalShop;

    // 去重用户数指数
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("total_csm")
    @Validation(required = true)
    public String totalCsm;

    // 其中老店店铺总交易笔数指数
    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("existing_cnt")
    @Validation(required = true)
    public String existingCnt;

    // 其中老店店铺总交易金额
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("existing_amt")
    @Validation(required = true)
    public String existingAmt;

    // 其中老店店铺数量指数
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("existing_shop")
    @Validation(required = true)
    public String existingShop;

    // 当月新增店铺数指数
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("new_shop")
    @Validation(required = true)
    public String newShop;

    // 分金额段指数
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("amt_range")
    @Validation(required = true)
    public String amtRange;

    // 店铺标签指数
    /**
     * <strong>example:</strong>
     * <p>线下</p>
     */
    @NameInMap("shop_tag")
    @Validation(required = true)
    public String shopTag;

    // 品牌码
    /**
     * <strong>example:</strong>
     * <p>P100100</p>
     */
    @NameInMap("brand_code")
    @Validation(required = true)
    public String brandCode;

    // 同店上年同期评分
    /**
     * <strong>example:</strong>
     * <p>23.45</p>
     */
    @NameInMap("existing_amt_last_year")
    @Validation(required = true)
    public String existingAmtLastYear;

    // 年月日
    /**
     * <strong>example:</strong>
     * <p>20220101</p>
     */
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    public static IndexData build(java.util.Map<String, ?> map) throws Exception {
        IndexData self = new IndexData();
        return TeaModel.build(map, self);
    }

    public IndexData setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public IndexData setCityTier(String cityTier) {
        this.cityTier = cityTier;
        return this;
    }
    public String getCityTier() {
        return this.cityTier;
    }

    public IndexData setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public IndexData setTotalCnt(String totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public String getTotalCnt() {
        return this.totalCnt;
    }

    public IndexData setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
        return this;
    }
    public String getTotalAmt() {
        return this.totalAmt;
    }

    public IndexData setTotalShop(String totalShop) {
        this.totalShop = totalShop;
        return this;
    }
    public String getTotalShop() {
        return this.totalShop;
    }

    public IndexData setTotalCsm(String totalCsm) {
        this.totalCsm = totalCsm;
        return this;
    }
    public String getTotalCsm() {
        return this.totalCsm;
    }

    public IndexData setExistingCnt(String existingCnt) {
        this.existingCnt = existingCnt;
        return this;
    }
    public String getExistingCnt() {
        return this.existingCnt;
    }

    public IndexData setExistingAmt(String existingAmt) {
        this.existingAmt = existingAmt;
        return this;
    }
    public String getExistingAmt() {
        return this.existingAmt;
    }

    public IndexData setExistingShop(String existingShop) {
        this.existingShop = existingShop;
        return this;
    }
    public String getExistingShop() {
        return this.existingShop;
    }

    public IndexData setNewShop(String newShop) {
        this.newShop = newShop;
        return this;
    }
    public String getNewShop() {
        return this.newShop;
    }

    public IndexData setAmtRange(String amtRange) {
        this.amtRange = amtRange;
        return this;
    }
    public String getAmtRange() {
        return this.amtRange;
    }

    public IndexData setShopTag(String shopTag) {
        this.shopTag = shopTag;
        return this;
    }
    public String getShopTag() {
        return this.shopTag;
    }

    public IndexData setBrandCode(String brandCode) {
        this.brandCode = brandCode;
        return this;
    }
    public String getBrandCode() {
        return this.brandCode;
    }

    public IndexData setExistingAmtLastYear(String existingAmtLastYear) {
        this.existingAmtLastYear = existingAmtLastYear;
        return this;
    }
    public String getExistingAmtLastYear() {
        return this.existingAmtLastYear;
    }

    public IndexData setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
