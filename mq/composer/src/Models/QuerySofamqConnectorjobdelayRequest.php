<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqConnectorjobdelayRequest extends Model
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

    // 任务名称
    /**
     * @var string
     */
    public $job;

    // connector任务执行计划Id
    //
    /**
     * @var string
     */
    public $planId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'job'               => 'job',
        'planId'            => 'plan_id',
    ];

    public function validate()
    {
        Model::validateRequired('job', $this->job, true);
        Model::validateRequired('planId', $this->planId, true);
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
        if (null !== $this->job) {
            $res['job'] = $this->job;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqConnectorjobdelayRequest
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
        if (isset($map['job'])) {
            $model->job = $map['job'];
        }
        if (isset($map['plan_id'])) {
            $model->planId = $map['plan_id'];
        }

        return $model;
    }
}
