// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetBashcmdResultResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 错误信息。内容为指令无法下发到机器上的详细原因
    @NameInMap("err_msg")
    public String errMsg;

    // 执行结束时间
    @NameInMap("finish_time")
    public String finishTime;

    // 执行的结果
    @NameInMap("results")
    public java.util.List<SingleExecResult> results;

    // 执行开始时间
    @NameInMap("start_time")
    public String startTime;

    // 执行结果状态。取值列表：EXECUTING：执行中；SUCCESS：执行成功；FAILED：执行失败；IGNORED：已忽略；TIME_OUT：已超时
    @NameInMap("status")
    public String status;

    public static GetBashcmdResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBashcmdResultResponse self = new GetBashcmdResultResponse();
        return TeaModel.build(map, self);
    }

    public GetBashcmdResultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetBashcmdResultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetBashcmdResultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetBashcmdResultResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBashcmdResultResponse setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetBashcmdResultResponse setResults(java.util.List<SingleExecResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SingleExecResult> getResults() {
        return this.results;
    }

    public GetBashcmdResultResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetBashcmdResultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
