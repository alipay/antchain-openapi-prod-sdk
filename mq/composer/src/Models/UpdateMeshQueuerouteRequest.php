<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeshQueuerouteRequest extends Model
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

    // 应用
    /**
     * @var string
     */
    public $app;

    // 路由规则id
    /**
     * @var int
     */
    public $id;

    // 版本
    /**
     * @var QueueRouteEditionDTO[]
     */
    public $list;

    // 方法
    /**
     * @var string
     */
    public $meth;

    // 路由规则名称
    /**
     * @var string
     */
    public $name;

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

    // 分流开关
    /**
     * @var int
     */
    public $switchStatus;

    // 路由类型
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'app'               => 'app',
        'id'                => 'id',
        'list'              => 'list',
        'meth'              => 'meth',
        'name'              => 'name',
        'queueId'           => 'queue_id',
        'status'            => 'status',
        'switchStatus'      => 'switch_status',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('list', $this->list, true);
        Model::validateRequired('meth', $this->meth, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('queueId', $this->queueId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('switchStatus', $this->switchStatus, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->meth) {
            $res['meth'] = $this->meth;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->queueId) {
            $res['queue_id'] = $this->queueId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->switchStatus) {
            $res['switch_status'] = $this->switchStatus;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMeshQueuerouteRequest
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
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? QueueRouteEditionDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['meth'])) {
            $model->meth = $map['meth'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['queue_id'])) {
            $model->queueId = $map['queue_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['switch_status'])) {
            $model->switchStatus = $map['switch_status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
