// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class JudgeAliyunMultiauthorityResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 鉴权结果列表
    @NameInMap("judgements")
    public java.util.List<Judgement> judgements;

    public static JudgeAliyunMultiauthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeAliyunMultiauthorityResponse self = new JudgeAliyunMultiauthorityResponse();
        return TeaModel.build(map, self);
    }

    public JudgeAliyunMultiauthorityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public JudgeAliyunMultiauthorityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public JudgeAliyunMultiauthorityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public JudgeAliyunMultiauthorityResponse setJudgements(java.util.List<Judgement> judgements) {
        this.judgements = judgements;
        return this;
    }
    public java.util.List<Judgement> getJudgements() {
        return this.judgements;
    }

}
