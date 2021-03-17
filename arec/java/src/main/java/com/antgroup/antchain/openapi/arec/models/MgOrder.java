// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class MgOrder extends TeaModel {
    // 已签署的合同列表
    @NameInMap("agreements")
    public java.util.List<Agreement> agreements;

    // 附件材料列表
    @NameInMap("archives")
    public java.util.List<Archive> archives;

    // 房屋授权查询合同签署任务
    @NameInMap("auth_ar_sign_task")
    public ArSignTask authArSignTask;

    // 银行名称
    @NameInMap("bank_name")
    public String bankName;

    // 银行编号
    @NameInMap("bank_no")
    public String bankNo;

    // 借款人身份证号
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型，比如：ID_CARD=身份证
    @NameInMap("cert_type")
    public String certType;

    // 借款人编号
    @NameInMap("cm_no")
    public String cmNo;

    // 抵押登记结束日期
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 抵押登记失败类型，比如：MF_REALTY_NOT_EXISTS=房产信息不存在
    @NameInMap("fail_code")
    public String failCode;

    // 抵押登记错误信息描述
    @NameInMap("fail_desc")
    public String failDesc;

    // 不动产返回房产信息
    @NameInMap("house")
    public House house;

    // 确认预抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
    @NameInMap("init_ar_var_value_json")
    public String initArVarValueJson;

    // 借款人婚姻状况，比如：MARRIED=已婚
    @NameInMap("marriage")
    public String marriage;

    // 抵押登记相关合同签署任务列表
    @NameInMap("mg_ar_sign_tasks")
    public java.util.List<ArSignTask> mgArSignTasks;

    // 抵押登记回执
    @NameInMap("mg_cert")
    public MgCert mgCert;

    // 抵押单号
    @NameInMap("mg_order_no")
    public String mgOrderNo;

    // 借款人身份证
    @NameInMap("name")
    public String name;

    // 银行的业务编号
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 抵押登记申请日期
    @NameInMap("reg_apply_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String regApplyDate;

    // 登记设立原因，比如：LOAN=借贷
    @NameInMap("reg_reason")
    public String regReason;

    // 登记设立原因描述
    @NameInMap("reg_reason_remark")
    public String regReasonRemark;

    // 登记权利,比如：MORTGAGE_RIGHTS=抵押权
    @NameInMap("reg_rights")
    public String regRights;

    // 登记类型，比如：FIRST_REG=首次登记
    @NameInMap("reg_type")
    public String regType;

    // 不动产中心的抵押登记号
    @NameInMap("rtc_mg_order_no")
    public String rtcMgOrderNo;

    // 不动产登记中心名称
    @NameInMap("rtc_name")
    public String rtcName;

    // 不动产登记中心编号
    @NameInMap("rtc_no")
    public String rtcNo;

    // 借款人配偶客户编号
    @NameInMap("spouse_cm_no")
    public String spouseCmNo;

    // 发起抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
    @NameInMap("start_ar_var_value_json")
    public String startArVarValueJson;

    // 抵押登记发起日期
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 抵押单状态 ，比如：MG_ING=抵押登记中
    @NameInMap("status")
    public String status;

    // 扩展字段
    @NameInMap("extend_json")
    public String extendJson;

    // 助贷平台
    @NameInMap("loan_assist_platform")
    public String loanAssistPlatform;

    // 办理业务分支行
    @NameInMap("branch_bank")
    public Bank branchBank;

    public static MgOrder build(java.util.Map<String, ?> map) throws Exception {
        MgOrder self = new MgOrder();
        return TeaModel.build(map, self);
    }

    public MgOrder setAgreements(java.util.List<Agreement> agreements) {
        this.agreements = agreements;
        return this;
    }
    public java.util.List<Agreement> getAgreements() {
        return this.agreements;
    }

    public MgOrder setArchives(java.util.List<Archive> archives) {
        this.archives = archives;
        return this;
    }
    public java.util.List<Archive> getArchives() {
        return this.archives;
    }

    public MgOrder setAuthArSignTask(ArSignTask authArSignTask) {
        this.authArSignTask = authArSignTask;
        return this;
    }
    public ArSignTask getAuthArSignTask() {
        return this.authArSignTask;
    }

    public MgOrder setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public MgOrder setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public MgOrder setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public MgOrder setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public MgOrder setCmNo(String cmNo) {
        this.cmNo = cmNo;
        return this;
    }
    public String getCmNo() {
        return this.cmNo;
    }

    public MgOrder setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MgOrder setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public MgOrder setFailDesc(String failDesc) {
        this.failDesc = failDesc;
        return this;
    }
    public String getFailDesc() {
        return this.failDesc;
    }

    public MgOrder setHouse(House house) {
        this.house = house;
        return this;
    }
    public House getHouse() {
        return this.house;
    }

    public MgOrder setInitArVarValueJson(String initArVarValueJson) {
        this.initArVarValueJson = initArVarValueJson;
        return this;
    }
    public String getInitArVarValueJson() {
        return this.initArVarValueJson;
    }

    public MgOrder setMarriage(String marriage) {
        this.marriage = marriage;
        return this;
    }
    public String getMarriage() {
        return this.marriage;
    }

    public MgOrder setMgArSignTasks(java.util.List<ArSignTask> mgArSignTasks) {
        this.mgArSignTasks = mgArSignTasks;
        return this;
    }
    public java.util.List<ArSignTask> getMgArSignTasks() {
        return this.mgArSignTasks;
    }

    public MgOrder setMgCert(MgCert mgCert) {
        this.mgCert = mgCert;
        return this;
    }
    public MgCert getMgCert() {
        return this.mgCert;
    }

    public MgOrder setMgOrderNo(String mgOrderNo) {
        this.mgOrderNo = mgOrderNo;
        return this;
    }
    public String getMgOrderNo() {
        return this.mgOrderNo;
    }

    public MgOrder setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MgOrder setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public MgOrder setRegApplyDate(String regApplyDate) {
        this.regApplyDate = regApplyDate;
        return this;
    }
    public String getRegApplyDate() {
        return this.regApplyDate;
    }

    public MgOrder setRegReason(String regReason) {
        this.regReason = regReason;
        return this;
    }
    public String getRegReason() {
        return this.regReason;
    }

    public MgOrder setRegReasonRemark(String regReasonRemark) {
        this.regReasonRemark = regReasonRemark;
        return this;
    }
    public String getRegReasonRemark() {
        return this.regReasonRemark;
    }

    public MgOrder setRegRights(String regRights) {
        this.regRights = regRights;
        return this;
    }
    public String getRegRights() {
        return this.regRights;
    }

    public MgOrder setRegType(String regType) {
        this.regType = regType;
        return this;
    }
    public String getRegType() {
        return this.regType;
    }

    public MgOrder setRtcMgOrderNo(String rtcMgOrderNo) {
        this.rtcMgOrderNo = rtcMgOrderNo;
        return this;
    }
    public String getRtcMgOrderNo() {
        return this.rtcMgOrderNo;
    }

    public MgOrder setRtcName(String rtcName) {
        this.rtcName = rtcName;
        return this;
    }
    public String getRtcName() {
        return this.rtcName;
    }

    public MgOrder setRtcNo(String rtcNo) {
        this.rtcNo = rtcNo;
        return this;
    }
    public String getRtcNo() {
        return this.rtcNo;
    }

    public MgOrder setSpouseCmNo(String spouseCmNo) {
        this.spouseCmNo = spouseCmNo;
        return this;
    }
    public String getSpouseCmNo() {
        return this.spouseCmNo;
    }

    public MgOrder setStartArVarValueJson(String startArVarValueJson) {
        this.startArVarValueJson = startArVarValueJson;
        return this;
    }
    public String getStartArVarValueJson() {
        return this.startArVarValueJson;
    }

    public MgOrder setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public MgOrder setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MgOrder setExtendJson(String extendJson) {
        this.extendJson = extendJson;
        return this;
    }
    public String getExtendJson() {
        return this.extendJson;
    }

    public MgOrder setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

    public MgOrder setBranchBank(Bank branchBank) {
        this.branchBank = branchBank;
        return this;
    }
    public Bank getBranchBank() {
        return this.branchBank;
    }

}
