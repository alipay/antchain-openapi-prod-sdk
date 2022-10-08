// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RecordScreenData extends TeaModel {
    // 错误原因（状态为FAIL才有数据）
    @NameInMap("error_reason")
    public String errorReason;

    // 录屏文件Hash值
    @NameInMap("file_hash")
    public String fileHash;

    // 录屏结束时间
    @NameInMap("gmt_end")
    @Validation(required = true)
    public Long gmtEnd;

    // 录屏开始时间
    @NameInMap("gmt_start")
    @Validation(required = true)
    public Long gmtStart;

    // OS版本号
    @NameInMap("os_version")
    @Validation(required = true)
    public String osVersion;

    // 录屏文件信息
    @NameInMap("screen_info")
    public ScreenInfo screenInfo;

    // 证据包下载地址（状态为SUCCESS 才有数据）
    @NameInMap("screen_zip")
    public String screenZip;

    // 录屏软件版本号
    @NameInMap("sw_version")
    @Validation(required = true)
    public String swVersion;

    // 可信时间戳的返回对象
    @NameInMap("tsr")
    public String tsr;

    // 统一证据编号
    @NameInMap("tx_hash")
    public String txHash;

    // 录屏文件大小
    @NameInMap("file_size")
    public Long fileSize;

    // 录屏文件存证块高
    @NameInMap("block_height")
    public Long blockHeight;

    // 录屏文件上链时间
    @NameInMap("timestamp")
    public Long timestamp;

    // 录屏文件公证处证书下载链接
    @NameInMap("certificate_url")
    public String certificateUrl;

    // 公证处证书编号
    @NameInMap("certificate_storage_no")
    public String certificateStorageNo;

    // 证据包存证交易hash
    @NameInMap("zip_tx_hash")
    public String zipTxHash;

    // 取证备注信息
    @NameInMap("inventory")
    public String inventory;

    // 证据包文件hash
    @NameInMap("zip_file_hash")
    public String zipFileHash;

    public static RecordScreenData build(java.util.Map<String, ?> map) throws Exception {
        RecordScreenData self = new RecordScreenData();
        return TeaModel.build(map, self);
    }

    public RecordScreenData setErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }
    public String getErrorReason() {
        return this.errorReason;
    }

    public RecordScreenData setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public RecordScreenData setGmtEnd(Long gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public Long getGmtEnd() {
        return this.gmtEnd;
    }

    public RecordScreenData setGmtStart(Long gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public Long getGmtStart() {
        return this.gmtStart;
    }

    public RecordScreenData setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public RecordScreenData setScreenInfo(ScreenInfo screenInfo) {
        this.screenInfo = screenInfo;
        return this;
    }
    public ScreenInfo getScreenInfo() {
        return this.screenInfo;
    }

    public RecordScreenData setScreenZip(String screenZip) {
        this.screenZip = screenZip;
        return this;
    }
    public String getScreenZip() {
        return this.screenZip;
    }

    public RecordScreenData setSwVersion(String swVersion) {
        this.swVersion = swVersion;
        return this;
    }
    public String getSwVersion() {
        return this.swVersion;
    }

    public RecordScreenData setTsr(String tsr) {
        this.tsr = tsr;
        return this;
    }
    public String getTsr() {
        return this.tsr;
    }

    public RecordScreenData setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public RecordScreenData setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public RecordScreenData setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public RecordScreenData setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public RecordScreenData setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public RecordScreenData setCertificateStorageNo(String certificateStorageNo) {
        this.certificateStorageNo = certificateStorageNo;
        return this;
    }
    public String getCertificateStorageNo() {
        return this.certificateStorageNo;
    }

    public RecordScreenData setZipTxHash(String zipTxHash) {
        this.zipTxHash = zipTxHash;
        return this;
    }
    public String getZipTxHash() {
        return this.zipTxHash;
    }

    public RecordScreenData setInventory(String inventory) {
        this.inventory = inventory;
        return this;
    }
    public String getInventory() {
        return this.inventory;
    }

    public RecordScreenData setZipFileHash(String zipFileHash) {
        this.zipFileHash = zipFileHash;
        return this;
    }
    public String getZipFileHash() {
        return this.zipFileHash;
    }

}
