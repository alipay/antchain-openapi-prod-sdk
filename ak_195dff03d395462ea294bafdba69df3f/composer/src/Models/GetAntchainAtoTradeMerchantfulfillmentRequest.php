<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class GetAntchainAtoTradeMerchantfulfillmentRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 订单所属商户的社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 履约期数，不填返回为所有履约期的履约信息
    // - 如果有填写，返回当前期数的履约信息，列表长度为1
    /**
     * @var int
     */
    public $termIdx;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'termIdx'           => 'term_idx',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('merchantId', $this->merchantId, 200);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->termIdx) {
            $res['term_idx'] = $this->termIdx;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntchainAtoTradeMerchantfulfillmentRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['term_idx'])) {
            $model->termIdx = $map['term_idx'];
        }

        return $model;
    }
}
