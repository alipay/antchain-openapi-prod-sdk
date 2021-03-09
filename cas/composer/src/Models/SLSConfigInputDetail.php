<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SLSConfigInputDetail extends Model
{
    // 用于过滤日志的key，只有key的值满足对应filterRegex列中设定的正则表达式，该日志数据才会被采集。
    /**
     * @example key1
     *
     * @var string[]
     */
    public $filterKey;

    // 与filterKey对应的正则表达式， filterRegex的长度和filterKey的长度必须相同。
    /**
     * @example regex1
     *
     * @var string[]
     */
    public $filterRegex;

    // 数据写入的模式。默认按照写入，开启后按照写入。支持的值包括 __topic__，__hostname__, __source__。
    /**
     * @example __topic__，__hostname__, __source__。
     *
     * @var string[]
     */
    public $shardHashKey;

    // 是否上传原始日志。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableRawLog;

    // 脱敏功能配置，类型为数组
    /**
     * @example
     *
     * @var SLSConfigSensitiveKey[]
     */
    public $sensitiveKeys;

    // 聚合方式，默认为topic，表示按照Topic方式聚合。支持的值为 topic、logstore。
    /**
     * @example topic, logstore
     *
     * @var string
     */
    public $mergeType;

    // 采集进度落后的告警阈值，默认为209715200，即200MB。
    /**
     * @example 209715200
     *
     * @var int
     */
    public $delayAlarmBytes;

    // 是否调整日志时区，仅在配置时间解析的情况下使用。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $adjustTimezone;

    // 时区偏移量，例如日志时间为东八区，则该值为GMT+08:00
    /**
     * @example GMT+08:00
     *
     * @var string
     */
    public $logTimezone;

    // 日志发送优先级，默认为0，若需设置为高优先级，则设置为1。
    /**
     * @example 0
     *
     * @var int
     */
    public $priority;

    // 日志的采集模式。如果Logtail配置参数inputType选择为file，则该参数为必填项。目前可选：
    // json_log：JSON模式。
    // apsara_log：飞天模式。
    // common_reg_log：完整正则模式。
    // delimiter_log：分隔符模式。
    /**
     * @example json_log, apsara_log, common_reg_log, delimiter_log
     *
     * @var string
     */
    public $logType;

    // 日志所在的父目录，例如/var/logs/。
    /**
     * @example /var/logs/
     *
     * @var string
     */
    public $logPath;

    // 日志文件的Pattern，例如access*.log。
    /**
     * @example access*.log
     *
     * @var string
     */
    public $filePattern;

    // Topic生成方式，支持以下四种类型：
    // none，表示topic为空。
    // default，表示将日志文件路径作为topic。
    // group_topic，表示将应用该配置的机器组topic属性作为topic。
    // 也可以将日志文件路径的某一部分作为topic，如/var/log/(.*).log。
    /**
     * @example none, default, group_topic, /var/log/(.*).log...
     *
     * @var string
     */
    public $topicFormat;

    // 日志时间格式，如%Y/%m/%d %H:%M:%S。
    /**
     * @example %Y/%m/%d %H:%M:%S
     *
     * @var string
     */
    public $timeFormat;

    // 监控目录超时设置。默认为true，代表监控目录永不超时，false代表监控目录超过30分钟则超时。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $preserve;

    // 当设置preserve为false时，指定监控不超时目录的深度，最大深度支持3。
    /**
     * @example 3
     *
     * @var int
     */
    public $preserveDepth;

    // 支持两种类型：utf8、gbk
    /**
     * @example utf8, gbk
     *
     * @var string
     */
    public $fileEncoding;

    // 是否丢弃匹配失败的日志。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $discardUnmatch;

    // 最大目录监控深度范围0-1000，0代表只监控本层目录。
    /**
     * @example 0
     *
     * @var int
     */
    public $maxDepth;

    // 采集落后时是否丢弃落后数据的阈值，默认为0，即不丢弃。当采集落后超过该值时，则直接丢弃落后的数据
    /**
     * @example 0
     *
     * @var int
     */
    public $delaySkipBytes;

    // 采集的目标文件是否为容器内文件，默认为false。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $dockerFile;

    // 容器Label白名单，采集包含白名单中Label的Docker容器日志，为空表示全部采集。
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $dockerIncludeLabel;

    // 容器Label黑名单，不采集包含黑名单中Label的Docker容器日志，为空表示全部采集。
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $dockerExcludeLabel;

    // 容器环境变量白名单，采集包含白名单中的环境变量的日志，为空表示全部采集。
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $dockerIncludeEnv;

    // 容器环境变量黑名单，采集不包含黑名单中的环境变量的日志，为空表示全部采集。
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $dockerExcludeEnv;

    // 完整正则/极简模式特有配置，日志内容提取结果的key列表。
    // 完整正则/极简模式 下 必填
    // 分隔符模式特有配置，日志内容提取结果的key列表。
    // 分隔符模式 下 必填
    /**
     * @example ["content"]
     *
     * @var string[]
     */
    public $key;

    // 完整正则/极简模式特有配置，行首正则表达式。
    // 完整正则/极简模式 下 非必填。
    // 飞天模式特有配置，行首正则表达式。
    // 飞天模式 下 非必填。
    /**
     * @example .*
     *
     * @var string
     */
    public $logBeginRegex;

    // 完整正则/极简模式特有配置，提取字段的正则表达式。
    // 完整正则/极简模式 下 非必填
    /**
     * @example (.*)
     *
     * @var string
     */
    public $regex;

    // JSON模式特有配置，指定时间字段的key名称。
    // JSON模式 下 非必填。
    // 分隔符模式特有配置，指定时间字段key名称，必须在key列表里面。
    // 分割符模式 下 必填。
    /**
     * @example key
     *
     * @var string
     */
    public $timeKey;

    // 分隔符模式特有配置，分隔符
    // 分隔符模式 下 非必填
    /**
     * @example ,
     *
     * @var string
     */
    public $separator;

    // 分隔符模式特有配置，引用符。
    // 分隔符模式 下 必填
    /**
     * @example "
     *
     * @var string
     */
    public $quote;

    // 分隔符模式特有配置，当日志中实际的key数量大于配置的key数量时，是否自动扩展。
    // 分隔符模式 下 非必填。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $autoExtend;

    // 插件所需JSON对象字符串，具体请参见。
    /**
     * @example {"xxx":"xxx"}
     *
     * @var string
     */
    public $plugin;
    protected $_name = [
        'filterKey'          => 'filter_key',
        'filterRegex'        => 'filter_regex',
        'shardHashKey'       => 'shard_hash_key',
        'enableRawLog'       => 'enable_raw_log',
        'sensitiveKeys'      => 'sensitive_keys',
        'mergeType'          => 'merge_type',
        'delayAlarmBytes'    => 'delay_alarm_bytes',
        'adjustTimezone'     => 'adjust_timezone',
        'logTimezone'        => 'log_timezone',
        'priority'           => 'priority',
        'logType'            => 'log_type',
        'logPath'            => 'log_path',
        'filePattern'        => 'file_pattern',
        'topicFormat'        => 'topic_format',
        'timeFormat'         => 'time_format',
        'preserve'           => 'preserve',
        'preserveDepth'      => 'preserve_depth',
        'fileEncoding'       => 'file_encoding',
        'discardUnmatch'     => 'discard_unmatch',
        'maxDepth'           => 'max_depth',
        'delaySkipBytes'     => 'delay_skip_bytes',
        'dockerFile'         => 'docker_file',
        'dockerIncludeLabel' => 'docker_include_label',
        'dockerExcludeLabel' => 'docker_exclude_label',
        'dockerIncludeEnv'   => 'docker_include_env',
        'dockerExcludeEnv'   => 'docker_exclude_env',
        'key'                => 'key',
        'logBeginRegex'      => 'log_begin_regex',
        'regex'              => 'regex',
        'timeKey'            => 'time_key',
        'separator'          => 'separator',
        'quote'              => 'quote',
        'autoExtend'         => 'auto_extend',
        'plugin'             => 'plugin',
    ];

    public function validate()
    {
        Model::validateRequired('logType', $this->logType, true);
        Model::validateRequired('logPath', $this->logPath, true);
        Model::validateRequired('filePattern', $this->filePattern, true);
        Model::validateRequired('topicFormat', $this->topicFormat, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->filterKey) {
            $res['filter_key'] = $this->filterKey;
        }
        if (null !== $this->filterRegex) {
            $res['filter_regex'] = $this->filterRegex;
        }
        if (null !== $this->shardHashKey) {
            $res['shard_hash_key'] = $this->shardHashKey;
        }
        if (null !== $this->enableRawLog) {
            $res['enable_raw_log'] = $this->enableRawLog;
        }
        if (null !== $this->sensitiveKeys) {
            $res['sensitive_keys'] = [];
            if (null !== $this->sensitiveKeys && \is_array($this->sensitiveKeys)) {
                $n = 0;
                foreach ($this->sensitiveKeys as $item) {
                    $res['sensitive_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->mergeType) {
            $res['merge_type'] = $this->mergeType;
        }
        if (null !== $this->delayAlarmBytes) {
            $res['delay_alarm_bytes'] = $this->delayAlarmBytes;
        }
        if (null !== $this->adjustTimezone) {
            $res['adjust_timezone'] = $this->adjustTimezone;
        }
        if (null !== $this->logTimezone) {
            $res['log_timezone'] = $this->logTimezone;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->logType) {
            $res['log_type'] = $this->logType;
        }
        if (null !== $this->logPath) {
            $res['log_path'] = $this->logPath;
        }
        if (null !== $this->filePattern) {
            $res['file_pattern'] = $this->filePattern;
        }
        if (null !== $this->topicFormat) {
            $res['topic_format'] = $this->topicFormat;
        }
        if (null !== $this->timeFormat) {
            $res['time_format'] = $this->timeFormat;
        }
        if (null !== $this->preserve) {
            $res['preserve'] = $this->preserve;
        }
        if (null !== $this->preserveDepth) {
            $res['preserve_depth'] = $this->preserveDepth;
        }
        if (null !== $this->fileEncoding) {
            $res['file_encoding'] = $this->fileEncoding;
        }
        if (null !== $this->discardUnmatch) {
            $res['discard_unmatch'] = $this->discardUnmatch;
        }
        if (null !== $this->maxDepth) {
            $res['max_depth'] = $this->maxDepth;
        }
        if (null !== $this->delaySkipBytes) {
            $res['delay_skip_bytes'] = $this->delaySkipBytes;
        }
        if (null !== $this->dockerFile) {
            $res['docker_file'] = $this->dockerFile;
        }
        if (null !== $this->dockerIncludeLabel) {
            $res['docker_include_label'] = [];
            if (null !== $this->dockerIncludeLabel && \is_array($this->dockerIncludeLabel)) {
                $n = 0;
                foreach ($this->dockerIncludeLabel as $item) {
                    $res['docker_include_label'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dockerExcludeLabel) {
            $res['docker_exclude_label'] = [];
            if (null !== $this->dockerExcludeLabel && \is_array($this->dockerExcludeLabel)) {
                $n = 0;
                foreach ($this->dockerExcludeLabel as $item) {
                    $res['docker_exclude_label'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dockerIncludeEnv) {
            $res['docker_include_env'] = [];
            if (null !== $this->dockerIncludeEnv && \is_array($this->dockerIncludeEnv)) {
                $n = 0;
                foreach ($this->dockerIncludeEnv as $item) {
                    $res['docker_include_env'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dockerExcludeEnv) {
            $res['docker_exclude_env'] = [];
            if (null !== $this->dockerExcludeEnv && \is_array($this->dockerExcludeEnv)) {
                $n = 0;
                foreach ($this->dockerExcludeEnv as $item) {
                    $res['docker_exclude_env'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->logBeginRegex) {
            $res['log_begin_regex'] = $this->logBeginRegex;
        }
        if (null !== $this->regex) {
            $res['regex'] = $this->regex;
        }
        if (null !== $this->timeKey) {
            $res['time_key'] = $this->timeKey;
        }
        if (null !== $this->separator) {
            $res['separator'] = $this->separator;
        }
        if (null !== $this->quote) {
            $res['quote'] = $this->quote;
        }
        if (null !== $this->autoExtend) {
            $res['auto_extend'] = $this->autoExtend;
        }
        if (null !== $this->plugin) {
            $res['plugin'] = $this->plugin;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SLSConfigInputDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['filter_key'])) {
            if (!empty($map['filter_key'])) {
                $model->filterKey = $map['filter_key'];
            }
        }
        if (isset($map['filter_regex'])) {
            if (!empty($map['filter_regex'])) {
                $model->filterRegex = $map['filter_regex'];
            }
        }
        if (isset($map['shard_hash_key'])) {
            if (!empty($map['shard_hash_key'])) {
                $model->shardHashKey = $map['shard_hash_key'];
            }
        }
        if (isset($map['enable_raw_log'])) {
            $model->enableRawLog = $map['enable_raw_log'];
        }
        if (isset($map['sensitive_keys'])) {
            if (!empty($map['sensitive_keys'])) {
                $model->sensitiveKeys = [];
                $n                    = 0;
                foreach ($map['sensitive_keys'] as $item) {
                    $model->sensitiveKeys[$n++] = null !== $item ? SLSConfigSensitiveKey::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['merge_type'])) {
            $model->mergeType = $map['merge_type'];
        }
        if (isset($map['delay_alarm_bytes'])) {
            $model->delayAlarmBytes = $map['delay_alarm_bytes'];
        }
        if (isset($map['adjust_timezone'])) {
            $model->adjustTimezone = $map['adjust_timezone'];
        }
        if (isset($map['log_timezone'])) {
            $model->logTimezone = $map['log_timezone'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['log_type'])) {
            $model->logType = $map['log_type'];
        }
        if (isset($map['log_path'])) {
            $model->logPath = $map['log_path'];
        }
        if (isset($map['file_pattern'])) {
            $model->filePattern = $map['file_pattern'];
        }
        if (isset($map['topic_format'])) {
            $model->topicFormat = $map['topic_format'];
        }
        if (isset($map['time_format'])) {
            $model->timeFormat = $map['time_format'];
        }
        if (isset($map['preserve'])) {
            $model->preserve = $map['preserve'];
        }
        if (isset($map['preserve_depth'])) {
            $model->preserveDepth = $map['preserve_depth'];
        }
        if (isset($map['file_encoding'])) {
            $model->fileEncoding = $map['file_encoding'];
        }
        if (isset($map['discard_unmatch'])) {
            $model->discardUnmatch = $map['discard_unmatch'];
        }
        if (isset($map['max_depth'])) {
            $model->maxDepth = $map['max_depth'];
        }
        if (isset($map['delay_skip_bytes'])) {
            $model->delaySkipBytes = $map['delay_skip_bytes'];
        }
        if (isset($map['docker_file'])) {
            $model->dockerFile = $map['docker_file'];
        }
        if (isset($map['docker_include_label'])) {
            if (!empty($map['docker_include_label'])) {
                $model->dockerIncludeLabel = [];
                $n                         = 0;
                foreach ($map['docker_include_label'] as $item) {
                    $model->dockerIncludeLabel[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['docker_exclude_label'])) {
            if (!empty($map['docker_exclude_label'])) {
                $model->dockerExcludeLabel = [];
                $n                         = 0;
                foreach ($map['docker_exclude_label'] as $item) {
                    $model->dockerExcludeLabel[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['docker_include_env'])) {
            if (!empty($map['docker_include_env'])) {
                $model->dockerIncludeEnv = [];
                $n                       = 0;
                foreach ($map['docker_include_env'] as $item) {
                    $model->dockerIncludeEnv[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['docker_exclude_env'])) {
            if (!empty($map['docker_exclude_env'])) {
                $model->dockerExcludeEnv = [];
                $n                       = 0;
                foreach ($map['docker_exclude_env'] as $item) {
                    $model->dockerExcludeEnv[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['key'])) {
            if (!empty($map['key'])) {
                $model->key = $map['key'];
            }
        }
        if (isset($map['log_begin_regex'])) {
            $model->logBeginRegex = $map['log_begin_regex'];
        }
        if (isset($map['regex'])) {
            $model->regex = $map['regex'];
        }
        if (isset($map['time_key'])) {
            $model->timeKey = $map['time_key'];
        }
        if (isset($map['separator'])) {
            $model->separator = $map['separator'];
        }
        if (isset($map['quote'])) {
            $model->quote = $map['quote'];
        }
        if (isset($map['auto_extend'])) {
            $model->autoExtend = $map['auto_extend'];
        }
        if (isset($map['plugin'])) {
            $model->plugin = $map['plugin'];
        }

        return $model;
    }
}
