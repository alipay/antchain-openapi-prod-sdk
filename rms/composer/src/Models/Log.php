<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Log extends Model
{
    // 应用名列表
    /**
     * @example
     *
     * @var string[]
     */
    public $apps;

    // 采集日志文件
    /**
     * @example /home/admin/logs/test.log
     *
     * @var string
     */
    public $path;

    // 日志编码
    /**
     * @example UTF-8
     *
     * @var string
     */
    public $charset;

    // 日志限制流量，单位KB/min
    /**
     * @example 5
     *
     * @var int
     */
    public $agentLimitKB;

    // 日志路径软连接描述
    /**
     * @example /home/admin/logs
     *
     * @var string
     */
    public $symlinkPath;
    protected $_name = [
        'apps'         => 'apps',
        'path'         => 'path',
        'charset'      => 'charset',
        'agentLimitKB' => 'agent_limit_k_b',
        'symlinkPath'  => 'symlink_path',
    ];

    public function validate()
    {
        Model::validateRequired('apps', $this->apps, true);
        Model::validateRequired('path', $this->path, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apps) {
            $res['apps'] = $this->apps;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->charset) {
            $res['charset'] = $this->charset;
        }
        if (null !== $this->agentLimitKB) {
            $res['agent_limit_k_b'] = $this->agentLimitKB;
        }
        if (null !== $this->symlinkPath) {
            $res['symlink_path'] = $this->symlinkPath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Log
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = $map['apps'];
            }
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['charset'])) {
            $model->charset = $map['charset'];
        }
        if (isset($map['agent_limit_k_b'])) {
            $model->agentLimitKB = $map['agent_limit_k_b'];
        }
        if (isset($map['symlink_path'])) {
            $model->symlinkPath = $map['symlink_path'];
        }

        return $model;
    }
}
