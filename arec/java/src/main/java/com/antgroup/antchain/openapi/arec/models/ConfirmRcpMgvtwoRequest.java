// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class ConfirmRcpMgvtwoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 助贷平台
    @NameInMap("loan_assist_platform")
    @Validation(required = true)
    public String loanAssistPlatform;

    // 房产链内部银行编号
    @NameInMap("bank_no")
    @Validation(required = true)
    public String bankNo;

    // 房产链抵押单号
    @NameInMap("mg_order_no")
    @Validation(required = true)
    public String mgOrderNo;

    // 确认抵押结果，Y:继续抵押,N:终止抵押
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 终止抵押原因code
    @NameInMap("fail_code")
    public String failCode;

    // 终止抵押原因desc
    @NameInMap("fail_desc")
    public String failDesc;

    // 借款人
    @NameInMap("borrower")
    @Validation(required = true)
    public Person borrower;

    // 婚姻状况,MARRIED=已婚
    @NameInMap("marital_status")
    @Validation(required = true)
    public String maritalStatus;

    // 借款人配偶
    @NameInMap("spouse")
    public Person spouse;

    // 银行签署完成的合同列表
    @NameInMap("agreements")
    @Validation(required = true)
    public java.util.List<Agreement> agreements;

    // 确认抵押需要的影印材料列表
    @NameInMap("archives")
    @Validation(required = true)
    public java.util.List<Archive> archives;

    // 登记权利类型，MORTGAGE_RIGHTS=抵押权
    @NameInMap("reg_rights")
    @Validation(required = true)
    public String regRights;

    // 登记类型,FIRSTMAXGAGE_BIZTYPE=不动产抵押权首次登记(最高额抵押)
    @NameInMap("reg_type")
    @Validation(required = true)
    public String regType;

    // 登记设立原因,LOAN=借贷
    @NameInMap("reg_reason")
    @Validation(required = true)
    public String regReason;

    // 登记设立原因备注
    @NameInMap("reg_reason_remark")
    @Validation(required = true)
    public String regReasonRemark;

    public static ConfirmRcpMgvtwoRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRcpMgvtwoRequest self = new ConfirmRcpMgvtwoRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmRcpMgvtwoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmRcpMgvtwoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmRcpMgvtwoRequest setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

    public ConfirmRcpMgvtwoRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public ConfirmRcpMgvtwoRequest setMgOrderNo(String mgOrderNo) {
        this.mgOrderNo = mgOrderNo;
        return this;
    }
    public String getMgOrderNo() {
        return this.mgOrderNo;
    }

    public ConfirmRcpMgvtwoRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ConfirmRcpMgvtwoRequest setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public ConfirmRcpMgvtwoRequest setFailDesc(String failDesc) {
        this.failDesc = failDesc;
        return this;
    }
    public String getFailDesc() {
        return this.failDesc;
    }

    public ConfirmRcpMgvtwoRequest setBorrower(Person borrower) {
        this.borrower = borrower;
        return this;
    }
    public Person getBorrower() {
        return this.borrower;
    }

    public ConfirmRcpMgvtwoRequest setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }
    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public ConfirmRcpMgvtwoRequest setSpouse(Person spouse) {
        this.spouse = spouse;
        return this;
    }
    public Person getSpouse() {
        return this.spouse;
    }

    public ConfirmRcpMgvtwoRequest setAgreements(java.util.List<Agreement> agreements) {
        this.agreements = agreements;
        return this;
    }
    public java.util.List<Agreement> getAgreements() {
        return this.agreements;
    }

    public ConfirmRcpMgvtwoRequest setArchives(java.util.List<Archive> archives) {
        this.archives = archives;
        return this;
    }
    public java.util.List<Archive> getArchives() {
        return this.archives;
    }

    public ConfirmRcpMgvtwoRequest setRegRights(String regRights) {
        this.regRights = regRights;
        return this;
    }
    public String getRegRights() {
        return this.regRights;
    }

    public ConfirmRcpMgvtwoRequest setRegType(String regType) {
        this.regType = regType;
        return this;
    }
    public String getRegType() {
        return this.regType;
    }

    public ConfirmRcpMgvtwoRequest setRegReason(String regReason) {
        this.regReason = regReason;
        return this;
    }
    public String getRegReason() {
        return this.regReason;
    }

    public ConfirmRcpMgvtwoRequest setRegReasonRemark(String regReasonRemark) {
        this.regReasonRemark = regReasonRemark;
        return this;
    }
    public String getRegReasonRemark() {
        return this.regReasonRemark;
    }

}
