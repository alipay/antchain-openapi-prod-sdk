// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class RecognizeOcrIndividualcardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
    @NameInMap("ocr_info")
    public OcrInfo ocrInfo;

    // 防伪结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。 如果不启用防伪，则不返回该字段。
    @NameInMap("risk_info")
    public RiskInfo riskInfo;

    // 扩展信息JSON串。
    @NameInMap("ext_info")
    public String extInfo;

    // 加密后的识别结果
    @NameInMap("ocr_info_encrypt")
    public String ocrInfoEncrypt;

    public static RecognizeOcrIndividualcardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeOcrIndividualcardResponse self = new RecognizeOcrIndividualcardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeOcrIndividualcardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeOcrIndividualcardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeOcrIndividualcardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeOcrIndividualcardResponse setOcrInfo(OcrInfo ocrInfo) {
        this.ocrInfo = ocrInfo;
        return this;
    }
    public OcrInfo getOcrInfo() {
        return this.ocrInfo;
    }

    public RecognizeOcrIndividualcardResponse setRiskInfo(RiskInfo riskInfo) {
        this.riskInfo = riskInfo;
        return this;
    }
    public RiskInfo getRiskInfo() {
        return this.riskInfo;
    }

    public RecognizeOcrIndividualcardResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RecognizeOcrIndividualcardResponse setOcrInfoEncrypt(String ocrInfoEncrypt) {
        this.ocrInfoEncrypt = ocrInfoEncrypt;
        return this;
    }
    public String getOcrInfoEncrypt() {
        return this.ocrInfoEncrypt;
    }

}
