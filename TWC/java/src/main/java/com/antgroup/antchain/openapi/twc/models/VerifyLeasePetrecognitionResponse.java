// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyLeasePetrecognitionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用于追踪业务调用流程
    @NameInMap("trace_id")
    public String traceId;

    // 图片合格性结果码值
    @NameInMap("verify_code")
    public String verifyCode;

    // 取值范围0~1，值越大代表本次校验结果越可信
    @NameInMap("confidence")
    public String confidence;

    public static VerifyLeasePetrecognitionResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyLeasePetrecognitionResponse self = new VerifyLeasePetrecognitionResponse();
        return TeaModel.build(map, self);
    }

    public VerifyLeasePetrecognitionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyLeasePetrecognitionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyLeasePetrecognitionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyLeasePetrecognitionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public VerifyLeasePetrecognitionResponse setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public VerifyLeasePetrecognitionResponse setConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }
    public String getConfidence() {
        return this.confidence;
    }

}
