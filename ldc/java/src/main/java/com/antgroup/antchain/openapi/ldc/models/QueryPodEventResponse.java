// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryPodEventResponse extends TeaModel {
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
    @NameInMap("event_list")
    public java.util.List<RpReleaseEvent> eventList;

    // 发布单对应的service_id
    @NameInMap("service_id")
    public String serviceId;

    // POD对应的uid
    @NameInMap("u_id")
    public String uId;

    public static QueryPodEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPodEventResponse self = new QueryPodEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryPodEventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPodEventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPodEventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPodEventResponse setEventList(java.util.List<RpReleaseEvent> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<RpReleaseEvent> getEventList() {
        return this.eventList;
    }

    public QueryPodEventResponse setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryPodEventResponse setUId(String uId) {
        this.uId = uId;
        return this;
    }
    public String getUId() {
        return this.uId;
    }

}
