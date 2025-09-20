<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class CheckOmngRiskRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // 手机号
    /**
     * @var string
     */
    public $mobilePhone;

    // 产品ID=实际产品ID#版本
    // prod#1
    /**
     * @var string
     */
    public $productId;

    // 商户的统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商户公司名字
    /**
     * @var string
     */
    public $merchantName;

    // 业务场景
    // 默认为CHARGING_BY_TERM
    //
    // CHARGING_BY_ORDER : 整单结算
    // CHARGING_BY_TERM : 分期结算
    // CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
    // CHARGING_BY_PROFIT : 分润结算
    /**
     * @var string
     */
    public $bizScene;

    // 业务类型
    // LEASE : 租赁 （默认）
    // INSTALLMENT: 分期付款
    //
    /**
     * @var string
     */
    public $bizType;

    // 签署模式
    // NONE : 灵活签约
    /**
     * @var string
     */
    public $signMode;

    // 主订单信息
    /**
     * @var OrderInfoReq
     */
    public $orderInfo;

    // 订单还款计划
    /**
     * @var OrderPromise
     */
    public $promiseInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'mobilePhone'       => 'mobile_phone',
        'productId'         => 'product_id',
        'merchantId'        => 'merchant_id',
        'merchantName'      => 'merchant_name',
        'bizScene'          => 'biz_scene',
        'bizType'           => 'biz_type',
        'signMode'          => 'sign_mode',
        'orderInfo'         => 'order_info',
        'promiseInfo'       => 'promise_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('mobilePhone', $this->mobilePhone, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('signMode', $this->signMode, true);
        Model::validateRequired('orderInfo', $this->orderInfo, true);
        Model::validateRequired('promiseInfo', $this->promiseInfo, true);
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
        if (null !== $this->mobilePhone) {
            $res['mobile_phone'] = $this->mobilePhone;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->signMode) {
            $res['sign_mode'] = $this->signMode;
        }
        if (null !== $this->orderInfo) {
            $res['order_info'] = null !== $this->orderInfo ? $this->orderInfo->toMap() : null;
        }
        if (null !== $this->promiseInfo) {
            $res['promise_info'] = null !== $this->promiseInfo ? $this->promiseInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckOmngRiskRequest
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
        if (isset($map['mobile_phone'])) {
            $model->mobilePhone = $map['mobile_phone'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['sign_mode'])) {
            $model->signMode = $map['sign_mode'];
        }
        if (isset($map['order_info'])) {
            $model->orderInfo = OrderInfoReq::fromMap($map['order_info']);
        }
        if (isset($map['promise_info'])) {
            $model->promiseInfo = OrderPromise::fromMap($map['promise_info']);
        }

        return $model;
    }
}
