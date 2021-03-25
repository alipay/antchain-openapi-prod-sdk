<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class DiscreteValue extends Model
{
    // 序号
    /**
     * @example 1
     *
     * @var int
     */
    public $sortId;

    // 文本信息
    /**
     * @example 测试链1-人民币账户
     *
     * @var string
     */
    public $text;

    // 文本值
    /**
     * @example chainID1-CNY
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'sortId' => 'sort_id',
        'text'   => 'text',
        'value'  => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('sortId', $this->sortId, true);
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
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
