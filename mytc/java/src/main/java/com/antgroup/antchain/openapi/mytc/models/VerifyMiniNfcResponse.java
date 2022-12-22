// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class VerifyMiniNfcResponse extends TeaModel {
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

    public static VerifyMiniNfcResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyMiniNfcResponse self = new VerifyMiniNfcResponse();
        return TeaModel.build(map, self);
    }

    public VerifyMiniNfcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyMiniNfcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyMiniNfcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyMiniNfcResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VerifyMiniNfcResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyMiniNfcResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyMiniNfcResponse setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
