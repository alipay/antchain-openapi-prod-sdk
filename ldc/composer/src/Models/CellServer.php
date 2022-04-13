<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CellServer extends Model
{
    // 单元名字
    /**
     * @example gz00c
     *
     * @var string
     */
    public $cell;

    // server或pod组
    /**
     * @example ["huanyu-40-5001", "huanyu-40-5002"]
     *
     * @var string[]
     */
    public $servers;

    // cell中host的数量
    /**
     * @example 3
     *
     * @var int
     */
    public $count;

    // servers列表对应的服务器/pod ip地址列表，目前仅在antcloud.ldc.opsplan.stages.export方法中返回
    /**
     * @example []
     *
     * @var string[]
     */
    public $serverIps;
    protected $_name = [
        'cell'      => 'cell',
        'servers'   => 'servers',
        'count'     => 'count',
        'serverIps' => 'server_ips',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->servers) {
            $res['servers'] = $this->servers;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->serverIps) {
            $res['server_ips'] = $this->serverIps;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellServer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['servers'])) {
            if (!empty($map['servers'])) {
                $model->servers = $map['servers'];
            }
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['server_ips'])) {
            if (!empty($map['server_ips'])) {
                $model->serverIps = $map['server_ips'];
            }
        }

        return $model;
    }
}
