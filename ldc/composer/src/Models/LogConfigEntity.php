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
    protected $_name = [
        'configName'   => 'config_name',
        'inputType'    => 'input_type',
        'logstoreName' => 'logstore_name',
        'logPath'      => 'log_path',
        'filePattern'  => 'file_pattern',
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

        return $model;
    }
}
