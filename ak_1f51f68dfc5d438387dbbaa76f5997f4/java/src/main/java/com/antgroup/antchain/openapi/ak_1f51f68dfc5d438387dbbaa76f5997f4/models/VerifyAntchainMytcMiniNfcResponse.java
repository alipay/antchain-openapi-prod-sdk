// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class VerifyAntchainMytcMiniNfcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 校验结果
    @NameInMap("status")
    public String status;

    // 校验信息
    @NameInMap("message")
    public String message;

    // 校验解析溯源码
    @NameInMap("code")
    public String code;

    // NFC UID
    @NameInMap("uid")
    public String uid;

    public static VerifyAntchainMytcMiniNfcResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainMytcMiniNfcResponse self = new VerifyAntchainMytcMiniNfcResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainMytcMiniNfcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainMytcMiniNfcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainMytcMiniNfcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainMytcMiniNfcResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VerifyAntchainMytcMiniNfcResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyAntchainMytcMiniNfcResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyAntchainMytcMiniNfcResponse setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
