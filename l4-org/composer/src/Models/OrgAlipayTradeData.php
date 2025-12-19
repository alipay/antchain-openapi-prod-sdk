<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ORG\Models;

use AlibabaCloud\Tea\Model;

class OrgAlipayTradeData extends Model
{
    // 支付宝订单号
    /**
     * @example 202503060003000000000001
     *
     * @var string
     */
    public $alipayOrderNo;

    // 交易创建时间
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $gmtCreate;

    // 交易支付时间
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $gmtPay;

    // 交易退款时间
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $gmtRefund;

    // 商品备注信息
    /**
     * @example 商品备注信息
     *
     * @var string
     */
    public $goodsMemo;

    // 机构名称
    /**
     * @example 机构名称
     *
     * @var string
     */
    public $goodsTitle;

    // 商户订单号，创建支付宝交易时传入的信息
    /**
     * @example 202503060003000000000001
     *
     * @var string
     */
    public $merchantOrderNo;

    // 商家优惠金额
    /**
     * @example 200
     *
     * @var string
     */
    public $netMdiscount;

    // 对方账户
    /**
     * @example 对方账户
     *
     * @var string
     */
    public $otherAccount;

    // 订单退款金额
    /**
     * @example 2000.99
     *
     * @var string
     */
    public $refundAmount;

    // 服务费金额
    /**
     * @example 20000.11
     *
     * @var string
     */
    public $serviceFee;

    // 门店名称
    /**
     * @example storeName
     *
     * @var string
     */
    public $storeName;

    // 门店编号
    /**
     * @example 门店编号
     *
     * @var string
     */
    public $storeNo;

    // 订单金额
    /**
     * @example 20000.11
     *
     * @var string
     */
    public $totalAmount;

    // 订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)
    /**
     * @example TRADE_SUCCESS
     *
     * @var string
     */
    public $tradeStatus;

    // 业务类型，帮助商户作为对账参考
    /**
     * @example 业务类型，帮助商户作为对账参考
     *
     * @var string
     */
    public $tradeType;
    protected $_name = [
        'alipayOrderNo'   => 'alipay_order_no',
        'gmtCreate'       => 'gmt_create',
        'gmtPay'          => 'gmt_pay',
        'gmtRefund'       => 'gmt_refund',
        'goodsMemo'       => 'goods_memo',
        'goodsTitle'      => 'goods_title',
        'merchantOrderNo' => 'merchant_order_no',
        'netMdiscount'    => 'net_mdiscount',
        'otherAccount'    => 'other_account',
        'refundAmount'    => 'refund_amount',
        'serviceFee'      => 'service_fee',
        'storeName'       => 'store_name',
        'storeNo'         => 'store_no',
        'totalAmount'     => 'total_amount',
        'tradeStatus'     => 'trade_status',
        'tradeType'       => 'trade_type',
    ];

    public function validate()
    {
        Model::validateRequired('alipayOrderNo', $this->alipayOrderNo, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtPay', $this->gmtPay, true);
        Model::validateRequired('gmtRefund', $this->gmtRefund, true);
        Model::validateRequired('goodsTitle', $this->goodsTitle, true);
        Model::validateRequired('merchantOrderNo', $this->merchantOrderNo, true);
        Model::validateRequired('netMdiscount', $this->netMdiscount, true);
        Model::validateRequired('otherAccount', $this->otherAccount, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('serviceFee', $this->serviceFee, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('tradeStatus', $this->tradeStatus, true);
        Model::validateRequired('tradeType', $this->tradeType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alipayOrderNo) {
            $res['alipay_order_no'] = $this->alipayOrderNo;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtPay) {
            $res['gmt_pay'] = $this->gmtPay;
        }
        if (null !== $this->gmtRefund) {
            $res['gmt_refund'] = $this->gmtRefund;
        }
        if (null !== $this->goodsMemo) {
            $res['goods_memo'] = $this->goodsMemo;
        }
        if (null !== $this->goodsTitle) {
            $res['goods_title'] = $this->goodsTitle;
        }
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        if (null !== $this->netMdiscount) {
            $res['net_mdiscount'] = $this->netMdiscount;
        }
        if (null !== $this->otherAccount) {
            $res['other_account'] = $this->otherAccount;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->serviceFee) {
            $res['service_fee'] = $this->serviceFee;
        }
        if (null !== $this->storeName) {
            $res['store_name'] = $this->storeName;
        }
        if (null !== $this->storeNo) {
            $res['store_no'] = $this->storeNo;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->tradeStatus) {
            $res['trade_status'] = $this->tradeStatus;
        }
        if (null !== $this->tradeType) {
            $res['trade_type'] = $this->tradeType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrgAlipayTradeData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alipay_order_no'])) {
            $model->alipayOrderNo = $map['alipay_order_no'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_pay'])) {
            $model->gmtPay = $map['gmt_pay'];
        }
        if (isset($map['gmt_refund'])) {
            $model->gmtRefund = $map['gmt_refund'];
        }
        if (isset($map['goods_memo'])) {
            $model->goodsMemo = $map['goods_memo'];
        }
        if (isset($map['goods_title'])) {
            $model->goodsTitle = $map['goods_title'];
        }
        if (isset($map['merchant_order_no'])) {
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        if (isset($map['net_mdiscount'])) {
            $model->netMdiscount = $map['net_mdiscount'];
        }
        if (isset($map['other_account'])) {
            $model->otherAccount = $map['other_account'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['service_fee'])) {
            $model->serviceFee = $map['service_fee'];
        }
        if (isset($map['store_name'])) {
            $model->storeName = $map['store_name'];
        }
        if (isset($map['store_no'])) {
            $model->storeNo = $map['store_no'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['trade_status'])) {
            $model->tradeStatus = $map['trade_status'];
        }
        if (isset($map['trade_type'])) {
            $model->tradeType = $map['trade_type'];
        }

        return $model;
    }
}
