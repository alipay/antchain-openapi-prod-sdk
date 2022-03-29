<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraceSpanSearchTagConfig extends Model
{
    // 字段的key
    /**
     * @example key
     *
     * @var string
     */
    public $key;

    // 中文标签
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 是否支持多选
    /**
     * @example multiple
     *
     * @var bool
     */
    public $multiple;

    // 如果该数组非空, 那么表明用户只能从数组给定的值中进行选择, 否则意味着用户可以随意填写.
    /**
     * @example
     *
     * @var string[]
     */
    public $values;
    protected $_name = [
        'key'      => 'key',
        'name'     => 'name',
        'multiple' => 'multiple',
        'values'   => 'values',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->multiple) {
            $res['multiple'] = $this->multiple;
        }
        if (null !== $this->values) {
            $res['values'] = $this->values;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceSpanSearchTagConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['multiple'])) {
            $model->multiple = $map['multiple'];
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = $map['values'];
            }
        }

        return $model;
    }
}
