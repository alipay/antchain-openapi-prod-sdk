// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreditAmount extends TeaModel {
    // 授信额度
    @NameInMap("credit_amount")
    @Validation(required = true)
    public Long creditAmount;

    // 授信余额
    @NameInMap("rest_amount")
    @Validation(required = true)
    public Long restAmount;

    // 发放日期
    @NameInMap("pay_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String payDate;

    // 到期日期
    @NameInMap("expire_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireDate;

    // 利率单位(1:年，2：月，3：日)
    @NameInMap("rate_unit")
    @Validation(required = true)
    public String rateUnit;

    // 执行利率,利率值，单位%
    // 年化5%，rateValue=5
    // 
    @NameInMap("rate_value")
    @Validation(required = true)
    public Long rateValue;

    // 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
    @NameInMap("repay_way")
    @Validation(required = true)
    public String repayWay;

    // 状态0-正常 1-冻结 2-终止
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发放日期（兼容字段）
    @NameInMap("pay_date_sup")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String payDateSup;

    // 到期日期（兼容字段）
    @NameInMap("expire_date_sup")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireDateSup;

    public static CreditAmount build(java.util.Map<String, ?> map) throws Exception {
        CreditAmount self = new CreditAmount();
        return TeaModel.build(map, self);
    }

    public CreditAmount setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public Long getCreditAmount() {
        return this.creditAmount;
    }

    public CreditAmount setRestAmount(Long restAmount) {
        this.restAmount = restAmount;
        return this;
    }
    public Long getRestAmount() {
        return this.restAmount;
    }

    public CreditAmount setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

    public CreditAmount setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public CreditAmount setRateUnit(String rateUnit) {
        this.rateUnit = rateUnit;
        return this;
    }
    public String getRateUnit() {
        return this.rateUnit;
    }

    public CreditAmount setRateValue(Long rateValue) {
        this.rateValue = rateValue;
        return this;
    }
    public Long getRateValue() {
        return this.rateValue;
    }

    public CreditAmount setRepayWay(String repayWay) {
        this.repayWay = repayWay;
        return this;
    }
    public String getRepayWay() {
        return this.repayWay;
    }

    public CreditAmount setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreditAmount setPayDateSup(String payDateSup) {
        this.payDateSup = payDateSup;
        return this;
    }
    public String getPayDateSup() {
        return this.payDateSup;
    }

    public CreditAmount setExpireDateSup(String expireDateSup) {
        this.expireDateSup = expireDateSup;
        return this;
    }
    public String getExpireDateSup() {
        return this.expireDateSup;
    }

}
