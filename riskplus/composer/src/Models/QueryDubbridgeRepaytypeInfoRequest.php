<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepaytypeInfoRequest extends Model
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

    // 客户号
    /**
     * @var string
     */
    public $customerNo;

    // 资金方编号
    /**
     * @var string
     */
    public $fundCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customerNo'        => 'customer_no',
        'fundCode'          => 'fund_code',
    ];

    public function validate()
    {
        Model::validateRequired('customerNo', $this->customerNo, true);
        Model::validateRequired('fundCode', $this->fundCode, true);
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
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRepaytypeInfoRequest
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
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }

        return $model;
    }
}
