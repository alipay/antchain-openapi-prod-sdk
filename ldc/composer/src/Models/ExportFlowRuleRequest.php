<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExportFlowRuleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 参与规则生成的应用列表
    /**
     * @var string[]
     */
    public $apps;

    // 是否灰度（默认 false）
    /**
     * @var bool
     */
    public $gray;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 规则类型，支持(ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR,TAO_BAO_RULE)
    /**
     * @var string
     */
    public $ruleType;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 是否进行规则校验，默认 false
    /**
     * @var bool
     */
    public $check;
    protected $_name = [
        'authToken'      => 'auth_token',
        'apps'           => 'apps',
        'gray'           => 'gray',
        'operator'       => 'operator',
        'ruleType'       => 'rule_type',
        'workspaceGroup' => 'workspace_group',
        'check'          => 'check',
    ];

    public function validate()
    {
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('ruleType', $this->ruleType, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apps) {
            $res['apps'] = $this->apps;
        }
        if (null !== $this->gray) {
            $res['gray'] = $this->gray;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->check) {
            $res['check'] = $this->check;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportFlowRuleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = $map['apps'];
            }
        }
        if (isset($map['gray'])) {
            $model->gray = $map['gray'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['check'])) {
            $model->check = $map['check'];
        }

        return $model;
    }
}
