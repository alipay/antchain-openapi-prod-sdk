// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenshotCertificateResult extends TeaModel {
    // 证据类型
    @NameInMap("evidence_type")
    @Validation(required = true)
    public String evidenceType;

    // 证据状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 网页截取编号
    @NameInMap("screenshot_id")
    @Validation(required = true)
    public String screenshotId;

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

    // 证书下载链接
    @NameInMap("certificate_file_url")
    @Validation(required = true)
    public String certificateFileUrl;

    // 截图文件下载链接
    @NameInMap("screenshot_file_url")
    @Validation(required = true)
    public String screenshotFileUrl;

    // 证据文件大小
    @NameInMap("evidence_file_size")
    @Validation(required = true)
    public Long evidenceFileSize;

    // 错误码
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 错误信息
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static ScreenshotCertificateResult build(java.util.Map<String, ?> map) throws Exception {
        ScreenshotCertificateResult self = new ScreenshotCertificateResult();
        return TeaModel.build(map, self);
    }

    public ScreenshotCertificateResult setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }
    public String getEvidenceType() {
        return this.evidenceType;
    }

    public ScreenshotCertificateResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ScreenshotCertificateResult setScreenshotId(String screenshotId) {
        this.screenshotId = screenshotId;
        return this;
    }
    public String getScreenshotId() {
        return this.screenshotId;
    }

    public ScreenshotCertificateResult setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

    public ScreenshotCertificateResult setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }
    public String getCertificateNo() {
        return this.certificateNo;
    }

    public ScreenshotCertificateResult setCertificateTime(Long certificateTime) {
        this.certificateTime = certificateTime;
        return this;
    }
    public Long getCertificateTime() {
        return this.certificateTime;
    }

    public ScreenshotCertificateResult setEvidenceHash(String evidenceHash) {
        this.evidenceHash = evidenceHash;
        return this;
    }
    public String getEvidenceHash() {
        return this.evidenceHash;
    }

    public ScreenshotCertificateResult setEvidenceTxHash(String evidenceTxHash) {
        this.evidenceTxHash = evidenceTxHash;
        return this;
    }
    public String getEvidenceTxHash() {
        return this.evidenceTxHash;
    }

    public ScreenshotCertificateResult setCertificateFileUrl(String certificateFileUrl) {
        this.certificateFileUrl = certificateFileUrl;
        return this;
    }
    public String getCertificateFileUrl() {
        return this.certificateFileUrl;
    }

    public ScreenshotCertificateResult setScreenshotFileUrl(String screenshotFileUrl) {
        this.screenshotFileUrl = screenshotFileUrl;
        return this;
    }
    public String getScreenshotFileUrl() {
        return this.screenshotFileUrl;
    }

    public ScreenshotCertificateResult setEvidenceFileSize(Long evidenceFileSize) {
        this.evidenceFileSize = evidenceFileSize;
        return this;
    }
    public Long getEvidenceFileSize() {
        return this.evidenceFileSize;
    }

    public ScreenshotCertificateResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ScreenshotCertificateResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
