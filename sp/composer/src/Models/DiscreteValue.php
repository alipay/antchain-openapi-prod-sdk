<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class DiscreteValue extends Model
{
    // 组件展示的内容
    /**
     * @example 可选大小
     *
     * @var string
     */
    public $text;

    // 组件的具体值
    /**
     * @example testValue
     *
     * @var string
     */
    public $value;

    // 组件值的单位
    /**
     * @example GB
     *
     * @var string
     */
    public $unit;

    // 组件选中值的说明/提示
    /**
     * @example 容量
     *
     * @var string
     */
    public $tips;

    // 多个组件展示的顺序
    /**
     * @example 1
     *
     * @var int
     */
    public $sortId;
    protected $_name = [
        'text'   => 'text',
        'value'  => 'value',
        'unit'   => 'unit',
        'tips'   => 'tips',
        'sortId' => 'sort_id',
    ];

    public function validate()
    {
        Model::validateRequired('text', $this->text, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('sortId', $this->sortId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->tips) {
            $res['tips'] = $this->tips;
        }
        if (null !== $this->sortId) {
            $res['sort_id'] = $this->sortId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DiscreteValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['tips'])) {
            $model->tips = $map['tips'];
        }
        if (isset($map['sort_id'])) {
            $model->sortId = $map['sort_id'];
        }

        return $model;
    }
}
