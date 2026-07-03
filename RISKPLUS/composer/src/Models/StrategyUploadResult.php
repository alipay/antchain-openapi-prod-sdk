<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class StrategyUploadResult extends Model
{
    // 元数据id
    /**
     * @example
     *
     * @var int
     */
    public $ruleMetaId;

    // 场景id
    /**
     * @example
     *
     * @var int
     */
    public $sceneId;

    // 租户场景id
    /**
     * @example
     *
     * @var int
     */
    public $tenantSceneId;

    // 圈客规则id
    /**
     * @example
     *
     * @var int
     */
    public $decisionRuleId;

    // 场景策略id
    /**
     * @example
     *
     * @var int
     */
    public $sceneStrategyId;
    protected $_name = [
        'ruleMetaId'      => 'rule_meta_id',
        'sceneId'         => 'scene_id',
        'tenantSceneId'   => 'tenant_scene_id',
        'decisionRuleId'  => 'decision_rule_id',
        'sceneStrategyId' => 'scene_strategy_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ruleMetaId) {
            $res['rule_meta_id'] = $this->ruleMetaId;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->tenantSceneId) {
            $res['tenant_scene_id'] = $this->tenantSceneId;
        }
        if (null !== $this->decisionRuleId) {
            $res['decision_rule_id'] = $this->decisionRuleId;
        }
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StrategyUploadResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rule_meta_id'])) {
            $model->ruleMetaId = $map['rule_meta_id'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['tenant_scene_id'])) {
            $model->tenantSceneId = $map['tenant_scene_id'];
        }
        if (isset($map['decision_rule_id'])) {
            $model->decisionRuleId = $map['decision_rule_id'];
        }
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }

        return $model;
    }
}
