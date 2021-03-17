// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class HqOrder extends TeaModel {
    // 房产链房产查询单号
    @NameInMap("house_query_order_no")
    public String houseQueryOrderNo;

    // 房产链房产查询单状态
    @NameInMap("status")
    public String status;

    // 房产查询场景,NO_AUTH_QUERY=无授权直查
    @NameInMap("scene")
    public String scene;

    // 2334898983498394838C
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 助贷平台
    @NameInMap("loan_assist_platform")
    public String loanAssistPlatform;

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

    // 房产权证类型
    @NameInMap("house_cert_type")
    public String houseCertType;

    // 权证编号(短号)
    @NameInMap("house_cert_no")
    public String houseCertNo;

    // 房产查询单生成时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 房产查询单结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 房产查询失败原因，MF_REALTY_NOT_EXISTS=房产信息不存在
    @NameInMap("fail_code")
    public String failCode;

    // 房产查询失败描述
    @NameInMap("fail_desc")
    public String failDesc;

    // 业务办理分支行
    @NameInMap("branch_bank")
    public Bank branchBank;

    // 房产信息
    @NameInMap("house")
    public House house;

    public static HqOrder build(java.util.Map<String, ?> map) throws Exception {
        HqOrder self = new HqOrder();
        return TeaModel.build(map, self);
    }

    public HqOrder setHouseQueryOrderNo(String houseQueryOrderNo) {
        this.houseQueryOrderNo = houseQueryOrderNo;
        return this;
    }
    public String getHouseQueryOrderNo() {
        return this.houseQueryOrderNo;
    }

    public HqOrder setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public HqOrder setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public HqOrder setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public HqOrder setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

    public HqOrder setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public HqOrder setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public HqOrder setRtcNo(String rtcNo) {
        this.rtcNo = rtcNo;
        return this;
    }
    public String getRtcNo() {
        return this.rtcNo;
    }

    public HqOrder setRtcName(String rtcName) {
        this.rtcName = rtcName;
        return this;
    }
    public String getRtcName() {
        return this.rtcName;
    }

    public HqOrder setHouseCertType(String houseCertType) {
        this.houseCertType = houseCertType;
        return this;
    }
    public String getHouseCertType() {
        return this.houseCertType;
    }

    public HqOrder setHouseCertNo(String houseCertNo) {
        this.houseCertNo = houseCertNo;
        return this;
    }
    public String getHouseCertNo() {
        return this.houseCertNo;
    }

    public HqOrder setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public HqOrder setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public HqOrder setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public HqOrder setFailDesc(String failDesc) {
        this.failDesc = failDesc;
        return this;
    }
    public String getFailDesc() {
        return this.failDesc;
    }

    public HqOrder setBranchBank(Bank branchBank) {
        this.branchBank = branchBank;
        return this;
    }
    public Bank getBranchBank() {
        return this.branchBank;
    }

    public HqOrder setHouse(House house) {
        this.house = house;
        return this;
    }
    public House getHouse() {
        return this.house;
    }

}
