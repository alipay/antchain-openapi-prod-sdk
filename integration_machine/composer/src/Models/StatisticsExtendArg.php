<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class StatisticsExtendArg extends Model
{
    // 字段key
    /**
     * @example totalFace
     *
     * @var string
     */
    public $key;

    // 数量
    /**
     * @example 100
     *
     * @var int
     */
    public $number;
    protected $_name = [
        'key'    => 'key',
        'number' => 'number',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('number', $this->number, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StatisticsExtendArg
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }

        return $model;
    }
}
