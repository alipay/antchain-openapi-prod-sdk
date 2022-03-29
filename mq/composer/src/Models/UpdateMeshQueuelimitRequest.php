<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeshQueuelimitRequest extends Model
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

    // 队列限流域值
    /**
     * @var QueueLimitValueDTO[]
     */
    public $list;

    // 限流算法
    /**
     * @var string
     */
    public $lAlgorithm;

    // 限流后操作
    /**
     * @var string
     */
    public $lOperation;

    // 方法
    /**
     * @var string
     */
    public $meth;

    // 限流规则名称
    /**
     * @var string
     */
    public $name;

    // 队列id
    /**
     * @var int
     */
    public $queueId;

    // 运行模式
    /**
     * @var string
     */
    public $rMode;

    // 状态
    /**
     * @var int
     */
    public $status;

    // 应用名
    /**
     * @var string
     */
    public $app;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'list'              => 'list',
        'lAlgorithm'        => 'l_algorithm',
        'lOperation'        => 'l_operation',
        'meth'              => 'meth',
        'name'              => 'name',
        'queueId'           => 'queue_id',
        'rMode'             => 'r_mode',
        'status'            => 'status',
        'app'               => 'app',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('list', $this->list, true);
        Model::validateRequired('lAlgorithm', $this->lAlgorithm, true);
        Model::validateRequired('lOperation', $this->lOperation, true);
        Model::validateRequired('meth', $this->meth, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('queueId', $this->queueId, true);
        Model::validateRequired('rMode', $this->rMode, true);
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
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->lAlgorithm) {
            $res['l_algorithm'] = $this->lAlgorithm;
        }
        if (null !== $this->lOperation) {
            $res['l_operation'] = $this->lOperation;
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
        if (null !== $this->rMode) {
            $res['r_mode'] = $this->rMode;
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
     * @return UpdateMeshQueuelimitRequest
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
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? QueueLimitValueDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['l_algorithm'])) {
            $model->lAlgorithm = $map['l_algorithm'];
        }
        if (isset($map['l_operation'])) {
            $model->lOperation = $map['l_operation'];
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
        if (isset($map['r_mode'])) {
            $model->rMode = $map['r_mode'];
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
