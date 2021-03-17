// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class StartRcpMgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待签署的合同列表
    @NameInMap("agreements")
    @Validation(required = true)
    public java.util.List<Agreement> agreements;

    // 材料清单列表
    @NameInMap("archives")
    public java.util.List<Archive> archives;

    // 合同变量和值的全集，Map<String,String>的json格式
    @NameInMap("ar_var_value_json")
    @Validation(required = true)
    public String arVarValueJson;

    // 银行编号
    @NameInMap("bank_no")
    @Validation(required = true)
    public String bankNo;

    // 借款人
    @NameInMap("borrower")
    @Validation(required = true)
    public Person borrower;

    // 扩展字段
    @NameInMap("extend_json")
    public String extendJson;

    // 抵押房产
    @NameInMap("house")
    @Validation(required = true)
    public House house;

    // 婚姻状况,比如：MARRIED=已婚
    @NameInMap("marital_status")
    @Validation(required = true)
    public String maritalStatus;

    // 外部业务单号，银行提供
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 登记设立原因，比如：LOAN=借贷
    @NameInMap("reg_reason")
    @Validation(required = true)
    public String regReason;

    // 登记设立原因备注
    @NameInMap("reg_reason_remark")
    public String regReasonRemark;

    // 登记权利,比如：MORTGAGE_RIGHTS=抵押权
    @NameInMap("reg_rights")
    @Validation(required = true)
    public String regRights;

    // 登记类型，比如：FIRST_REG=首次登记
    @NameInMap("reg_type")
    @Validation(required = true)
    public String regType;

    // 配偶
    @NameInMap("spouse")
    public Person spouse;

    public static StartRcpMgRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRcpMgRequest self = new StartRcpMgRequest();
        return TeaModel.build(map, self);
    }

    public StartRcpMgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartRcpMgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartRcpMgRequest setAgreements(java.util.List<Agreement> agreements) {
        this.agreements = agreements;
        return this;
    }
    public java.util.List<Agreement> getAgreements() {
        return this.agreements;
    }

    public StartRcpMgRequest setArchives(java.util.List<Archive> archives) {
        this.archives = archives;
        return this;
    }
    public java.util.List<Archive> getArchives() {
        return this.archives;
    }

    public StartRcpMgRequest setArVarValueJson(String arVarValueJson) {
        this.arVarValueJson = arVarValueJson;
        return this;
    }
    public String getArVarValueJson() {
        return this.arVarValueJson;
    }

    public StartRcpMgRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public StartRcpMgRequest setBorrower(Person borrower) {
        this.borrower = borrower;
        return this;
    }
    public Person getBorrower() {
        return this.borrower;
    }

    public StartRcpMgRequest setExtendJson(String extendJson) {
        this.extendJson = extendJson;
        return this;
    }
    public String getExtendJson() {
        return this.extendJson;
    }

    public StartRcpMgRequest setHouse(House house) {
        this.house = house;
        return this;
    }
    public House getHouse() {
        return this.house;
    }

    public StartRcpMgRequest setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }
    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public StartRcpMgRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public StartRcpMgRequest setRegReason(String regReason) {
        this.regReason = regReason;
        return this;
    }
    public String getRegReason() {
        return this.regReason;
    }

    public StartRcpMgRequest setRegReasonRemark(String regReasonRemark) {
        this.regReasonRemark = regReasonRemark;
        return this;
    }
    public String getRegReasonRemark() {
        return this.regReasonRemark;
    }

    public StartRcpMgRequest setRegRights(String regRights) {
        this.regRights = regRights;
        return this;
    }
    public String getRegRights() {
        return this.regRights;
    }

    public StartRcpMgRequest setRegType(String regType) {
        this.regType = regType;
        return this;
    }
    public String getRegType() {
        return this.regType;
    }

    public StartRcpMgRequest setSpouse(Person spouse) {
        this.spouse = spouse;
        return this;
    }
    public Person getSpouse() {
        return this.spouse;
    }

}
