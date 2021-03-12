<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DiscreteValue extends Model
{
    // 排序id
    /**
     * @example 12
     *
     * @var int
     */
    public $sortId;

    // 字段描述
    /**
     * @example 联盟名称
     *
     * @var string
     */
    public $text;

    // 提示信息
    /**
     * @example 提示信息
     *
     * @var string
     */
    public $tips;

    // 单位信息
    /**
     * @example 单位信息
     *
     * @var string
     */
    public $unit;

    // 值内容
    /**
     * @example 值内容
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'sortId' => 'sort_id',
        'text'   => 'text',
        'tips'   => 'tips',
        'unit'   => 'unit',
        'value'  => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('text', $this->text, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sortId) {
            $res['sort_id'] = $this->sortId;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->tips) {
            $res['tips'] = $this->tips;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
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
        if (isset($map['sort_id'])) {
            $model->sortId = $map['sort_id'];
        }
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['tips'])) {
            $model->tips = $map['tips'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
