<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCommissionSeparateSetInfo extends Model
{
    // 授权品类
    /**
     * @example 服装
     *
     * @var string
     */
    public $category;

    // 佣金比例
    /**
     * @example 8
     *
     * @var string
     */
    public $commissionWeight;

    // 保底商品销售金额
    /**
     * @example 100
     *
     * @var string
     */
    public $guaranteeSaleNumber;
    protected $_name = [
        'category'            => 'category',
        'commissionWeight'    => 'commission_weight',
        'guaranteeSaleNumber' => 'guarantee_sale_number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->commissionWeight) {
            $res['commission_weight'] = $this->commissionWeight;
        }
        if (null !== $this->guaranteeSaleNumber) {
            $res['guarantee_sale_number'] = $this->guaranteeSaleNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCommissionSeparateSetInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['commission_weight'])) {
            $model->commissionWeight = $map['commission_weight'];
        }
        if (isset($map['guarantee_sale_number'])) {
            $model->guaranteeSaleNumber = $map['guarantee_sale_number'];
        }

        return $model;
    }
}
