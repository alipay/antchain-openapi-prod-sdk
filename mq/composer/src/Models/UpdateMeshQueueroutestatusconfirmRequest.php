<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeshQueueroutestatusconfirmRequest extends Model
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

    // 路由规则id
    /**
     * @var int
     */
    public $id;

    // 队列id
    /**
     * @var int
     */
    public $queueId;

    // 状态
    /**
     * @var int
     */
    public $status;

    // 应用
    /**
     * @var string
     */
    public $app;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'queueId'           => 'queue_id',
        'status'            => 'status',
        'app'               => 'app',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('queueId', $this->queueId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('app', $this->app, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->queueId) {
            $res['queue_id'] = $this->queueId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMeshQueueroutestatusconfirmRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['queue_id'])) {
            $model->queueId = $map['queue_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }

        return $model;
    }
}
