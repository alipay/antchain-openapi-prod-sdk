// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerPendingeventResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 事件id
    @NameInMap("event_id")
    public String eventId;

    // 通知:NOTIFICATION 
    // 确认函:CONFIRMATION
    @NameInMap("type")
    public String type;

    // ("PENDING","待办中"), ("CONFIRMED","确认"), ("REJECTED","已拒绝") ("FAILED","失败"),("EXPIRED","已过期");
    @NameInMap("status")
    public String status;

    // 待办内容主题
    @NameInMap("content_subject")
    public String contentSubject;

    // 待办内容详情
    @NameInMap("content_details")
    public String contentDetails;

    // 待办处理页面操作按钮 
    // ACKNOWLEDGE 我已知晓
    //  CONFIRM 确认
    //  RETURN 返回 
    // REJECT 拒绝
    @NameInMap("action_options_config")
    public String actionOptionsConfig;

    // 事件有效期开始
    @NameInMap("effective_start_time")
    public String effectiveStartTime;

    // 事件有效期结束
    @NameInMap("effective_end_time")
    public String effectiveEndTime;

    public static DetailInnerPendingeventResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerPendingeventResponse self = new DetailInnerPendingeventResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerPendingeventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerPendingeventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerPendingeventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerPendingeventResponse setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DetailInnerPendingeventResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DetailInnerPendingeventResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DetailInnerPendingeventResponse setContentSubject(String contentSubject) {
        this.contentSubject = contentSubject;
        return this;
    }
    public String getContentSubject() {
        return this.contentSubject;
    }

    public DetailInnerPendingeventResponse setContentDetails(String contentDetails) {
        this.contentDetails = contentDetails;
        return this;
    }
    public String getContentDetails() {
        return this.contentDetails;
    }

    public DetailInnerPendingeventResponse setActionOptionsConfig(String actionOptionsConfig) {
        this.actionOptionsConfig = actionOptionsConfig;
        return this;
    }
    public String getActionOptionsConfig() {
        return this.actionOptionsConfig;
    }

    public DetailInnerPendingeventResponse setEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public String getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public DetailInnerPendingeventResponse setEffectiveEndTime(String effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public String getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

}
