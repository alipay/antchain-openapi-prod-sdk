// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class GetFacevrfEvidenceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 刷脸的certifyId，原样返回
    @NameInMap("certify_id")
    public String certifyId;

    // 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
    @NameInMap("onchain_id")
    public String onchainId;

    // 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
    @NameInMap("onchain_status")
    public String onchainStatus;

    // pdf存证是否已经过期，不支持超过6个月的存证获取
    @NameInMap("pdf_expired")
    public Boolean pdfExpired;

    // 存证pdf文件内容的base64
    @NameInMap("pdf_content")
    public String pdfContent;

    public static GetFacevrfEvidenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFacevrfEvidenceResponse self = new GetFacevrfEvidenceResponse();
        return TeaModel.build(map, self);
    }

    public GetFacevrfEvidenceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFacevrfEvidenceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFacevrfEvidenceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFacevrfEvidenceResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public GetFacevrfEvidenceResponse setOnchainId(String onchainId) {
        this.onchainId = onchainId;
        return this;
    }
    public String getOnchainId() {
        return this.onchainId;
    }

    public GetFacevrfEvidenceResponse setOnchainStatus(String onchainStatus) {
        this.onchainStatus = onchainStatus;
        return this;
    }
    public String getOnchainStatus() {
        return this.onchainStatus;
    }

    public GetFacevrfEvidenceResponse setPdfExpired(Boolean pdfExpired) {
        this.pdfExpired = pdfExpired;
        return this;
    }
    public Boolean getPdfExpired() {
        return this.pdfExpired;
    }

    public GetFacevrfEvidenceResponse setPdfContent(String pdfContent) {
        this.pdfContent = pdfContent;
        return this;
    }
    public String getPdfContent() {
        return this.pdfContent;
    }

}
