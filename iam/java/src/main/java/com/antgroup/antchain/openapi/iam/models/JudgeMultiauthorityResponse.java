// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class JudgeMultiauthorityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 鉴权结果列表
    @NameInMap("judgements")
    public java.util.List<Judgement> judgements;

    public static JudgeMultiauthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeMultiauthorityResponse self = new JudgeMultiauthorityResponse();
        return TeaModel.build(map, self);
    }

    public JudgeMultiauthorityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public JudgeMultiauthorityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public JudgeMultiauthorityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public JudgeMultiauthorityResponse setJudgements(java.util.List<Judgement> judgements) {
        this.judgements = judgements;
        return this;
    }
    public java.util.List<Judgement> getJudgements() {
        return this.judgements;
    }

}
