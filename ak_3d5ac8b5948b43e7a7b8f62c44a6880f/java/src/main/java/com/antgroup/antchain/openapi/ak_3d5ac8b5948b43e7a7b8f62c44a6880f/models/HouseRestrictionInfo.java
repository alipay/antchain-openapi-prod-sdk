// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_3d5ac8b5948b43e7a7b8f62c44a6880f.models;

import com.aliyun.tea.*;

public class HouseRestrictionInfo extends TeaModel {
    // 申请人
    // 
    @NameInMap("applicant")
    public String applicant;

    // 限制结束日期
    @NameInMap("restriction_end_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String restrictionEndDate;

    // 限制起始日期
    @NameInMap("restriction_start_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String restrictionStartDate;

    // 来文单位
    @NameInMap("from_org_name")
    public String fromOrgName;

    // 登记时间
    @NameInMap("register_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String registerTime;

    // 限制金额，人民币默认单位元，保留两位小数点
    @NameInMap("restricted_amount")
    public String restrictedAmount;

    // 限制金额货币类型，比如：CNY=人民币
    @NameInMap("restricted_amount_currency")
    public String restrictedAmountCurrency;

    // 限制文号
    @NameInMap("restriction_no")
    public String restrictionNo;

    // 房产链内部房产编号
    @NameInMap("house_no")
    public String houseNo;

    public static HouseRestrictionInfo build(java.util.Map<String, ?> map) throws Exception {
        HouseRestrictionInfo self = new HouseRestrictionInfo();
        return TeaModel.build(map, self);
    }

    public HouseRestrictionInfo setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public HouseRestrictionInfo setRestrictionEndDate(String restrictionEndDate) {
        this.restrictionEndDate = restrictionEndDate;
        return this;
    }
    public String getRestrictionEndDate() {
        return this.restrictionEndDate;
    }

    public HouseRestrictionInfo setRestrictionStartDate(String restrictionStartDate) {
        this.restrictionStartDate = restrictionStartDate;
        return this;
    }
    public String getRestrictionStartDate() {
        return this.restrictionStartDate;
    }

    public HouseRestrictionInfo setFromOrgName(String fromOrgName) {
        this.fromOrgName = fromOrgName;
        return this;
    }
    public String getFromOrgName() {
        return this.fromOrgName;
    }

    public HouseRestrictionInfo setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public String getRegisterTime() {
        return this.registerTime;
    }

    public HouseRestrictionInfo setRestrictedAmount(String restrictedAmount) {
        this.restrictedAmount = restrictedAmount;
        return this;
    }
    public String getRestrictedAmount() {
        return this.restrictedAmount;
    }

    public HouseRestrictionInfo setRestrictedAmountCurrency(String restrictedAmountCurrency) {
        this.restrictedAmountCurrency = restrictedAmountCurrency;
        return this;
    }
    public String getRestrictedAmountCurrency() {
        return this.restrictedAmountCurrency;
    }

    public HouseRestrictionInfo setRestrictionNo(String restrictionNo) {
        this.restrictionNo = restrictionNo;
        return this;
    }
    public String getRestrictionNo() {
        return this.restrictionNo;
    }

    public HouseRestrictionInfo setHouseNo(String houseNo) {
        this.houseNo = houseNo;
        return this;
    }
    public String getHouseNo() {
        return this.houseNo;
    }

}
