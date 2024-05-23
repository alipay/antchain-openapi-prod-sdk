<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateWithholdSignRequest extends Model
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

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 支付宝商户id，使用签约能力前时候进行向平台申请
    /**
     * @var string
     */
    public $alipayMerchantId;

    // 支付宝商户名称，会展示在支付并签约界面
    /**
     * @var string
     */
    public $alipayMerchantName;

    // 支付宝商户服务名称，会展示在支付并签约界面
    /**
     * @var string
     */
    public $alipayMerchantServiceName;

    // 支付宝商户服务描述，会展示在支付并签约界面
    /**
     * @var string
     */
    public $alipayMerchantServiceDescription;

    // 支付宝uid，非必填
    /**
     * @var string
     */
    public $alipayUserId;
    protected $_name = [
        'authToken'                        => 'auth_token',
        'productInstanceId'                => 'product_instance_id',
        'orderId'                          => 'order_id',
        'alipayMerchantId'                 => 'alipay_merchant_id',
        'alipayMerchantName'               => 'alipay_merchant_name',
        'alipayMerchantServiceName'        => 'alipay_merchant_service_name',
        'alipayMerchantServiceDescription' => 'alipay_merchant_service_description',
        'alipayUserId'                     => 'alipay_user_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('alipayMerchantId', $this->alipayMerchantId, 20);
        Model::validateMaxLength('alipayMerchantName', $this->alipayMerchantName, 50);
        Model::validateMaxLength('alipayMerchantServiceName', $this->alipayMerchantServiceName, 50);
        Model::validateMaxLength('alipayMerchantServiceDescription', $this->alipayMerchantServiceDescription, 150);
        Model::validateMaxLength('alipayUserId', $this->alipayUserId, 128);
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
        if (null !== $this->alipayMerchantId) {
            $res['alipay_merchant_id'] = $this->alipayMerchantId;
        }
        if (null !== $this->alipayMerchantName) {
            $res['alipay_merchant_name'] = $this->alipayMerchantName;
        }
        if (null !== $this->alipayMerchantServiceName) {
            $res['alipay_merchant_service_name'] = $this->alipayMerchantServiceName;
        }
        if (null !== $this->alipayMerchantServiceDescription) {
            $res['alipay_merchant_service_description'] = $this->alipayMerchantServiceDescription;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateWithholdSignRequest
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
        if (isset($map['alipay_merchant_id'])) {
            $model->alipayMerchantId = $map['alipay_merchant_id'];
        }
        if (isset($map['alipay_merchant_name'])) {
            $model->alipayMerchantName = $map['alipay_merchant_name'];
        }
        if (isset($map['alipay_merchant_service_name'])) {
            $model->alipayMerchantServiceName = $map['alipay_merchant_service_name'];
        }
        if (isset($map['alipay_merchant_service_description'])) {
            $model->alipayMerchantServiceDescription = $map['alipay_merchant_service_description'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }

        return $model;
    }
}
