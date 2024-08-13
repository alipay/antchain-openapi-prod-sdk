// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciFeedbackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申诉状态
    @NameInMap("feedback_status")
    public String feedbackStatus;

    // dciID
    @NameInMap("dci_content_id")
    public String dciContentId;

    // 备注或失败原因
    @NameInMap("msg")
    public String msg;

    public static QueryDciFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDciFeedbackResponse self = new QueryDciFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public QueryDciFeedbackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDciFeedbackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDciFeedbackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDciFeedbackResponse setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
        return this;
    }
    public String getFeedbackStatus() {
        return this.feedbackStatus;
    }

    public QueryDciFeedbackResponse setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public QueryDciFeedbackResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
