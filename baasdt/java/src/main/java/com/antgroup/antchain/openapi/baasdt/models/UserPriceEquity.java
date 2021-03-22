// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UserPriceEquity extends TeaModel {
    // 权益提供商商户ID
    @NameInMap("admin_id")
    @Validation(required = true)
    public String adminId;

    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public Long authType;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 默认价格
    @NameInMap("default_price")
    @Validation(required = true)
    public String defaultPrice;

    // 权益描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 权益描述图片
    @NameInMap("desc_images")
    @Validation(required = true)
    public String descImages;

    // 权益ID
    @NameInMap("equity_d")
    @Validation(required = true)
    public String equityD;

    // 权益名称
    @NameInMap("equity_name")
    @Validation(required = true)
    public String equityName;

    // 权益类型
    @NameInMap("equity_type")
    @Validation(required = true)
    public Long equityType;

    // 权益主图片
    @NameInMap("images")
    @Validation(required = true)
    public String images;

    // 是否公开权益
    @NameInMap("is_public")
    @Validation(required = true)
    public Boolean isPublic;

    // 商户每日兑换上线
    @NameInMap("limit_per_merchant_and_day")
    @Validation(required = true)
    public Long limitPerMerchantAndDay;

    // 商户每月兑换上线
    @NameInMap("limit_per_merchant_and_month")
    @Validation(required = true)
    public Long limitPerMerchantAndMonth;

    // 用户每日兑换上线
    @NameInMap("limit_per_user_and_day")
    @Validation(required = true)
    public Long limitPerUserAndDay;

    // 用户每月兑换上限
    @NameInMap("limit_per_user_and_month")
    @Validation(required = true)
    public Long limitPerUserAndMonth;

    // 权益附言信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 授权的租户ID
    @NameInMap("open_to_tenant_id")
    @Validation(required = true)
    public String openToTenantId;

    // 用户价格
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 用户价格比例
    @NameInMap("ratio")
    @Validation(required = true)
    public String ratio;

    // 快照租户价格
    @NameInMap("snapshot_tenant_price")
    @Validation(required = true)
    public String snapshotTenantPrice;

    // 权益状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 权益提供商租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 权益库存
    @NameInMap("total_count")
    @Validation(required = true)
    public String totalCount;

    // 用户价格类型
    @NameInMap("user_price_type")
    @Validation(required = true)
    public Long userPriceType;

    // 可用右区间
    @NameInMap("use_valid_not_after")
    @Validation(required = true)
    public Long useValidNotAfter;

    // 可用左区间
    @NameInMap("use_valid_not_before")
    @Validation(required = true)
    public Long useValidNotBefore;

    // 有效右区间
    @NameInMap("valid_not_after")
    @Validation(required = true)
    public Long validNotAfter;

    // 有效左区间
    @NameInMap("valid_not_before")
    @Validation(required = true)
    public Long validNotBefore;

    // 价值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static UserPriceEquity build(java.util.Map<String, ?> map) throws Exception {
        UserPriceEquity self = new UserPriceEquity();
        return TeaModel.build(map, self);
    }

    public UserPriceEquity setAdminId(String adminId) {
        this.adminId = adminId;
        return this;
    }
    public String getAdminId() {
        return this.adminId;
    }

    public UserPriceEquity setAuthType(Long authType) {
        this.authType = authType;
        return this;
    }
    public Long getAuthType() {
        return this.authType;
    }

    public UserPriceEquity setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public UserPriceEquity setDefaultPrice(String defaultPrice) {
        this.defaultPrice = defaultPrice;
        return this;
    }
    public String getDefaultPrice() {
        return this.defaultPrice;
    }

    public UserPriceEquity setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UserPriceEquity setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public UserPriceEquity setEquityD(String equityD) {
        this.equityD = equityD;
        return this;
    }
    public String getEquityD() {
        return this.equityD;
    }

    public UserPriceEquity setEquityName(String equityName) {
        this.equityName = equityName;
        return this;
    }
    public String getEquityName() {
        return this.equityName;
    }

    public UserPriceEquity setEquityType(Long equityType) {
        this.equityType = equityType;
        return this;
    }
    public Long getEquityType() {
        return this.equityType;
    }

    public UserPriceEquity setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public UserPriceEquity setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public UserPriceEquity setLimitPerMerchantAndDay(Long limitPerMerchantAndDay) {
        this.limitPerMerchantAndDay = limitPerMerchantAndDay;
        return this;
    }
    public Long getLimitPerMerchantAndDay() {
        return this.limitPerMerchantAndDay;
    }

    public UserPriceEquity setLimitPerMerchantAndMonth(Long limitPerMerchantAndMonth) {
        this.limitPerMerchantAndMonth = limitPerMerchantAndMonth;
        return this;
    }
    public Long getLimitPerMerchantAndMonth() {
        return this.limitPerMerchantAndMonth;
    }

    public UserPriceEquity setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public UserPriceEquity setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public UserPriceEquity setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public UserPriceEquity setOpenToTenantId(String openToTenantId) {
        this.openToTenantId = openToTenantId;
        return this;
    }
    public String getOpenToTenantId() {
        return this.openToTenantId;
    }

    public UserPriceEquity setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public UserPriceEquity setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public UserPriceEquity setSnapshotTenantPrice(String snapshotTenantPrice) {
        this.snapshotTenantPrice = snapshotTenantPrice;
        return this;
    }
    public String getSnapshotTenantPrice() {
        return this.snapshotTenantPrice;
    }

    public UserPriceEquity setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UserPriceEquity setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UserPriceEquity setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public UserPriceEquity setUserPriceType(Long userPriceType) {
        this.userPriceType = userPriceType;
        return this;
    }
    public Long getUserPriceType() {
        return this.userPriceType;
    }

    public UserPriceEquity setUseValidNotAfter(Long useValidNotAfter) {
        this.useValidNotAfter = useValidNotAfter;
        return this;
    }
    public Long getUseValidNotAfter() {
        return this.useValidNotAfter;
    }

    public UserPriceEquity setUseValidNotBefore(Long useValidNotBefore) {
        this.useValidNotBefore = useValidNotBefore;
        return this;
    }
    public Long getUseValidNotBefore() {
        return this.useValidNotBefore;
    }

    public UserPriceEquity setValidNotAfter(Long validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public Long getValidNotAfter() {
        return this.validNotAfter;
    }

    public UserPriceEquity setValidNotBefore(Long validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public Long getValidNotBefore() {
        return this.validNotBefore;
    }

    public UserPriceEquity setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
