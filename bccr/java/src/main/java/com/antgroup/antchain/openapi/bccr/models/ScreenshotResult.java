// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenshotResult extends TeaModel {
    // 截图文件下载链接
    @NameInMap("screenshot_file_url")
    @Validation(required = true)
    public String screenshotFileUrl;

    // 网页截取编号
    @NameInMap("screenshot_id")
    @Validation(required = true)
    public String screenshotId;

    // 取证类型(SCREENSHOT: 网页截图)
    @NameInMap("screenshot_type")
    @Validation(required = true)
    public String screenshotType;

    // 取证状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息
    @NameInMap("error_message")
    public String errorMessage;

    // 网页截取名称
    @NameInMap("screenshot_name")
    @Validation(required = true)
    public String screenshotName;

    public static ScreenshotResult build(java.util.Map<String, ?> map) throws Exception {
        ScreenshotResult self = new ScreenshotResult();
        return TeaModel.build(map, self);
    }

    public ScreenshotResult setScreenshotFileUrl(String screenshotFileUrl) {
        this.screenshotFileUrl = screenshotFileUrl;
        return this;
    }
    public String getScreenshotFileUrl() {
        return this.screenshotFileUrl;
    }

    public ScreenshotResult setScreenshotId(String screenshotId) {
        this.screenshotId = screenshotId;
        return this;
    }
    public String getScreenshotId() {
        return this.screenshotId;
    }

    public ScreenshotResult setScreenshotType(String screenshotType) {
        this.screenshotType = screenshotType;
        return this;
    }
    public String getScreenshotType() {
        return this.screenshotType;
    }

    public ScreenshotResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ScreenshotResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ScreenshotResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ScreenshotResult setScreenshotName(String screenshotName) {
        this.screenshotName = screenshotName;
        return this;
    }
    public String getScreenshotName() {
        return this.screenshotName;
    }

}
