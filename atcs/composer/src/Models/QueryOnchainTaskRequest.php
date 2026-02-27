<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATCS\Models;

use AlibabaCloud\Tea\Model;

class QueryOnchainTaskRequest extends Model
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

    // 客户标识，如支付宝2088标识
    /**
     * @var string
     */
    public $agentId;

    // 任务标识列表
    /**
     * @var string[]
     */
    public $taskIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId'           => 'agent_id',
        'taskIdList'        => 'task_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('taskIdList', $this->taskIdList, true);
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
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->taskIdList) {
            $res['task_id_list'] = $this->taskIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOnchainTaskRequest
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
        if (isset($map['agent_id'])) {
            $model->agentId = $map['agent_id'];
        }
        if (isset($map['task_id_list'])) {
            if (!empty($map['task_id_list'])) {
                $model->taskIdList = $map['task_id_list'];
            }
        }

        return $model;
    }
}
