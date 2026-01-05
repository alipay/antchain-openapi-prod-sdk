<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class TestDemo extends Model
{
    // 1
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 1
    /**
     * @example 23
     *
     * @var int
     */
    public $number;
    protected $_name = [
        'name'   => 'name',
        'number' => 'number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestDemo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }

        return $model;
    }
}
