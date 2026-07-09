<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class FinishTraceConfigRequest extends Model
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

    // 私有化端配置成功标志
    /**
     * @var bool
     */
    public $success;

    // 租户
    /**
     * @var string
     */
    public $privatedTenant;

    // 私有化端唯一标识
    /**
     * @var string
     */
    public $uniqueNum;

    // 任务信息，用于消费者回告
    /**
     * @var TaskInfo
     */
    public $taskInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'success'           => 'success',
        'privatedTenant'    => 'privated_tenant',
        'uniqueNum'         => 'unique_num',
        'taskInfo'          => 'task_info',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('privatedTenant', $this->privatedTenant, true);
        Model::validateRequired('uniqueNum', $this->uniqueNum, true);
        Model::validateRequired('taskInfo', $this->taskInfo, true);
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->privatedTenant) {
            $res['privated_tenant'] = $this->privatedTenant;
        }
        if (null !== $this->uniqueNum) {
            $res['unique_num'] = $this->uniqueNum;
        }
        if (null !== $this->taskInfo) {
            $res['task_info'] = null !== $this->taskInfo ? $this->taskInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishTraceConfigRequest
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['privated_tenant'])) {
            $model->privatedTenant = $map['privated_tenant'];
        }
        if (isset($map['unique_num'])) {
            $model->uniqueNum = $map['unique_num'];
        }
        if (isset($map['task_info'])) {
            $model->taskInfo = TaskInfo::fromMap($map['task_info']);
        }

        return $model;
    }
}
