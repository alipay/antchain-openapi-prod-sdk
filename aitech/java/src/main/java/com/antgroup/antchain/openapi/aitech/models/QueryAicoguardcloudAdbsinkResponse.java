// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryAicoguardcloudAdbsinkResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求的问题
    @NameInMap("question")
    public String question;

    // 代答结果
    @NameInMap("answer")
    public String answer;

    // 匹配度分数
    @NameInMap("score")
    public String score;

    // adb的请求id
    @NameInMap("request_id")
    public String requestId;

    public static QueryAicoguardcloudAdbsinkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAicoguardcloudAdbsinkResponse self = new QueryAicoguardcloudAdbsinkResponse();
        return TeaModel.build(map, self);
    }

    public QueryAicoguardcloudAdbsinkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAicoguardcloudAdbsinkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAicoguardcloudAdbsinkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAicoguardcloudAdbsinkResponse setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryAicoguardcloudAdbsinkResponse setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public QueryAicoguardcloudAdbsinkResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public QueryAicoguardcloudAdbsinkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
