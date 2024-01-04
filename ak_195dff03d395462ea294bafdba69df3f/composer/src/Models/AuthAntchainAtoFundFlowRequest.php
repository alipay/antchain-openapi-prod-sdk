<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class AuthAntchainAtoFundFlowRequest extends Model
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

    // 签署的电子合同ID
    /**
     * @var string
     */
    public $signNo;

    // 签署区域的tag，和发起签署流程的机构的tag对应
    /**
     * @var string
     */
    public $tag;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'orderId'           => 'order_id',
        'signNo'            => 'sign_no',
        'tag'               => 'tag',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('signNo', $this->signNo, true);
        Model::validateRequired('tag', $this->tag, true);
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
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthAntchainAtoFundFlowRequest
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
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }

        return $model;
    }
}
