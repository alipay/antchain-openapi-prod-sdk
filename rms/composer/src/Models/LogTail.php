<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class LogTail extends Model
{
    // 代理IP
    /**
     * @example 11.124.63.126
     *
     * @var string
     */
    public $agent;

    // 应用名
    /**
     * @example RMS-monitorprod
     *
     * @var string
     */
    public $app;

    // 日志行数据
    /**
     * @example [""]
     *
     * @var string[]
     */
    public $lines;

    // collectId
    /**
     * @example 100.88.106.208
     *
     * @var string
     */
    public $nc;
    protected $_name = [
        'agent' => 'agent',
        'app'   => 'app',
        'lines' => 'lines',
        'nc'    => 'nc',
    ];

    public function validate()
    {
        Model::validateRequired('agent', $this->agent, true);
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('lines', $this->lines, true);
        Model::validateRequired('nc', $this->nc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agent) {
            $res['agent'] = $this->agent;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->lines) {
            $res['lines'] = $this->lines;
        }
        if (null !== $this->nc) {
            $res['nc'] = $this->nc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LogTail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agent'])) {
            $model->agent = $map['agent'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['lines'])) {
            if (!empty($map['lines'])) {
                $model->lines = $map['lines'];
            }
        }
        if (isset($map['nc'])) {
            $model->nc = $map['nc'];
        }

        return $model;
    }
}
