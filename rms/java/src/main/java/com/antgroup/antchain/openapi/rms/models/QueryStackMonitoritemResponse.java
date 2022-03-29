// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryStackMonitoritemResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 监控项列表
    @NameInMap("monitor_items")
    public java.util.List<StackMonitorItem> monitorItems;

    public static QueryStackMonitoritemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStackMonitoritemResponse self = new QueryStackMonitoritemResponse();
        return TeaModel.build(map, self);
    }

    public QueryStackMonitoritemResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStackMonitoritemResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStackMonitoritemResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStackMonitoritemResponse setMonitorItems(java.util.List<StackMonitorItem> monitorItems) {
        this.monitorItems = monitorItems;
        return this;
    }
    public java.util.List<StackMonitorItem> getMonitorItems() {
        return this.monitorItems;
    }

}
