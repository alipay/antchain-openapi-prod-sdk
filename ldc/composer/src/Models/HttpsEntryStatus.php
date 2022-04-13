<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HttpsEntryStatus extends Model
{
    // 统一接入实例https entry分配到的spanner 后端端口
    /**
     * @example 4002
     *
     * @var int
     */
    public $backendPort;

    // 统一接入实例对应的service分配到的节点端口
    /**
     * @example 34568
     *
     * @var int
     */
    public $nodePort;
    protected $_name = [
        'backendPort' => 'backend_port',
        'nodePort'    => 'node_port',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->backendPort) {
            $res['backend_port'] = $this->backendPort;
        }
        if (null !== $this->nodePort) {
            $res['node_port'] = $this->nodePort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HttpsEntryStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['backend_port'])) {
            $model->backendPort = $map['backend_port'];
        }
        if (isset($map['node_port'])) {
            $model->nodePort = $map['node_port'];
        }

        return $model;
    }
}
