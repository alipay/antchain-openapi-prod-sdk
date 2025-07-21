// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RecordScreenData extends TeaModel {
    // 错误原因（状态为FAIL才有数据）
    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("error_reason")
    public String errorReason;

    // 录屏文件Hash值
    /**
     * <strong>example:</strong>
     * <p>00030a38fae767396d499b306c810d2f08c15773f8447d870e5e0235e6634ed10000</p>
     */
    @NameInMap("file_hash")
    public String fileHash;

    // 录屏结束时间
    /**
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("gmt_end")
    @Validation(required = true)
    public Long gmtEnd;

    // 录屏开始时间
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("gmt_start")
    @Validation(required = true)
    public Long gmtStart;

    // OS版本号
    /**
     * <strong>example:</strong>
     * <p>Microsoft Windows Server 2012 R2 Datacenter 64 位</p>
     */
    @NameInMap("os_version")
    @Validation(required = true)
    public String osVersion;

    // 录屏文件信息
    @NameInMap("screen_info")
    public ScreenInfo screenInfo;

    // 证据包下载地址（状态为SUCCESS 才有数据）
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("screen_zip")
    public String screenZip;

    // 录屏软件版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.24</p>
     */
    @NameInMap("sw_version")
    @Validation(required = true)
    public String swVersion;

    // 可信时间戳的返回对象
    /**
     * <strong>example:</strong>
     * <p>{&quot;cTSR&quot;:&quot;1f8b080000009d0e6c198caccc2c4c&quot;,&quot;code&quot;:&quot;0&quot;,&quot;hashAlgorithm&quot;:&quot;sha256&quot;,&quot;hashedMessage&quot;:&quot;3585100148072894b8&quot;,&quot;sN&quot;:&quot;TTAS_S.0.2_87310861339018912&quot;,&quot;tS&quot;:1602672018916,&quot;version&quot;:&quot;2.0&quot;}</p>
     */
    @NameInMap("tsr")
    public String tsr;

    // 统一证据编号
    /**
     * <strong>example:</strong>
     * <p>1d642de2e838c809965768d7fd63230c10ad8740809b5bc0a070855397674ea5</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    // 录屏文件大小
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("file_size")
    public Long fileSize;

    // 录屏文件存证块高
    /**
     * <strong>example:</strong>
     * <p>1212121</p>
     */
    @NameInMap("block_height")
    public Long blockHeight;

    // 录屏文件上链时间
    /**
     * <strong>example:</strong>
     * <p>1605597503000</p>
     */
    @NameInMap("timestamp")
    public Long timestamp;

    // 录屏文件公证处证书下载链接
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

    // 证据包存证交易hash
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("zip_tx_hash")
    public String zipTxHash;

    // 取证备注信息
    /**
     * <strong>example:</strong>
     * <p>{    &quot;urls&quot;: [       &quot;<a href="https://www.baidu.com">https://www.baidu.com</a>&quot;,       &quot;<a href="https://www.mydcs.com">https://www.mydcs.com</a>&quot;    ] }</p>
     */
    @NameInMap("inventory")
    public String inventory;

    // 证据包文件hash
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("zip_file_hash")
    public String zipFileHash;

    // 主要核心证据文件名称
    /**
     * <strong>example:</strong>
     * <p>test.mp4</p>
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

    // 补正说明函下载地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("correction_url")
    public String correctionUrl;

    // 录屏取证准备时间
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("gmt_ready")
    public Long gmtReady;

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

    public RecordScreenData setMainEvidenceName(String mainEvidenceName) {
        this.mainEvidenceName = mainEvidenceName;
        return this;
    }
    public String getMainEvidenceName() {
        return this.mainEvidenceName;
    }

    public RecordScreenData setEvidenceOrderNum(String evidenceOrderNum) {
        this.evidenceOrderNum = evidenceOrderNum;
        return this;
    }
    public String getEvidenceOrderNum() {
        return this.evidenceOrderNum;
    }

    public RecordScreenData setCorrectionUrl(String correctionUrl) {
        this.correctionUrl = correctionUrl;
        return this;
    }
    public String getCorrectionUrl() {
        return this.correctionUrl;
    }

    public RecordScreenData setGmtReady(Long gmtReady) {
        this.gmtReady = gmtReady;
        return this;
    }
    public Long getGmtReady() {
        return this.gmtReady;
    }

}
