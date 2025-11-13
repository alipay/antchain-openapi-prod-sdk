<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class LeasePricePlan extends Model
{
    // 租赁方案
    /**
     * @example 租赁方案
     *
     * @var string
     */
    public $rentalPlan;

    // 租赁周期
    /**
     * @example
     *
     * @var int
     */
    public $rentalPeriod;

    // 租赁价格属性列表
    /**
     * @example
     *
     * @var LeasePriceProp[]
     */
    public $leasePricePropList;
    protected $_name = [
        'rentalPlan'         => 'rental_plan',
        'rentalPeriod'       => 'rental_period',
        'leasePricePropList' => 'lease_price_prop_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rentalPlan) {
            $res['rental_plan'] = $this->rentalPlan;
        }
        if (null !== $this->rentalPeriod) {
            $res['rental_period'] = $this->rentalPeriod;
        }
        if (null !== $this->leasePricePropList) {
            $res['lease_price_prop_list'] = [];
            if (null !== $this->leasePricePropList && \is_array($this->leasePricePropList)) {
                $n = 0;
                foreach ($this->leasePricePropList as $item) {
                    $res['lease_price_prop_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeasePricePlan
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rental_plan'])) {
            $model->rentalPlan = $map['rental_plan'];
        }
        if (isset($map['rental_period'])) {
            $model->rentalPeriod = $map['rental_period'];
        }
        if (isset($map['lease_price_prop_list'])) {
            if (!empty($map['lease_price_prop_list'])) {
                $model->leasePricePropList = [];
                $n                         = 0;
                foreach ($map['lease_price_prop_list'] as $item) {
                    $model->leasePricePropList[$n++] = null !== $item ? LeasePriceProp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
