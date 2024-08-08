<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ReplaceTradeUserpromiseRequest extends Model
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

    // json字符串
    /**
     * @var string
     */
    public $bizContent;

    // order_id
    /**
     * @var string
     */
    public $orderId;

    // 订单所属商户社会信用代码
    /**
     * @var string
     */
    public $merchantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizContent'        => 'biz_content',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('merchantId', $this->merchantId, 200);
        Model::validateMinLength('orderId', $this->orderId, 6);
        Model::validateMinLength('merchantId', $this->merchantId, 0);
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
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReplaceTradeUserpromiseRequest
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
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }

        return $model;
    }
}
