<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models;

use AlibabaCloud\Tea\Model;

class InitPack extends Model
{
    // 返回接收到请求的当前时间
    /**
     * @example 2022-11-07 14:48
     *
     * @var string
     */
    public $time;

    // 操作人
    /**
     * @example wanyi
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
     * @return InitPack
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
