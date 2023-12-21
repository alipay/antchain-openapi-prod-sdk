<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class RefuseAntchainAtoFundFlowRequest extends Model
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

    // 订单所属商户的统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商户的订单号
    /**
     * @var string
     */
    public $orderId;

    // 签署合同单号
    /**
     * @var string
     */
    public $signNo;

    // 填写拒绝落章原因，如果同意则不用填写
    /**
     * @var string
     */
    public $signReason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'orderId'           => 'order_id',
        'signNo'            => 'sign_no',
        'signReason'        => 'sign_reason',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('signNo', $this->signNo, true);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->signNo) {
            $res['sign_no'] = $this->signNo;
        }
        if (null !== $this->signReason) {
            $res['sign_reason'] = $this->signReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefuseAntchainAtoFundFlowRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['sign_no'])) {
            $model->signNo = $map['sign_no'];
        }
        if (isset($map['sign_reason'])) {
            $model->signReason = $map['sign_reason'];
        }

        return $model;
    }
}
