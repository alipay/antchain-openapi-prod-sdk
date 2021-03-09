// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 阿里云日志服务(SLS)-日志配置-输入类型配置
    public class SLSConfigInputDetail : TeaModel {
        // 用于过滤日志的key，只有key的值满足对应filterRegex列中设定的正则表达式，该日志数据才会被采集。
        [NameInMap("filter_key")]
        [Validation(Required=false)]
        public List<string> FilterKey { get; set; }

        // 与filterKey对应的正则表达式， filterRegex的长度和filterKey的长度必须相同。
        [NameInMap("filter_regex")]
        [Validation(Required=false)]
        public List<string> FilterRegex { get; set; }

        // 数据写入的模式。默认按照写入，开启后按照写入。支持的值包括 __topic__，__hostname__, __source__。
        [NameInMap("shard_hash_key")]
        [Validation(Required=false)]
        public List<string> ShardHashKey { get; set; }

        // 是否上传原始日志。
        [NameInMap("enable_raw_log")]
        [Validation(Required=false)]
        public bool? EnableRawLog { get; set; }

        // 脱敏功能配置，类型为数组
        [NameInMap("sensitive_keys")]
        [Validation(Required=false)]
        public List<SLSConfigSensitiveKey> SensitiveKeys { get; set; }

        // 聚合方式，默认为topic，表示按照Topic方式聚合。支持的值为 topic、logstore。
        [NameInMap("merge_type")]
        [Validation(Required=false)]
        public string MergeType { get; set; }

        // 采集进度落后的告警阈值，默认为209715200，即200MB。
        [NameInMap("delay_alarm_bytes")]
        [Validation(Required=false)]
        public long? DelayAlarmBytes { get; set; }

        // 是否调整日志时区，仅在配置时间解析的情况下使用。
        [NameInMap("adjust_timezone")]
        [Validation(Required=false)]
        public bool? AdjustTimezone { get; set; }

        // 时区偏移量，例如日志时间为东八区，则该值为GMT+08:00
        [NameInMap("log_timezone")]
        [Validation(Required=false)]
        public string LogTimezone { get; set; }

        // 日志发送优先级，默认为0，若需设置为高优先级，则设置为1。
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // 日志的采集模式。如果Logtail配置参数inputType选择为file，则该参数为必填项。目前可选：
        // json_log：JSON模式。
        // apsara_log：飞天模式。
        // common_reg_log：完整正则模式。
        // delimiter_log：分隔符模式。
        [NameInMap("log_type")]
        [Validation(Required=true)]
        public string LogType { get; set; }

        // 日志所在的父目录，例如/var/logs/。
        [NameInMap("log_path")]
        [Validation(Required=true)]
        public string LogPath { get; set; }

        // 日志文件的Pattern，例如access*.log。
        [NameInMap("file_pattern")]
        [Validation(Required=true)]
        public string FilePattern { get; set; }

        // Topic生成方式，支持以下四种类型：
        // none，表示topic为空。
        // default，表示将日志文件路径作为topic。
        // group_topic，表示将应用该配置的机器组topic属性作为topic。
        // 也可以将日志文件路径的某一部分作为topic，如/var/log/(.*).log。
        [NameInMap("topic_format")]
        [Validation(Required=true)]
        public string TopicFormat { get; set; }

        // 日志时间格式，如%Y/%m/%d %H:%M:%S。
        [NameInMap("time_format")]
        [Validation(Required=false)]
        public string TimeFormat { get; set; }

        // 监控目录超时设置。默认为true，代表监控目录永不超时，false代表监控目录超过30分钟则超时。
        [NameInMap("preserve")]
        [Validation(Required=false)]
        public bool? Preserve { get; set; }

        // 当设置preserve为false时，指定监控不超时目录的深度，最大深度支持3。
        [NameInMap("preserve_depth")]
        [Validation(Required=false)]
        public long? PreserveDepth { get; set; }

        // 支持两种类型：utf8、gbk
        [NameInMap("file_encoding")]
        [Validation(Required=false)]
        public string FileEncoding { get; set; }

        // 是否丢弃匹配失败的日志。
        [NameInMap("discard_unmatch")]
        [Validation(Required=false)]
        public bool? DiscardUnmatch { get; set; }

        // 最大目录监控深度范围0-1000，0代表只监控本层目录。
        [NameInMap("max_depth")]
        [Validation(Required=false)]
        public long? MaxDepth { get; set; }

        // 采集落后时是否丢弃落后数据的阈值，默认为0，即不丢弃。当采集落后超过该值时，则直接丢弃落后的数据
        [NameInMap("delay_skip_bytes")]
        [Validation(Required=false)]
        public long? DelaySkipBytes { get; set; }

        // 采集的目标文件是否为容器内文件，默认为false。
        [NameInMap("docker_file")]
        [Validation(Required=false)]
        public bool? DockerFile { get; set; }

        // 容器Label白名单，采集包含白名单中Label的Docker容器日志，为空表示全部采集。
        [NameInMap("docker_include_label")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> DockerIncludeLabel { get; set; }

        // 容器Label黑名单，不采集包含黑名单中Label的Docker容器日志，为空表示全部采集。
        [NameInMap("docker_exclude_label")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> DockerExcludeLabel { get; set; }

        // 容器环境变量白名单，采集包含白名单中的环境变量的日志，为空表示全部采集。
        [NameInMap("docker_include_env")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> DockerIncludeEnv { get; set; }

        // 容器环境变量黑名单，采集不包含黑名单中的环境变量的日志，为空表示全部采集。
        [NameInMap("docker_exclude_env")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> DockerExcludeEnv { get; set; }

        // 完整正则/极简模式特有配置，日志内容提取结果的key列表。
        // 完整正则/极简模式 下 必填
        // 分隔符模式特有配置，日志内容提取结果的key列表。
        // 分隔符模式 下 必填
        [NameInMap("key")]
        [Validation(Required=false)]
        public List<string> Key { get; set; }

        // 完整正则/极简模式特有配置，行首正则表达式。
        // 完整正则/极简模式 下 非必填。
        // 飞天模式特有配置，行首正则表达式。
        // 飞天模式 下 非必填。
        [NameInMap("log_begin_regex")]
        [Validation(Required=false)]
        public string LogBeginRegex { get; set; }

        // 完整正则/极简模式特有配置，提取字段的正则表达式。
        // 完整正则/极简模式 下 非必填
        [NameInMap("regex")]
        [Validation(Required=false)]
        public string Regex { get; set; }

        // JSON模式特有配置，指定时间字段的key名称。
        // JSON模式 下 非必填。
        // 分隔符模式特有配置，指定时间字段key名称，必须在key列表里面。
        // 分割符模式 下 必填。
        [NameInMap("time_key")]
        [Validation(Required=false)]
        public string TimeKey { get; set; }

        // 分隔符模式特有配置，分隔符
        // 分隔符模式 下 非必填
        [NameInMap("separator")]
        [Validation(Required=false)]
        public string Separator { get; set; }

        // 分隔符模式特有配置，引用符。
        // 分隔符模式 下 必填
        [NameInMap("quote")]
        [Validation(Required=false)]
        public string Quote { get; set; }

        // 分隔符模式特有配置，当日志中实际的key数量大于配置的key数量时，是否自动扩展。
        // 分隔符模式 下 非必填。
        [NameInMap("auto_extend")]
        [Validation(Required=false)]
        public bool? AutoExtend { get; set; }

        // 插件所需JSON对象字符串，具体请参见。
        [NameInMap("plugin")]
        [Validation(Required=false)]
        public string Plugin { get; set; }

    }

}
