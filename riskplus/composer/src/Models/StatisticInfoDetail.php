<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class StatisticInfoDetail extends Model
{
    // actionDriverCode类型
    /**
     * @example 1
     *
     * @var int
     */
    public $actionDriverCode;

    // 成功数
    /**
     * @example 123
     *
     * @var int
     */
    public $successCount;

    // 失败数
    /**
     * @example 123
     *
     * @var int
     */
    public $failCount;

    // 待触达的手机号数
    /**
     * @example 0
     *
     * @var int
     */
    public $waitingSubTaskCount;

    // 已收到的回执数
    /**
     * @example 10
     *
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'actionDriverCode'    => 'action_driver_code',
        'successCount'        => 'success_count',
        'failCount'           => 'fail_count',
        'waitingSubTaskCount' => 'waiting_sub_task_count',
        'totalCount'          => 'total_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionDriverCode) {
            $res['action_driver_code'] = $this->actionDriverCode;
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->failCount) {
            $res['fail_count'] = $this->failCount;
        }
        if (null !== $this->waitingSubTaskCount) {
            $res['waiting_sub_task_count'] = $this->waitingSubTaskCount;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StatisticInfoDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_driver_code'])) {
            $model->actionDriverCode = $map['action_driver_code'];
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }
        if (isset($map['fail_count'])) {
            $model->failCount = $map['fail_count'];
        }
        if (isset($map['waiting_sub_task_count'])) {
            $model->waitingSubTaskCount = $map['waiting_sub_task_count'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
