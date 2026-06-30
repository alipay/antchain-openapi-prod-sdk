// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDirectmonitorResultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 监测任务id
    @NameInMap("monitor_task_id")
    public String monitorTaskId;

    // 当前页面监测结果数量
    @NameInMap("result_count")
    public Long resultCount;

    // 监测结果列表
    @NameInMap("monitor_result_list")
    public java.util.List<DirectMonitorResult> monitorResultList;

    public static QueryDirectmonitorResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDirectmonitorResultResponse self = new QueryDirectmonitorResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryDirectmonitorResultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDirectmonitorResultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDirectmonitorResultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDirectmonitorResultResponse setMonitorTaskId(String monitorTaskId) {
        this.monitorTaskId = monitorTaskId;
        return this;
    }
    public String getMonitorTaskId() {
        return this.monitorTaskId;
    }

    public QueryDirectmonitorResultResponse setResultCount(Long resultCount) {
        this.resultCount = resultCount;
        return this;
    }
    public Long getResultCount() {
        return this.resultCount;
    }

    public QueryDirectmonitorResultResponse setMonitorResultList(java.util.List<DirectMonitorResult> monitorResultList) {
        this.monitorResultList = monitorResultList;
        return this;
    }
    public java.util.List<DirectMonitorResult> getMonitorResultList() {
        return this.monitorResultList;
    }

}
