<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ApplyIpAuthtradeRequest extends Model
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

    // 基础请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 采购者的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // IP授权交易时传入IP ID；增值服务交易时传入服务ID
    /**
     * @var string
     */
    public $ipId;

    // 收费模式：0 销售抽佣, 1 按量付费
    /**
     * @var int
     */
    public $chargeType;

    // 授权计费比例
    /**
     * @var string
     */
    public $authRate;

    // 按量付费的收费单价（按量付费模式必填）
    /**
     * @var string
     */
    public $authPrice;

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

    // 合同（文件URL）
    /**
     * @var string
     */
    public $contract;

    // 设计稿（文件URL）
    /**
     * @var string
     */
    public $designDraft;

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

    // 备注消息(不超过256个字符)
    /**
     * @var string
     */
    public $memo;

    // 是否有保底金
    /**
     * @var bool
     */
    public $guaranteed;

    // 支付的保底金金额
    /**
     * @var string
     */
    public $guaranteedFund;

    // 保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
    /**
     * @var int
     */
    public $guaranteedGoodsAmount;

    // 保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
    /**
     * @var string
     */
    public $guaranteedSales;

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
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'baseRequest'           => 'base_request',
        'accountId'             => 'account_id',
        'ipId'                  => 'ip_id',
        'chargeType'            => 'charge_type',
        'authRate'              => 'auth_rate',
        'authPrice'             => 'auth_price',
        'authBeginTime'         => 'auth_begin_time',
        'authEndTime'           => 'auth_end_time',
        'contract'              => 'contract',
        'designDraft'           => 'design_draft',
        'authProductScope'      => 'auth_product_scope',
        'authAreaScope'         => 'auth_area_scope',
        'salesChannel'          => 'sales_channel',
        'memo'                  => 'memo',
        'guaranteed'            => 'guaranteed',
        'guaranteedFund'        => 'guaranteed_fund',
        'guaranteedGoodsAmount' => 'guaranteed_goods_amount',
        'guaranteedSales'       => 'guaranteed_sales',
        'goodsType'             => 'goods_type',
        'relatedOrderId'        => 'related_order_id',
        'payReturnUrl'          => 'pay_return_url',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('authBeginTime', $this->authBeginTime, true);
        Model::validateRequired('authEndTime', $this->authEndTime, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('guaranteed', $this->guaranteed, true);
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
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->authRate) {
            $res['auth_rate'] = $this->authRate;
        }
        if (null !== $this->authPrice) {
            $res['auth_price'] = $this->authPrice;
        }
        if (null !== $this->authBeginTime) {
            $res['auth_begin_time'] = $this->authBeginTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->designDraft) {
            $res['design_draft'] = $this->designDraft;
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
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->guaranteed) {
            $res['guaranteed'] = $this->guaranteed;
        }
        if (null !== $this->guaranteedFund) {
            $res['guaranteed_fund'] = $this->guaranteedFund;
        }
        if (null !== $this->guaranteedGoodsAmount) {
            $res['guaranteed_goods_amount'] = $this->guaranteedGoodsAmount;
        }
        if (null !== $this->guaranteedSales) {
            $res['guaranteed_sales'] = $this->guaranteedSales;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyIpAuthtradeRequest
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
        if (isset($map['charge_type'])) {
            $model->chargeType = $map['charge_type'];
        }
        if (isset($map['auth_rate'])) {
            $model->authRate = $map['auth_rate'];
        }
        if (isset($map['auth_price'])) {
            $model->authPrice = $map['auth_price'];
        }
        if (isset($map['auth_begin_time'])) {
            $model->authBeginTime = $map['auth_begin_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['design_draft'])) {
            $model->designDraft = $map['design_draft'];
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
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['guaranteed'])) {
            $model->guaranteed = $map['guaranteed'];
        }
        if (isset($map['guaranteed_fund'])) {
            $model->guaranteedFund = $map['guaranteed_fund'];
        }
        if (isset($map['guaranteed_goods_amount'])) {
            $model->guaranteedGoodsAmount = $map['guaranteed_goods_amount'];
        }
        if (isset($map['guaranteed_sales'])) {
            $model->guaranteedSales = $map['guaranteed_sales'];
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

        return $model;
    }
}
