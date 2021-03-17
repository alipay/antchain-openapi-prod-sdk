// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class MortGuaranteeInfo extends TeaModel {
    // 争议处理方式,比如：COUNT_PROCEEDING=有管辖权的人民法院提起诉讼
    @NameInMap("conflict_handle_method")
    public String conflictHandleMethod;

    // 评估价值，人民币默认单位为元，小数点保留2位
    @NameInMap("evaluation_amt")
    public String evaluationAmt;

    // 评估价值货币类型,比如：CNY=人民币
    @NameInMap("evaluation_amt_currency")
    public String evaluationAmtCurrency;

    // 担保范围列表,比如：MAIN_CLAIM=主债权
    @NameInMap("guarantee_scope_json")
    public java.util.List<String> guaranteeScopeJson;

    // 担保范围备注
    @NameInMap("guarantee_scope_note")
    public String guaranteeScopeNote;

    // 抵押方式，比如：MAX_AMOUNT_MORT=最高额抵押权
    @NameInMap("mortgage_type")
    public String mortgageType;

    // 被担保主债权数额,人民币默认单位元，保留两位小数点
    @NameInMap("debt_amt")
    public String debtAmt;

    // 被担保主债权数额货币类型，比如：CNY=人民币
    @NameInMap("debt_amt_currency")
    public String debtAmtCurrency;

    // 履债结束日期
    @NameInMap("debt_end_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String debtEndDate;

    // 履债起始日期
    @NameInMap("debt_start_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String debtStartDate;

    // 抵押物属性,比如：REGISTED_BUILDING=已建成并登记发证建筑物
    @NameInMap("mort_realty_property")
    public String mortRealtyProperty;

    // 合同债权金额币种
    @NameInMap("ar_debt_amt_currency")
    public String arDebtAmtCurrency;

    // 合同债权金额
    @NameInMap("ar_debt_amt")
    public String arDebtAmt;

    // 房产链内部抵押单号
    @NameInMap("mg_order_no")
    public String mgOrderNo;

    public static MortGuaranteeInfo build(java.util.Map<String, ?> map) throws Exception {
        MortGuaranteeInfo self = new MortGuaranteeInfo();
        return TeaModel.build(map, self);
    }

    public MortGuaranteeInfo setConflictHandleMethod(String conflictHandleMethod) {
        this.conflictHandleMethod = conflictHandleMethod;
        return this;
    }
    public String getConflictHandleMethod() {
        return this.conflictHandleMethod;
    }

    public MortGuaranteeInfo setEvaluationAmt(String evaluationAmt) {
        this.evaluationAmt = evaluationAmt;
        return this;
    }
    public String getEvaluationAmt() {
        return this.evaluationAmt;
    }

    public MortGuaranteeInfo setEvaluationAmtCurrency(String evaluationAmtCurrency) {
        this.evaluationAmtCurrency = evaluationAmtCurrency;
        return this;
    }
    public String getEvaluationAmtCurrency() {
        return this.evaluationAmtCurrency;
    }

    public MortGuaranteeInfo setGuaranteeScopeJson(java.util.List<String> guaranteeScopeJson) {
        this.guaranteeScopeJson = guaranteeScopeJson;
        return this;
    }
    public java.util.List<String> getGuaranteeScopeJson() {
        return this.guaranteeScopeJson;
    }

    public MortGuaranteeInfo setGuaranteeScopeNote(String guaranteeScopeNote) {
        this.guaranteeScopeNote = guaranteeScopeNote;
        return this;
    }
    public String getGuaranteeScopeNote() {
        return this.guaranteeScopeNote;
    }

    public MortGuaranteeInfo setMortgageType(String mortgageType) {
        this.mortgageType = mortgageType;
        return this;
    }
    public String getMortgageType() {
        return this.mortgageType;
    }

    public MortGuaranteeInfo setDebtAmt(String debtAmt) {
        this.debtAmt = debtAmt;
        return this;
    }
    public String getDebtAmt() {
        return this.debtAmt;
    }

    public MortGuaranteeInfo setDebtAmtCurrency(String debtAmtCurrency) {
        this.debtAmtCurrency = debtAmtCurrency;
        return this;
    }
    public String getDebtAmtCurrency() {
        return this.debtAmtCurrency;
    }

    public MortGuaranteeInfo setDebtEndDate(String debtEndDate) {
        this.debtEndDate = debtEndDate;
        return this;
    }
    public String getDebtEndDate() {
        return this.debtEndDate;
    }

    public MortGuaranteeInfo setDebtStartDate(String debtStartDate) {
        this.debtStartDate = debtStartDate;
        return this;
    }
    public String getDebtStartDate() {
        return this.debtStartDate;
    }

    public MortGuaranteeInfo setMortRealtyProperty(String mortRealtyProperty) {
        this.mortRealtyProperty = mortRealtyProperty;
        return this;
    }
    public String getMortRealtyProperty() {
        return this.mortRealtyProperty;
    }

    public MortGuaranteeInfo setArDebtAmtCurrency(String arDebtAmtCurrency) {
        this.arDebtAmtCurrency = arDebtAmtCurrency;
        return this;
    }
    public String getArDebtAmtCurrency() {
        return this.arDebtAmtCurrency;
    }

    public MortGuaranteeInfo setArDebtAmt(String arDebtAmt) {
        this.arDebtAmt = arDebtAmt;
        return this;
    }
    public String getArDebtAmt() {
        return this.arDebtAmt;
    }

    public MortGuaranteeInfo setMgOrderNo(String mgOrderNo) {
        this.mgOrderNo = mgOrderNo;
        return this;
    }
    public String getMgOrderNo() {
        return this.mgOrderNo;
    }

}
