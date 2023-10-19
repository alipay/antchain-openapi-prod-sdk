<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class RiskAssessResult extends Model
{
    // 风险评估结果
    /**
     * @example 中风险
     *
     * @var string
     */
    public $riskValue;

    // 风险评估分数
    /**
     * @example 90
     *
     * @var string
     */
    public $riskScore;

    // 风险评估标签
    /**
     * @example
     *
     * @var RiskModel
     */
    public $modelInfos;
    protected $_name = [
        'riskValue'  => 'risk_value',
        'riskScore'  => 'risk_score',
        'modelInfos' => 'model_infos',
    ];

    public function validate()
    {
        Model::validateRequired('riskValue', $this->riskValue, true);
        Model::validateRequired('riskScore', $this->riskScore, true);
        Model::validateRequired('modelInfos', $this->modelInfos, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskValue) {
            $res['risk_value'] = $this->riskValue;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->modelInfos) {
            $res['model_infos'] = null !== $this->modelInfos ? $this->modelInfos->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskAssessResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_value'])) {
            $model->riskValue = $map['risk_value'];
        }
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['model_infos'])) {
            $model->modelInfos = RiskModel::fromMap($map['model_infos']);
        }

        return $model;
    }
}
