<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class UpdateAntchainSdsScenedataTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 【批次号】submit接口返回的批次号
    /**
     * @var string
     */
    public $batchNo;

    // 【异步任务上下线】INIT-初始化异步任务，异步任务开始执行，同时可以修改拓展参数，必须先下线才能初始化。INVALID-下线异步任务，停止异步任务执行。传空不修改。一次只能提一个任务状态变更。
    /**
     * @var string
     */
    public $asyncTaskStatus;

    // 【拓展参数】下线后，可以修改拓展参数，再次上线后生效。处理该拓展参数的任务，需要对参数做校验，避免参数改动太大，任务恢复异常。
    /**
     * @var BizNoCondition[]
     */
    public $expectCondition;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchNo'           => 'batch_no',
        'asyncTaskStatus'   => 'async_task_status',
        'expectCondition'   => 'expect_condition',
    ];

    public function validate()
    {
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateRequired('asyncTaskStatus', $this->asyncTaskStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->asyncTaskStatus) {
            $res['async_task_status'] = $this->asyncTaskStatus;
        }
        if (null !== $this->expectCondition) {
            $res['expect_condition'] = [];
            if (null !== $this->expectCondition && \is_array($this->expectCondition)) {
                $n = 0;
                foreach ($this->expectCondition as $item) {
                    $res['expect_condition'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAntchainSdsScenedataTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['async_task_status'])) {
            $model->asyncTaskStatus = $map['async_task_status'];
        }
        if (isset($map['expect_condition'])) {
            if (!empty($map['expect_condition'])) {
                $model->expectCondition = [];
                $n                      = 0;
                foreach ($map['expect_condition'] as $item) {
                    $model->expectCondition[$n++] = null !== $item ? BizNoCondition::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
