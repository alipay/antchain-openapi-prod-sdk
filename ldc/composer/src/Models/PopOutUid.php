<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PopOutUid extends Model
{
    // 弹出的 UID 值
    /**
     * @example
     *
     * @var int
     */
    public $value;

    // 弹出的目标部署单元
    /**
     * @example CellA
     *
     * @var string
     */
    public $cell;
    protected $_name = [
        'value' => 'value',
        'cell'  => 'cell',
    ];

    public function validate()
    {
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('cell', $this->cell, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PopOutUid
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }

        return $model;
    }
}
