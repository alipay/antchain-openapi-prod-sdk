// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryReleasepipelineEventResponse extends TeaModel {
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

    // ReleasePipeline service_id
    @NameInMap("service_id")
    public String serviceId;

    // 返回列表中类型和对象摘要
    @NameInMap("type_ins_summary")
    public String typeInsSummary;

    public static QueryReleasepipelineEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReleasepipelineEventResponse self = new QueryReleasepipelineEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryReleasepipelineEventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryReleasepipelineEventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryReleasepipelineEventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryReleasepipelineEventResponse setEventList(java.util.List<RpReleaseEvent> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<RpReleaseEvent> getEventList() {
        return this.eventList;
    }

    public QueryReleasepipelineEventResponse setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryReleasepipelineEventResponse setTypeInsSummary(String typeInsSummary) {
        this.typeInsSummary = typeInsSummary;
        return this;
    }
    public String getTypeInsSummary() {
        return this.typeInsSummary;
    }

}
