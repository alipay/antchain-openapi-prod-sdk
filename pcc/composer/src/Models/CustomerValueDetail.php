<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class CustomerValueDetail extends Model
{
    // 名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 友商价格
    /**
     * @example test
     *
     * @var string
     */
    public $profit;

    // 蚂蚁收益
    /**
     * @example test
     *
     * @var string
     */
    public $antDivide;

    // BD权限价预估
    /**
     * @example test
     *
     * @var string
     */
    public $bdPricePredict;
    protected $_name = [
        'name'           => 'name',
        'profit'         => 'profit',
        'antDivide'      => 'ant_divide',
        'bdPricePredict' => 'bd_price_predict',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->profit) {
            $res['profit'] = $this->profit;
        }
        if (null !== $this->antDivide) {
            $res['ant_divide'] = $this->antDivide;
        }
        if (null !== $this->bdPricePredict) {
            $res['bd_price_predict'] = $this->bdPricePredict;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerValueDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['profit'])) {
            $model->profit = $map['profit'];
        }
        if (isset($map['ant_divide'])) {
            $model->antDivide = $map['ant_divide'];
        }
        if (isset($map['bd_price_predict'])) {
            $model->bdPricePredict = $map['bd_price_predict'];
        }

        return $model;
    }
}
