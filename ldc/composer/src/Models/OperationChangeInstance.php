<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OperationChangeInstance extends Model
{
    // 主机名
    /**
     * @example app-0.domain.alipay.net
     *
     * @var string
     */
    public $hostname;

    // 部署单元
    /**
     * @example RZ01A
     *
     * @var string
     */
    public $cell;

    // ip
    /**
     * @example 11.11.11.11
     *
     * @var string
     */
    public $ip;

    // 资源ID
    /**
     * @example 12345
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'hostname' => 'hostname',
        'cell'     => 'cell',
        'ip'       => 'ip',
        'id'       => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperationChangeInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
