<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GrayLabelDownstreamRule extends Model
{
    // 判断入口流量的方式，目前支持通过header或cookie判断
    /**
     * @example header/cookie
     *
     * @var string
     */
    public $type;

    // 用于判断的键
    /**
     * @example header1
     *
     * @var string
     */
    public $key;

    // 判断条件，目前支持相等或者不相等
    /**
     * @example EQUALS, NOT_EQUALS
     *
     * @var string
     */
    public $condition;

    // 用于判断的值
    /**
     * @example value1
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'type'      => 'type',
        'key'       => 'key',
        'condition' => 'condition',
        'value'     => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('condition', $this->condition, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->condition) {
            $res['condition'] = $this->condition;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrayLabelDownstreamRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['condition'])) {
            $model->condition = $map['condition'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
