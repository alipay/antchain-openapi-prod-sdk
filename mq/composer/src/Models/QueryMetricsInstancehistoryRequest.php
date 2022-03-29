<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueryMetricsInstancehistoryRequest extends Model
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

    // 结束时间（Unix 时间戳）
    /**
     * @var int
     */
    public $endTime;

    // 实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 开始时间（Unix 时间戳）
    /**
     * @var int
     */
    public $startTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'endTime'           => 'end_time',
        'instanceId'        => 'instance_id',
        'startTime'         => 'start_time',
    ];

    public function validate()
    {
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('startTime', $this->startTime, true);
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
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMetricsInstancehistoryRequest
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
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
