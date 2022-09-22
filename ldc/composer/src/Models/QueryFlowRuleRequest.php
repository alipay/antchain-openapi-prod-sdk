<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryFlowRuleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 环境
    /**
     * @var string
     */
    public $workspaceGroup;

    // 规则类型：ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR
    /**
     * @var string
     */
    public $ruleType;

    // 推送目标类型: MAIN, MIDDLEWARE, ALB
    /**
     * @var string
     */
    public $pushTarget;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'ruleType'       => 'rule_type',
        'pushTarget'     => 'push_target',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('ruleType', $this->ruleType, true);
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
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->pushTarget) {
            $res['push_target'] = $this->pushTarget;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFlowRuleRequest
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
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['push_target'])) {
            $model->pushTarget = $map['push_target'];
        }

        return $model;
    }
}
