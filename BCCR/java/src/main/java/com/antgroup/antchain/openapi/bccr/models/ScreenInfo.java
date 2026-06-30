// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenInfo extends TeaModel {
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

    // 自清洁文件下载地址
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
    @NameInMap("web_screenshot_file")
    public String webScreenshotFile;

    // 网页截图文件哈希
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("web_screenshot_file_hash")
    public String webScreenshotFileHash;

    // 网页源码文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("web_source_file")
    public String webSourceFile;

    // 网页源码文件哈希
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("web_source_file_hash")
    public String webSourceFileHash;

    // 视频源文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="http://xx">http://xx</a></p>
     */
    @NameInMap("video_file")
    public String videoFile;

    // 视频源文件哈希
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("video_file_hash")
    public String videoFileHash;

    // 手机自清洁文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("extend_device_check_file")
    public String extendDeviceCheckFile;

    // 手机自清洁文件哈希
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("extend_device_check_file_hash")
    public String extendDeviceCheckFileHash;

    // 手机操作日志下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("extend_device_process_file")
    public String extendDeviceProcessFile;

    // 手机操作日志哈希
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("extend_device_process_file_hash")
    public String extendDeviceProcessFileHash;

    // 日志打包文件hash
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("log_zip_file_hash")
    public String logZipFileHash;

    // 日志打包文件上链hash
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("log_zip_tx_hash")
    public String logZipTxHash;

    public static ScreenInfo build(java.util.Map<String, ?> map) throws Exception {
        ScreenInfo self = new ScreenInfo();
        return TeaModel.build(map, self);
    }

    public ScreenInfo setProcessLogFile(String processLogFile) {
        this.processLogFile = processLogFile;
        return this;
    }
    public String getProcessLogFile() {
        return this.processLogFile;
    }

    public ScreenInfo setProcessLogFileHash(String processLogFileHash) {
        this.processLogFileHash = processLogFileHash;
        return this;
    }
    public String getProcessLogFileHash() {
        return this.processLogFileHash;
    }

    public ScreenInfo setCheckLogFile(String checkLogFile) {
        this.checkLogFile = checkLogFile;
        return this;
    }
    public String getCheckLogFile() {
        return this.checkLogFile;
    }

    public ScreenInfo setCheckLogFileHash(String checkLogFileHash) {
        this.checkLogFileHash = checkLogFileHash;
        return this;
    }
    public String getCheckLogFileHash() {
        return this.checkLogFileHash;
    }

    public ScreenInfo setWebScreenshotFile(String webScreenshotFile) {
        this.webScreenshotFile = webScreenshotFile;
        return this;
    }
    public String getWebScreenshotFile() {
        return this.webScreenshotFile;
    }

    public ScreenInfo setWebScreenshotFileHash(String webScreenshotFileHash) {
        this.webScreenshotFileHash = webScreenshotFileHash;
        return this;
    }
    public String getWebScreenshotFileHash() {
        return this.webScreenshotFileHash;
    }

    public ScreenInfo setWebSourceFile(String webSourceFile) {
        this.webSourceFile = webSourceFile;
        return this;
    }
    public String getWebSourceFile() {
        return this.webSourceFile;
    }

    public ScreenInfo setWebSourceFileHash(String webSourceFileHash) {
        this.webSourceFileHash = webSourceFileHash;
        return this;
    }
    public String getWebSourceFileHash() {
        return this.webSourceFileHash;
    }

    public ScreenInfo setVideoFile(String videoFile) {
        this.videoFile = videoFile;
        return this;
    }
    public String getVideoFile() {
        return this.videoFile;
    }

    public ScreenInfo setVideoFileHash(String videoFileHash) {
        this.videoFileHash = videoFileHash;
        return this;
    }
    public String getVideoFileHash() {
        return this.videoFileHash;
    }

    public ScreenInfo setExtendDeviceCheckFile(String extendDeviceCheckFile) {
        this.extendDeviceCheckFile = extendDeviceCheckFile;
        return this;
    }
    public String getExtendDeviceCheckFile() {
        return this.extendDeviceCheckFile;
    }

    public ScreenInfo setExtendDeviceCheckFileHash(String extendDeviceCheckFileHash) {
        this.extendDeviceCheckFileHash = extendDeviceCheckFileHash;
        return this;
    }
    public String getExtendDeviceCheckFileHash() {
        return this.extendDeviceCheckFileHash;
    }

    public ScreenInfo setExtendDeviceProcessFile(String extendDeviceProcessFile) {
        this.extendDeviceProcessFile = extendDeviceProcessFile;
        return this;
    }
    public String getExtendDeviceProcessFile() {
        return this.extendDeviceProcessFile;
    }

    public ScreenInfo setExtendDeviceProcessFileHash(String extendDeviceProcessFileHash) {
        this.extendDeviceProcessFileHash = extendDeviceProcessFileHash;
        return this;
    }
    public String getExtendDeviceProcessFileHash() {
        return this.extendDeviceProcessFileHash;
    }

    public ScreenInfo setLogZipFileHash(String logZipFileHash) {
        this.logZipFileHash = logZipFileHash;
        return this;
    }
    public String getLogZipFileHash() {
        return this.logZipFileHash;
    }

    public ScreenInfo setLogZipTxHash(String logZipTxHash) {
        this.logZipTxHash = logZipTxHash;
        return this;
    }
    public String getLogZipTxHash() {
        return this.logZipTxHash;
    }

}
