<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class WorkersWagePayment extends Model
{
    // 薪资年月
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $payYM;

    // 工资是否发放[已发放 未发放]
    /**
     * @example 已发放
     *
     * @var string
     */
    public $payWages;
    protected $_name = [
        'payYM'    => 'pay_y_m',
        'payWages' => 'pay_wages',
    ];

    public function validate()
    {
        Model::validateRequired('payYM', $this->payYM, true);
        Model::validateRequired('payWages', $this->payWages, true);
        Model::validatePattern('payYM', $this->payYM, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payYM) {
            $res['pay_y_m'] = $this->payYM;
        }
        if (null !== $this->payWages) {
            $res['pay_wages'] = $this->payWages;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkersWagePayment
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_y_m'])) {
            $model->payYM = $map['pay_y_m'];
        }
        if (isset($map['pay_wages'])) {
            $model->payWages = $map['pay_wages'];
        }

        return $model;
    }
}
