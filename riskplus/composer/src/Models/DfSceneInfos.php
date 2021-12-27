<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DfSceneInfos extends Model
{
    // scene_code
    /**
     * @example 场景code
     *
     * @var string
     */
    public $sceneCode;

    // 拒绝
    /**
     * @example reject
     *
     * @var string
     */
    public $sceneDecision;

    // decision_flow
    /**
     * @example decision_flow
     *
     * @var DecisionFlow
     */
    public $decisionFlow;
    protected $_name = [
        'sceneCode'     => 'scene_code',
        'sceneDecision' => 'scene_decision',
        'decisionFlow'  => 'decision_flow',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('sceneDecision', $this->sceneDecision, true);
        Model::validateRequired('decisionFlow', $this->decisionFlow, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->sceneDecision) {
            $res['scene_decision'] = $this->sceneDecision;
        }
        if (null !== $this->decisionFlow) {
            $res['decision_flow'] = null !== $this->decisionFlow ? $this->decisionFlow->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DfSceneInfos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['scene_decision'])) {
            $model->sceneDecision = $map['scene_decision'];
        }
        if (isset($map['decision_flow'])) {
            $model->decisionFlow = DecisionFlow::fromMap($map['decision_flow']);
        }

        return $model;
    }
}
