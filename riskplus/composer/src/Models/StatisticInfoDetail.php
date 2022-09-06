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

    // 调用总数
    /**
     * @example 123
     *
     * @var int
     */
    public $invokeCount;

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

    // 已处理完成任务数
    /**
     * @example
     *
     * @var int
     */
    public $finishCount;
    protected $_name = [
        'actionDriverCode' => 'action_driver_code',
        'invokeCount'      => 'invoke_count',
        'successCount'     => 'success_count',
        'failCount'        => 'fail_count',
        'finishCount'      => 'finish_count',
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
        if (null !== $this->invokeCount) {
            $res['invoke_count'] = $this->invokeCount;
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->failCount) {
            $res['fail_count'] = $this->failCount;
        }
        if (null !== $this->finishCount) {
            $res['finish_count'] = $this->finishCount;
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
        if (isset($map['invoke_count'])) {
            $model->invokeCount = $map['invoke_count'];
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }
        if (isset($map['fail_count'])) {
            $model->failCount = $map['fail_count'];
        }
        if (isset($map['finish_count'])) {
            $model->finishCount = $map['finish_count'];
        }

        return $model;
    }
}
