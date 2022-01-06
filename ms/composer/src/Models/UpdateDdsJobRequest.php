<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDdsJobRequest extends Model
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

    // job id
    /**
     * @var int
     */
    public $id;

    // middleware instance id
    /**
     * @var string
     */
    public $instanceId;

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

    // 任务描述信息
    /**
     * @var string
     */
    public $des;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'cron'              => 'cron',
        'shardingCount'     => 'sharding_count',
        'customParams'      => 'custom_params',
        'des'               => 'des',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
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
        if (null !== $this->des) {
            $res['des'] = $this->des;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDdsJobRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
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
        if (isset($map['des'])) {
            $model->des = $map['des'];
        }

        return $model;
    }
}
