<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryInterestSuppliersubjectRequest extends Model
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

    // 权益流水号
    /**
     * @var string
     */
    public $interestNo;
    protected $_name = [
        'authToken'  => 'auth_token',
        'orderNo'    => 'order_no',
        'interestNo' => 'interest_no',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('interestNo', $this->interestNo, true);
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
        if (null !== $this->interestNo) {
            $res['interest_no'] = $this->interestNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInterestSuppliersubjectRequest
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
        if (isset($map['interest_no'])) {
            $model->interestNo = $map['interest_no'];
        }

        return $model;
    }
}
