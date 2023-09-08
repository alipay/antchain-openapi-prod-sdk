<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MarketingRiskData extends Model
{
    // risk_level
    /**
     * @example
     *
     * @var int
     */
    public $riskLevel;

    // sug_action
    /**
     * @example sug_action
     *
     * @var string
     */
    public $sugAction;

    // `
    /**
     * @example
     *
     * @var string[]
     */
    public $riskLabels;
    protected $_name = [
        'riskLevel'  => 'risk_level',
        'sugAction'  => 'sug_action',
        'riskLabels' => 'risk_labels',
    ];

    public function validate()
    {
        Model::validateRequired('riskLevel', $this->riskLevel, true);
        Model::validateRequired('sugAction', $this->sugAction, true);
        Model::validateRequired('riskLabels', $this->riskLabels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }
        if (null !== $this->sugAction) {
            $res['sug_action'] = $this->sugAction;
        }
        if (null !== $this->riskLabels) {
            $res['risk_labels'] = $this->riskLabels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MarketingRiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }
        if (isset($map['sug_action'])) {
            $model->sugAction = $map['sug_action'];
        }
        if (isset($map['risk_labels'])) {
            if (!empty($map['risk_labels'])) {
                $model->riskLabels = $map['risk_labels'];
            }
        }

        return $model;
    }
}
