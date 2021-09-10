<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PersonLoss extends Model
{
    // 伤情，HOSPITALIZE-住院，CLINIC-门诊，DEATH-死亡，ALLOWANCE-津贴
    /**
     * @example CLINIC
     *
     * @var string
     */
    public $personInjuredCondition;

    // 伤者姓名
    /**
     * @example 王大毛
     *
     * @var string
     */
    public $personInjuredName;

    // 损失预估，单位（元），最多支持2位小数
    /**
     * @example 68.00
     *
     * @var string
     */
    public $personLossEstimateAmount;
    protected $_name = [
        'personInjuredCondition'   => 'person_injured_condition',
        'personInjuredName'        => 'person_injured_name',
        'personLossEstimateAmount' => 'person_loss_estimate_amount',
    ];

    public function validate()
    {
        Model::validateRequired('personInjuredCondition', $this->personInjuredCondition, true);
        Model::validateRequired('personInjuredName', $this->personInjuredName, true);
        Model::validateMaxLength('personInjuredCondition', $this->personInjuredCondition, 50);
        Model::validateMaxLength('personInjuredName', $this->personInjuredName, 200);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->personInjuredCondition) {
            $res['person_injured_condition'] = $this->personInjuredCondition;
        }
        if (null !== $this->personInjuredName) {
            $res['person_injured_name'] = $this->personInjuredName;
        }
        if (null !== $this->personLossEstimateAmount) {
            $res['person_loss_estimate_amount'] = $this->personLossEstimateAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersonLoss
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['person_injured_condition'])) {
            $model->personInjuredCondition = $map['person_injured_condition'];
        }
        if (isset($map['person_injured_name'])) {
            $model->personInjuredName = $map['person_injured_name'];
        }
        if (isset($map['person_loss_estimate_amount'])) {
            $model->personLossEstimateAmount = $map['person_loss_estimate_amount'];
        }

        return $model;
    }
}
