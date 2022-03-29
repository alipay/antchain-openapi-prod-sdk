<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateSofamqRouterRequest extends Model
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

    // 当前状态
    /**
     * @var int
     */
    public $currentStatus;

    // 路由任务描述信息
    /**
     * @var string
     */
    public $description;

    // 路由任务 ID
    /**
     * @var int
     */
    public $routerId;

    // 实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 目标状态
    /**
     * @var int
     */
    public $targetStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'currentStatus'     => 'current_status',
        'description'       => 'description',
        'routerId'          => 'router_id',
        'instanceId'        => 'instance_id',
        'targetStatus'      => 'target_status',
    ];

    public function validate()
    {
        Model::validateRequired('currentStatus', $this->currentStatus, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('routerId', $this->routerId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('targetStatus', $this->targetStatus, true);
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
        if (null !== $this->currentStatus) {
            $res['current_status'] = $this->currentStatus;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->routerId) {
            $res['router_id'] = $this->routerId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->targetStatus) {
            $res['target_status'] = $this->targetStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSofamqRouterRequest
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
        if (isset($map['current_status'])) {
            $model->currentStatus = $map['current_status'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['router_id'])) {
            $model->routerId = $map['router_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['target_status'])) {
            $model->targetStatus = $map['target_status'];
        }

        return $model;
    }
}
