// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LogConfigEntity extends TeaModel {
    // 配置名称
    @NameInMap("config_name")
    @Validation(required = true)
    public String configName;

    // 输入类型
    @NameInMap("input_type")
    @Validation(required = true)
    public String inputType;

    // 日志库名称
    @NameInMap("logstore_name")
    @Validation(required = true)
    public String logstoreName;

    // 日志目录
    @NameInMap("log_path")
    @Validation(required = true)
    public String logPath;

    // file_pattern
    @NameInMap("file_pattern")
    public String filePattern;

    public static LogConfigEntity build(java.util.Map<String, ?> map) throws Exception {
        LogConfigEntity self = new LogConfigEntity();
        return TeaModel.build(map, self);
    }

    public LogConfigEntity setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public LogConfigEntity setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public LogConfigEntity setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public LogConfigEntity setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public LogConfigEntity setFilePattern(String filePattern) {
        this.filePattern = filePattern;
        return this;
    }
    public String getFilePattern() {
        return this.filePattern;
    }

}
