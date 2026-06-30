// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryMonitorTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 监测任务信息
    // 
    // 
    @NameInMap("monitor_task")
    public MonitorTask monitorTask;

    public static QueryMonitorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorTaskResponse self = new QueryMonitorTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonitorTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMonitorTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMonitorTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMonitorTaskResponse setMonitorTask(MonitorTask monitorTask) {
        this.monitorTask = monitorTask;
        return this;
    }
    public MonitorTask getMonitorTask() {
        return this.monitorTask;
    }

}
