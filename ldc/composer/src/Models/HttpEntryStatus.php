<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HttpEntryStatus extends Model
{
    // 此entry分配到的spanner后端端口（l7 listener 端口）
    /**
     * @example 4001
     *
     * @var int
     */
    public $backendPort;

    // 此entry对应service分配到的节点端口
    /**
     * @example 34567
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
     * @return HttpEntryStatus
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
