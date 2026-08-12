// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest extends TeaModel {
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
    public java.util.List<InvoiceApplyItem> invoiceApplyItemList;

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

    public static PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest self = new PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest();
        return TeaModel.build(map, self);
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setBizAction(String bizAction) {
        this.bizAction = bizAction;
        return this;
    }
    public String getBizAction() {
        return this.bizAction;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public String getTaxRate() {
        return this.taxRate;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setInvoiceApplyItemList(java.util.List<InvoiceApplyItem> invoiceApplyItemList) {
        this.invoiceApplyItemList = invoiceApplyItemList;
        return this;
    }
    public java.util.List<InvoiceApplyItem> getInvoiceApplyItemList() {
        return this.invoiceApplyItemList;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setInvoiceEmailInfo(InvoiceMailInfo invoiceEmailInfo) {
        this.invoiceEmailInfo = invoiceEmailInfo;
        return this;
    }
    public InvoiceMailInfo getInvoiceEmailInfo() {
        return this.invoiceEmailInfo;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
        return this;
    }
    public String getOperatorNo() {
        return this.operatorNo;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setOuCurrencyCode(String ouCurrencyCode) {
        this.ouCurrencyCode = ouCurrencyCode;
        return this;
    }
    public String getOuCurrencyCode() {
        return this.ouCurrencyCode;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setUserInvoiceInfo(UserInvoiceInfo userInvoiceInfo) {
        this.userInvoiceInfo = userInvoiceInfo;
        return this;
    }
    public UserInvoiceInfo getUserInvoiceInfo() {
        return this.userInvoiceInfo;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setExpenseperiodStartdate(String expenseperiodStartdate) {
        this.expenseperiodStartdate = expenseperiodStartdate;
        return this;
    }
    public String getExpenseperiodStartdate() {
        return this.expenseperiodStartdate;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest setExpenseperiodEnddate(String expenseperiodEnddate) {
        this.expenseperiodEnddate = expenseperiodEnddate;
        return this;
    }
    public String getExpenseperiodEnddate() {
        return this.expenseperiodEnddate;
    }

}
