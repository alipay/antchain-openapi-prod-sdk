<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CellInfo extends Model
{
    // 单元
    /**
     * @example cell
     *
     * @var string
     */
    public $cell;

    // 是否特别推送
    /**
     * @example true, false
     *
     * @var bool
     */
    public $specialPush;

    // 推送值
    /**
     * @example value
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'cell'        => 'cell',
        'specialPush' => 'special_push',
        'value'       => 'value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->specialPush) {
            $res['special_push'] = $this->specialPush;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['special_push'])) {
            $model->specialPush = $map['special_push'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
