<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddDdsJobRequest extends Model
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

    // middleware instance id
    /**
     * @var string
     */
    public $instanceId;

    // 任务所属APP
    /**
     * @var string
     */
    public $app;

    // 任务名字
    /**
     * @var string
     */
    public $name;

    // 任务CRON表达式
    /**
     * @var string
     */
    public $cron;

    // 任务分片数量
    /**
     * @var int
     */
    public $shardingCount;

    // 任务自定义参数
    /**
     * @var string[]
     */
    public $customParams;

    // 任务状态
    /**
     * @var string
     */
    public $status;

    // 任务描述信息
    /**
     * @var string
     */
    public $des;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'app'               => 'app',
        'name'              => 'name',
        'cron'              => 'cron',
        'shardingCount'     => 'sharding_count',
        'customParams'      => 'custom_params',
        'status'            => 'status',
        'des'               => 'des',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('cron', $this->cron, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cron) {
            $res['cron'] = $this->cron;
        }
        if (null !== $this->shardingCount) {
            $res['sharding_count'] = $this->shardingCount;
        }
        if (null !== $this->customParams) {
            $res['custom_params'] = $this->customParams;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->des) {
            $res['des'] = $this->des;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDdsJobRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cron'])) {
            $model->cron = $map['cron'];
        }
        if (isset($map['sharding_count'])) {
            $model->shardingCount = $map['sharding_count'];
        }
        if (isset($map['custom_params'])) {
            if (!empty($map['custom_params'])) {
                $model->customParams = $map['custom_params'];
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['des'])) {
            $model->des = $map['des'];
        }

        return $model;
    }
}
