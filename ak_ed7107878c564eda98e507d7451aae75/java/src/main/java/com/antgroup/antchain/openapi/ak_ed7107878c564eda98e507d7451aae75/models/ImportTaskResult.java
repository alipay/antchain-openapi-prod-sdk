// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class ImportTaskResult extends TeaModel {
    // 任务状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 进度值
    @NameInMap("progress")
    public Long progress;

    // 错误日志
    @NameInMap("error_message")
    public String errorMessage;

    // 导入日志文件url
    @NameInMap("file_url")
    public String fileUrl;

    public static ImportTaskResult build(java.util.Map<String, ?> map) throws Exception {
        ImportTaskResult self = new ImportTaskResult();
        return TeaModel.build(map, self);
    }

    public ImportTaskResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ImportTaskResult setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public ImportTaskResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ImportTaskResult setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
