<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class AnotherClass extends Model
{
    // 测试字段
    /**
     * @example some string
     *
     * @var string
     */
    public $bar;

    // 引用字段
    /**
     * @example
     *
     * @var QueryMap
     */
    public $ref;
    protected $_name = [
        'bar' => 'bar',
        'ref' => 'ref',
    ];

    public function validate()
    {
        Model::validateRequired('bar', $this->bar, true);
        Model::validateRequired('ref', $this->ref, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bar) {
            $res['bar'] = $this->bar;
        }
        if (null !== $this->ref) {
            $res['ref'] = null !== $this->ref ? $this->ref->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AnotherClass
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bar'])) {
            $model->bar = $map['bar'];
        }
        if (isset($map['ref'])) {
            $model->ref = QueryMap::fromMap($map['ref']);
        }

        return $model;
    }
}
