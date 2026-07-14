// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class PushIntlinvoicesProformainvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 合同号或订单号
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 业务动作
    @NameInMap("biz_action")
    @Validation(required = true)
    public String bizAction;

    // 业务场景
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 币种
    @NameInMap("currency_code")
    @Validation(required = true)
    public String currencyCode;

    // 税率
    @NameInMap("tax_rate")
    @Validation(required = true)
    public String taxRate;

    // 开票申请项列表
    @NameInMap("invoice_apply_item_list")
    @Validation(required = true)
    public java.util.List<IntlInvoiceApplyInfoItem> invoiceApplyItemList;

    // 开票日期
    @NameInMap("invoice_date")
    @Validation(required = true)
    public String invoiceDate;

    // 发票邮寄信息
    @NameInMap("invoice_email_info")
    @Validation(required = true)
    public InvoiceMailInfo invoiceEmailInfo;

    // 发票类型
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 操作人姓名
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 操作人ID
    @NameInMap("operator_no")
    @Validation(required = true)
    public String operatorNo;

    // OU
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // OU币种
    @NameInMap("ou_currency_code")
    @Validation(required = true)
    public String ouCurrencyCode;

    // 来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 用户开票信息
    @NameInMap("user_invoice_info")
    @Validation(required = true)
    public UserInvoiceInfo userInvoiceInfo;

    // 申请原因
    @NameInMap("apply_reason")
    public String applyReason;

    // 费用期间开始日期
    @NameInMap("expenseperiod_startdate")
    public String expenseperiodStartdate;

    // 费用期间结束日期
    @NameInMap("expenseperiod_enddate")
    public String expenseperiodEnddate;

    public static PushIntlinvoicesProformainvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PushIntlinvoicesProformainvoiceRequest self = new PushIntlinvoicesProformainvoiceRequest();
        return TeaModel.build(map, self);
    }

    public PushIntlinvoicesProformainvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushIntlinvoicesProformainvoiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PushIntlinvoicesProformainvoiceRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public PushIntlinvoicesProformainvoiceRequest setBizAction(String bizAction) {
        this.bizAction = bizAction;
        return this;
    }
    public String getBizAction() {
        return this.bizAction;
    }

    public PushIntlinvoicesProformainvoiceRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public PushIntlinvoicesProformainvoiceRequest setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public PushIntlinvoicesProformainvoiceRequest setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public String getTaxRate() {
        return this.taxRate;
    }

    public PushIntlinvoicesProformainvoiceRequest setInvoiceApplyItemList(java.util.List<IntlInvoiceApplyInfoItem> invoiceApplyItemList) {
        this.invoiceApplyItemList = invoiceApplyItemList;
        return this;
    }
    public java.util.List<IntlInvoiceApplyInfoItem> getInvoiceApplyItemList() {
        return this.invoiceApplyItemList;
    }

    public PushIntlinvoicesProformainvoiceRequest setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public PushIntlinvoicesProformainvoiceRequest setInvoiceEmailInfo(InvoiceMailInfo invoiceEmailInfo) {
        this.invoiceEmailInfo = invoiceEmailInfo;
        return this;
    }
    public InvoiceMailInfo getInvoiceEmailInfo() {
        return this.invoiceEmailInfo;
    }

    public PushIntlinvoicesProformainvoiceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public PushIntlinvoicesProformainvoiceRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public PushIntlinvoicesProformainvoiceRequest setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
        return this;
    }
    public String getOperatorNo() {
        return this.operatorNo;
    }

    public PushIntlinvoicesProformainvoiceRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public PushIntlinvoicesProformainvoiceRequest setOuCurrencyCode(String ouCurrencyCode) {
        this.ouCurrencyCode = ouCurrencyCode;
        return this;
    }
    public String getOuCurrencyCode() {
        return this.ouCurrencyCode;
    }

    public PushIntlinvoicesProformainvoiceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PushIntlinvoicesProformainvoiceRequest setUserInvoiceInfo(UserInvoiceInfo userInvoiceInfo) {
        this.userInvoiceInfo = userInvoiceInfo;
        return this;
    }
    public UserInvoiceInfo getUserInvoiceInfo() {
        return this.userInvoiceInfo;
    }

    public PushIntlinvoicesProformainvoiceRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public PushIntlinvoicesProformainvoiceRequest setExpenseperiodStartdate(String expenseperiodStartdate) {
        this.expenseperiodStartdate = expenseperiodStartdate;
        return this;
    }
    public String getExpenseperiodStartdate() {
        return this.expenseperiodStartdate;
    }

    public PushIntlinvoicesProformainvoiceRequest setExpenseperiodEnddate(String expenseperiodEnddate) {
        this.expenseperiodEnddate = expenseperiodEnddate;
        return this;
    }
    public String getExpenseperiodEnddate() {
        return this.expenseperiodEnddate;
    }

}
