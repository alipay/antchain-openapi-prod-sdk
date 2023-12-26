<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CrowdNodeTypeEnum extends Model
{
    // 组合节点
    /**
     * @example xx
     *
     * @var string
     */
    public $group;

    // 条件节点
    /**
     * @example xx
     *
     * @var string
     */
    public $condition;
    protected $_name = [
        'group'     => 'group',
        'condition' => 'condition',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->condition) {
            $res['condition'] = $this->condition;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrowdNodeTypeEnum
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['condition'])) {
            $model->condition = $map['condition'];
        }

        return $model;
    }
}
