<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PriceDetail extends Model
{
    // 商品租赁期数
    /**
     * @example 1
     *
     * @var int
     */
    public $periodNum;

    // 押金，单位：元。精度：分。
    /**
     * @example 1000.00
     *
     * @var string
     */
    public $depositPrice;

    // 买断价格，单位：元，精度：分
    /**
     * @example 1000.00
     *
     * @var string
     */
    public $buyoutPrice;

    // 首期租金，单位：元，精度：分
    /**
     * @example 1000.00
     *
     * @var string
     */
    public $initialRentPrice;
    protected $_name = [
        'periodNum'        => 'period_num',
        'depositPrice'     => 'deposit_price',
        'buyoutPrice'      => 'buyout_price',
        'initialRentPrice' => 'initial_rent_price',
    ];

    public function validate()
    {
        Model::validateRequired('periodNum', $this->periodNum, true);
        Model::validateRequired('depositPrice', $this->depositPrice, true);
        Model::validateRequired('buyoutPrice', $this->buyoutPrice, true);
        Model::validateRequired('initialRentPrice', $this->initialRentPrice, true);
        Model::validateMaximum('periodNum', $this->periodNum, 1000);
        Model::validateMaxLength('depositPrice', $this->depositPrice, 10);
        Model::validateMaxLength('buyoutPrice', $this->buyoutPrice, 10);
        Model::validateMaxLength('initialRentPrice', $this->initialRentPrice, 10);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->depositPrice) {
            $res['deposit_price'] = $this->depositPrice;
        }
        if (null !== $this->buyoutPrice) {
            $res['buyout_price'] = $this->buyoutPrice;
        }
        if (null !== $this->initialRentPrice) {
            $res['initial_rent_price'] = $this->initialRentPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PriceDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['deposit_price'])) {
            $model->depositPrice = $map['deposit_price'];
        }
        if (isset($map['buyout_price'])) {
            $model->buyoutPrice = $map['buyout_price'];
        }
        if (isset($map['initial_rent_price'])) {
            $model->initialRentPrice = $map['initial_rent_price'];
        }

        return $model;
    }
}
