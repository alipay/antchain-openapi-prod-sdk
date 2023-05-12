<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class ActivityTrend extends Model
{
    // 时间点
    /**
     * @example 1572930308946
     *
     * @var int
     */
    public $time;

    // 总数
    /**
     * @example 10
     *
     * @var int
     */
    public $total;

    // 成功数
    /**
     * @example 8
     *
     * @var int
     */
    public $success;

    // 回滚数
    /**
     * @example 2
     *
     * @var int
     */
    public $rollback;
    protected $_name = [
        'time'     => 'time',
        'total'    => 'total',
        'success'  => 'success',
        'rollback' => 'rollback',
    ];

    public function validate()
    {
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('rollback', $this->rollback, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->rollback) {
            $res['rollback'] = $this->rollback;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActivityTrend
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['rollback'])) {
            $model->rollback = $map['rollback'];
        }

        return $model;
    }
}
