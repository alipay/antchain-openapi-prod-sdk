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
    protected $_name = [
        'riskLevel' => 'risk_level',
        'sugAction' => 'sug_action',
    ];

    public function validate()
    {
        Model::validateRequired('riskLevel', $this->riskLevel, true);
        Model::validateRequired('sugAction', $this->sugAction, true);
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

        return $model;
    }
}
