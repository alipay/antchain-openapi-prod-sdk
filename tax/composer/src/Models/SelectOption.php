<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class SelectOption extends Model
{
    // 选项名称
    /**
     * @example 选项名称
     *
     * @var string
     */
    public $lable;

    // 选项的值，一般是 id 之类的唯一标识符，给后端传这个
    /**
     * @example zhangsan
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'lable' => 'lable',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('lable', $this->lable, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lable) {
            $res['lable'] = $this->lable;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SelectOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lable'])) {
            $model->lable = $map['lable'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
