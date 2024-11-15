<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\JZQPRODUCTG\Models;

use AlibabaCloud\Tea\Model;

class InitParkDemo extends Model
{
    // 时间
    /**
     * @example 2024-11-16T10:10:00Z
     *
     * @var string
     */
    public $time;

    // 请求人
    /**
     * @example 姜泽琦
     *
     * @var string
     */
    public $operate;

    // 请求编号
    /**
     * @example 1
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'time'    => 'time',
        'operate' => 'operate',
        'count'   => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('operate', $this->operate, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->operate) {
            $res['operate'] = $this->operate;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitParkDemo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['operate'])) {
            $model->operate = $map['operate'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
