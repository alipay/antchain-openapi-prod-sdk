// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenInfo extends TeaModel {
    // 全链路取证日志文件下载链接
    @NameInMap("process_log_file")
    public String processLogFile;

    // 自清洁文件下载地址
    @NameInMap("check_log_file")
    public String checkLogFile;

    // 网页截图文件下载链接
    @NameInMap("web_screenshot_file")
    public String webScreenshotFile;

    // 网页源码文件下载链接
    @NameInMap("web_source_file")
    public String webSourceFile;

    // 视频源文件下载链接
    @NameInMap("video_file")
    public String videoFile;

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

    public ScreenInfo setCheckLogFile(String checkLogFile) {
        this.checkLogFile = checkLogFile;
        return this;
    }
    public String getCheckLogFile() {
        return this.checkLogFile;
    }

    public ScreenInfo setWebScreenshotFile(String webScreenshotFile) {
        this.webScreenshotFile = webScreenshotFile;
        return this;
    }
    public String getWebScreenshotFile() {
        return this.webScreenshotFile;
    }

    public ScreenInfo setWebSourceFile(String webSourceFile) {
        this.webSourceFile = webSourceFile;
        return this;
    }
    public String getWebSourceFile() {
        return this.webSourceFile;
    }

    public ScreenInfo setVideoFile(String videoFile) {
        this.videoFile = videoFile;
        return this;
    }
    public String getVideoFile() {
        return this.videoFile;
    }

}
