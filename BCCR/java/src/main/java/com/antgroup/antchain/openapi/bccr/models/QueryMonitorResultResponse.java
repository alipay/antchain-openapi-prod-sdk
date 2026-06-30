// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryMonitorResultResponse extends TeaModel {
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
    @NameInMap("monitor_result_list")
    public java.util.List<MonitorResult> monitorResultList;

    // 页序号(>0)
    @NameInMap("page_index")
    public Long pageIndex;

    // 页大小(1-200)
    @NameInMap("page_size")
    public Long pageSize;

    // 监测结果数量
    @NameInMap("result_count")
    public Long resultCount;

    public static QueryMonitorResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorResultResponse self = new QueryMonitorResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonitorResultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMonitorResultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMonitorResultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMonitorResultResponse setMonitorResultList(java.util.List<MonitorResult> monitorResultList) {
        this.monitorResultList = monitorResultList;
        return this;
    }
    public java.util.List<MonitorResult> getMonitorResultList() {
        return this.monitorResultList;
    }

    public QueryMonitorResultResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryMonitorResultResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMonitorResultResponse setResultCount(Long resultCount) {
        this.resultCount = resultCount;
        return this;
    }
    public Long getResultCount() {
        return this.resultCount;
    }

}
