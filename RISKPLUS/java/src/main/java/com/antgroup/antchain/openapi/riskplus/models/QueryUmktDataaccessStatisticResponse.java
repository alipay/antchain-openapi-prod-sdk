// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktDataaccessStatisticResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 回执统计结果
    @NameInMap("statistic_result")
    public StatisticResult statisticResult;

    // 任务状态
    @NameInMap("task_status")
    public String taskStatus;

    public static QueryUmktDataaccessStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktDataaccessStatisticResponse self = new QueryUmktDataaccessStatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryUmktDataaccessStatisticResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUmktDataaccessStatisticResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUmktDataaccessStatisticResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUmktDataaccessStatisticResponse setStatisticResult(StatisticResult statisticResult) {
        this.statisticResult = statisticResult;
        return this;
    }
    public StatisticResult getStatisticResult() {
        return this.statisticResult;
    }

    public QueryUmktDataaccessStatisticResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
