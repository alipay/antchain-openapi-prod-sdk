<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class ComboOrder extends Model
{
    // 租户ID
    /**
     * @example 2088xxx
     *
     * @var string
     */
    public $tenantId;

    // 业务流水号
    /**
     * @example 2088123412341234
     *
     * @var string
     */
    public $bizNo;

    // 套餐订单号
    /**
     * @example 2088123412341234
     *
     * @var string
     */
    public $orderId;

    // 套餐编码
    /**
     * @example KKAASP00001001
     *
     * @var string
     */
    public $comboCode;

    // 套餐名称，下单时的套餐名称
    /**
     * @example 测试套餐
     *
     * @var string
     */
    public $comboName;

    // 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
    /**
     * @example CREATED
     *
     * @var string
     */
    public $status;

    // 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
    /**
     * @example COMPLETED
     *
     * @var string
     */
    public $provisionStatus;

    // 订单原始金额
    /**
     * @example 200.00
     *
     * @var string
     */
    public $originalAmount;

    // 折扣金额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $discountAmount;

    // 优惠金额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $couponAmount;

    // 实付金额
    /**
     * @example 0.00
     *
     * @var string
     */
    public $payAmount;

    // 下单时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 套餐内商品订单列表
    /**
     * @example []
     *
     * @var ComboCommodityOrder[]
     */
    public $commodityOrders;

    // 支付完成时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $payTime;

    // 支付渠道
    /**
     * @example CUSTOMER_FUND
     *
     * @var string
     */
    public $payChannel;
    protected $_name = [
        'tenantId'        => 'tenant_id',
        'bizNo'           => 'biz_no',
        'orderId'         => 'order_id',
        'comboCode'       => 'combo_code',
        'comboName'       => 'combo_name',
        'status'          => 'status',
        'provisionStatus' => 'provision_status',
        'originalAmount'  => 'original_amount',
        'discountAmount'  => 'discount_amount',
        'couponAmount'    => 'coupon_amount',
        'payAmount'       => 'pay_amount',
        'gmtCreate'       => 'gmt_create',
        'commodityOrders' => 'commodity_orders',
        'payTime'         => 'pay_time',
        'payChannel'      => 'pay_channel',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('comboCode', $this->comboCode, true);
        Model::validateRequired('comboName', $this->comboName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('provisionStatus', $this->provisionStatus, true);
        Model::validateRequired('originalAmount', $this->originalAmount, true);
        Model::validateRequired('discountAmount', $this->discountAmount, true);
        Model::validateRequired('couponAmount', $this->couponAmount, true);
        Model::validateRequired('payAmount', $this->payAmount, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('commodityOrders', $this->commodityOrders, true);
        Model::validateRequired('payTime', $this->payTime, true);
        Model::validateRequired('payChannel', $this->payChannel, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('payTime', $this->payTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->comboCode) {
            $res['combo_code'] = $this->comboCode;
        }
        if (null !== $this->comboName) {
            $res['combo_name'] = $this->comboName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->provisionStatus) {
            $res['provision_status'] = $this->provisionStatus;
        }
        if (null !== $this->originalAmount) {
            $res['original_amount'] = $this->originalAmount;
        }
        if (null !== $this->discountAmount) {
            $res['discount_amount'] = $this->discountAmount;
        }
        if (null !== $this->couponAmount) {
            $res['coupon_amount'] = $this->couponAmount;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->commodityOrders) {
            $res['commodity_orders'] = [];
            if (null !== $this->commodityOrders && \is_array($this->commodityOrders)) {
                $n = 0;
                foreach ($this->commodityOrders as $item) {
                    $res['commodity_orders'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->payTime) {
            $res['pay_time'] = $this->payTime;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComboOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['combo_code'])) {
            $model->comboCode = $map['combo_code'];
        }
        if (isset($map['combo_name'])) {
            $model->comboName = $map['combo_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['provision_status'])) {
            $model->provisionStatus = $map['provision_status'];
        }
        if (isset($map['original_amount'])) {
            $model->originalAmount = $map['original_amount'];
        }
        if (isset($map['discount_amount'])) {
            $model->discountAmount = $map['discount_amount'];
        }
        if (isset($map['coupon_amount'])) {
            $model->couponAmount = $map['coupon_amount'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['commodity_orders'])) {
            if (!empty($map['commodity_orders'])) {
                $model->commodityOrders = [];
                $n                      = 0;
                foreach ($map['commodity_orders'] as $item) {
                    $model->commodityOrders[$n++] = null !== $item ? ComboCommodityOrder::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pay_time'])) {
            $model->payTime = $map['pay_time'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }

        return $model;
    }
}
