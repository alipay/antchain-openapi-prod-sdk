<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LogConfigEntity extends Model
{
    // 配置名称
    /**
     * @example sample-logtail-config
     *
     * @var string
     */
    public $configName;

    // 输入类型
    /**
     * @example file
     *
     * @var string
     */
    public $inputType;

    // 日志库名称
    /**
     * @example sls-test-logstore
     *
     * @var string
     */
    public $logstoreName;

    // 日志目录
    /**
     * @example /var/log/httpd/
     *
     * @var string
     */
    public $logPath;

    // file_pattern
    /**
     * @example *
     *
     * @var string
     */
    public $filePattern;

    // log_sample
    /**
     * @example log_sample
     *
     * @var string
     */
    public $logSample;

    // logBeginRegex
    /**
     * @example logBeginRegex
     *
     * @var string
     */
    public $logBeginRegex;

    // regex
    /**
     * @example regex
     *
     * @var string
     */
    public $regex;

    // op不支持map，请传入一个可以序列化成map的字符串
    /**
     * @example {"a":"b"}
     *
     * @var string
     */
    public $dockerIncludeLabel;

    // OP不支持map，请传入一个可以序列化的JSON
    /**
     * @example {"a":"b"}
     *
     * @var string
     */
    public $dockerExcludeLabel;

    // file_path_blacklist
    /**
     * @example
     *
     * @var string[]
     */
    public $filePathBlacklist;

    // 正则表达式必填，用于提取内容
    /**
     * @example ["time","he"]
     *
     * @var string[]
     */
    public $key;
    protected $_name = [
        'configName'         => 'config_name',
        'inputType'          => 'input_type',
        'logstoreName'       => 'logstore_name',
        'logPath'            => 'log_path',
        'filePattern'        => 'file_pattern',
        'logSample'          => 'log_sample',
        'logBeginRegex'      => 'log_begin_regex',
        'regex'              => 'regex',
        'dockerIncludeLabel' => 'docker_include_label',
        'dockerExcludeLabel' => 'docker_exclude_label',
        'filePathBlacklist'  => 'file_path_blacklist',
        'key'                => 'key',
    ];

    public function validate()
    {
        Model::validateRequired('configName', $this->configName, true);
        Model::validateRequired('inputType', $this->inputType, true);
        Model::validateRequired('logstoreName', $this->logstoreName, true);
        Model::validateRequired('logPath', $this->logPath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->configName) {
            $res['config_name'] = $this->configName;
        }
        if (null !== $this->inputType) {
            $res['input_type'] = $this->inputType;
        }
        if (null !== $this->logstoreName) {
            $res['logstore_name'] = $this->logstoreName;
        }
        if (null !== $this->logPath) {
            $res['log_path'] = $this->logPath;
        }
        if (null !== $this->filePattern) {
            $res['file_pattern'] = $this->filePattern;
        }
        if (null !== $this->logSample) {
            $res['log_sample'] = $this->logSample;
        }
        if (null !== $this->logBeginRegex) {
            $res['log_begin_regex'] = $this->logBeginRegex;
        }
        if (null !== $this->regex) {
            $res['regex'] = $this->regex;
        }
        if (null !== $this->dockerIncludeLabel) {
            $res['docker_include_label'] = $this->dockerIncludeLabel;
        }
        if (null !== $this->dockerExcludeLabel) {
            $res['docker_exclude_label'] = $this->dockerExcludeLabel;
        }
        if (null !== $this->filePathBlacklist) {
            $res['file_path_blacklist'] = $this->filePathBlacklist;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LogConfigEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['config_name'])) {
            $model->configName = $map['config_name'];
        }
        if (isset($map['input_type'])) {
            $model->inputType = $map['input_type'];
        }
        if (isset($map['logstore_name'])) {
            $model->logstoreName = $map['logstore_name'];
        }
        if (isset($map['log_path'])) {
            $model->logPath = $map['log_path'];
        }
        if (isset($map['file_pattern'])) {
            $model->filePattern = $map['file_pattern'];
        }
        if (isset($map['log_sample'])) {
            $model->logSample = $map['log_sample'];
        }
        if (isset($map['log_begin_regex'])) {
            $model->logBeginRegex = $map['log_begin_regex'];
        }
        if (isset($map['regex'])) {
            $model->regex = $map['regex'];
        }
        if (isset($map['docker_include_label'])) {
            $model->dockerIncludeLabel = $map['docker_include_label'];
        }
        if (isset($map['docker_exclude_label'])) {
            $model->dockerExcludeLabel = $map['docker_exclude_label'];
        }
        if (isset($map['file_path_blacklist'])) {
            if (!empty($map['file_path_blacklist'])) {
                $model->filePathBlacklist = $map['file_path_blacklist'];
            }
        }
        if (isset($map['key'])) {
            if (!empty($map['key'])) {
                $model->key = $map['key'];
            }
        }

        return $model;
    }
}
