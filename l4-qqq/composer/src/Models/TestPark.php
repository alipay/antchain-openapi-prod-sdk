<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QQQ\Models;

use AlibabaCloud\Tea\Model;

class TestPark extends Model
{
    // 请求时间
    /**
     * @example 2022-11-07 14:48
     *
     * @var string
     */
    public $time;

    // 请求人
    /**
     * @example 张三
     *
     * @var string
     */
    public $operator;

    // 请求编号
    /**
     * @example 1
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'time'     => 'time',
        'operator' => 'operator',
        'count'    => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestPark
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
