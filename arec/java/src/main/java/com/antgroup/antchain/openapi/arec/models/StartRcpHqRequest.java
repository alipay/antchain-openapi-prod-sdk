// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class StartRcpHqRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 房产查询场景,NO_AUTH_QUERY=无授权直查
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

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

    // 房产信息
    @NameInMap("house")
    @Validation(required = true)
    public House house;

    // 查询产权
    @NameInMap("house_owner")
    @Validation(required = true)
    public HouseOwner houseOwner;

    // 办理业务分支行
    @NameInMap("branch_bank")
    @Validation(required = true)
    public Bank branchBank;

    public static StartRcpHqRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRcpHqRequest self = new StartRcpHqRequest();
        return TeaModel.build(map, self);
    }

    public StartRcpHqRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartRcpHqRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartRcpHqRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public StartRcpHqRequest setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

    public StartRcpHqRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public StartRcpHqRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public StartRcpHqRequest setHouse(House house) {
        this.house = house;
        return this;
    }
    public House getHouse() {
        return this.house;
    }

    public StartRcpHqRequest setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
        return this;
    }
    public HouseOwner getHouseOwner() {
        return this.houseOwner;
    }

    public StartRcpHqRequest setBranchBank(Bank branchBank) {
        this.branchBank = branchBank;
        return this;
    }
    public Bank getBranchBank() {
        return this.branchBank;
    }

}
