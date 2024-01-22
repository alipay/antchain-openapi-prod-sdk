<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RiskQueryData extends Model
{
    // 风险评分
    /**
     * @example .
     *
     * @var string
     */
    public $riskScore;

    // 风险标签
    /**
     * @example .
     *
     * @var string[]
     */
    public $riskLabels;
    protected $_name = [
        'riskScore'  => 'risk_score',
        'riskLabels' => 'risk_labels',
    ];

    public function validate()
    {
        Model::validateRequired('riskScore', $this->riskScore, true);
        Model::validateRequired('riskLabels', $this->riskLabels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->riskLabels) {
            $res['risk_labels'] = $this->riskLabels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskQueryData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['risk_labels'])) {
            if (!empty($map['risk_labels'])) {
                $model->riskLabels = $map['risk_labels'];
            }
        }

        return $model;
    }
}
