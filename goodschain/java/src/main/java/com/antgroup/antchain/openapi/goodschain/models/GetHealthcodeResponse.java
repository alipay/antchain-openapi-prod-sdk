// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class GetHealthcodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1：绿色 2：黄色 3：红色
    @NameInMap("health_code")
    public String healthCode;

    // 健康码失败原因
    @NameInMap("health_factor")
    public String healthFactor;

    // 行程码信息
    // 1:没去过疫情区，绿码;
    // 2:去过疫情区，红码;
    // 3:其他，黄码;
    // 0:行程信息不全;
    // -1查询失败;
    @NameInMap("travel_code")
    public String travelCode;

    // 检测类型
    @NameInMap("report_type")
    public String reportType;

    // 检测结果
    @NameInMap("report_result")
    public String reportResult;

    // 检测机构
    @NameInMap("report_organization")
    public String reportOrganization;

    // 检测时间
    @NameInMap("report_time")
    public String reportTime;

    // 疫苗接种信息：
    // 0查询失败 1未接种 2已接种一针 3完成接种
    @NameInMap("vaccination_code")
    public String vaccinationCode;

    public static GetHealthcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHealthcodeResponse self = new GetHealthcodeResponse();
        return TeaModel.build(map, self);
    }

    public GetHealthcodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetHealthcodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHealthcodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetHealthcodeResponse setHealthCode(String healthCode) {
        this.healthCode = healthCode;
        return this;
    }
    public String getHealthCode() {
        return this.healthCode;
    }

    public GetHealthcodeResponse setHealthFactor(String healthFactor) {
        this.healthFactor = healthFactor;
        return this;
    }
    public String getHealthFactor() {
        return this.healthFactor;
    }

    public GetHealthcodeResponse setTravelCode(String travelCode) {
        this.travelCode = travelCode;
        return this;
    }
    public String getTravelCode() {
        return this.travelCode;
    }

    public GetHealthcodeResponse setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public GetHealthcodeResponse setReportResult(String reportResult) {
        this.reportResult = reportResult;
        return this;
    }
    public String getReportResult() {
        return this.reportResult;
    }

    public GetHealthcodeResponse setReportOrganization(String reportOrganization) {
        this.reportOrganization = reportOrganization;
        return this;
    }
    public String getReportOrganization() {
        return this.reportOrganization;
    }

    public GetHealthcodeResponse setReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public String getReportTime() {
        return this.reportTime;
    }

    public GetHealthcodeResponse setVaccinationCode(String vaccinationCode) {
        this.vaccinationCode = vaccinationCode;
        return this;
    }
    public String getVaccinationCode() {
        return this.vaccinationCode;
    }

}
