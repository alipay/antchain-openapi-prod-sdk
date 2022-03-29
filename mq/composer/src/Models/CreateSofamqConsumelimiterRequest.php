<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqConsumelimiterRequest extends Model
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

    // 实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 限流资源名，由 GROUP@TOPIC 组成
    /**
     * @var string
     */
    public $name;

    // 限流类型
    // - UNIT：单元限流，指定单元/CELL限流
    /**
     * @var string
     */
    public $limiterType;

    // 限流值配置，BASE 为基准限流值。
    /**
     * @var string
     */
    public $tps;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'limiterType'       => 'limiter_type',
        'tps'               => 'tps',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('limiterType', $this->limiterType, true);
        Model::validateRequired('tps', $this->tps, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->limiterType) {
            $res['limiter_type'] = $this->limiterType;
        }
        if (null !== $this->tps) {
            $res['tps'] = $this->tps;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqConsumelimiterRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['limiter_type'])) {
            $model->limiterType = $map['limiter_type'];
        }
        if (isset($map['tps'])) {
            $model->tps = $map['tps'];
        }

        return $model;
    }
}
