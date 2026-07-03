<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SecurityResultInfos extends Model
{
    // 反欺诈风险数据服务风险建议决策
    /**
     * @example reject
     *
     * @var string
     */
    public $decision;

    // 反欺诈风险数据服务风险分
    /**
     * @example 100.0
     *
     * @var int
     */
    public $riskScore;

    // 反欺诈风险数据服务场景码
    /**
     * @example EC_TEST
     *
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'decision'  => 'decision',
        'riskScore' => 'risk_score',
        'sceneCode' => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('decision', $this->decision, true);
        Model::validateRequired('riskScore', $this->riskScore, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityResultInfos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
