// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryAilegalAnswerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回问题id，全局唯一
    @NameInMap("question_id")
    public String questionId;

    // 问题答案
    @NameInMap("answer")
    public String answer;

    // 是否支持反馈(true 是,false 否)
    @NameInMap("can_feedback")
    public Boolean canFeedback;

    // 是否回答结束(true 是,false 否)
    @NameInMap("end")
    public Boolean end;

    public static QueryAilegalAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAilegalAnswerResponse self = new QueryAilegalAnswerResponse();
        return TeaModel.build(map, self);
    }

    public QueryAilegalAnswerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAilegalAnswerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAilegalAnswerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAilegalAnswerResponse setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }
    public String getQuestionId() {
        return this.questionId;
    }

    public QueryAilegalAnswerResponse setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public QueryAilegalAnswerResponse setCanFeedback(Boolean canFeedback) {
        this.canFeedback = canFeedback;
        return this;
    }
    public Boolean getCanFeedback() {
        return this.canFeedback;
    }

    public QueryAilegalAnswerResponse setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

}
