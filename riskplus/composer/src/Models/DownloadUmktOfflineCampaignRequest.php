<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DownloadUmktOfflineCampaignRequest extends Model
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

    // 圈投计划id
    /**
     * @var int
     */
    public $campaignId;

    // 节点id
    /**
     * @var string
     */
    public $nodeId;

    // 关联圈客计划id
    /**
     * @var int
     */
    public $decisionPlanId;

    // 任务id
    /**
     * @var string
     */
    public $taskId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'campaignId'        => 'campaign_id',
        'nodeId'            => 'node_id',
        'decisionPlanId'    => 'decision_plan_id',
        'taskId'            => 'task_id',
    ];

    public function validate()
    {
        Model::validateRequired('campaignId', $this->campaignId, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('decisionPlanId', $this->decisionPlanId, true);
        Model::validateRequired('taskId', $this->taskId, true);
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
        if (null !== $this->campaignId) {
            $res['campaign_id'] = $this->campaignId;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->decisionPlanId) {
            $res['decision_plan_id'] = $this->decisionPlanId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadUmktOfflineCampaignRequest
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
        if (isset($map['campaign_id'])) {
            $model->campaignId = $map['campaign_id'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['decision_plan_id'])) {
            $model->decisionPlanId = $map['decision_plan_id'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }

        return $model;
    }
}
