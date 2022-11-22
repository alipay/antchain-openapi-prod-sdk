// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class RecognizeDocIndividualcardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果码
    @NameInMap("ret_code")
    public String retCode;

    // 错误码
    @NameInMap("ret_code_sub")
    public String retCodeSub;

    // 错误信息
    @NameInMap("ret_message_sub")
    public String retMessageSub;

    // 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
    @NameInMap("ocr_info")
    public String ocrInfo;

    // 扩展信息JSON串。
    @NameInMap("ext_info")
    public String extInfo;

    public static RecognizeDocIndividualcardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDocIndividualcardResponse self = new RecognizeDocIndividualcardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeDocIndividualcardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeDocIndividualcardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeDocIndividualcardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeDocIndividualcardResponse setRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }
    public String getRetCode() {
        return this.retCode;
    }

    public RecognizeDocIndividualcardResponse setRetCodeSub(String retCodeSub) {
        this.retCodeSub = retCodeSub;
        return this;
    }
    public String getRetCodeSub() {
        return this.retCodeSub;
    }

    public RecognizeDocIndividualcardResponse setRetMessageSub(String retMessageSub) {
        this.retMessageSub = retMessageSub;
        return this;
    }
    public String getRetMessageSub() {
        return this.retMessageSub;
    }

    public RecognizeDocIndividualcardResponse setOcrInfo(String ocrInfo) {
        this.ocrInfo = ocrInfo;
        return this;
    }
    public String getOcrInfo() {
        return this.ocrInfo;
    }

    public RecognizeDocIndividualcardResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
