<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TopologyEdge extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // source节点的id
    /**
     * @example 1
     *
     * @var string
     */
    public $source;

    // target节点的id
    /**
     * @example 2
     *
     * @var string
     */
    public $target;
    protected $_name = [
        'id'     => 'id',
        'source' => 'source',
        'target' => 'target',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopologyEdge
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }

        return $model;
    }
}
