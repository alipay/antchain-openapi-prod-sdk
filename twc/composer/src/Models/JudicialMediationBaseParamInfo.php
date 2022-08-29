<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class JudicialMediationBaseParamInfo extends Model
{
    // 委托调解时长(天), 仅支持:30,60,90
    /**
     * @example 30
     *
     * @var int
     */
    public $mediationDayLimit;

    // 调解总标的金额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $mediationTotalAmount;

    // 可接受最低调解回款金额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $minAmount;
    protected $_name = [
        'mediationDayLimit'    => 'mediation_day_limit',
        'mediationTotalAmount' => 'mediation_total_amount',
        'minAmount'            => 'min_amount',
    ];

    public function validate()
    {
        Model::validateRequired('mediationDayLimit', $this->mediationDayLimit, true);
        Model::validateRequired('mediationTotalAmount', $this->mediationTotalAmount, true);
        Model::validateRequired('minAmount', $this->minAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mediationDayLimit) {
            $res['mediation_day_limit'] = $this->mediationDayLimit;
        }
        if (null !== $this->mediationTotalAmount) {
            $res['mediation_total_amount'] = $this->mediationTotalAmount;
        }
        if (null !== $this->minAmount) {
            $res['min_amount'] = $this->minAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudicialMediationBaseParamInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mediation_day_limit'])) {
            $model->mediationDayLimit = $map['mediation_day_limit'];
        }
        if (isset($map['mediation_total_amount'])) {
            $model->mediationTotalAmount = $map['mediation_total_amount'];
        }
        if (isset($map['min_amount'])) {
            $model->minAmount = $map['min_amount'];
        }

        return $model;
    }
}
