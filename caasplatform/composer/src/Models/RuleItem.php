<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class RuleItem extends Model
{
    // 分账方Id
    /**
     * @example ea596f28-4ece-406d-a9e1-86fa83cc505f
     *
     * @var string
     */
    public $id;

    // 分账份额，总份额100，保留2位小数
    /**
     * @example 23.36
     *
     * @var string
     */
    public $proportion;
    protected $_name = [
        'id'         => 'id',
        'proportion' => 'proportion',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('proportion', $this->proportion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->proportion) {
            $res['proportion'] = $this->proportion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RuleItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['proportion'])) {
            $model->proportion = $map['proportion'];
        }

        return $model;
    }
}
