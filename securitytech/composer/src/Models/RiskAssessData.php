<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

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
     * @example A238EE36A9E096A97BF49C568EE7D0F4543043E21CE1A9831303EFDD
     *
     * @var string
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
            $res['risk_result'] = $this->riskResult;
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
            $model->riskResult = $map['risk_result'];
        }

        return $model;
    }
}
