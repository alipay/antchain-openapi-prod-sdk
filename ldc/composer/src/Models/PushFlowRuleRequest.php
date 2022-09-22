<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PushFlowRuleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 包含系统列表，目前功能不支持，禁止设置
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

    // 推送中间件流量规则时，是否同时推送中间件中枢
    /**
     * @var bool
     */
    public $pushAll;

    // 规则类型,支持(ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR,TAO_BAO_RULE)
    /**
     * @var string
     */
    public $ruleType;

    // 规则文本
    /**
     * @var string
     */
    public $ruleValue;

    // 推送目标列表，域外支持 MIDDLEWARE（微服务/中间件）、ALB（统一接入） 两种
    /**
     * @var string[]
     */
    public $targets;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 是否覆盖其他应用的规则，默认 false
    /**
     * @var bool
     */
    public $override;
    protected $_name = [
        'authToken'      => 'auth_token',
        'apps'           => 'apps',
        'gray'           => 'gray',
        'operator'       => 'operator',
        'pushAll'        => 'push_all',
        'ruleType'       => 'rule_type',
        'ruleValue'      => 'rule_value',
        'targets'        => 'targets',
        'workspaceGroup' => 'workspace_group',
        'override'       => 'override',
    ];

    public function validate()
    {
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('ruleType', $this->ruleType, true);
        Model::validateRequired('ruleValue', $this->ruleValue, true);
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
        if (null !== $this->pushAll) {
            $res['push_all'] = $this->pushAll;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->ruleValue) {
            $res['rule_value'] = $this->ruleValue;
        }
        if (null !== $this->targets) {
            $res['targets'] = $this->targets;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->override) {
            $res['override'] = $this->override;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushFlowRuleRequest
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
        if (isset($map['push_all'])) {
            $model->pushAll = $map['push_all'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['rule_value'])) {
            $model->ruleValue = $map['rule_value'];
        }
        if (isset($map['targets'])) {
            if (!empty($map['targets'])) {
                $model->targets = $map['targets'];
            }
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['override'])) {
            $model->override = $map['override'];
        }

        return $model;
    }
}
