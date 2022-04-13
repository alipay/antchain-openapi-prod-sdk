<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppDeployPodStateSummary extends Model
{
    // 执行对象ID
    /**
     * @example 00000000001
     *
     * @var string
     */
    public $id;

    // 执行对象状态
    /**
     * @example EXECUTING
     *
     * @var string
     */
    public $state;

    // 总计
    /**
     * @example 10
     *
     * @var int
     */
    public $total;

    // 执行中个数
    /**
     * @example 10
     *
     * @var int
     */
    public $executing;

    // 成功数
    /**
     * @example 10
     *
     * @var int
     */
    public $succeeded;

    // 等待个数
    /**
     * @example 10
     *
     * @var int
     */
    public $waiting;

    // 失败个数
    /**
     * @example 10
     *
     * @var int
     */
    public $failed;

    // 初始化个数
    //
    /**
     * @example 10
     *
     * @var int
     */
    public $inited;

    // 阻塞个数
    /**
     * @example 10
     *
     * @var int
     */
    public $blocked;
    protected $_name = [
        'id'        => 'id',
        'state'     => 'state',
        'total'     => 'total',
        'executing' => 'executing',
        'succeeded' => 'succeeded',
        'waiting'   => 'waiting',
        'failed'    => 'failed',
        'inited'    => 'inited',
        'blocked'   => 'blocked',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('executing', $this->executing, true);
        Model::validateRequired('succeeded', $this->succeeded, true);
        Model::validateRequired('waiting', $this->waiting, true);
        Model::validateRequired('failed', $this->failed, true);
        Model::validateRequired('inited', $this->inited, true);
        Model::validateRequired('blocked', $this->blocked, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->executing) {
            $res['executing'] = $this->executing;
        }
        if (null !== $this->succeeded) {
            $res['succeeded'] = $this->succeeded;
        }
        if (null !== $this->waiting) {
            $res['waiting'] = $this->waiting;
        }
        if (null !== $this->failed) {
            $res['failed'] = $this->failed;
        }
        if (null !== $this->inited) {
            $res['inited'] = $this->inited;
        }
        if (null !== $this->blocked) {
            $res['blocked'] = $this->blocked;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDeployPodStateSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['executing'])) {
            $model->executing = $map['executing'];
        }
        if (isset($map['succeeded'])) {
            $model->succeeded = $map['succeeded'];
        }
        if (isset($map['waiting'])) {
            $model->waiting = $map['waiting'];
        }
        if (isset($map['failed'])) {
            $model->failed = $map['failed'];
        }
        if (isset($map['inited'])) {
            $model->inited = $map['inited'];
        }
        if (isset($map['blocked'])) {
            $model->blocked = $map['blocked'];
        }

        return $model;
    }
}
