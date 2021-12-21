// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenshotData extends TeaModel {
    // 取证地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 网页取证时间
    @NameInMap("gmt_evidence")
    @Validation(required = true)
    public Long gmtEvidence;

    // 网页取证文件Hash值
    @NameInMap("file_hash")
    public String fileHash;

    // 网页取证文件大小
    @NameInMap("file_size")
    public Long fileSize;

    // 统一证据编号
    @NameInMap("tx_hash")
    public String txHash;

    // 网页取证文件存证块高
    @NameInMap("block_height")
    public Long blockHeight;

    // 网页取证文件上链时间
    @NameInMap("timestamp")
    public Long timestamp;

    // 可信时间戳的返回对象
    @NameInMap("tsr")
    public String tsr;

    // 网页截图文件公证处证书下载链接
    @NameInMap("certificate_url")
    public String certificateUrl;

    // 公证处证书编号
    @NameInMap("certificate_storage_no")
    public String certificateStorageNo;

    // 网页取证工具软件版本号
    @NameInMap("tool_version")
    public String toolVersion;

    // 证据包下载地址（状态为SUCCESS 才有数据）
    @NameInMap("screenshot_zip")
    public String screenshotZip;

    // 取证文件信息
    @NameInMap("screenshot_info")
    public ScreenshotInfo screenshotInfo;

    // 网页title
    @NameInMap("head_title")
    public String headTitle;

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

}
