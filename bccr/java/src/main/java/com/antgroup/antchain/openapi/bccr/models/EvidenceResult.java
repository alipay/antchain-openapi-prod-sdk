// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class EvidenceResult extends TeaModel {
    // 取证编号
    @NameInMap("evidence_id")
    @Validation(required = true)
    public String evidenceId;

    // 取证类型（LIVE：直播，VOD：点播）
    @NameInMap("evidence_type")
    @Validation(required = true)
    public String evidenceType;

    // 公证处code
    @NameInMap("notary_office")
    @Validation(required = true)
    public String notaryOffice;

    // 取证站点url信息
    @NameInMap("evidence_url")
    @Validation(required = true)
    public EvidenceWebUrlInfo evidenceUrl;

    // 取证结果文件下载url（有效期3天）
    @NameInMap("evidence_result_url")
    @Validation(required = true)
    public String evidenceResultUrl;

    // 存证证明信息
    @NameInMap("certificate_info")
    @Validation(required = true)
    public EvidenceCertificateInfo certificateInfo;

    // 取证开始时间戳
    @NameInMap("evidence_start_time")
    @Validation(required = true)
    public Long evidenceStartTime;

    // 取证状态(SUCCESS:成功, FAIL:取证失败)
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 处理结果码
    @NameInMap("code")
    public String code;

    // 处理结果信息
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static EvidenceResult build(java.util.Map<String, ?> map) throws Exception {
        EvidenceResult self = new EvidenceResult();
        return TeaModel.build(map, self);
    }

    public EvidenceResult setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

    public EvidenceResult setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }
    public String getEvidenceType() {
        return this.evidenceType;
    }

    public EvidenceResult setNotaryOffice(String notaryOffice) {
        this.notaryOffice = notaryOffice;
        return this;
    }
    public String getNotaryOffice() {
        return this.notaryOffice;
    }

    public EvidenceResult setEvidenceUrl(EvidenceWebUrlInfo evidenceUrl) {
        this.evidenceUrl = evidenceUrl;
        return this;
    }
    public EvidenceWebUrlInfo getEvidenceUrl() {
        return this.evidenceUrl;
    }

    public EvidenceResult setEvidenceResultUrl(String evidenceResultUrl) {
        this.evidenceResultUrl = evidenceResultUrl;
        return this;
    }
    public String getEvidenceResultUrl() {
        return this.evidenceResultUrl;
    }

    public EvidenceResult setCertificateInfo(EvidenceCertificateInfo certificateInfo) {
        this.certificateInfo = certificateInfo;
        return this;
    }
    public EvidenceCertificateInfo getCertificateInfo() {
        return this.certificateInfo;
    }

    public EvidenceResult setEvidenceStartTime(Long evidenceStartTime) {
        this.evidenceStartTime = evidenceStartTime;
        return this;
    }
    public Long getEvidenceStartTime() {
        return this.evidenceStartTime;
    }

    public EvidenceResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public EvidenceResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EvidenceResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
