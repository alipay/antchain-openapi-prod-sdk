// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryAistudioModelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务唯一id
    @NameInMap("biz_code")
    public String bizCode;

    // 压测报告
    @NameInMap("pressure_report")
    public String pressureReport;

    // 运行态报告
    @NameInMap("runtime_report")
    public String runtimeReport;

    // 安全报告
    @NameInMap("safety_report")
    public String safetyReport;

    // 任务状态
    @NameInMap("status")
    public String status;

    public static QueryAistudioModelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAistudioModelResponse self = new QueryAistudioModelResponse();
        return TeaModel.build(map, self);
    }

    public QueryAistudioModelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAistudioModelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAistudioModelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAistudioModelResponse setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryAistudioModelResponse setPressureReport(String pressureReport) {
        this.pressureReport = pressureReport;
        return this;
    }
    public String getPressureReport() {
        return this.pressureReport;
    }

    public QueryAistudioModelResponse setRuntimeReport(String runtimeReport) {
        this.runtimeReport = runtimeReport;
        return this;
    }
    public String getRuntimeReport() {
        return this.runtimeReport;
    }

    public QueryAistudioModelResponse setSafetyReport(String safetyReport) {
        this.safetyReport = safetyReport;
        return this;
    }
    public String getSafetyReport() {
        return this.safetyReport;
    }

    public QueryAistudioModelResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
