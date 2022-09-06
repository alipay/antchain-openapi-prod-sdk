<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeSearchContractRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 原用信订单号
    /**
     * @var string
     */
    public $originalOrderNo;

    // 客户号
    /**
     * @var string
     */
    public $customerNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'originalOrderNo'   => 'original_order_no',
        'customerNo'        => 'customer_no',
    ];

    public function validate()
    {
        Model::validateRequired('originalOrderNo', $this->originalOrderNo, true);
        Model::validateRequired('customerNo', $this->customerNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->originalOrderNo) {
            $res['original_order_no'] = $this->originalOrderNo;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeSearchContractRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['original_order_no'])) {
            $model->originalOrderNo = $map['original_order_no'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }

        return $model;
    }
}
