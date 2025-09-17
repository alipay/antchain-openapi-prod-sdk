<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyBenefithubRiskPayunilateralRequest extends Model
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

    // 业务操作类型,目前只支持下单
    /**
     * @var string
     */
    public $bizType;

    // 外部支付的订单号
    /**
     * @var string
     */
    public $paymentNo;

    // 订单状态
    /**
     * @var string
     */
    public $status;

    // 订单金额
    /**
     * @var string
     */
    public $orderAmount;

    // 订单实际支付金额
    /**
     * @var string
     */
    public $paymentAmount;

    // 支付时间
    /**
     * @var string
     */
    public $paymentTime;

    // 支付使用的方式
    /**
     * @var string
     */
    public $paymentMethodType;

    // 三方支付流水号
    /**
     * @var string
     */
    public $capNum;

    // 支付通道商户号
    /**
     * @var string
     */
    public $merchantNo;

    // 订单类型，订阅、单次购买等
    /**
     * @var string
     */
    public $orderType;

    // 订单来源
    /**
     * @var string
     */
    public $orderSource;

    // 平台code，由蚂蚁数科颁发的特定平台code，用于报告产品授权使用
    /**
     * @var string
     */
    public $platformCode;

    // 用户唯一id，流量平台提供，内部结合platformCode 组成唯一code
    /**
     * @var string
     */
    public $userUniqueId;

    // 产品code，具体的报告产品；不同产品价格、展示内容可能均不一样，可通过产品code区分不同场景
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'paymentNo'         => 'payment_no',
        'status'            => 'status',
        'orderAmount'       => 'order_amount',
        'paymentAmount'     => 'payment_amount',
        'paymentTime'       => 'payment_time',
        'paymentMethodType' => 'payment_method_type',
        'capNum'            => 'cap_num',
        'merchantNo'        => 'merchant_no',
        'orderType'         => 'order_type',
        'orderSource'       => 'order_source',
        'platformCode'      => 'platform_code',
        'userUniqueId'      => 'user_unique_id',
        'productCode'       => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('paymentNo', $this->paymentNo, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('orderAmount', $this->orderAmount, true);
        Model::validateRequired('paymentAmount', $this->paymentAmount, true);
        Model::validateRequired('paymentTime', $this->paymentTime, true);
        Model::validateRequired('paymentMethodType', $this->paymentMethodType, true);
        Model::validateRequired('capNum', $this->capNum, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('orderSource', $this->orderSource, true);
        Model::validateRequired('platformCode', $this->platformCode, true);
        Model::validateRequired('userUniqueId', $this->userUniqueId, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->paymentNo) {
            $res['payment_no'] = $this->paymentNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->orderAmount) {
            $res['order_amount'] = $this->orderAmount;
        }
        if (null !== $this->paymentAmount) {
            $res['payment_amount'] = $this->paymentAmount;
        }
        if (null !== $this->paymentTime) {
            $res['payment_time'] = $this->paymentTime;
        }
        if (null !== $this->paymentMethodType) {
            $res['payment_method_type'] = $this->paymentMethodType;
        }
        if (null !== $this->capNum) {
            $res['cap_num'] = $this->capNum;
        }
        if (null !== $this->merchantNo) {
            $res['merchant_no'] = $this->merchantNo;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->orderSource) {
            $res['order_source'] = $this->orderSource;
        }
        if (null !== $this->platformCode) {
            $res['platform_code'] = $this->platformCode;
        }
        if (null !== $this->userUniqueId) {
            $res['user_unique_id'] = $this->userUniqueId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyBenefithubRiskPayunilateralRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['payment_no'])) {
            $model->paymentNo = $map['payment_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['order_amount'])) {
            $model->orderAmount = $map['order_amount'];
        }
        if (isset($map['payment_amount'])) {
            $model->paymentAmount = $map['payment_amount'];
        }
        if (isset($map['payment_time'])) {
            $model->paymentTime = $map['payment_time'];
        }
        if (isset($map['payment_method_type'])) {
            $model->paymentMethodType = $map['payment_method_type'];
        }
        if (isset($map['cap_num'])) {
            $model->capNum = $map['cap_num'];
        }
        if (isset($map['merchant_no'])) {
            $model->merchantNo = $map['merchant_no'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['order_source'])) {
            $model->orderSource = $map['order_source'];
        }
        if (isset($map['platform_code'])) {
            $model->platformCode = $map['platform_code'];
        }
        if (isset($map['user_unique_id'])) {
            $model->userUniqueId = $map['user_unique_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
