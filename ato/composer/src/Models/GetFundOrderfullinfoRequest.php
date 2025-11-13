<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class GetFundOrderfullinfoRequest extends Model
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

    // 订单Id
    /**
     * @var string
     */
    public $orderId;

    // 订单所属商户的社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 订单所属商户的社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 123
    /**
     * @var string
     */
    public $bizType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'fundId'            => 'fund_id',
        'bizType'           => 'biz_type',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('merchantId', $this->merchantId, 64);
        Model::validateMaxLength('fundId', $this->fundId, 64);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('fundId', $this->fundId, 1);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetFundOrderfullinfoRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }

        return $model;
    }
}
