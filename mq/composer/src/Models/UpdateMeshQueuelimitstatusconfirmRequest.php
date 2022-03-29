<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeshQueuelimitstatusconfirmRequest extends Model
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

    // 限流规则id
    /**
     * @var int
     */
    public $id;

    // 限流规则状态
    /**
     * @var int
     */
    public $status;

    // 队列id
    /**
     * @var int
     */
    public $queueId;

    // 方法
    /**
     * @var string
     */
    public $meth;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'status'            => 'status',
        'queueId'           => 'queue_id',
        'meth'              => 'meth',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('queueId', $this->queueId, true);
        Model::validateRequired('meth', $this->meth, true);
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->queueId) {
            $res['queue_id'] = $this->queueId;
        }
        if (null !== $this->meth) {
            $res['meth'] = $this->meth;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMeshQueuelimitstatusconfirmRequest
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['queue_id'])) {
            $model->queueId = $map['queue_id'];
        }
        if (isset($map['meth'])) {
            $model->meth = $map['meth'];
        }

        return $model;
    }
}
