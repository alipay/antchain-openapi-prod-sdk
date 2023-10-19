<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class RiskAssessData extends Model
{
    // 响应头
    /**
     * @example
     *
     * @var ResponseHead
     */
    public $head;

    // 风险评估结果
    /**
     * @example
     *
     * @var RiskAssessResult
     */
    public $riskResult;
    protected $_name = [
        'head'       => 'head',
        'riskResult' => 'risk_result',
    ];

    public function validate()
    {
        Model::validateRequired('head', $this->head, true);
        Model::validateRequired('riskResult', $this->riskResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->head) {
            $res['head'] = null !== $this->head ? $this->head->toMap() : null;
        }
        if (null !== $this->riskResult) {
            $res['risk_result'] = null !== $this->riskResult ? $this->riskResult->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskAssessData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['head'])) {
            $model->head = ResponseHead::fromMap($map['head']);
        }
        if (isset($map['risk_result'])) {
            $model->riskResult = RiskAssessResult::fromMap($map['risk_result']);
        }

        return $model;
    }
}
