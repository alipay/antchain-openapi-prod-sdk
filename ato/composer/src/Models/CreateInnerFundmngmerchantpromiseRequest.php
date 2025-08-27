<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerFundmngmerchantpromiseRequest extends Model
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

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 订单所属商户的社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 订单所属融资方的社会统一信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商家还款方式
    // FULL_REPAYMENT_PER_INSTALLMENT
    // (每期全额还款)
    /**
     * @var string
     */
    public $merchantPayType;

    // 商户代偿开始时间
    /**
     * @var int
     */
    public $merchantCompensateStartDay;

    // 商户还款开始期数
    /**
     * @var int
     */
    public $payStartTermIndex;

    // 分账支付宝账号uid
    /**
     * @var string
     */
    public $divideAlipayUserId;

    // 分账支付宝登录账号
    /**
     * @var string
     */
    public $divideAlipayLoginId;

    // 代偿支付宝账号uid
    /**
     * @var string
     */
    public $compensateAlipayUserId;

    // 代偿支付宝登录账号
    /**
     * @var string
     */
    public $compensateAlipayLoginId;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'fundTenantId'               => 'fund_tenant_id',
        'tenantId'                   => 'tenant_id',
        'orderId'                    => 'order_id',
        'merchantId'                 => 'merchant_id',
        'fundId'                     => 'fund_id',
        'merchantPayType'            => 'merchant_pay_type',
        'merchantCompensateStartDay' => 'merchant_compensate_start_day',
        'payStartTermIndex'          => 'pay_start_term_index',
        'divideAlipayUserId'         => 'divide_alipay_user_id',
        'divideAlipayLoginId'        => 'divide_alipay_login_id',
        'compensateAlipayUserId'     => 'compensate_alipay_user_id',
        'compensateAlipayLoginId'    => 'compensate_alipay_login_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('merchantPayType', $this->merchantPayType, true);
        Model::validateRequired('merchantCompensateStartDay', $this->merchantCompensateStartDay, true);
        Model::validateRequired('payStartTermIndex', $this->payStartTermIndex, true);
        Model::validateRequired('divideAlipayUserId', $this->divideAlipayUserId, true);
        Model::validateRequired('divideAlipayLoginId', $this->divideAlipayLoginId, true);
        Model::validateRequired('compensateAlipayUserId', $this->compensateAlipayUserId, true);
        Model::validateRequired('compensateAlipayLoginId', $this->compensateAlipayLoginId, true);
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
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
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
        if (null !== $this->merchantPayType) {
            $res['merchant_pay_type'] = $this->merchantPayType;
        }
        if (null !== $this->merchantCompensateStartDay) {
            $res['merchant_compensate_start_day'] = $this->merchantCompensateStartDay;
        }
        if (null !== $this->payStartTermIndex) {
            $res['pay_start_term_index'] = $this->payStartTermIndex;
        }
        if (null !== $this->divideAlipayUserId) {
            $res['divide_alipay_user_id'] = $this->divideAlipayUserId;
        }
        if (null !== $this->divideAlipayLoginId) {
            $res['divide_alipay_login_id'] = $this->divideAlipayLoginId;
        }
        if (null !== $this->compensateAlipayUserId) {
            $res['compensate_alipay_user_id'] = $this->compensateAlipayUserId;
        }
        if (null !== $this->compensateAlipayLoginId) {
            $res['compensate_alipay_login_id'] = $this->compensateAlipayLoginId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerFundmngmerchantpromiseRequest
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
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
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
        if (isset($map['merchant_pay_type'])) {
            $model->merchantPayType = $map['merchant_pay_type'];
        }
        if (isset($map['merchant_compensate_start_day'])) {
            $model->merchantCompensateStartDay = $map['merchant_compensate_start_day'];
        }
        if (isset($map['pay_start_term_index'])) {
            $model->payStartTermIndex = $map['pay_start_term_index'];
        }
        if (isset($map['divide_alipay_user_id'])) {
            $model->divideAlipayUserId = $map['divide_alipay_user_id'];
        }
        if (isset($map['divide_alipay_login_id'])) {
            $model->divideAlipayLoginId = $map['divide_alipay_login_id'];
        }
        if (isset($map['compensate_alipay_user_id'])) {
            $model->compensateAlipayUserId = $map['compensate_alipay_user_id'];
        }
        if (isset($map['compensate_alipay_login_id'])) {
            $model->compensateAlipayLoginId = $map['compensate_alipay_login_id'];
        }

        return $model;
    }
}
