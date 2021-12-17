// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class RecognizeAntiQrcodeacResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解码结果,0:失败,1:成功，如果解码成功，可忽略detectState字段返回结果
    @NameInMap("code")
    public String code;

    // 识别状态
    @NameInMap("detect_state")
    public String detectState;

    // 识别状态描述
    @NameInMap("detect_desc")
    public String detectDesc;

    // 加密数据
    @NameInMap("encrypt_data")
    public String encryptData;

    public static RecognizeAntiQrcodeacResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAntiQrcodeacResponse self = new RecognizeAntiQrcodeacResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeAntiQrcodeacResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeAntiQrcodeacResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeAntiQrcodeacResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeAntiQrcodeacResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeAntiQrcodeacResponse setDetectState(String detectState) {
        this.detectState = detectState;
        return this;
    }
    public String getDetectState() {
        return this.detectState;
    }

    public RecognizeAntiQrcodeacResponse setDetectDesc(String detectDesc) {
        this.detectDesc = detectDesc;
        return this;
    }
    public String getDetectDesc() {
        return this.detectDesc;
    }

    public RecognizeAntiQrcodeacResponse setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

}
