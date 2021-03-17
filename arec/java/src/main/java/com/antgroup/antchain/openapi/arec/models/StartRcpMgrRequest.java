// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class StartRcpMgrRequest extends TeaModel {
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

    public static StartRcpMgrRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRcpMgrRequest self = new StartRcpMgrRequest();
        return TeaModel.build(map, self);
    }

    public StartRcpMgrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartRcpMgrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartRcpMgrRequest setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

    public StartRcpMgrRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public StartRcpMgrRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public StartRcpMgrRequest setOtherRightCertNo(String otherRightCertNo) {
        this.otherRightCertNo = otherRightCertNo;
        return this;
    }
    public String getOtherRightCertNo() {
        return this.otherRightCertNo;
    }

    public StartRcpMgrRequest setWipeMortgageReason(String wipeMortgageReason) {
        this.wipeMortgageReason = wipeMortgageReason;
        return this;
    }
    public String getWipeMortgageReason() {
        return this.wipeMortgageReason;
    }

    public StartRcpMgrRequest setHouse(House house) {
        this.house = house;
        return this;
    }
    public House getHouse() {
        return this.house;
    }

    public StartRcpMgrRequest setBranchBank(Bank branchBank) {
        this.branchBank = branchBank;
        return this;
    }
    public Bank getBranchBank() {
        return this.branchBank;
    }

}
