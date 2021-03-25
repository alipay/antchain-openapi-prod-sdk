// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class EquityExtInfo extends TeaModel {
    // 指定兑换日限制已使用
    @NameInMap("limit_per_day_used")
    @Validation(required = true)
    public Long limitPerDayUsed;

    // 指定兑换月限制已使用
    @NameInMap("limit_per_month_used")
    @Validation(required = true)
    public Long limitPerMonthUsed;

    // 权益开放的租户ID
    @NameInMap("open_to_tenant_id")
    @Validation(required = true)
    public String openToTenantId;

    // 指定日期
    @NameInMap("target_date")
    @Validation(required = true)
    public String targetDate;

    // 权益对租户价格
    @NameInMap("tenant_price")
    @Validation(required = true)
    public String tenantPrice;

    // 授权给租户用户的价格
    @NameInMap("tenant_user_price")
    @Validation(required = true)
    public UserPrice tenantUserPrice;

    // 租户价格包括费率
    @NameInMap("tenant_price_with_commission")
    @Validation(required = true)
    public String tenantPriceWithCommission;

    // 费率
    @NameInMap("commission")
    @Validation(required = true)
    public String commission;

    public static EquityExtInfo build(java.util.Map<String, ?> map) throws Exception {
        EquityExtInfo self = new EquityExtInfo();
        return TeaModel.build(map, self);
    }

    public EquityExtInfo setLimitPerDayUsed(Long limitPerDayUsed) {
        this.limitPerDayUsed = limitPerDayUsed;
        return this;
    }
    public Long getLimitPerDayUsed() {
        return this.limitPerDayUsed;
    }

    public EquityExtInfo setLimitPerMonthUsed(Long limitPerMonthUsed) {
        this.limitPerMonthUsed = limitPerMonthUsed;
        return this;
    }
    public Long getLimitPerMonthUsed() {
        return this.limitPerMonthUsed;
    }

    public EquityExtInfo setOpenToTenantId(String openToTenantId) {
        this.openToTenantId = openToTenantId;
        return this;
    }
    public String getOpenToTenantId() {
        return this.openToTenantId;
    }

    public EquityExtInfo setTargetDate(String targetDate) {
        this.targetDate = targetDate;
        return this;
    }
    public String getTargetDate() {
        return this.targetDate;
    }

    public EquityExtInfo setTenantPrice(String tenantPrice) {
        this.tenantPrice = tenantPrice;
        return this;
    }
    public String getTenantPrice() {
        return this.tenantPrice;
    }

    public EquityExtInfo setTenantUserPrice(UserPrice tenantUserPrice) {
        this.tenantUserPrice = tenantUserPrice;
        return this;
    }
    public UserPrice getTenantUserPrice() {
        return this.tenantUserPrice;
    }

    public EquityExtInfo setTenantPriceWithCommission(String tenantPriceWithCommission) {
        this.tenantPriceWithCommission = tenantPriceWithCommission;
        return this;
    }
    public String getTenantPriceWithCommission() {
        return this.tenantPriceWithCommission;
    }

    public EquityExtInfo setCommission(String commission) {
        this.commission = commission;
        return this;
    }
    public String getCommission() {
        return this.commission;
    }

}
