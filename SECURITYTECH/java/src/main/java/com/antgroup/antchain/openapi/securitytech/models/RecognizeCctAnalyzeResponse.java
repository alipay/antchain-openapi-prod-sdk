// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RecognizeCctAnalyzeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // biz_request_id
    @NameInMap("biz_request_id")
    public String bizRequestId;

    // suggestion
    @NameInMap("suggestion")
    public String suggestion;

    // detect_labels
    @NameInMap("detect_labels")
    public java.util.List<CctDetectCheckLabel> detectLabels;

    public static RecognizeCctAnalyzeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCctAnalyzeResponse self = new RecognizeCctAnalyzeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCctAnalyzeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeCctAnalyzeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeCctAnalyzeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeCctAnalyzeResponse setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public RecognizeCctAnalyzeResponse setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public RecognizeCctAnalyzeResponse setDetectLabels(java.util.List<CctDetectCheckLabel> detectLabels) {
        this.detectLabels = detectLabels;
        return this;
    }
    public java.util.List<CctDetectCheckLabel> getDetectLabels() {
        return this.detectLabels;
    }

}
