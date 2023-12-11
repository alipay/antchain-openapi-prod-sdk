// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitAilegalQuestionResponse extends TeaModel {
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

    public static InitAilegalQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAilegalQuestionResponse self = new InitAilegalQuestionResponse();
        return TeaModel.build(map, self);
    }

    public InitAilegalQuestionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitAilegalQuestionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitAilegalQuestionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitAilegalQuestionResponse setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }
    public String getQuestionId() {
        return this.questionId;
    }

}
