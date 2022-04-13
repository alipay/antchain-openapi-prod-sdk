// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListEventsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 事件列表
    @NameInMap("events")
    public java.util.List<KubeEvent> events;

    public static ListEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventsResponse self = new ListEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListEventsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListEventsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListEventsResponse setEvents(java.util.List<KubeEvent> events) {
        this.events = events;
        return this;
    }
    public java.util.List<KubeEvent> getEvents() {
        return this.events;
    }

}
