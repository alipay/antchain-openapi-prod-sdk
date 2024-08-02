<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class BizNoCondition extends Model
{
    // 枚举
    // CITY 城市
    // BLOCK 区县
    // AGE 年龄
    /**
     * @example 100010
     *
     * @var string
     */
    public $dimension;

    // 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
    // CITY:区划码
    // BLOCK:区划码（底包暂不支持）
    // AGE:30+、40+、50+（底包暂不支持
    /**
     * @example ["100010","100011","100020"]
     *
     * @var string[]
     */
    public $valueScope;
    protected $_name = [
        'dimension'  => 'dimension',
        'valueScope' => 'value_scope',
    ];

    public function validate()
    {
        Model::validateRequired('dimension', $this->dimension, true);
        Model::validateRequired('valueScope', $this->valueScope, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dimension) {
            $res['dimension'] = $this->dimension;
        }
        if (null !== $this->valueScope) {
            $res['value_scope'] = $this->valueScope;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizNoCondition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dimension'])) {
            $model->dimension = $map['dimension'];
        }
        if (isset($map['value_scope'])) {
            if (!empty($map['value_scope'])) {
                $model->valueScope = $map['value_scope'];
            }
        }

        return $model;
    }
}
