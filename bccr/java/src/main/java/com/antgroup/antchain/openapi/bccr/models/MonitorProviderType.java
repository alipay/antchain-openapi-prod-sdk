// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class MonitorProviderType extends TeaModel {
    // 监测文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 提交类型
    @NameInMap("submit_type")
    @Validation(required = true)
    public String submitType;

    // 文件格式
    @NameInMap("file_format")
    public String fileFormat;

    // 支持的服务商列表，已排序
    @NameInMap("monitor_providers")
    @Validation(required = true)
    public java.util.List<MonitorProviderCapability> monitorProviders;

    public static MonitorProviderType build(java.util.Map<String, ?> map) throws Exception {
        MonitorProviderType self = new MonitorProviderType();
        return TeaModel.build(map, self);
    }

    public MonitorProviderType setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public MonitorProviderType setSubmitType(String submitType) {
        this.submitType = submitType;
        return this;
    }
    public String getSubmitType() {
        return this.submitType;
    }

    public MonitorProviderType setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public MonitorProviderType setMonitorProviders(java.util.List<MonitorProviderCapability> monitorProviders) {
        this.monitorProviders = monitorProviders;
        return this;
    }
    public java.util.List<MonitorProviderCapability> getMonitorProviders() {
        return this.monitorProviders;
    }

}
