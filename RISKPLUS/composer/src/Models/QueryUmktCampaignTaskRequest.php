<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryUmktCampaignTaskRequest extends Model
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

    // 半圈投计划id
    /**
     * @var int
     */
    public $campaignId;

    // 任务唯一id
    /**
     * @var string
     */
    public $taskId;

    // 圈投任务执行日期
    /**
     * @var string
     */
    public $execDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'campaignId'        => 'campaign_id',
        'taskId'            => 'task_id',
        'execDate'          => 'exec_date',
    ];

    public function validate()
    {
        Model::validateRequired('campaignId', $this->campaignId, true);
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
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->execDate) {
            $res['exec_date'] = $this->execDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUmktCampaignTaskRequest
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
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['exec_date'])) {
            $model->execDate = $map['exec_date'];
        }

        return $model;
    }
}
