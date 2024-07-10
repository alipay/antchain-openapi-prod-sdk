<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DownloadUmktOfflinedecisionResultRequest extends Model
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

    // 离线圈客计划id
    /**
     * @var int
     */
    public $offlineDecisionPlanId;

    // 圈客计划id
    /**
     * @var int
     */
    public $decisionPlanId;

    // 圈客结果的产出日期
    // 格式：yyyy-MM-dd
    // 默认当前时间的前一天
    /**
     * @var string
     */
    public $resultDate;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'offlineDecisionPlanId' => 'offline_decision_plan_id',
        'decisionPlanId'        => 'decision_plan_id',
        'resultDate'            => 'result_date',
    ];

    public function validate()
    {
        Model::validateRequired('offlineDecisionPlanId', $this->offlineDecisionPlanId, true);
        Model::validateRequired('decisionPlanId', $this->decisionPlanId, true);
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
        if (null !== $this->offlineDecisionPlanId) {
            $res['offline_decision_plan_id'] = $this->offlineDecisionPlanId;
        }
        if (null !== $this->decisionPlanId) {
            $res['decision_plan_id'] = $this->decisionPlanId;
        }
        if (null !== $this->resultDate) {
            $res['result_date'] = $this->resultDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadUmktOfflinedecisionResultRequest
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
        if (isset($map['offline_decision_plan_id'])) {
            $model->offlineDecisionPlanId = $map['offline_decision_plan_id'];
        }
        if (isset($map['decision_plan_id'])) {
            $model->decisionPlanId = $map['decision_plan_id'];
        }
        if (isset($map['result_date'])) {
            $model->resultDate = $map['result_date'];
        }

        return $model;
    }
}
