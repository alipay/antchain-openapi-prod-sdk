<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerFundmngloanresultsRequest extends Model
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

    // 资方的租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 商户的租户id
    /**
     * @var string
     */
    public $tenantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 商户的社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 资方的社会统一信用代码
    /**
     * @var string
     */
    public $fundId;

    // 同步类型
    // AGREE_RETRY（同意重试）
    // AGREE （同意）
    // REJECT（拒绝）
    /**
     * @var string
     */
    public $type;

    // 融资模式
    // 供应链金融：
    // SUPPLY_CHAIN_FINANCE
    // 自定义还款：
    // DEFAULT
    /**
     * @var string
     */
    public $fundMode;

    // 融资放款结果，FinanceLoanResults
    /**
     * @var string
     */
    public $financeLoanResults;

    // 商户履约承诺MerchantPromiseInfo
    /**
     * @var string
     */
    public $merchantPromiseInfo;

    // 推广id
    /**
     * @var string
     */
    public $promotionId;

    // 商户起始还款期数
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

    // traceid
    /**
     * @var string
     */
    public $traceId;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'fundTenantId'            => 'fund_tenant_id',
        'tenantId'                => 'tenant_id',
        'orderId'                 => 'order_id',
        'merchantId'              => 'merchant_id',
        'fundId'                  => 'fund_id',
        'type'                    => 'type',
        'fundMode'                => 'fund_mode',
        'financeLoanResults'      => 'finance_loan_results',
        'merchantPromiseInfo'     => 'merchant_promise_info',
        'promotionId'             => 'promotion_id',
        'payStartTermIndex'       => 'pay_start_term_index',
        'divideAlipayUserId'      => 'divide_alipay_user_id',
        'divideAlipayLoginId'     => 'divide_alipay_login_id',
        'compensateAlipayUserId'  => 'compensate_alipay_user_id',
        'compensateAlipayLoginId' => 'compensate_alipay_login_id',
        'traceId'                 => 'trace_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('fundMode', $this->fundMode, true);
        Model::validateRequired('traceId', $this->traceId, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->financeLoanResults) {
            $res['finance_loan_results'] = $this->financeLoanResults;
        }
        if (null !== $this->merchantPromiseInfo) {
            $res['merchant_promise_info'] = $this->merchantPromiseInfo;
        }
        if (null !== $this->promotionId) {
            $res['promotion_id'] = $this->promotionId;
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
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerFundmngloanresultsRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['finance_loan_results'])) {
            $model->financeLoanResults = $map['finance_loan_results'];
        }
        if (isset($map['merchant_promise_info'])) {
            $model->merchantPromiseInfo = $map['merchant_promise_info'];
        }
        if (isset($map['promotion_id'])) {
            $model->promotionId = $map['promotion_id'];
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
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }

        return $model;
    }
}
