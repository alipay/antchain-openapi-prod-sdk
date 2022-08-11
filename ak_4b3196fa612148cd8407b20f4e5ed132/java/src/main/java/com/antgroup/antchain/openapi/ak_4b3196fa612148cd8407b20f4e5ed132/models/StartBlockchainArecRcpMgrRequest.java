// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b3196fa612148cd8407b20f4e5ed132.models;

import com.aliyun.tea.*;

public class StartBlockchainArecRcpMgrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 外部业务单号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 不动产颁发的他项权证号
    @NameInMap("other_right_cert_no")
    @Validation(required = true)
    public String otherRightCertNo;

    // 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
    @NameInMap("wipe_mortgage_reason")
    @Validation(required = true)
    public String wipeMortgageReason;

    // 解抵押的房产信息
    @NameInMap("house")
    @Validation(required = true)
    public House house;

    // 办理业务分支行
    @NameInMap("branch_bank")
    @Validation(required = true)
    public Bank branchBank;

    // 解抵押单号
    @NameInMap("mg_release_order_no")
    public String mgReleaseOrderNo;

    public static StartBlockchainArecRcpMgrRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBlockchainArecRcpMgrRequest self = new StartBlockchainArecRcpMgrRequest();
        return TeaModel.build(map, self);
    }

    public StartBlockchainArecRcpMgrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBlockchainArecRcpMgrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBlockchainArecRcpMgrRequest setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

    public StartBlockchainArecRcpMgrRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public StartBlockchainArecRcpMgrRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public StartBlockchainArecRcpMgrRequest setOtherRightCertNo(String otherRightCertNo) {
        this.otherRightCertNo = otherRightCertNo;
        return this;
    }
    public String getOtherRightCertNo() {
        return this.otherRightCertNo;
    }

    public StartBlockchainArecRcpMgrRequest setWipeMortgageReason(String wipeMortgageReason) {
        this.wipeMortgageReason = wipeMortgageReason;
        return this;
    }
    public String getWipeMortgageReason() {
        return this.wipeMortgageReason;
    }

    public StartBlockchainArecRcpMgrRequest setHouse(House house) {
        this.house = house;
        return this;
    }
    public House getHouse() {
        return this.house;
    }

    public StartBlockchainArecRcpMgrRequest setBranchBank(Bank branchBank) {
        this.branchBank = branchBank;
        return this;
    }
    public Bank getBranchBank() {
        return this.branchBank;
    }

    public StartBlockchainArecRcpMgrRequest setMgReleaseOrderNo(String mgReleaseOrderNo) {
        this.mgReleaseOrderNo = mgReleaseOrderNo;
        return this;
    }
    public String getMgReleaseOrderNo() {
        return this.mgReleaseOrderNo;
    }

}
