<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TopologyNode extends Model
{
    // 应用名
    /**
     * @example web
     *
     * @var string
     */
    public $app;

    // 节点类型: APP DB MQ CACHE
    /**
     * @example APP
     *
     * @var string
     */
    public $type;

    // 节点id
    /**
     * @example id
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'app'  => 'app',
        'type' => 'type',
        'id'   => 'id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopologyNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
