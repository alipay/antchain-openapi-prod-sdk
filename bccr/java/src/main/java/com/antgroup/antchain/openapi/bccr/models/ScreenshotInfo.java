// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenshotInfo extends TeaModel {
    // 全链路取证日志文件下载链接
    @NameInMap("process_log_file")
    public String processLogFile;

    // 自清洁文件下载链接
    @NameInMap("check_log_file")
    public String checkLogFile;

    // 网页截图文件下载链接
    @NameInMap("screenshot_file")
    @Validation(required = true)
    public String screenshotFile;

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

    public ScreenshotInfo setCheckLogFile(String checkLogFile) {
        this.checkLogFile = checkLogFile;
        return this;
    }
    public String getCheckLogFile() {
        return this.checkLogFile;
    }

    public ScreenshotInfo setScreenshotFile(String screenshotFile) {
        this.screenshotFile = screenshotFile;
        return this;
    }
    public String getScreenshotFile() {
        return this.screenshotFile;
    }

}
