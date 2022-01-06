<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyNodeModel extends Model
{
    // ip地址
    /**
     * @example 127.0.0.0
     *
     * @var string
     */
    public $ip;

    // 节点类型
    /**
     * @example CONTAINER
     *
     * @var string
     */
    public $nodeType;

    // 节点ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;
    protected $_name = [
        'ip'       => 'ip',
        'nodeType' => 'node_type',
        'id'       => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyNodeModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
