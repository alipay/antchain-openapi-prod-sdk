<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ApplyIpPackagetradeRequest extends Model
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

    // 基础参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 买方的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // IP授权交易时传入IP ID；增值服务交易时传入服务ID
    /**
     * @var string
     */
    public $ipId;

    // true 只上链不走真实支付，false 上链并链下真实支付账单
    /**
     * @var bool
     */
    public $onlyCallBlockchain;

    // 终端商品价格区间
    /**
     * @var string
     */
    public $priceRange;

    // 套餐中包含终端商品数量
    /**
     * @var int
     */
    public $amount;

    // 套餐交易应付金额，单位元，保留两位小数
    /**
     * @var string
     */
    public $expectedTotalPrice;

    // 授权合作开始期限（毫秒时间戳）
    /**
     * @var int
     */
    public $authBeginTime;

    // 授权合作结束期限（毫秒时间戳）
    /**
     * @var int
     */
    public $authEndTime;

    // 备注信息
    /**
     * @var string
     */
    public $memo;

    // 附加条款
    /**
     * @var string
     */
    public $additionalClause;

    // 授权产品范围
    /**
     * @var string
     */
    public $authProductScope;

    // 授权地域范围
    /**
     * @var string
     */
    public $authAreaScope;

    // 商品销售渠道
    /**
     * @var string
     */
    public $salesChannel;

    // 0 IP交易，1 增值服务交易
    /**
     * @var int
     */
    public $goodsType;

    // 增值服务交易绑定的ip授权交易订单，增值服务交易必填
    /**
     * @var string
     */
    public $relatedOrderId;

    // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
    /**
     * @var string
     */
    public $payReturnUrl;

    // 授权类型
    /**
     * @var string
     */
    public $authType;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'baseRequest'        => 'base_request',
        'accountId'          => 'account_id',
        'ipId'               => 'ip_id',
        'onlyCallBlockchain' => 'only_call_blockchain',
        'priceRange'         => 'price_range',
        'amount'             => 'amount',
        'expectedTotalPrice' => 'expected_total_price',
        'authBeginTime'      => 'auth_begin_time',
        'authEndTime'        => 'auth_end_time',
        'memo'               => 'memo',
        'additionalClause'   => 'additional_clause',
        'authProductScope'   => 'auth_product_scope',
        'authAreaScope'      => 'auth_area_scope',
        'salesChannel'       => 'sales_channel',
        'goodsType'          => 'goods_type',
        'relatedOrderId'     => 'related_order_id',
        'payReturnUrl'       => 'pay_return_url',
        'authType'           => 'auth_type',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('onlyCallBlockchain', $this->onlyCallBlockchain, true);
        Model::validateRequired('priceRange', $this->priceRange, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('expectedTotalPrice', $this->expectedTotalPrice, true);
        Model::validateRequired('authBeginTime', $this->authBeginTime, true);
        Model::validateRequired('authEndTime', $this->authEndTime, true);
        Model::validateRequired('memo', $this->memo, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->onlyCallBlockchain) {
            $res['only_call_blockchain'] = $this->onlyCallBlockchain;
        }
        if (null !== $this->priceRange) {
            $res['price_range'] = $this->priceRange;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->expectedTotalPrice) {
            $res['expected_total_price'] = $this->expectedTotalPrice;
        }
        if (null !== $this->authBeginTime) {
            $res['auth_begin_time'] = $this->authBeginTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->additionalClause) {
            $res['additional_clause'] = $this->additionalClause;
        }
        if (null !== $this->authProductScope) {
            $res['auth_product_scope'] = $this->authProductScope;
        }
        if (null !== $this->authAreaScope) {
            $res['auth_area_scope'] = $this->authAreaScope;
        }
        if (null !== $this->salesChannel) {
            $res['sales_channel'] = $this->salesChannel;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->relatedOrderId) {
            $res['related_order_id'] = $this->relatedOrderId;
        }
        if (null !== $this->payReturnUrl) {
            $res['pay_return_url'] = $this->payReturnUrl;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyIpPackagetradeRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['only_call_blockchain'])) {
            $model->onlyCallBlockchain = $map['only_call_blockchain'];
        }
        if (isset($map['price_range'])) {
            $model->priceRange = $map['price_range'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['expected_total_price'])) {
            $model->expectedTotalPrice = $map['expected_total_price'];
        }
        if (isset($map['auth_begin_time'])) {
            $model->authBeginTime = $map['auth_begin_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['additional_clause'])) {
            $model->additionalClause = $map['additional_clause'];
        }
        if (isset($map['auth_product_scope'])) {
            $model->authProductScope = $map['auth_product_scope'];
        }
        if (isset($map['auth_area_scope'])) {
            $model->authAreaScope = $map['auth_area_scope'];
        }
        if (isset($map['sales_channel'])) {
            $model->salesChannel = $map['sales_channel'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['related_order_id'])) {
            $model->relatedOrderId = $map['related_order_id'];
        }
        if (isset($map['pay_return_url'])) {
            $model->payReturnUrl = $map['pay_return_url'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }

        return $model;
    }
}
