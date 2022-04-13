<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateFlowElasticrulestatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 命名空间
    /**
     * @var string
     */
    public $workspaceGroup;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 弹性规则ID列表
    /**
     * @var int[]
     */
    public $elasticRuleIds;

    // VALID("线上生效"), PRESS("仅压测生效"),  INVALID("无效状态");
    /**
     * @var string
     */
    public $newStatus;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'operator'       => 'operator',
        'elasticRuleIds' => 'elastic_rule_ids',
        'newStatus'      => 'new_status',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('elasticRuleIds', $this->elasticRuleIds, true);
        Model::validateRequired('newStatus', $this->newStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->elasticRuleIds) {
            $res['elastic_rule_ids'] = $this->elasticRuleIds;
        }
        if (null !== $this->newStatus) {
            $res['new_status'] = $this->newStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFlowElasticrulestatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['elastic_rule_ids'])) {
            if (!empty($map['elastic_rule_ids'])) {
                $model->elasticRuleIds = $map['elastic_rule_ids'];
            }
        }
        if (isset($map['new_status'])) {
            $model->newStatus = $map['new_status'];
        }

        return $model;
    }
}
