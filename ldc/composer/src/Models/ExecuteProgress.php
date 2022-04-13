<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExecuteProgress extends Model
{
    // 阻塞个数
    /**
     * @example 1
     *
     * @var int
     */
    public $blocked;

    // 执行中个数
    /**
     * @example 1
     *
     * @var int
     */
    public $executing;

    // 失败个数
    /**
     * @example 1
     *
     * @var int
     */
    public $failed;

    // 执行对象ID
    /**
     * @example 00000000001
     *
     * @var string
     */
    public $id;

    // 初始化机器个数
    /**
     * @example 10
     *
     * @var int
     */
    public $inited;

    // 执行对象状态
    /**
     * @example EXECUTING
     *
     * @var string
     */
    public $state;

    // 成功个数
    /**
     * @example 1
     *
     * @var int
     */
    public $success;

    // 总计
    /**
     * @example 100
     *
     * @var int
     */
    public $total;

    // 等待中个数
    /**
     * @example 1
     *
     * @var int
     */
    public $waiting;
    protected $_name = [
        'blocked'   => 'blocked',
        'executing' => 'executing',
        'failed'    => 'failed',
        'id'        => 'id',
        'inited'    => 'inited',
        'state'     => 'state',
        'success'   => 'success',
        'total'     => 'total',
        'waiting'   => 'waiting',
    ];

    public function validate()
    {
        Model::validateRequired('blocked', $this->blocked, true);
        Model::validateRequired('executing', $this->executing, true);
        Model::validateRequired('failed', $this->failed, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('inited', $this->inited, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('waiting', $this->waiting, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blocked) {
            $res['blocked'] = $this->blocked;
        }
        if (null !== $this->executing) {
            $res['executing'] = $this->executing;
        }
        if (null !== $this->failed) {
            $res['failed'] = $this->failed;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->inited) {
            $res['inited'] = $this->inited;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->waiting) {
            $res['waiting'] = $this->waiting;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecuteProgress
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['blocked'])) {
            $model->blocked = $map['blocked'];
        }
        if (isset($map['executing'])) {
            $model->executing = $map['executing'];
        }
        if (isset($map['failed'])) {
            $model->failed = $map['failed'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['inited'])) {
            $model->inited = $map['inited'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['waiting'])) {
            $model->waiting = $map['waiting'];
        }

        return $model;
    }
}
