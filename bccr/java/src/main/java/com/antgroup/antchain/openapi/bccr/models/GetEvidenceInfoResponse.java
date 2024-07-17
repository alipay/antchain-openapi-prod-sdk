// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GetEvidenceInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 取证编号
    @NameInMap("evidence_id")
    public String evidenceId;

    // 取证类型（LIVE：直播，VOD：点播）
    @NameInMap("evidence_type")
    public String evidenceType;

    // 取证状态（取证中：DOING，取证成功：SUCCESS，取证失败：FAIL）
    @NameInMap("status")
    public String status;

    // 公证处code
    @NameInMap("notary_office")
    public String notaryOffice;

    // 取证url信息
    @NameInMap("evidence_url")
    public EvidenceWebUrlInfo evidenceUrl;

    // 取证结果文件下载url（有效期3天）
    @NameInMap("evidence_result_url")
    public String evidenceResultUrl;

    // 存证证明信息
    @NameInMap("certificate_info")
    public EvidenceCertificateInfo certificateInfo;

    // 取证错误码
    @NameInMap("evidence_error_code")
    public String evidenceErrorCode;

    // 取证错误描述
    @NameInMap("evidence_error_msg")
    public String evidenceErrorMsg;

    // 取证开始时间
    @NameInMap("start_time")
    public Long startTime;

    // 取证结束时间
    @NameInMap("finish_time")
    public Long finishTime;

    public static GetEvidenceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEvidenceInfoResponse self = new GetEvidenceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetEvidenceInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetEvidenceInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetEvidenceInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetEvidenceInfoResponse setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

    public GetEvidenceInfoResponse setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }
    public String getEvidenceType() {
        return this.evidenceType;
    }

    public GetEvidenceInfoResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEvidenceInfoResponse setNotaryOffice(String notaryOffice) {
        this.notaryOffice = notaryOffice;
        return this;
    }
    public String getNotaryOffice() {
        return this.notaryOffice;
    }

    public GetEvidenceInfoResponse setEvidenceUrl(EvidenceWebUrlInfo evidenceUrl) {
        this.evidenceUrl = evidenceUrl;
        return this;
    }
    public EvidenceWebUrlInfo getEvidenceUrl() {
        return this.evidenceUrl;
    }

    public GetEvidenceInfoResponse setEvidenceResultUrl(String evidenceResultUrl) {
        this.evidenceResultUrl = evidenceResultUrl;
        return this;
    }
    public String getEvidenceResultUrl() {
        return this.evidenceResultUrl;
    }

    public GetEvidenceInfoResponse setCertificateInfo(EvidenceCertificateInfo certificateInfo) {
        this.certificateInfo = certificateInfo;
        return this;
    }
    public EvidenceCertificateInfo getCertificateInfo() {
        return this.certificateInfo;
    }

    public GetEvidenceInfoResponse setEvidenceErrorCode(String evidenceErrorCode) {
        this.evidenceErrorCode = evidenceErrorCode;
        return this;
    }
    public String getEvidenceErrorCode() {
        return this.evidenceErrorCode;
    }

    public GetEvidenceInfoResponse setEvidenceErrorMsg(String evidenceErrorMsg) {
        this.evidenceErrorMsg = evidenceErrorMsg;
        return this;
    }
    public String getEvidenceErrorMsg() {
        return this.evidenceErrorMsg;
    }

    public GetEvidenceInfoResponse setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetEvidenceInfoResponse setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public Long getFinishTime() {
        return this.finishTime;
    }

}
