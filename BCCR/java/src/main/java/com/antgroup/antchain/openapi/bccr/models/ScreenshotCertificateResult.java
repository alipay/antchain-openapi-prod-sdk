// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenshotCertificateResult extends TeaModel {
    // 证据类型
    /**
     * <strong>example:</strong>
     * <p>SCREENSHOT</p>
     */
    @NameInMap("evidence_type")
    @Validation(required = true)
    public String evidenceType;

    // 证据状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 网页截取编号
    /**
     * <strong>example:</strong>
     * <p>8240419000000028693</p>
     */
    @NameInMap("screenshot_id")
    @Validation(required = true)
    public String screenshotId;

    // 证据编号
    /**
     * <strong>example:</strong>
     * <p>8240419000000028693</p>
     */
    @NameInMap("evidence_id")
    @Validation(required = true)
    public String evidenceId;

    // 存证编号
    /**
     * <strong>example:</strong>
     * <p>20240422173407597000001</p>
     */
    @NameInMap("certificate_no")
    @Validation(required = true)
    public String certificateNo;

    // 上链时间
    /**
     * <strong>example:</strong>
     * <p>1713779272000</p>
     */
    @NameInMap("certificate_time")
    @Validation(required = true)
    public Long certificateTime;

    // 证据hash
    /**
     * <strong>example:</strong>
     * <p>dbdd234c35ca275a17b395ad58eff4c2</p>
     */
    @NameInMap("evidence_hash")
    @Validation(required = true)
    public String evidenceHash;

    // 链上交易hash
    /**
     * <strong>example:</strong>
     * <p>fc044ac2c1d75ed1219b39db86398cc7cd1c67a43d6ea6c4b83f3a7f5b918a14</p>
     */
    @NameInMap("evidence_tx_hash")
    @Validation(required = true)
    public String evidenceTxHash;

    // 证书下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.baidu.com">https://www.baidu.com</a></p>
     */
    @NameInMap("certificate_file_url")
    @Validation(required = true)
    public String certificateFileUrl;

    // 截图文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.baidu.com">https://www.baidu.com</a></p>
     */
    @NameInMap("screenshot_file_url")
    @Validation(required = true)
    public String screenshotFileUrl;

    // 证据文件大小
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("evidence_file_size")
    @Validation(required = true)
    public Long evidenceFileSize;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>NOTARY_SCREENSHOT_ERROR</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>公证处网页取证存证失败</p>
     */
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
