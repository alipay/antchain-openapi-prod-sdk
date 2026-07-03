<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PlatformRepayTypeInfo extends Model
{
    // 1：等额本息
    // 2：等额本金
    // 3：按期付息到期还本（先息后本）
    /**
     * @example 1
     *
     * @var string
     */
    public $repayType;

    // {”1“，”2“}
    /**
     * @example
     *
     * @var string[]
     */
    public $periods;
    protected $_name = [
        'repayType' => 'repay_type',
        'periods'   => 'periods',
    ];

    public function validate()
    {
        Model::validateRequired('repayType', $this->repayType, true);
        Model::validateRequired('periods', $this->periods, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->periods) {
            $res['periods'] = $this->periods;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PlatformRepayTypeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['periods'])) {
            if (!empty($map['periods'])) {
                $model->periods = $map['periods'];
            }
        }

        return $model;
    }
}
