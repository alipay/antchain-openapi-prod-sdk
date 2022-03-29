<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XPrometheusQuery extends Model
{
    /**
     * @example
     *
     * @var int
     */
    public $port;

    /**
     * @example
     *
     * @var string
     */
    public $ip;

    /**
     * @example /metrics
     *
     * @var string
     */
    public $path;

    /**
     * @example
     *
     * @var XTarget
     */
    public $target;
    protected $_name = [
        'port'   => 'port',
        'ip'     => 'ip',
        'path'   => 'path',
        'target' => 'target',
    ];

    public function validate()
    {
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('path', $this->path, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->target) {
            $res['target'] = null !== $this->target ? $this->target->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XPrometheusQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['target'])) {
            $model->target = XTarget::fromMap($map['target']);
        }

        return $model;
    }
}
