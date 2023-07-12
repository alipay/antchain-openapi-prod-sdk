<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MarketingRiskSecurityData extends Model
{
    // apdid_token
    /**
     * @example apdid_token
     *
     * @var string
     */
    public $apdidToken;

    // signature
    /**
     * @example signature
     *
     * @var string
     */
    public $signature;

    // solution_risk_code
    /**
     * @example solution_risk_code
     *
     * @var string
     */
    public $solutionRiskCode;
    protected $_name = [
        'apdidToken'       => 'apdid_token',
        'signature'        => 'signature',
        'solutionRiskCode' => 'solution_risk_code',
    ];

    public function validate()
    {
        Model::validateRequired('apdidToken', $this->apdidToken, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('solutionRiskCode', $this->solutionRiskCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apdidToken) {
            $res['apdid_token'] = $this->apdidToken;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->solutionRiskCode) {
            $res['solution_risk_code'] = $this->solutionRiskCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MarketingRiskSecurityData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apdid_token'])) {
            $model->apdidToken = $map['apdid_token'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['solution_risk_code'])) {
            $model->solutionRiskCode = $map['solution_risk_code'];
        }

        return $model;
    }
}
