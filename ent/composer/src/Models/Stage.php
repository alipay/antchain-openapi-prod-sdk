<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class Stage extends Model
{
    // 票数区间上限
    /**
     * @example 1000
     *
     * @var int
     */
    public $upperLimit;

    // 票数区间下限
    /**
     * @example 500
     *
     * @var int
     */
    public $lowerLimit;

    // 当前区间粉丝粒数量，单位分个
    /**
     * @example 100
     *
     * @var int
     */
    public $tokenAmount;

    // 当前区间粉丝粒价格，单位分
    /**
     * @example 200
     *
     * @var int
     */
    public $tokenPrice;
    protected $_name = [
        'upperLimit'  => 'upper_limit',
        'lowerLimit'  => 'lower_limit',
        'tokenAmount' => 'token_amount',
        'tokenPrice'  => 'token_price',
    ];

    public function validate()
    {
        Model::validateRequired('upperLimit', $this->upperLimit, true);
        Model::validateRequired('lowerLimit', $this->lowerLimit, true);
        Model::validateRequired('tokenAmount', $this->tokenAmount, true);
        Model::validateRequired('tokenPrice', $this->tokenPrice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->upperLimit) {
            $res['upper_limit'] = $this->upperLimit;
        }
        if (null !== $this->lowerLimit) {
            $res['lower_limit'] = $this->lowerLimit;
        }
        if (null !== $this->tokenAmount) {
            $res['token_amount'] = $this->tokenAmount;
        }
        if (null !== $this->tokenPrice) {
            $res['token_price'] = $this->tokenPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Stage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['upper_limit'])) {
            $model->upperLimit = $map['upper_limit'];
        }
        if (isset($map['lower_limit'])) {
            $model->lowerLimit = $map['lower_limit'];
        }
        if (isset($map['token_amount'])) {
            $model->tokenAmount = $map['token_amount'];
        }
        if (isset($map['token_price'])) {
            $model->tokenPrice = $map['token_price'];
        }

        return $model;
    }
}
