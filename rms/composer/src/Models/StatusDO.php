<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class StatusDO extends Model
{
    // creater
    /**
     * @example creater
     *
     * @var string
     */
    public $creater;

    // create_time
    /**
     * @example create_time
     *
     * @var int
     */
    public $createTime;

    // operator
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // update_time
    /**
     * @example update_time
     *
     * @var int
     */
    public $updateTime;

    // status_desc
    /**
     * @example status_desc
     *
     * @var string
     */
    public $statusDesc;

    // compute_close
    /**
     * @example true,false
     *
     * @var bool
     */
    public $computeClose;

    // degrade_reason
    /**
     * @example degrade_reason
     *
     * @var string
     */
    public $degradeReason;

    // degrade_operator
    /**
     * @example degrade_operator
     *
     * @var string
     */
    public $degradeOperator;

    // degrade_time
    /**
     * @example degrade_time
     *
     * @var string
     */
    public $degradeTime;

    // degrade_time_v2
    /**
     * @example degrade_time_v2
     *
     * @var int
     */
    public $degradeTimeV2;
    protected $_name = [
        'creater'         => 'creater',
        'createTime'      => 'create_time',
        'operator'        => 'operator',
        'updateTime'      => 'update_time',
        'statusDesc'      => 'status_desc',
        'computeClose'    => 'compute_close',
        'degradeReason'   => 'degrade_reason',
        'degradeOperator' => 'degrade_operator',
        'degradeTime'     => 'degrade_time',
        'degradeTimeV2'   => 'degrade_time_v2',
    ];

    public function validate()
    {
        Model::validateRequired('creater', $this->creater, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('statusDesc', $this->statusDesc, true);
        Model::validateRequired('computeClose', $this->computeClose, true);
        Model::validateRequired('degradeReason', $this->degradeReason, true);
        Model::validateRequired('degradeOperator', $this->degradeOperator, true);
        Model::validateRequired('degradeTime', $this->degradeTime, true);
        Model::validateRequired('degradeTimeV2', $this->degradeTimeV2, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creater) {
            $res['creater'] = $this->creater;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->statusDesc) {
            $res['status_desc'] = $this->statusDesc;
        }
        if (null !== $this->computeClose) {
            $res['compute_close'] = $this->computeClose;
        }
        if (null !== $this->degradeReason) {
            $res['degrade_reason'] = $this->degradeReason;
        }
        if (null !== $this->degradeOperator) {
            $res['degrade_operator'] = $this->degradeOperator;
        }
        if (null !== $this->degradeTime) {
            $res['degrade_time'] = $this->degradeTime;
        }
        if (null !== $this->degradeTimeV2) {
            $res['degrade_time_v2'] = $this->degradeTimeV2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StatusDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creater'])) {
            $model->creater = $map['creater'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['status_desc'])) {
            $model->statusDesc = $map['status_desc'];
        }
        if (isset($map['compute_close'])) {
            $model->computeClose = $map['compute_close'];
        }
        if (isset($map['degrade_reason'])) {
            $model->degradeReason = $map['degrade_reason'];
        }
        if (isset($map['degrade_operator'])) {
            $model->degradeOperator = $map['degrade_operator'];
        }
        if (isset($map['degrade_time'])) {
            $model->degradeTime = $map['degrade_time'];
        }
        if (isset($map['degrade_time_v2'])) {
            $model->degradeTimeV2 = $map['degrade_time_v2'];
        }

        return $model;
    }
}
