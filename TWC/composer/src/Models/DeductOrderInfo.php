<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class DeductOrderInfo extends Model
{
    // 订单id
    /**
     * @example 9d3057dfdcad494fb2d9033130
     *
     * @var string
     */
    public $orderId;

    // 商户统一社会信用代码
    /**
     * @example 91310101MA1FPODA3G
     *
     * @var string
     */
    public $merchantId;

    // 租户id
    /**
     * @example CYRMAXCZ
     *
     * @var string
     */
    public $tenantId;

    // 用户支付宝uid
    /**
     * @example 2088xxxxxxxx8721
     *
     * @var string
     */
    public $alipayUserId;

    // 商品名称
    /**
     * @example iPhone19 Pro Max
     *
     * @var string
     */
    public $productName;

    // 订单创建时间
    /**
     * @example 2024-01-01 00:00:00
     *
     * @var string
     */
    public $orderCreateDate;

    // 订单状态
    /**
     * @example OPEN
     *
     * @var string
     */
    public $orderStatusCode;

    // 订单子状态,ORDER_FULFILLMENT: 履约中;ORDER_FULFILLMENT_COMPLETED:履约完成;
    /**
     * @example ORDER_FULFILLMENT
     *
     * @var string
     */
    public $orderSubStatusCode;

    // 总金额，单位为分
    /**
     * @example 100
     *
     * @var int
     */
    public $totalRentMoney;
    protected $_name = [
        'orderId'            => 'order_id',
        'merchantId'         => 'merchant_id',
        'tenantId'           => 'tenant_id',
        'alipayUserId'       => 'alipay_user_id',
        'productName'        => 'product_name',
        'orderCreateDate'    => 'order_create_date',
        'orderStatusCode'    => 'order_status_code',
        'orderSubStatusCode' => 'order_sub_status_code',
        'totalRentMoney'     => 'total_rent_money',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('alipayUserId', $this->alipayUserId, true);
        Model::validateRequired('orderCreateDate', $this->orderCreateDate, true);
        Model::validateRequired('orderSubStatusCode', $this->orderSubStatusCode, true);
        Model::validateRequired('totalRentMoney', $this->totalRentMoney, true);
        Model::validatePattern('orderCreateDate', $this->orderCreateDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->orderCreateDate) {
            $res['order_create_date'] = $this->orderCreateDate;
        }
        if (null !== $this->orderStatusCode) {
            $res['order_status_code'] = $this->orderStatusCode;
        }
        if (null !== $this->orderSubStatusCode) {
            $res['order_sub_status_code'] = $this->orderSubStatusCode;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeductOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['order_create_date'])) {
            $model->orderCreateDate = $map['order_create_date'];
        }
        if (isset($map['order_status_code'])) {
            $model->orderStatusCode = $map['order_status_code'];
        }
        if (isset($map['order_sub_status_code'])) {
            $model->orderSubStatusCode = $map['order_sub_status_code'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }

        return $model;
    }
}
