// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RecordScreenResult extends TeaModel {
    // 取证类型(SCREEN_RECORDING：录屏取证)
    @NameInMap("evidence_type")
    @Validation(required = true)
    public String evidenceType;

    // 取证状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 证据编号
    @NameInMap("evidence_id")
    @Validation(required = true)
    public String evidenceId;

    // 存证编号
    @NameInMap("certificate_no")
    @Validation(required = true)
    public String certificateNo;

    // 上链时间
    @NameInMap("certificate_time")
    @Validation(required = true)
    public Long certificateTime;

    // 证据hash
    @NameInMap("evidence_hash")
    @Validation(required = true)
    public String evidenceHash;

    // 链上交易hash
    @NameInMap("evidence_tx_hash")
    @Validation(required = true)
    public String evidenceTxHash;

    // 证书文件下载地址
    @NameInMap("certificate_file_url")
    public String certificateFileUrl;

    // 录屏取证文件列表
    @NameInMap("evidence_files")
    public java.util.List<EvidenceFile> evidenceFiles;

    // 录屏开始时间
    @NameInMap("evidence_start_time")
    @Validation(required = true)
    public Long evidenceStartTime;

    // 录屏结束时间
    @NameInMap("evidence_end_time")
    @Validation(required = true)
    public Long evidenceEndTime;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static RecordScreenResult build(java.util.Map<String, ?> map) throws Exception {
        RecordScreenResult self = new RecordScreenResult();
        return TeaModel.build(map, self);
    }

    public RecordScreenResult setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }
    public String getEvidenceType() {
        return this.evidenceType;
    }

    public RecordScreenResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RecordScreenResult setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

    public RecordScreenResult setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }
    public String getCertificateNo() {
        return this.certificateNo;
    }

    public RecordScreenResult setCertificateTime(Long certificateTime) {
        this.certificateTime = certificateTime;
        return this;
    }
    public Long getCertificateTime() {
        return this.certificateTime;
    }

    public RecordScreenResult setEvidenceHash(String evidenceHash) {
        this.evidenceHash = evidenceHash;
        return this;
    }
    public String getEvidenceHash() {
        return this.evidenceHash;
    }

    public RecordScreenResult setEvidenceTxHash(String evidenceTxHash) {
        this.evidenceTxHash = evidenceTxHash;
        return this;
    }
    public String getEvidenceTxHash() {
        return this.evidenceTxHash;
    }

    public RecordScreenResult setCertificateFileUrl(String certificateFileUrl) {
        this.certificateFileUrl = certificateFileUrl;
        return this;
    }
    public String getCertificateFileUrl() {
        return this.certificateFileUrl;
    }

    public RecordScreenResult setEvidenceFiles(java.util.List<EvidenceFile> evidenceFiles) {
        this.evidenceFiles = evidenceFiles;
        return this;
    }
    public java.util.List<EvidenceFile> getEvidenceFiles() {
        return this.evidenceFiles;
    }

    public RecordScreenResult setEvidenceStartTime(Long evidenceStartTime) {
        this.evidenceStartTime = evidenceStartTime;
        return this;
    }
    public Long getEvidenceStartTime() {
        return this.evidenceStartTime;
    }

    public RecordScreenResult setEvidenceEndTime(Long evidenceEndTime) {
        this.evidenceEndTime = evidenceEndTime;
        return this;
    }
    public Long getEvidenceEndTime() {
        return this.evidenceEndTime;
    }

    public RecordScreenResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RecordScreenResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
