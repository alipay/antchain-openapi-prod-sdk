<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class ShareRefundInfo extends Model
{
    // 商户id
    /**
     * @example 1000
     *
     * @var string
     */
    public $merchantId;

    // 分账金额,整数、单位为分
    /**
     * @example 100
     *
     * @var string
     */
    public $amount;
    protected $_name = [
        'merchantId' => 'merchant_id',
        'amount'     => 'amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ShareRefundInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }

        return $model;
    }
}
