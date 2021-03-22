// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Equity extends TeaModel {
    // 权益管理员ID
    @NameInMap("admin_id")
    @Validation(required = true)
    public String adminId;

    // 权益授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public Long authType;

    // 权益锚定币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 权益默认价格
    @NameInMap("default_price")
    @Validation(required = true)
    public String defaultPrice;

    // 权益描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 权益描述图片OSS地址 分号分隔
    @NameInMap("desc_images")
    @Validation(required = true)
    public String descImages;

    // 权益附属信息
    @NameInMap("equity_ext_info")
    @Validation(required = true)
    public EquityExtInfo equityExtInfo;

    // 权益ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 权益名称
    @NameInMap("equity_name")
    @Validation(required = true)
    public String equityName;

    // 商品类型，详见数字商品公约https://tech.antfin.com/docs/2/163896
    @NameInMap("equity_type")
    @Validation(required = true)
    public String equityType;

    // 权益主图片OSS地址 分号;分隔
    @NameInMap("images")
    @Validation(required = true)
    public String images;

    // 是否为公开权益
    @NameInMap("is_public")
    @Validation(required = true)
    public Boolean isPublic;

    // 商户每日兑换上限
    @NameInMap("limit_per_merchant_and_day")
    @Validation(required = true)
    public Long limitPerMerchantAndDay;

    // 商户每月兑换上限
    @NameInMap("limit_per_merchant_and_month")
    @Validation(required = true)
    public Long limitPerMerchantAndMonth;

    // 用户每日兑换上限
    @NameInMap("limit_per_user_and_day")
    @Validation(required = true)
    public Long limitPerUserAndDay;

    // 用户每月兑换上限
    @NameInMap("limit_per_user_and_month")
    @Validation(required = true)
    public Long limitPerUserAndMonth;

    // 附言
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 权益状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 权益库存
    @NameInMap("total_count")
    @Validation(required = true)
    public String totalCount;

    // 权益使用有效期右闭区间
    @NameInMap("use_valid_not_after")
    @Validation(required = true)
    public Long useValidNotAfter;

    // 权益使用有效期左闭区间
    @NameInMap("use_valid_not_before")
    @Validation(required = true)
    public Long useValidNotBefore;

    // 权益兑换有效期右闭区间
    @NameInMap("valid_not_after")
    @Validation(required = true)
    public Long validNotAfter;

    // 权益兑换有效期左闭区间
    @NameInMap("valid_not_before")
    @Validation(required = true)
    public Long validNotBefore;

    // 权益面值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 是否计算手续费（0: 更新手续费版本前不在合约计算手续费，1: 在合约计算手续费）
    @NameInMap("commission_accepted")
    @Validation(required = true)
    public Long commissionAccepted;

    public static Equity build(java.util.Map<String, ?> map) throws Exception {
        Equity self = new Equity();
        return TeaModel.build(map, self);
    }

    public Equity setAdminId(String adminId) {
        this.adminId = adminId;
        return this;
    }
    public String getAdminId() {
        return this.adminId;
    }

    public Equity setAuthType(Long authType) {
        this.authType = authType;
        return this;
    }
    public Long getAuthType() {
        return this.authType;
    }

    public Equity setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public Equity setDefaultPrice(String defaultPrice) {
        this.defaultPrice = defaultPrice;
        return this;
    }
    public String getDefaultPrice() {
        return this.defaultPrice;
    }

    public Equity setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Equity setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public Equity setEquityExtInfo(EquityExtInfo equityExtInfo) {
        this.equityExtInfo = equityExtInfo;
        return this;
    }
    public EquityExtInfo getEquityExtInfo() {
        return this.equityExtInfo;
    }

    public Equity setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public Equity setEquityName(String equityName) {
        this.equityName = equityName;
        return this;
    }
    public String getEquityName() {
        return this.equityName;
    }

    public Equity setEquityType(String equityType) {
        this.equityType = equityType;
        return this;
    }
    public String getEquityType() {
        return this.equityType;
    }

    public Equity setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public Equity setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public Equity setLimitPerMerchantAndDay(Long limitPerMerchantAndDay) {
        this.limitPerMerchantAndDay = limitPerMerchantAndDay;
        return this;
    }
    public Long getLimitPerMerchantAndDay() {
        return this.limitPerMerchantAndDay;
    }

    public Equity setLimitPerMerchantAndMonth(Long limitPerMerchantAndMonth) {
        this.limitPerMerchantAndMonth = limitPerMerchantAndMonth;
        return this;
    }
    public Long getLimitPerMerchantAndMonth() {
        return this.limitPerMerchantAndMonth;
    }

    public Equity setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public Equity setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public Equity setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public Equity setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public Equity setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Equity setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public Equity setUseValidNotAfter(Long useValidNotAfter) {
        this.useValidNotAfter = useValidNotAfter;
        return this;
    }
    public Long getUseValidNotAfter() {
        return this.useValidNotAfter;
    }

    public Equity setUseValidNotBefore(Long useValidNotBefore) {
        this.useValidNotBefore = useValidNotBefore;
        return this;
    }
    public Long getUseValidNotBefore() {
        return this.useValidNotBefore;
    }

    public Equity setValidNotAfter(Long validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public Long getValidNotAfter() {
        return this.validNotAfter;
    }

    public Equity setValidNotBefore(Long validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public Long getValidNotBefore() {
        return this.validNotBefore;
    }

    public Equity setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public Equity setCommissionAccepted(Long commissionAccepted) {
        this.commissionAccepted = commissionAccepted;
        return this;
    }
    public Long getCommissionAccepted() {
        return this.commissionAccepted;
    }

}
