<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class SubMetricData extends Model
{
    // 日期
    /**
     * @example 2024-09-11
     *
     * @var string
     */
    public $date;

    // 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
    /**
     * @example OPERATING_INCOME
     *
     * @var string
     */
    public $type;

    // 指标值
    /**
     * @example 891762.89
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'date'  => 'date',
        'type'  => 'type',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubMetricData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
