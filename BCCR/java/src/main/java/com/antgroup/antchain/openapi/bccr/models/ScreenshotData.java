// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenshotData extends TeaModel {
    // 取证地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 网页取证时间
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("gmt_evidence")
    public Long gmtEvidence;

    // 网页取证文件Hash值
    /**
     * <strong>example:</strong>
     * <p>00030a38fae767396d499b306c810d2f08c15773f8447d870e5e0235e6634ed10000</p>
     */
    @NameInMap("file_hash")
    public String fileHash;

    // 网页取证文件大小
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("file_size")
    public Long fileSize;

    // 统一证据编号
    /**
     * <strong>example:</strong>
     * <p>1d642de2e838c809965768d7fd63230c10ad8740809b5bc0a070855397674ea5</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    // 网页取证文件存证块高
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("block_height")
    public Long blockHeight;

    // 网页取证文件上链时间
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("timestamp")
    public Long timestamp;

    // 可信时间戳的返回对象
    /**
     * <strong>example:</strong>
     * <p>{&quot;cTSR&quot;:&quot;1f8b080000009d0e6c198caccc2c4c&quot;,&quot;code&quot;:&quot;0&quot;,&quot;hashAlgorithm&quot;:&quot;sha256&quot;,&quot;hashedMessage&quot;:&quot;3585100148072894b8&quot;,&quot;sN&quot;:&quot;TTAS_S.0.2_87310861339018912&quot;,&quot;tS&quot;:1602672018916,&quot;version&quot;:&quot;2.0&quot;}</p>
     */
    @NameInMap("tsr")
    public String tsr;

    // 网页截图文件公证处证书下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("certificate_url")
    public String certificateUrl;

    // 公证处证书编号
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("certificate_storage_no")
    public String certificateStorageNo;

    // 网页取证工具软件版本号
    /**
     * <strong>example:</strong>
     * <p>0.0.1</p>
     */
    @NameInMap("tool_version")
    public String toolVersion;

    // 证据包下载地址（状态为SUCCESS 才有数据）
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("screenshot_zip")
    public String screenshotZip;

    // 取证文件信息
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("screenshot_info")
    public ScreenshotInfo screenshotInfo;

    // 网页title
    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("head_title")
    public String headTitle;

    // 证据包交易hash
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("zip_tx_hash")
    public String zipTxHash;

    // 网页取证失败原因
    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("error_reason")
    public String errorReason;

    // 中文失败原因
    /**
     * <strong>example:</strong>
     * <p>中文失败原因</p>
     */
    @NameInMap("error_reason_cn")
    public String errorReasonCn;

    // 证据包文件hash
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("zip_file_hash")
    public String zipFileHash;

    // 核心证据文件名称
    /**
     * <strong>example:</strong>
     * <p>test.jpg</p>
     */
    @NameInMap("main_evidence_name")
    public String mainEvidenceName;

    // 取证申请单号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("evidence_order_num")
    public String evidenceOrderNum;

    // 取证开始时间
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("gmt_evidence_start")
    public Long gmtEvidenceStart;

    public static ScreenshotData build(java.util.Map<String, ?> map) throws Exception {
        ScreenshotData self = new ScreenshotData();
        return TeaModel.build(map, self);
    }

    public ScreenshotData setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ScreenshotData setGmtEvidence(Long gmtEvidence) {
        this.gmtEvidence = gmtEvidence;
        return this;
    }
    public Long getGmtEvidence() {
        return this.gmtEvidence;
    }

    public ScreenshotData setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public ScreenshotData setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public ScreenshotData setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ScreenshotData setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public ScreenshotData setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public ScreenshotData setTsr(String tsr) {
        this.tsr = tsr;
        return this;
    }
    public String getTsr() {
        return this.tsr;
    }

    public ScreenshotData setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public ScreenshotData setCertificateStorageNo(String certificateStorageNo) {
        this.certificateStorageNo = certificateStorageNo;
        return this;
    }
    public String getCertificateStorageNo() {
        return this.certificateStorageNo;
    }

    public ScreenshotData setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
        return this;
    }
    public String getToolVersion() {
        return this.toolVersion;
    }

    public ScreenshotData setScreenshotZip(String screenshotZip) {
        this.screenshotZip = screenshotZip;
        return this;
    }
    public String getScreenshotZip() {
        return this.screenshotZip;
    }

    public ScreenshotData setScreenshotInfo(ScreenshotInfo screenshotInfo) {
        this.screenshotInfo = screenshotInfo;
        return this;
    }
    public ScreenshotInfo getScreenshotInfo() {
        return this.screenshotInfo;
    }

    public ScreenshotData setHeadTitle(String headTitle) {
        this.headTitle = headTitle;
        return this;
    }
    public String getHeadTitle() {
        return this.headTitle;
    }

    public ScreenshotData setZipTxHash(String zipTxHash) {
        this.zipTxHash = zipTxHash;
        return this;
    }
    public String getZipTxHash() {
        return this.zipTxHash;
    }

    public ScreenshotData setErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }
    public String getErrorReason() {
        return this.errorReason;
    }

    public ScreenshotData setErrorReasonCn(String errorReasonCn) {
        this.errorReasonCn = errorReasonCn;
        return this;
    }
    public String getErrorReasonCn() {
        return this.errorReasonCn;
    }

    public ScreenshotData setZipFileHash(String zipFileHash) {
        this.zipFileHash = zipFileHash;
        return this;
    }
    public String getZipFileHash() {
        return this.zipFileHash;
    }

    public ScreenshotData setMainEvidenceName(String mainEvidenceName) {
        this.mainEvidenceName = mainEvidenceName;
        return this;
    }
    public String getMainEvidenceName() {
        return this.mainEvidenceName;
    }

    public ScreenshotData setEvidenceOrderNum(String evidenceOrderNum) {
        this.evidenceOrderNum = evidenceOrderNum;
        return this;
    }
    public String getEvidenceOrderNum() {
        return this.evidenceOrderNum;
    }

    public ScreenshotData setGmtEvidenceStart(Long gmtEvidenceStart) {
        this.gmtEvidenceStart = gmtEvidenceStart;
        return this;
    }
    public Long getGmtEvidenceStart() {
        return this.gmtEvidenceStart;
    }

}
