<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerServiceReleaseInfo extends Model
{
    // 发布单id
    /**
     * @example 201912191447563126
     *
     * @var string
     */
    public $createdPlanId;

    // 发布开始时间
    /**
     * @example 2019-01-01 11:21:11
     *
     * @var string
     */
    public $latestDeploymentStartTime;

    // 发布完成时间
    /**
     * @example 2019-01-01 11:21:11
     *
     * @var string
     */
    public $latestDeploymentEndTime;
    protected $_name = [
        'createdPlanId'             => 'created_plan_id',
        'latestDeploymentStartTime' => 'latest_deployment_start_time',
        'latestDeploymentEndTime'   => 'latest_deployment_end_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createdPlanId) {
            $res['created_plan_id'] = $this->createdPlanId;
        }
        if (null !== $this->latestDeploymentStartTime) {
            $res['latest_deployment_start_time'] = $this->latestDeploymentStartTime;
        }
        if (null !== $this->latestDeploymentEndTime) {
            $res['latest_deployment_end_time'] = $this->latestDeploymentEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerServiceReleaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['created_plan_id'])) {
            $model->createdPlanId = $map['created_plan_id'];
        }
        if (isset($map['latest_deployment_start_time'])) {
            $model->latestDeploymentStartTime = $map['latest_deployment_start_time'];
        }
        if (isset($map['latest_deployment_end_time'])) {
            $model->latestDeploymentEndTime = $map['latest_deployment_end_time'];
        }

        return $model;
    }
}
