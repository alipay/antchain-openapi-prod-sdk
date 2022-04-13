// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryReleasepipelinestageEventResponse extends TeaModel {
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

    // ReleasePipelineStage id
    @NameInMap("stage_id")
    public String stageId;

    // 返回列表中类型和对象摘要
    @NameInMap("type_ins_summary")
    public String typeInsSummary;

    public static QueryReleasepipelinestageEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReleasepipelinestageEventResponse self = new QueryReleasepipelinestageEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryReleasepipelinestageEventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryReleasepipelinestageEventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryReleasepipelinestageEventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryReleasepipelinestageEventResponse setEventList(java.util.List<RpReleaseEvent> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<RpReleaseEvent> getEventList() {
        return this.eventList;
    }

    public QueryReleasepipelinestageEventResponse setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public QueryReleasepipelinestageEventResponse setTypeInsSummary(String typeInsSummary) {
        this.typeInsSummary = typeInsSummary;
        return this;
    }
    public String getTypeInsSummary() {
        return this.typeInsSummary;
    }

}
