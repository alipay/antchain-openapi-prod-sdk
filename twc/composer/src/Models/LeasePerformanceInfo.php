<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeasePerformanceInfo extends Model
{
    // 支付租金总额
    /**
     * @example 123.00
     *
     * @var string
     */
    public $rentPayTotal;

    // 买断金额
    /**
     * @example 123.00
     *
     * @var string
     */
    public $buyoutAmount;

    // 租赁分期履约信息
    /**
     * @example
     *
     * @var RentalInstallmentPerformance[]
     */
    public $rentalInstallmentPerformance;
    protected $_name = [
        'rentPayTotal'                 => 'rent_pay_total',
        'buyoutAmount'                 => 'buyout_amount',
        'rentalInstallmentPerformance' => 'rental_installment_performance',
    ];

    public function validate()
    {
        Model::validateRequired('rentPayTotal', $this->rentPayTotal, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rentPayTotal) {
            $res['rent_pay_total'] = $this->rentPayTotal;
        }
        if (null !== $this->buyoutAmount) {
            $res['buyout_amount'] = $this->buyoutAmount;
        }
        if (null !== $this->rentalInstallmentPerformance) {
            $res['rental_installment_performance'] = [];
            if (null !== $this->rentalInstallmentPerformance && \is_array($this->rentalInstallmentPerformance)) {
                $n = 0;
                foreach ($this->rentalInstallmentPerformance as $item) {
                    $res['rental_installment_performance'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeasePerformanceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rent_pay_total'])) {
            $model->rentPayTotal = $map['rent_pay_total'];
        }
        if (isset($map['buyout_amount'])) {
            $model->buyoutAmount = $map['buyout_amount'];
        }
        if (isset($map['rental_installment_performance'])) {
            if (!empty($map['rental_installment_performance'])) {
                $model->rentalInstallmentPerformance = [];
                $n                                   = 0;
                foreach ($map['rental_installment_performance'] as $item) {
                    $model->rentalInstallmentPerformance[$n++] = null !== $item ? RentalInstallmentPerformance::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
