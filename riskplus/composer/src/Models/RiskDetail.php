<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RiskDetail extends Model
{
    // 反欺诈风险数据服务命中规则风险权重
    /**
     * @example 1
     *
     * @var string
     */
    public $ruleWeight;

    // 反欺诈风险数据服务命中规则名称
    /**
     * @example 贷款车辆厂商指导价与实际不符
     *
     * @var string
     */
    public $ruleName;
    protected $_name = [
        'ruleWeight' => 'rule_weight',
        'ruleName'   => 'rule_name',
    ];

    public function validate()
    {
        Model::validateRequired('ruleWeight', $this->ruleWeight, true);
        Model::validateRequired('ruleName', $this->ruleName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ruleWeight) {
            $res['rule_weight'] = $this->ruleWeight;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rule_weight'])) {
            $model->ruleWeight = $map['rule_weight'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }

        return $model;
    }
}
