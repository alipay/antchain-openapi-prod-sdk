// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryKmRagResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 答案
    @NameInMap("answer")
    public String answer;

    // 置信度
    @NameInMap("confidence")
    public Long confidence;

    // 引用来源
    @NameInMap("references")
    public java.util.List<String> references;

    public static QueryKmRagResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryKmRagResponse self = new QueryKmRagResponse();
        return TeaModel.build(map, self);
    }

    public QueryKmRagResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryKmRagResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryKmRagResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryKmRagResponse setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public QueryKmRagResponse setConfidence(Long confidence) {
        this.confidence = confidence;
        return this;
    }
    public Long getConfidence() {
        return this.confidence;
    }

    public QueryKmRagResponse setReferences(java.util.List<String> references) {
        this.references = references;
        return this;
    }
    public java.util.List<String> getReferences() {
        return this.references;
    }

}
