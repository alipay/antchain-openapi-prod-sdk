<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryBillingcoreMerchantinvoiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;
    protected $_name = [
        'authToken' => 'auth_token',
        'orderNo'   => 'order_no',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBillingcoreMerchantinvoiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }

        return $model;
    }
}
