<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPOrderApplyInfo extends Model
{
    // 授权合作商品
    /**
     * @example 授权合作商品
     *
     * @var string
     */
    public $authGoods;

    // 销售规模数量
    /**
     * @example 10000
     *
     * @var int
     */
    public $salesAmount;

    // 销售规模金额
    /**
     * @example 1000.00
     *
     * @var string
     */
    public $salesNumber;
    protected $_name = [
        'authGoods'   => 'auth_goods',
        'salesAmount' => 'sales_amount',
        'salesNumber' => 'sales_number',
    ];

    public function validate()
    {
        Model::validateRequired('authGoods', $this->authGoods, true);
        Model::validateRequired('salesAmount', $this->salesAmount, true);
        Model::validateRequired('salesNumber', $this->salesNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authGoods) {
            $res['auth_goods'] = $this->authGoods;
        }
        if (null !== $this->salesAmount) {
            $res['sales_amount'] = $this->salesAmount;
        }
        if (null !== $this->salesNumber) {
            $res['sales_number'] = $this->salesNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPOrderApplyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_goods'])) {
            $model->authGoods = $map['auth_goods'];
        }
        if (isset($map['sales_amount'])) {
            $model->salesAmount = $map['sales_amount'];
        }
        if (isset($map['sales_number'])) {
            $model->salesNumber = $map['sales_number'];
        }

        return $model;
    }
}
