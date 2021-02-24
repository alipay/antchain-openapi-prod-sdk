// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyAlarmResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 预警企业列表
    @NameInMap("company_alarms")
    public java.util.List<RtopCompanyAlarm> companyAlarms;

    // 返回码
    @NameInMap("response_code")
    public String responseCode;

    // 是否调用成功
    @NameInMap("success")
    public Boolean success;

    // 总条数
    @NameInMap("total_num")
    public Long totalNum;

    public static QueryRtopCompanyAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyAlarmResponse self = new QueryRtopCompanyAlarmResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyAlarmResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCompanyAlarmResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCompanyAlarmResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCompanyAlarmResponse setCompanyAlarms(java.util.List<RtopCompanyAlarm> companyAlarms) {
        this.companyAlarms = companyAlarms;
        return this;
    }
    public java.util.List<RtopCompanyAlarm> getCompanyAlarms() {
        return this.companyAlarms;
    }

    public QueryRtopCompanyAlarmResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryRtopCompanyAlarmResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRtopCompanyAlarmResponse setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

}
