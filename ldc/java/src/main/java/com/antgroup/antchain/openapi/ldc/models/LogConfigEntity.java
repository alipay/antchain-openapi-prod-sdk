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

    // log_sample
    @NameInMap("log_sample")
    public String logSample;

    // logBeginRegex
    @NameInMap("log_begin_regex")
    public String logBeginRegex;

    // regex
    @NameInMap("regex")
    public String regex;

    // op不支持map，请传入一个可以序列化成map的字符串
    @NameInMap("docker_include_label")
    public String dockerIncludeLabel;

    // OP不支持map，请传入一个可以序列化的JSON
    @NameInMap("docker_exclude_label")
    public String dockerExcludeLabel;

    // file_path_blacklist
    @NameInMap("file_path_blacklist")
    public java.util.List<String> filePathBlacklist;

    // 正则表达式必填，用于提取内容
    @NameInMap("key")
    public java.util.List<String> key;

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

    public LogConfigEntity setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public LogConfigEntity setLogBeginRegex(String logBeginRegex) {
        this.logBeginRegex = logBeginRegex;
        return this;
    }
    public String getLogBeginRegex() {
        return this.logBeginRegex;
    }

    public LogConfigEntity setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public LogConfigEntity setDockerIncludeLabel(String dockerIncludeLabel) {
        this.dockerIncludeLabel = dockerIncludeLabel;
        return this;
    }
    public String getDockerIncludeLabel() {
        return this.dockerIncludeLabel;
    }

    public LogConfigEntity setDockerExcludeLabel(String dockerExcludeLabel) {
        this.dockerExcludeLabel = dockerExcludeLabel;
        return this;
    }
    public String getDockerExcludeLabel() {
        return this.dockerExcludeLabel;
    }

    public LogConfigEntity setFilePathBlacklist(java.util.List<String> filePathBlacklist) {
        this.filePathBlacklist = filePathBlacklist;
        return this;
    }
    public java.util.List<String> getFilePathBlacklist() {
        return this.filePathBlacklist;
    }

    public LogConfigEntity setKey(java.util.List<String> key) {
        this.key = key;
        return this;
    }
    public java.util.List<String> getKey() {
        return this.key;
    }

}
