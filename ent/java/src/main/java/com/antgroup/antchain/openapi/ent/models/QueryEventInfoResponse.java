// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryEventInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 事件唯一标识
    @NameInMap("event_id")
    public String eventId;

    // 事件状态
    @NameInMap("event_status")
    public String eventStatus;

    // token发放状态
    @NameInMap("token_status")
    public String tokenStatus;

    // token数量
    @NameInMap("token_amount")
    public Long tokenAmount;

    // 事件上报时间
    @NameInMap("event_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String eventTime;

    // 事件处理结果提示信息
    @NameInMap("message")
    public String message;

    public static QueryEventInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventInfoResponse self = new QueryEventInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEventInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEventInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEventInfoResponse setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryEventInfoResponse setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public String getEventStatus() {
        return this.eventStatus;
    }

    public QueryEventInfoResponse setTokenStatus(String tokenStatus) {
        this.tokenStatus = tokenStatus;
        return this;
    }
    public String getTokenStatus() {
        return this.tokenStatus;
    }

    public QueryEventInfoResponse setTokenAmount(Long tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public Long getTokenAmount() {
        return this.tokenAmount;
    }

    public QueryEventInfoResponse setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public QueryEventInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
