<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclPromiseInfo extends Model
{
    // 承诺租期 单位
    // 月 MONTH
    /**
     * @example MONTH
     *
     * @var string
     */
    public $rentUnit;

    // 总期数
    /**
     * @example 12
     *
     * @var int
     */
    public $rentTerm;

    // 总金额 单位分
    /**
     * @example 123123
     *
     * @var int
     */
    public $totalRentMoney;

    // 承诺履约详情
    /**
     * @example
     *
     * @var BclPromiseDetailInfo[]
     */
    public $promiseDetails;
    protected $_name = [
        'rentUnit'       => 'rent_unit',
        'rentTerm'       => 'rent_term',
        'totalRentMoney' => 'total_rent_money',
        'promiseDetails' => 'promise_details',
    ];

    public function validate()
    {
        Model::validateRequired('rentUnit', $this->rentUnit, true);
        Model::validateRequired('rentTerm', $this->rentTerm, true);
        Model::validateRequired('totalRentMoney', $this->totalRentMoney, true);
        Model::validateRequired('promiseDetails', $this->promiseDetails, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rentUnit) {
            $res['rent_unit'] = $this->rentUnit;
        }
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }
        if (null !== $this->promiseDetails) {
            $res['promise_details'] = [];
            if (null !== $this->promiseDetails && \is_array($this->promiseDetails)) {
                $n = 0;
                foreach ($this->promiseDetails as $item) {
                    $res['promise_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclPromiseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rent_unit'])) {
            $model->rentUnit = $map['rent_unit'];
        }
        if (isset($map['rent_term'])) {
            $model->rentTerm = $map['rent_term'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }
        if (isset($map['promise_details'])) {
            if (!empty($map['promise_details'])) {
                $model->promiseDetails = [];
                $n                     = 0;
                foreach ($map['promise_details'] as $item) {
                    $model->promiseDetails[$n++] = null !== $item ? BclPromiseDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
