// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class JudgeCodeFakescreenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 验真是否成功
    @NameInMap("detect_success")
    public Boolean detectSuccess;

    // 返回编码
    @NameInMap("detect_code")
    public String detectCode;

    // 调用返回信息
    @NameInMap("detect_message")
    public String detectMessage;

    public static JudgeCodeFakescreenResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeCodeFakescreenResponse self = new JudgeCodeFakescreenResponse();
        return TeaModel.build(map, self);
    }

    public JudgeCodeFakescreenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public JudgeCodeFakescreenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public JudgeCodeFakescreenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public JudgeCodeFakescreenResponse setDetectSuccess(Boolean detectSuccess) {
        this.detectSuccess = detectSuccess;
        return this;
    }
    public Boolean getDetectSuccess() {
        return this.detectSuccess;
    }

    public JudgeCodeFakescreenResponse setDetectCode(String detectCode) {
        this.detectCode = detectCode;
        return this;
    }
    public String getDetectCode() {
        return this.detectCode;
    }

    public JudgeCodeFakescreenResponse setDetectMessage(String detectMessage) {
        this.detectMessage = detectMessage;
        return this;
    }
    public String getDetectMessage() {
        return this.detectMessage;
    }

}
