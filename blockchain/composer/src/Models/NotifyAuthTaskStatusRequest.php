<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NotifyAuthTaskStatusRequest extends Model
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

    // 任务id
    /**
     * @var string
     */
    public $taskId;

    // 支uid
    /**
     * @var string
     */
    public $userId;

    // NO_START, NO_SUBMIT, NOT_COMPLETE, COMPLETE
    /**
     * @var string
     */
    public $status;

    // 状态发生时间
    /**
     * @var string
     */
    public $happenTime;

    // 业务流水号，问卷方传给主站后透传给授权宝
    /**
     * @var string
     */
    public $outBizNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskId'            => 'task_id',
        'userId'            => 'user_id',
        'status'            => 'status',
        'happenTime'        => 'happen_time',
        'outBizNo'          => 'out_biz_no',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('happenTime', $this->happenTime, true);
        Model::validatePattern('happenTime', $this->happenTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->happenTime) {
            $res['happen_time'] = $this->happenTime;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyAuthTaskStatusRequest
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
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['happen_time'])) {
            $model->happenTime = $map['happen_time'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }

        return $model;
    }
}
