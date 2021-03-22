// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class OpenedEquity extends TeaModel {
    // 商户管理员ID
    @NameInMap("admin_id")
    @Validation(required = true)
    public String adminId;

    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 默认价格
    @NameInMap("default_price")
    @Validation(required = true)
    public String defaultPrice;

    // 权益详情
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 权益详情图片
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

    // 是否是公开权益
    @NameInMap("is_public")
    @Validation(required = true)
    public Boolean isPublic;

    // 每日商户对换限制
    @NameInMap("limit_per_merchant_and_day")
    @Validation(required = true)
    public Long limitPerMerchantAndDay;

    // 每月商户对换限制
    @NameInMap("limit_per_merchant_and_month")
    @Validation(required = true)
    public Long limitPerMerchantAndMonth;

    // 每日用户对换限制
    @NameInMap("limit_per_user_and_day")
    @Validation(required = true)
    public Long limitPerUserAndDay;

    // 每月用户对换限制
    @NameInMap("limit_per_user_and_month")
    @Validation(required = true)
    public Long limitPerUserAndMonth;

    // 权益附言
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 被授权的租户ID
    @NameInMap("open_to_tenant_id")
    @Validation(required = true)
    public String openToTenantId;

    // 权益状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 授权价格
    @NameInMap("tenant_price")
    @Validation(required = true)
    public String tenantPrice;

    // 库存
    @NameInMap("total_count")
    @Validation(required = true)
    public String totalCount;

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

    // 有效左时间
    @NameInMap("valid_not_before")
    @Validation(required = true)
    public Long validNotBefore;

    // 价值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static OpenedEquity build(java.util.Map<String, ?> map) throws Exception {
        OpenedEquity self = new OpenedEquity();
        return TeaModel.build(map, self);
    }

    public OpenedEquity setAdminId(String adminId) {
        this.adminId = adminId;
        return this;
    }
    public String getAdminId() {
        return this.adminId;
    }

    public OpenedEquity setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public OpenedEquity setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public OpenedEquity setDefaultPrice(String defaultPrice) {
        this.defaultPrice = defaultPrice;
        return this;
    }
    public String getDefaultPrice() {
        return this.defaultPrice;
    }

    public OpenedEquity setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpenedEquity setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public OpenedEquity setEquityD(String equityD) {
        this.equityD = equityD;
        return this;
    }
    public String getEquityD() {
        return this.equityD;
    }

    public OpenedEquity setEquityName(String equityName) {
        this.equityName = equityName;
        return this;
    }
    public String getEquityName() {
        return this.equityName;
    }

    public OpenedEquity setEquityType(Long equityType) {
        this.equityType = equityType;
        return this;
    }
    public Long getEquityType() {
        return this.equityType;
    }

    public OpenedEquity setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public OpenedEquity setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public OpenedEquity setLimitPerMerchantAndDay(Long limitPerMerchantAndDay) {
        this.limitPerMerchantAndDay = limitPerMerchantAndDay;
        return this;
    }
    public Long getLimitPerMerchantAndDay() {
        return this.limitPerMerchantAndDay;
    }

    public OpenedEquity setLimitPerMerchantAndMonth(Long limitPerMerchantAndMonth) {
        this.limitPerMerchantAndMonth = limitPerMerchantAndMonth;
        return this;
    }
    public Long getLimitPerMerchantAndMonth() {
        return this.limitPerMerchantAndMonth;
    }

    public OpenedEquity setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public OpenedEquity setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public OpenedEquity setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public OpenedEquity setOpenToTenantId(String openToTenantId) {
        this.openToTenantId = openToTenantId;
        return this;
    }
    public String getOpenToTenantId() {
        return this.openToTenantId;
    }

    public OpenedEquity setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public OpenedEquity setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenedEquity setTenantPrice(String tenantPrice) {
        this.tenantPrice = tenantPrice;
        return this;
    }
    public String getTenantPrice() {
        return this.tenantPrice;
    }

    public OpenedEquity setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public OpenedEquity setUseValidNotAfter(Long useValidNotAfter) {
        this.useValidNotAfter = useValidNotAfter;
        return this;
    }
    public Long getUseValidNotAfter() {
        return this.useValidNotAfter;
    }

    public OpenedEquity setUseValidNotBefore(Long useValidNotBefore) {
        this.useValidNotBefore = useValidNotBefore;
        return this;
    }
    public Long getUseValidNotBefore() {
        return this.useValidNotBefore;
    }

    public OpenedEquity setValidNotAfter(Long validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public Long getValidNotAfter() {
        return this.validNotAfter;
    }

    public OpenedEquity setValidNotBefore(Long validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public Long getValidNotBefore() {
        return this.validNotBefore;
    }

    public OpenedEquity setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
