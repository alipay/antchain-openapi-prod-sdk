<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class FinishMydidcommunWorkergroupSyncRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 部署ID
    /**
     * @var int
     */
    public $podId;

    // 任务ID
    /**
     * @var int
     */
    public $taskId;

    // 是否同步成功
    /**
     * @var bool
     */
    public $isSuccess;

    // 处理消息
    /**
     * @var string
     */
    public $msg;

    // 负责更新的节点名
    /**
     * @var string
     */
    public $masterNode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'podId'             => 'pod_id',
        'taskId'            => 'task_id',
        'isSuccess'         => 'is_success',
        'msg'               => 'msg',
        'masterNode'        => 'master_node',
    ];

    public function validate()
    {
        Model::validateRequired('podId', $this->podId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('isSuccess', $this->isSuccess, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('masterNode', $this->masterNode, true);
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
        if (null !== $this->podId) {
            $res['pod_id'] = $this->podId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->isSuccess) {
            $res['is_success'] = $this->isSuccess;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->masterNode) {
            $res['master_node'] = $this->masterNode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishMydidcommunWorkergroupSyncRequest
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
        if (isset($map['pod_id'])) {
            $model->podId = $map['pod_id'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['is_success'])) {
            $model->isSuccess = $map['is_success'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['master_node'])) {
            $model->masterNode = $map['master_node'];
        }

        return $model;
    }
}
