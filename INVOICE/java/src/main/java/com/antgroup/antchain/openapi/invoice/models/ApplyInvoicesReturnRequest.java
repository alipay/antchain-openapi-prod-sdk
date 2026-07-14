// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoicesReturnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // ou
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // 业务场景,退换票申请
    @NameInMap("invoice_biz_scene")
    @Validation(required = true)
    public String invoiceBizScene;

    // 操作，OLD_RETURN、ELC_RETURN
    @NameInMap("invoice_biz_action")
    @Validation(required = true)
    public String invoiceBizAction;

    // 系统来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 操作人员类型，01：商户，02：小二
    @NameInMap("operator_type")
    @Validation(required = true)
    public String operatorType;

    // 操作人工号
    @NameInMap("operator_no")
    @Validation(required = true)
    public String operatorNo;

    // 操作人名称
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 外部业务号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 合同ID
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 发票的退换信息
    @NameInMap("return_invoice_info")
    @Validation(required = true)
    public ReturnInvoiceInfo returnInvoiceInfo;

    // 购方信息
    @NameInMap("invoice_buyer")
    public ApplyInvoiceBuyer invoiceBuyer;

    public static ApplyInvoicesReturnRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoicesReturnRequest self = new ApplyInvoicesReturnRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInvoicesReturnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInvoicesReturnRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApplyInvoicesReturnRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public ApplyInvoicesReturnRequest setInvoiceBizScene(String invoiceBizScene) {
        this.invoiceBizScene = invoiceBizScene;
        return this;
    }
    public String getInvoiceBizScene() {
        return this.invoiceBizScene;
    }

    public ApplyInvoicesReturnRequest setInvoiceBizAction(String invoiceBizAction) {
        this.invoiceBizAction = invoiceBizAction;
        return this;
    }
    public String getInvoiceBizAction() {
        return this.invoiceBizAction;
    }

    public ApplyInvoicesReturnRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApplyInvoicesReturnRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public ApplyInvoicesReturnRequest setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
        return this;
    }
    public String getOperatorNo() {
        return this.operatorNo;
    }

    public ApplyInvoicesReturnRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ApplyInvoicesReturnRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public ApplyInvoicesReturnRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public ApplyInvoicesReturnRequest setReturnInvoiceInfo(ReturnInvoiceInfo returnInvoiceInfo) {
        this.returnInvoiceInfo = returnInvoiceInfo;
        return this;
    }
    public ReturnInvoiceInfo getReturnInvoiceInfo() {
        return this.returnInvoiceInfo;
    }

    public ApplyInvoicesReturnRequest setInvoiceBuyer(ApplyInvoiceBuyer invoiceBuyer) {
        this.invoiceBuyer = invoiceBuyer;
        return this;
    }
    public ApplyInvoiceBuyer getInvoiceBuyer() {
        return this.invoiceBuyer;
    }

}
