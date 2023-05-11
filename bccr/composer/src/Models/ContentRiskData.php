<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ContentRiskData extends Model
{
    // 风险名称
    /**
     * @example 风险名称
     *
     * @var string
     */
    public $riskName;

    // 风险是否通过审查
    /**
     * @example true, false
     *
     * @var bool
     */
    public $riskResult;
    protected $_name = [
        'riskName'   => 'risk_name',
        'riskResult' => 'risk_result',
    ];

    public function validate()
    {
        Model::validateRequired('riskName', $this->riskName, true);
        Model::validateRequired('riskResult', $this->riskResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskName) {
            $res['risk_name'] = $this->riskName;
        }
        if (null !== $this->riskResult) {
            $res['risk_result'] = $this->riskResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentRiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_name'])) {
            $model->riskName = $map['risk_name'];
        }
        if (isset($map['risk_result'])) {
            $model->riskResult = $map['risk_result'];
        }

        return $model;
    }
}
