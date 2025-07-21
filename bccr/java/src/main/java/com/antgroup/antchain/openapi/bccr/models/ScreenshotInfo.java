// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenshotInfo extends TeaModel {
    // 全链路取证日志文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("process_log_file")
    public String processLogFile;

    // 全链路取证日志文件哈希
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("process_log_file_hash")
    public String processLogFileHash;

    // 自清洁文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("check_log_file")
    public String checkLogFile;

    // 自清洁文件哈希
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("check_log_file_hash")
    public String checkLogFileHash;

    // 网页截图文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("screenshot_file")
    @Validation(required = true)
    public String screenshotFile;

    // 网页截图文件哈希
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("screenshot_file_hash")
    public String screenshotFileHash;

    // 日志打包文件hash
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("log_zip_file_hash")
    public String logZipFileHash;

    // 日志文件上链hash
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("log_zip_tx_hash")
    public String logZipTxHash;

    public static ScreenshotInfo build(java.util.Map<String, ?> map) throws Exception {
        ScreenshotInfo self = new ScreenshotInfo();
        return TeaModel.build(map, self);
    }

    public ScreenshotInfo setProcessLogFile(String processLogFile) {
        this.processLogFile = processLogFile;
        return this;
    }
    public String getProcessLogFile() {
        return this.processLogFile;
    }

    public ScreenshotInfo setProcessLogFileHash(String processLogFileHash) {
        this.processLogFileHash = processLogFileHash;
        return this;
    }
    public String getProcessLogFileHash() {
        return this.processLogFileHash;
    }

    public ScreenshotInfo setCheckLogFile(String checkLogFile) {
        this.checkLogFile = checkLogFile;
        return this;
    }
    public String getCheckLogFile() {
        return this.checkLogFile;
    }

    public ScreenshotInfo setCheckLogFileHash(String checkLogFileHash) {
        this.checkLogFileHash = checkLogFileHash;
        return this;
    }
    public String getCheckLogFileHash() {
        return this.checkLogFileHash;
    }

    public ScreenshotInfo setScreenshotFile(String screenshotFile) {
        this.screenshotFile = screenshotFile;
        return this;
    }
    public String getScreenshotFile() {
        return this.screenshotFile;
    }

    public ScreenshotInfo setScreenshotFileHash(String screenshotFileHash) {
        this.screenshotFileHash = screenshotFileHash;
        return this;
    }
    public String getScreenshotFileHash() {
        return this.screenshotFileHash;
    }

    public ScreenshotInfo setLogZipFileHash(String logZipFileHash) {
        this.logZipFileHash = logZipFileHash;
        return this;
    }
    public String getLogZipFileHash() {
        return this.logZipFileHash;
    }

    public ScreenshotInfo setLogZipTxHash(String logZipTxHash) {
        this.logZipTxHash = logZipTxHash;
        return this;
    }
    public String getLogZipTxHash() {
        return this.logZipTxHash;
    }

}
