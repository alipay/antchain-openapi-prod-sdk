<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeCustomerAgreementsignRequest extends Model
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

    // 客户编码
    /**
     * @var string
     */
    public $customNo;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 资金方编号
    /**
     * @var string
     */
    public $fundCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customNo'          => 'custom_no',
        'orderNo'           => 'order_no',
        'fundCode'          => 'fund_code',
    ];

    public function validate()
    {
        Model::validateRequired('customNo', $this->customNo, true);
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
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeCustomerAgreementsignRequest
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
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }

        return $model;
    }
}
