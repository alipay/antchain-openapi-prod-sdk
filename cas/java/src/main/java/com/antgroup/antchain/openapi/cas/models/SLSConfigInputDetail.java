// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SLSConfigInputDetail extends TeaModel {
    // 用于过滤日志的key，只有key的值满足对应filterRegex列中设定的正则表达式，该日志数据才会被采集。
    @NameInMap("filter_key")
    public java.util.List<String> filterKey;

    // 与filterKey对应的正则表达式， filterRegex的长度和filterKey的长度必须相同。
    @NameInMap("filter_regex")
    public java.util.List<String> filterRegex;

    // 数据写入的模式。默认按照写入，开启后按照写入。支持的值包括 __topic__，__hostname__, __source__。
    @NameInMap("shard_hash_key")
    public java.util.List<String> shardHashKey;

    // 是否上传原始日志。
    @NameInMap("enable_raw_log")
    public Boolean enableRawLog;

    // 脱敏功能配置，类型为数组
    @NameInMap("sensitive_keys")
    public java.util.List<SLSConfigSensitiveKey> sensitiveKeys;

    // 聚合方式，默认为topic，表示按照Topic方式聚合。支持的值为 topic、logstore。
    @NameInMap("merge_type")
    public String mergeType;

    // 采集进度落后的告警阈值，默认为209715200，即200MB。
    @NameInMap("delay_alarm_bytes")
    public Long delayAlarmBytes;

    // 是否调整日志时区，仅在配置时间解析的情况下使用。
    @NameInMap("adjust_timezone")
    public Boolean adjustTimezone;

    // 时区偏移量，例如日志时间为东八区，则该值为GMT+08:00
    @NameInMap("log_timezone")
    public String logTimezone;

    // 日志发送优先级，默认为0，若需设置为高优先级，则设置为1。
    @NameInMap("priority")
    public Long priority;

    // 日志的采集模式。如果Logtail配置参数inputType选择为file，则该参数为必填项。目前可选：
    // json_log：JSON模式。
    // apsara_log：飞天模式。
    // common_reg_log：完整正则模式。
    // delimiter_log：分隔符模式。
    @NameInMap("log_type")
    @Validation(required = true)
    public String logType;

    // 日志所在的父目录，例如/var/logs/。
    @NameInMap("log_path")
    @Validation(required = true)
    public String logPath;

    // 日志文件的Pattern，例如access*.log。
    @NameInMap("file_pattern")
    @Validation(required = true)
    public String filePattern;

    // Topic生成方式，支持以下四种类型：
    // none，表示topic为空。
    // default，表示将日志文件路径作为topic。
    // group_topic，表示将应用该配置的机器组topic属性作为topic。
    // 也可以将日志文件路径的某一部分作为topic，如/var/log/(.*).log。
    @NameInMap("topic_format")
    @Validation(required = true)
    public String topicFormat;

    // 日志时间格式，如%Y/%m/%d %H:%M:%S。
    @NameInMap("time_format")
    public String timeFormat;

    // 监控目录超时设置。默认为true，代表监控目录永不超时，false代表监控目录超过30分钟则超时。
    @NameInMap("preserve")
    public Boolean preserve;

    // 当设置preserve为false时，指定监控不超时目录的深度，最大深度支持3。
    @NameInMap("preserve_depth")
    public Long preserveDepth;

    // 支持两种类型：utf8、gbk
    @NameInMap("file_encoding")
    public String fileEncoding;

    // 是否丢弃匹配失败的日志。
    @NameInMap("discard_unmatch")
    public Boolean discardUnmatch;

    // 最大目录监控深度范围0-1000，0代表只监控本层目录。
    @NameInMap("max_depth")
    public Long maxDepth;

    // 采集落后时是否丢弃落后数据的阈值，默认为0，即不丢弃。当采集落后超过该值时，则直接丢弃落后的数据
    @NameInMap("delay_skip_bytes")
    public Long delaySkipBytes;

    // 采集的目标文件是否为容器内文件，默认为false。
    @NameInMap("docker_file")
    public Boolean dockerFile;

    // 容器Label白名单，采集包含白名单中Label的Docker容器日志，为空表示全部采集。
    @NameInMap("docker_include_label")
    public java.util.List<MapStringToStringEntity> dockerIncludeLabel;

    // 容器Label黑名单，不采集包含黑名单中Label的Docker容器日志，为空表示全部采集。
    @NameInMap("docker_exclude_label")
    public java.util.List<MapStringToStringEntity> dockerExcludeLabel;

    // 容器环境变量白名单，采集包含白名单中的环境变量的日志，为空表示全部采集。
    @NameInMap("docker_include_env")
    public java.util.List<MapStringToStringEntity> dockerIncludeEnv;

    // 容器环境变量黑名单，采集不包含黑名单中的环境变量的日志，为空表示全部采集。
    @NameInMap("docker_exclude_env")
    public java.util.List<MapStringToStringEntity> dockerExcludeEnv;

    // 完整正则/极简模式特有配置，日志内容提取结果的key列表。
    // 完整正则/极简模式 下 必填
    // 分隔符模式特有配置，日志内容提取结果的key列表。
    // 分隔符模式 下 必填
    @NameInMap("key")
    public java.util.List<String> key;

    // 完整正则/极简模式特有配置，行首正则表达式。
    // 完整正则/极简模式 下 非必填。
    // 飞天模式特有配置，行首正则表达式。
    // 飞天模式 下 非必填。
    @NameInMap("log_begin_regex")
    public String logBeginRegex;

    // 完整正则/极简模式特有配置，提取字段的正则表达式。
    // 完整正则/极简模式 下 非必填
    @NameInMap("regex")
    public String regex;

    // JSON模式特有配置，指定时间字段的key名称。
    // JSON模式 下 非必填。
    // 分隔符模式特有配置，指定时间字段key名称，必须在key列表里面。
    // 分割符模式 下 必填。
    @NameInMap("time_key")
    public String timeKey;

    // 分隔符模式特有配置，分隔符
    // 分隔符模式 下 非必填
    @NameInMap("separator")
    public String separator;

    // 分隔符模式特有配置，引用符。
    // 分隔符模式 下 必填
    @NameInMap("quote")
    public String quote;

    // 分隔符模式特有配置，当日志中实际的key数量大于配置的key数量时，是否自动扩展。
    // 分隔符模式 下 非必填。
    @NameInMap("auto_extend")
    public Boolean autoExtend;

    // 插件所需JSON对象字符串，具体请参见。
    @NameInMap("plugin")
    public String plugin;

    public static SLSConfigInputDetail build(java.util.Map<String, ?> map) throws Exception {
        SLSConfigInputDetail self = new SLSConfigInputDetail();
        return TeaModel.build(map, self);
    }

    public SLSConfigInputDetail setFilterKey(java.util.List<String> filterKey) {
        this.filterKey = filterKey;
        return this;
    }
    public java.util.List<String> getFilterKey() {
        return this.filterKey;
    }

    public SLSConfigInputDetail setFilterRegex(java.util.List<String> filterRegex) {
        this.filterRegex = filterRegex;
        return this;
    }
    public java.util.List<String> getFilterRegex() {
        return this.filterRegex;
    }

    public SLSConfigInputDetail setShardHashKey(java.util.List<String> shardHashKey) {
        this.shardHashKey = shardHashKey;
        return this;
    }
    public java.util.List<String> getShardHashKey() {
        return this.shardHashKey;
    }

    public SLSConfigInputDetail setEnableRawLog(Boolean enableRawLog) {
        this.enableRawLog = enableRawLog;
        return this;
    }
    public Boolean getEnableRawLog() {
        return this.enableRawLog;
    }

    public SLSConfigInputDetail setSensitiveKeys(java.util.List<SLSConfigSensitiveKey> sensitiveKeys) {
        this.sensitiveKeys = sensitiveKeys;
        return this;
    }
    public java.util.List<SLSConfigSensitiveKey> getSensitiveKeys() {
        return this.sensitiveKeys;
    }

    public SLSConfigInputDetail setMergeType(String mergeType) {
        this.mergeType = mergeType;
        return this;
    }
    public String getMergeType() {
        return this.mergeType;
    }

    public SLSConfigInputDetail setDelayAlarmBytes(Long delayAlarmBytes) {
        this.delayAlarmBytes = delayAlarmBytes;
        return this;
    }
    public Long getDelayAlarmBytes() {
        return this.delayAlarmBytes;
    }

    public SLSConfigInputDetail setAdjustTimezone(Boolean adjustTimezone) {
        this.adjustTimezone = adjustTimezone;
        return this;
    }
    public Boolean getAdjustTimezone() {
        return this.adjustTimezone;
    }

    public SLSConfigInputDetail setLogTimezone(String logTimezone) {
        this.logTimezone = logTimezone;
        return this;
    }
    public String getLogTimezone() {
        return this.logTimezone;
    }

    public SLSConfigInputDetail setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public SLSConfigInputDetail setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public SLSConfigInputDetail setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public SLSConfigInputDetail setFilePattern(String filePattern) {
        this.filePattern = filePattern;
        return this;
    }
    public String getFilePattern() {
        return this.filePattern;
    }

    public SLSConfigInputDetail setTopicFormat(String topicFormat) {
        this.topicFormat = topicFormat;
        return this;
    }
    public String getTopicFormat() {
        return this.topicFormat;
    }

    public SLSConfigInputDetail setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public SLSConfigInputDetail setPreserve(Boolean preserve) {
        this.preserve = preserve;
        return this;
    }
    public Boolean getPreserve() {
        return this.preserve;
    }

    public SLSConfigInputDetail setPreserveDepth(Long preserveDepth) {
        this.preserveDepth = preserveDepth;
        return this;
    }
    public Long getPreserveDepth() {
        return this.preserveDepth;
    }

    public SLSConfigInputDetail setFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
        return this;
    }
    public String getFileEncoding() {
        return this.fileEncoding;
    }

    public SLSConfigInputDetail setDiscardUnmatch(Boolean discardUnmatch) {
        this.discardUnmatch = discardUnmatch;
        return this;
    }
    public Boolean getDiscardUnmatch() {
        return this.discardUnmatch;
    }

    public SLSConfigInputDetail setMaxDepth(Long maxDepth) {
        this.maxDepth = maxDepth;
        return this;
    }
    public Long getMaxDepth() {
        return this.maxDepth;
    }

    public SLSConfigInputDetail setDelaySkipBytes(Long delaySkipBytes) {
        this.delaySkipBytes = delaySkipBytes;
        return this;
    }
    public Long getDelaySkipBytes() {
        return this.delaySkipBytes;
    }

    public SLSConfigInputDetail setDockerFile(Boolean dockerFile) {
        this.dockerFile = dockerFile;
        return this;
    }
    public Boolean getDockerFile() {
        return this.dockerFile;
    }

    public SLSConfigInputDetail setDockerIncludeLabel(java.util.List<MapStringToStringEntity> dockerIncludeLabel) {
        this.dockerIncludeLabel = dockerIncludeLabel;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getDockerIncludeLabel() {
        return this.dockerIncludeLabel;
    }

    public SLSConfigInputDetail setDockerExcludeLabel(java.util.List<MapStringToStringEntity> dockerExcludeLabel) {
        this.dockerExcludeLabel = dockerExcludeLabel;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getDockerExcludeLabel() {
        return this.dockerExcludeLabel;
    }

    public SLSConfigInputDetail setDockerIncludeEnv(java.util.List<MapStringToStringEntity> dockerIncludeEnv) {
        this.dockerIncludeEnv = dockerIncludeEnv;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getDockerIncludeEnv() {
        return this.dockerIncludeEnv;
    }

    public SLSConfigInputDetail setDockerExcludeEnv(java.util.List<MapStringToStringEntity> dockerExcludeEnv) {
        this.dockerExcludeEnv = dockerExcludeEnv;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getDockerExcludeEnv() {
        return this.dockerExcludeEnv;
    }

    public SLSConfigInputDetail setKey(java.util.List<String> key) {
        this.key = key;
        return this;
    }
    public java.util.List<String> getKey() {
        return this.key;
    }

    public SLSConfigInputDetail setLogBeginRegex(String logBeginRegex) {
        this.logBeginRegex = logBeginRegex;
        return this;
    }
    public String getLogBeginRegex() {
        return this.logBeginRegex;
    }

    public SLSConfigInputDetail setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public SLSConfigInputDetail setTimeKey(String timeKey) {
        this.timeKey = timeKey;
        return this;
    }
    public String getTimeKey() {
        return this.timeKey;
    }

    public SLSConfigInputDetail setSeparator(String separator) {
        this.separator = separator;
        return this;
    }
    public String getSeparator() {
        return this.separator;
    }

    public SLSConfigInputDetail setQuote(String quote) {
        this.quote = quote;
        return this;
    }
    public String getQuote() {
        return this.quote;
    }

    public SLSConfigInputDetail setAutoExtend(Boolean autoExtend) {
        this.autoExtend = autoExtend;
        return this;
    }
    public Boolean getAutoExtend() {
        return this.autoExtend;
    }

    public SLSConfigInputDetail setPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }
    public String getPlugin() {
        return this.plugin;
    }

}
