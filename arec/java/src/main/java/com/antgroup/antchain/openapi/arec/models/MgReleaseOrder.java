// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class MgReleaseOrder extends TeaModel {
    // 解抵押单号
    @NameInMap("mg_release_order_no")
    public String mgReleaseOrderNo;

    // 不动产中心解抵押单号
    @NameInMap("rtc_mg_release_order_no")
    public String rtcMgReleaseOrderNo;

    // 机构侧业务单号
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 抵押登记权证号(他项权证号)
    @NameInMap("other_right_cert_no")
    public String otherRightCertNo;

    // 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
    @NameInMap("wipe_mortgage_reason")
    public String wipeMortgageReason;

    // 解抵押状态
    @NameInMap("status")
    public String status;

    // 房产链内部银行编号
    @NameInMap("bank_no")
    public String bankNo;

    // 银行名称
    @NameInMap("bank_name")
    public String bankName;

    // 房产链内部不动产中心编号
    @NameInMap("rtc_no")
    public String rtcNo;

    // 不动产中心名称
    @NameInMap("rtc_name")
    public String rtcName;

    // 办理业务分支行
    @NameInMap("branch_bank")
    public Bank branchBank;

    // 解抵押的房产信息
    @NameInMap("house")
    public House house;

    // 解抵押的合同列表
    @NameInMap("agreements")
    public java.util.List<Agreement> agreements;

    // 解抵押相关的附件材料
    @NameInMap("archives")
    public java.util.List<Archive> archives;

    // 解抵押单据生成时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 解抵押单据结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 解抵押失败code,MGR_AR_SIGN_FAIL=解抵押合同签署失败
    @NameInMap("fail_code")
    public String failCode;

    // 解抵押失败原因描述
    @NameInMap("fail_desc")
    public String failDesc;

    // 助贷平台
    @NameInMap("loan_assist_platform")
    public String loanAssistPlatform;

    public static MgReleaseOrder build(java.util.Map<String, ?> map) throws Exception {
        MgReleaseOrder self = new MgReleaseOrder();
        return TeaModel.build(map, self);
    }

    public MgReleaseOrder setMgReleaseOrderNo(String mgReleaseOrderNo) {
        this.mgReleaseOrderNo = mgReleaseOrderNo;
        return this;
    }
    public String getMgReleaseOrderNo() {
        return this.mgReleaseOrderNo;
    }

    public MgReleaseOrder setRtcMgReleaseOrderNo(String rtcMgReleaseOrderNo) {
        this.rtcMgReleaseOrderNo = rtcMgReleaseOrderNo;
        return this;
    }
    public String getRtcMgReleaseOrderNo() {
        return this.rtcMgReleaseOrderNo;
    }

    public MgReleaseOrder setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public MgReleaseOrder setOtherRightCertNo(String otherRightCertNo) {
        this.otherRightCertNo = otherRightCertNo;
        return this;
    }
    public String getOtherRightCertNo() {
        return this.otherRightCertNo;
    }

    public MgReleaseOrder setWipeMortgageReason(String wipeMortgageReason) {
        this.wipeMortgageReason = wipeMortgageReason;
        return this;
    }
    public String getWipeMortgageReason() {
        return this.wipeMortgageReason;
    }

    public MgReleaseOrder setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MgReleaseOrder setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public MgReleaseOrder setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public MgReleaseOrder setRtcNo(String rtcNo) {
        this.rtcNo = rtcNo;
        return this;
    }
    public String getRtcNo() {
        return this.rtcNo;
    }

    public MgReleaseOrder setRtcName(String rtcName) {
        this.rtcName = rtcName;
        return this;
    }
    public String getRtcName() {
        return this.rtcName;
    }

    public MgReleaseOrder setBranchBank(Bank branchBank) {
        this.branchBank = branchBank;
        return this;
    }
    public Bank getBranchBank() {
        return this.branchBank;
    }

    public MgReleaseOrder setHouse(House house) {
        this.house = house;
        return this;
    }
    public House getHouse() {
        return this.house;
    }

    public MgReleaseOrder setAgreements(java.util.List<Agreement> agreements) {
        this.agreements = agreements;
        return this;
    }
    public java.util.List<Agreement> getAgreements() {
        return this.agreements;
    }

    public MgReleaseOrder setArchives(java.util.List<Archive> archives) {
        this.archives = archives;
        return this;
    }
    public java.util.List<Archive> getArchives() {
        return this.archives;
    }

    public MgReleaseOrder setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public MgReleaseOrder setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MgReleaseOrder setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public MgReleaseOrder setFailDesc(String failDesc) {
        this.failDesc = failDesc;
        return this;
    }
    public String getFailDesc() {
        return this.failDesc;
    }

    public MgReleaseOrder setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

}
