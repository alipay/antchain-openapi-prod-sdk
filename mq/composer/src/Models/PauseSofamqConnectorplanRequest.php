<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class PauseSofamqConnectorplanRequest extends Model
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

    // 执行计划的Id
    /**
     * @var string
     */
    public $planId;

    // Connector任务名
    /**
     * @var string
     */
    public $job;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'planId'            => 'plan_id',
        'job'               => 'job',
    ];

    public function validate()
    {
        Model::validateRequired('planId', $this->planId, true);
        Model::validateRequired('job', $this->job, true);
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
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->job) {
            $res['job'] = $this->job;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PauseSofamqConnectorplanRequest
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
        if (isset($map['plan_id'])) {
            $model->planId = $map['plan_id'];
        }
        if (isset($map['job'])) {
            $model->job = $map['job'];
        }

        return $model;
    }
}
