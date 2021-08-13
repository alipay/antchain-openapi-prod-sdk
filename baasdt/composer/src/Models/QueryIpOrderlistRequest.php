<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpOrderlistRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 买方ID
    /**
     * @var string
     */
    public $buyerId;

    // 卖方ID
    /**
     * @var string
     */
    public $sellerId;

    // IP id
    /**
     * @var string
     */
    public $ipId;

    // 订单ID
    /**
     * @var string
     */
    public $ipOrderId;

    // 订单状态
    /**
     * @var int
     */
    public $orderStatus;

    // 根据IP名称模糊查询
    /**
     * @var string
     */
    public $ipName;

    // 卖方名称，根据卖方名称模糊查询
    /**
     * @var string
     */
    public $sellerName;

    // 交易类型：1 套餐交易， 2 定向授权
    /**
     * @var int
     */
    public $tradeType;

    // 0 IP交易，1 增值服务交易
    /**
     * @var int
     */
    public $goodsType;

    // 收费模式：0 销售抽拥，1 按量计费
    /**
     * @var int
     */
    public $chargeType;

    // 查询订单授权开始时间
    /**
     * @var int
     */
    public $authStartTime;

    // 查询订单授权结束时间
    /**
     * @var int
     */
    public $authEndTime;

    // 排序字段
    /**
     * @var string
     */
    public $orderBy;

    // 数据排序顺序：正序还是倒序
    /**
     * @var string
     */
    public $order;

    // 页码
    /**
     * @var int
     */
    public $pageNumber;

    // 每页数据量大小
    /**
     * @var int
     */
    public $pageSize;

    // 渠道名称
    /**
     * @var string
     */
    public $channelName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'buyerId'           => 'buyer_id',
        'sellerId'          => 'seller_id',
        'ipId'              => 'ip_id',
        'ipOrderId'         => 'ip_order_id',
        'orderStatus'       => 'order_status',
        'ipName'            => 'ip_name',
        'sellerName'        => 'seller_name',
        'tradeType'         => 'trade_type',
        'goodsType'         => 'goods_type',
        'chargeType'        => 'charge_type',
        'authStartTime'     => 'auth_start_time',
        'authEndTime'       => 'auth_end_time',
        'orderBy'           => 'order_by',
        'order'             => 'order',
        'pageNumber'        => 'page_number',
        'pageSize'          => 'page_size',
        'channelName'       => 'channel_name',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('orderBy', $this->orderBy, true);
        Model::validateRequired('order', $this->order, true);
        Model::validateRequired('pageNumber', $this->pageNumber, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->sellerName) {
            $res['seller_name'] = $this->sellerName;
        }
        if (null !== $this->tradeType) {
            $res['trade_type'] = $this->tradeType;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->orderBy) {
            $res['order_by'] = $this->orderBy;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpOrderlistRequest
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
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['seller_name'])) {
            $model->sellerName = $map['seller_name'];
        }
        if (isset($map['trade_type'])) {
            $model->tradeType = $map['trade_type'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['charge_type'])) {
            $model->chargeType = $map['charge_type'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['order_by'])) {
            $model->orderBy = $map['order_by'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }

        return $model;
    }
}
