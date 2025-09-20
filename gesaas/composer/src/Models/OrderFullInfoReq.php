<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class OrderFullInfoReq extends Model
{
    // 订单号
    //
    /**
     * @example 1798234932684395
     *
     * @var string
     */
    public $orderId;

    // 手机号
    /**
     * @example 15629827201
     *
     * @var string
     */
    public $mobilePhone;

    // 产品ID=实际产品ID#版本 prod#1
    //
    /**
     * @example prod#1
     *
     * @var string
     */
    public $productId;

    // 商户的统一社会信用代码
    /**
     * @example 2088xxx
     *
     * @var string
     */
    public $merchantId;

    // 商户公司名字
    /**
     * @example 蚂蚁云创xxx有限公司
     *
     * @var string
     */
    public $merchantName;

    // 业务场景 默认为CHARGING_BY_TERM
    // CHARGING_BY_ORDER : 整单结算
    // CHARGING_BY_TERM : 分期结算
    // CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
    // CHARGING_BY_PROFIT : 分润结算
    /**
     * @example CHARGING_BY_TERM
     *
     * @var string
     */
    public $bizScene;

    // 业务类型 LEASE : 租赁 （默认） INSTALLMENT: 分期付款
    //
    /**
     * @example INSTALLMENT
     *
     * @var string
     */
    public $bizType;

    // 签署模式 NONE : 灵活签约
    /**
     * @example NONE
     *
     * @var string
     */
    public $signMode;

    // 主订单信息
    /**
     * @example
     *
     * @var OrderInfoReq
     */
    public $orderInfo;

    // 订单还款计划
    /**
     * @example
     *
     * @var OrderPromise
     */
    public $promiseInfo;
    protected $_name = [
        'orderId'      => 'order_id',
        'mobilePhone'  => 'mobile_phone',
        'productId'    => 'product_id',
        'merchantId'   => 'merchant_id',
        'merchantName' => 'merchant_name',
        'bizScene'     => 'biz_scene',
        'bizType'      => 'biz_type',
        'signMode'     => 'sign_mode',
        'orderInfo'    => 'order_info',
        'promiseInfo'  => 'promise_info',
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
     * @return OrderFullInfoReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
