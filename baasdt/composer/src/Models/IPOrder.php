<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPOrder extends Model
{
    // 订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipOrderId;

    // 卖方
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb165345237549274
     *
     * @var string
     */
    public $sellerId;

    // 卖家名称
    /**
     * @example 卖家名称
     *
     * @var string
     */
    public $sellerName;

    // 买方
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb163472346869786987
     *
     * @var string
     */
    public $buyerId;

    // 买家名称
    /**
     * @example 买家名称
     *
     * @var string
     */
    public $buyerName;

    // 订单交易类型：0套餐交易，1授权交易
    /**
     * @example 0
     *
     * @var int
     */
    public $type;

    // ip id
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipId;

    // IP名称
    /**
     * @example IP名称
     *
     * @var string
     */
    public $ipName;

    // 渠道信息
    /**
     * @example channel
     *
     * @var string
     */
    public $channelId;

    // 套餐总量
    /**
     * @example 10000
     *
     * @var int
     */
    public $totalAmount;

    // 套餐已使用数量
    /**
     * @example 6000
     *
     * @var int
     */
    public $usedAmount;

    // 终端商品价格范围
    /**
     * @example 0-50
     *
     * @var string
     */
    public $priceRange;

    // 套餐交易总费用
    /**
     * @example 30000
     *
     * @var string
     */
    public $totalPrice;

    // 授权佣金比例
    /**
     * @example 0.006
     *
     * @var string
     */
    public $authRate;

    // 授权合作开始时间（毫秒时间戳）
    /**
     * @example
     *
     * @var int
     */
    public $authStartTime;

    // 授权合作结束时间
    /**
     * @example
     *
     * @var int
     */
    public $authEndTime;

    // 合同信息
    /**
     * @example oss://myexchange/1259371fc8f77d37...5dfb6d130facf32dd6d4257fa0.jpeg
     *
     * @var string
     */
    public $contract;

    // 设计稿信息
    /**
     * @example oss://myexchange/1259371fc8f77d37...5dfb6d130facf32dd6d4257fa1.jpeg
     *
     * @var string
     */
    public $designDraft;

    // 操作人
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $operator;

    // 操作者名称
    /**
     * @example 操作者名称
     *
     * @var string
     */
    public $operatorName;

    // 订单状态。TODO 补充枚举信息
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 订单最近更新时间
    /**
     * @example 1604896477580
     *
     * @var int
     */
    public $updateTime;
    protected $_name = [
        'ipOrderId'     => 'ip_order_id',
        'sellerId'      => 'seller_id',
        'sellerName'    => 'seller_name',
        'buyerId'       => 'buyer_id',
        'buyerName'     => 'buyer_name',
        'type'          => 'type',
        'ipId'          => 'ip_id',
        'ipName'        => 'ip_name',
        'channelId'     => 'channel_id',
        'totalAmount'   => 'total_amount',
        'usedAmount'    => 'used_amount',
        'priceRange'    => 'price_range',
        'totalPrice'    => 'total_price',
        'authRate'      => 'auth_rate',
        'authStartTime' => 'auth_start_time',
        'authEndTime'   => 'auth_end_time',
        'contract'      => 'contract',
        'designDraft'   => 'design_draft',
        'operator'      => 'operator',
        'operatorName'  => 'operator_name',
        'status'        => 'status',
        'updateTime'    => 'update_time',
    ];

    public function validate()
    {
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('sellerId', $this->sellerId, true);
        Model::validateRequired('sellerName', $this->sellerName, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('buyerName', $this->buyerName, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('ipName', $this->ipName, true);
        Model::validateRequired('channelId', $this->channelId, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('usedAmount', $this->usedAmount, true);
        Model::validateRequired('priceRange', $this->priceRange, true);
        Model::validateRequired('totalPrice', $this->totalPrice, true);
        Model::validateRequired('authRate', $this->authRate, true);
        Model::validateRequired('authStartTime', $this->authStartTime, true);
        Model::validateRequired('authEndTime', $this->authEndTime, true);
        Model::validateRequired('contract', $this->contract, true);
        Model::validateRequired('designDraft', $this->designDraft, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->sellerName) {
            $res['seller_name'] = $this->sellerName;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->buyerName) {
            $res['buyer_name'] = $this->buyerName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->usedAmount) {
            $res['used_amount'] = $this->usedAmount;
        }
        if (null !== $this->priceRange) {
            $res['price_range'] = $this->priceRange;
        }
        if (null !== $this->totalPrice) {
            $res['total_price'] = $this->totalPrice;
        }
        if (null !== $this->authRate) {
            $res['auth_rate'] = $this->authRate;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
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
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['seller_name'])) {
            $model->sellerName = $map['seller_name'];
        }
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }
        if (isset($map['buyer_name'])) {
            $model->buyerName = $map['buyer_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['channel_id'])) {
            $model->channelId = $map['channel_id'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['used_amount'])) {
            $model->usedAmount = $map['used_amount'];
        }
        if (isset($map['price_range'])) {
            $model->priceRange = $map['price_range'];
        }
        if (isset($map['total_price'])) {
            $model->totalPrice = $map['total_price'];
        }
        if (isset($map['auth_rate'])) {
            $model->authRate = $map['auth_rate'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
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
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['operator_name'])) {
            $model->operatorName = $map['operator_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
