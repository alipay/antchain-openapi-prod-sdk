<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class NodeTopItem extends Model
{
    // 主机名称
    /**
     * @example node
     *
     * @var string
     */
    public $node;

    // 应用TopN统计值，有可能有小数，使用前转换为数值
    /**
     * @example 15
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'node'  => 'node',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('node', $this->node, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->node) {
            $res['node'] = $this->node;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeTopItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node'])) {
            $model->node = $map['node'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
