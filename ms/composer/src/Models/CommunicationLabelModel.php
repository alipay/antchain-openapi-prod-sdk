<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CommunicationLabelModel extends Model
{
    // 关键字
    /**
     * @example aa
     *
     * @var string
     */
    public $key;

    // 值
    /**
     * @example val
     *
     * @var string
     */
    public $value;

    // 类型(0-应用,1-标签)
    /**
     * @example 1
     *
     * @var int
     */
    public $type;
    protected $_name = [
        'key'   => 'key',
        'value' => 'value',
        'type'  => 'type',
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
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommunicationLabelModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
