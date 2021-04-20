// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ExecEventReportResponse extends TeaModel {
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

    // 事件状态，REPORTED：已上报，PROCESSING：处理中，PROCESSED： 处理完毕，NEED_RETRY：需要重试，EVENT_NOT_SUPPORTED：项目暂不支持该事件
    @NameInMap("event_status")
    public String eventStatus;

    // token状态，TOKEN_SUCCESS：token发放成功，TOKEN_PROCESSING：token发放中，TOKEN_FAILED：token发放失败，NO_NEED_ALLOCATION：无需发放
    @NameInMap("token_status")
    public String tokenStatus;

    // 购买者/访问者获得token数量
    @NameInMap("token_amount")
    public Long tokenAmount;

    // 提示信息
    @NameInMap("message")
    public String message;

    // 分享人获得token数
    @NameInMap("parent_token_amount")
    public Long parentTokenAmount;

    public static ExecEventReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecEventReportResponse self = new ExecEventReportResponse();
        return TeaModel.build(map, self);
    }

    public ExecEventReportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecEventReportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecEventReportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecEventReportResponse setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ExecEventReportResponse setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public String getEventStatus() {
        return this.eventStatus;
    }

    public ExecEventReportResponse setTokenStatus(String tokenStatus) {
        this.tokenStatus = tokenStatus;
        return this;
    }
    public String getTokenStatus() {
        return this.tokenStatus;
    }

    public ExecEventReportResponse setTokenAmount(Long tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public Long getTokenAmount() {
        return this.tokenAmount;
    }

    public ExecEventReportResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecEventReportResponse setParentTokenAmount(Long parentTokenAmount) {
        this.parentTokenAmount = parentTokenAmount;
        return this;
    }
    public Long getParentTokenAmount() {
        return this.parentTokenAmount;
    }

}
