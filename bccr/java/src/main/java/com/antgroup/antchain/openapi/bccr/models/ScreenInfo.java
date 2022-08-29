// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenInfo extends TeaModel {
    // 全链路取证日志文件下载链接
    @NameInMap("process_log_file")
    public String processLogFile;

    // 全链路取证日志文件哈希
    @NameInMap("process_log_file_hash")
    public String processLogFileHash;

    // 自清洁文件下载地址
    @NameInMap("check_log_file")
    public String checkLogFile;

    // 自清洁文件哈希
    @NameInMap("check_log_file_hash")
    public String checkLogFileHash;

    // 网页截图文件下载链接
    @NameInMap("web_screenshot_file")
    public String webScreenshotFile;

    // 网页截图文件哈希
    @NameInMap("web_screenshot_file_hash")
    public String webScreenshotFileHash;

    // 网页源码文件下载链接
    @NameInMap("web_source_file")
    public String webSourceFile;

    // 网页源码文件哈希
    @NameInMap("web_source_file_hash")
    public String webSourceFileHash;

    // 视频源文件下载链接
    @NameInMap("video_file")
    public String videoFile;

    // 视频源文件哈希
    @NameInMap("video_file_hash")
    public String videoFileHash;

    // 手机自清洁文件下载链接
    @NameInMap("extend_device_check_file")
    public String extendDeviceCheckFile;

    // 手机自清洁文件哈希
    @NameInMap("extend_device_check_file_hash")
    public String extendDeviceCheckFileHash;

    // 手机操作日志下载链接
    @NameInMap("extend_device_process_file")
    public String extendDeviceProcessFile;

    // 手机操作日志哈希
    @NameInMap("extend_device_process_file_hash")
    public String extendDeviceProcessFileHash;

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

}
