<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NFSVolumeSource extends Model
{
    // 挂载路径
    /**
     * @example /home/admin/logs/
     *
     * @var string
     */
    public $path;

    // NFS 服务端地址
    /**
     * @example 192.168.8.120
     *
     * @var string
     */
    public $server;
    protected $_name = [
        'path'   => 'path',
        'server' => 'server',
    ];

    public function validate()
    {
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('server', $this->server, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->server) {
            $res['server'] = $this->server;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NFSVolumeSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['server'])) {
            $model->server = $map['server'];
        }

        return $model;
    }
}
