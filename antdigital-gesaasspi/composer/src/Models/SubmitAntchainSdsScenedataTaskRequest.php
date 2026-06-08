<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class SubmitAntchainSdsScenedataTaskRequest extends Model
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

    // 【场景】约定的场景枚举
    /**
     * @var string
     */
    public $scene;

    // 【业务号类型】该字段逐步废弃，枚举-PHONE_SHA1，PHONE_MD5
    /**
     * @var string
     */
    public $bizNoType;

    // 【来源标识】适配客户的来源，可能是客户的任务/AK
    /**
     * @var string
     */
    public $sourceMark;

    // 【动态参数】任务动态参数信息
    /**
     * @var BizNoCondition[]
     */
    public $expectCondition;

    // 【外部批次号】和任务类型组成唯一键
    /**
     * @var string
     */
    public $outBatchNo;

    // 【任务类型】SDS根据类型触发异步处理流程
    /**
     * @var string
     */
    public $taskType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'bizNoType'         => 'biz_no_type',
        'sourceMark'        => 'source_mark',
        'expectCondition'   => 'expect_condition',
        'outBatchNo'        => 'out_batch_no',
        'taskType'          => 'task_type',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateMaxLength('scene', $this->scene, 32);
        Model::validateMaxLength('bizNoType', $this->bizNoType, 32);
        Model::validateMaxLength('sourceMark', $this->sourceMark, 32);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->bizNoType) {
            $res['biz_no_type'] = $this->bizNoType;
        }
        if (null !== $this->sourceMark) {
            $res['source_mark'] = $this->sourceMark;
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
        if (null !== $this->outBatchNo) {
            $res['out_batch_no'] = $this->outBatchNo;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAntchainSdsScenedataTaskRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['biz_no_type'])) {
            $model->bizNoType = $map['biz_no_type'];
        }
        if (isset($map['source_mark'])) {
            $model->sourceMark = $map['source_mark'];
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
        if (isset($map['out_batch_no'])) {
            $model->outBatchNo = $map['out_batch_no'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }

        return $model;
    }
}
