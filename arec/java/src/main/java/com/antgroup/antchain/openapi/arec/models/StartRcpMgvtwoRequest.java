// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class StartRcpMgvtwoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 助贷平台
    @NameInMap("loan_assist_platform")
    public String loanAssistPlatform;

    // 房产链内部银行编号
    @NameInMap("bank_no")
    public String bankNo;

    // 外部业务单号
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 借款人
    @NameInMap("borrower")
    public Person borrower;

    // 婚姻状况
    @NameInMap("marital_status")
    public String maritalStatus;

    // 借款人配偶
    @NameInMap("spouse")
    public Person spouse;

    // 房产信息
    @NameInMap("house")
    public House house;

    // 待签合同列表
    @NameInMap("agreements")
    public java.util.List<Agreement> agreements;

    // 客户签署合同过期时间
    @NameInMap("ar_expire_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String arExpireTime;

    // 抵押担保信息
    @NameInMap("mg_order_mort_guarantee")
    public MortGuaranteeInfo mgOrderMortGuarantee;

    // 办理业务分支行
    @NameInMap("branch_bank")
    public Bank branchBank;

    public static StartRcpMgvtwoRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRcpMgvtwoRequest self = new StartRcpMgvtwoRequest();
        return TeaModel.build(map, self);
    }

    public StartRcpMgvtwoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartRcpMgvtwoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartRcpMgvtwoRequest setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

    public StartRcpMgvtwoRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public StartRcpMgvtwoRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public StartRcpMgvtwoRequest setBorrower(Person borrower) {
        this.borrower = borrower;
        return this;
    }
    public Person getBorrower() {
        return this.borrower;
    }

    public StartRcpMgvtwoRequest setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }
    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public StartRcpMgvtwoRequest setSpouse(Person spouse) {
        this.spouse = spouse;
        return this;
    }
    public Person getSpouse() {
        return this.spouse;
    }

    public StartRcpMgvtwoRequest setHouse(House house) {
        this.house = house;
        return this;
    }
    public House getHouse() {
        return this.house;
    }

    public StartRcpMgvtwoRequest setAgreements(java.util.List<Agreement> agreements) {
        this.agreements = agreements;
        return this;
    }
    public java.util.List<Agreement> getAgreements() {
        return this.agreements;
    }

    public StartRcpMgvtwoRequest setArExpireTime(String arExpireTime) {
        this.arExpireTime = arExpireTime;
        return this;
    }
    public String getArExpireTime() {
        return this.arExpireTime;
    }

    public StartRcpMgvtwoRequest setMgOrderMortGuarantee(MortGuaranteeInfo mgOrderMortGuarantee) {
        this.mgOrderMortGuarantee = mgOrderMortGuarantee;
        return this;
    }
    public MortGuaranteeInfo getMgOrderMortGuarantee() {
        return this.mgOrderMortGuarantee;
    }

    public StartRcpMgvtwoRequest setBranchBank(Bank branchBank) {
        this.branchBank = branchBank;
        return this;
    }
    public Bank getBranchBank() {
        return this.branchBank;
    }

}
