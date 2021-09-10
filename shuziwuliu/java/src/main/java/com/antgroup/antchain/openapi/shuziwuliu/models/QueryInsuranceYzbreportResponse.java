// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryInsuranceYzbreportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 报案号
    @NameInMap("report_no")
    public String reportNo;

    // 保单号
    @NameInMap("policy_no")
    public String policyNo;

    // 赔案号
    @NameInMap("claim_no")
    public String claimNo;

    // 报案时间，格式yyyy-mm-dd hh:mm:ss
    @NameInMap("report_req_time")
    public String reportReqTime;

    // 案件状态，已报案，已结案，已赔付
    @NameInMap("report_status")
    public String reportStatus;

    // 案件赔付金额，单位元，两位小数;
    @NameInMap("report_paid_amount")
    public String reportPaidAmount;

    // 险种名称
    @NameInMap("external_product_name")
    public String externalProductName;

    // 结案时间，格式yyyy-mm-dd hh:mm:ss
    @NameInMap("report_end_time")
    public String reportEndTime;

    // 案件赔付结论，1-赔付 2-零结 3-商业险拒赔 4-整案拒赔 5-注销
    @NameInMap("report_paid_desc")
    public String reportPaidDesc;

    // 案件赔付时间，格式yyyy-mm-dd hh:mm:ss
    // 
    @NameInMap("report_paid_time")
    public String reportPaidTime;

    public static QueryInsuranceYzbreportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceYzbreportResponse self = new QueryInsuranceYzbreportResponse();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceYzbreportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInsuranceYzbreportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInsuranceYzbreportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInsuranceYzbreportResponse setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
    }

    public QueryInsuranceYzbreportResponse setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public QueryInsuranceYzbreportResponse setClaimNo(String claimNo) {
        this.claimNo = claimNo;
        return this;
    }
    public String getClaimNo() {
        return this.claimNo;
    }

    public QueryInsuranceYzbreportResponse setReportReqTime(String reportReqTime) {
        this.reportReqTime = reportReqTime;
        return this;
    }
    public String getReportReqTime() {
        return this.reportReqTime;
    }

    public QueryInsuranceYzbreportResponse setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }
    public String getReportStatus() {
        return this.reportStatus;
    }

    public QueryInsuranceYzbreportResponse setReportPaidAmount(String reportPaidAmount) {
        this.reportPaidAmount = reportPaidAmount;
        return this;
    }
    public String getReportPaidAmount() {
        return this.reportPaidAmount;
    }

    public QueryInsuranceYzbreportResponse setExternalProductName(String externalProductName) {
        this.externalProductName = externalProductName;
        return this;
    }
    public String getExternalProductName() {
        return this.externalProductName;
    }

    public QueryInsuranceYzbreportResponse setReportEndTime(String reportEndTime) {
        this.reportEndTime = reportEndTime;
        return this;
    }
    public String getReportEndTime() {
        return this.reportEndTime;
    }

    public QueryInsuranceYzbreportResponse setReportPaidDesc(String reportPaidDesc) {
        this.reportPaidDesc = reportPaidDesc;
        return this;
    }
    public String getReportPaidDesc() {
        return this.reportPaidDesc;
    }

    public QueryInsuranceYzbreportResponse setReportPaidTime(String reportPaidTime) {
        this.reportPaidTime = reportPaidTime;
        return this;
    }
    public String getReportPaidTime() {
        return this.reportPaidTime;
    }

}
