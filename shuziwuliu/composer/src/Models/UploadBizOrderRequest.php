<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadBizOrderRequest extends Model
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

    // 船公司did
    /**
     * @var string
     */
    public $carrierDid;

    // 尾款金额
    /**
     * @var string
     */
    public $deadlineAmount;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 订单总额
    /**
     * @var UploadOrderAmount[]
     */
    public $orderAmounts;

    // 订单booking信息
    /**
     * @var UploadOrderBooking[]
     */
    public $orderBookings;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 结算did
    /**
     * @var string
     */
    public $settleDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'carrierDid'        => 'carrier_did',
        'deadlineAmount'    => 'deadline_amount',
        'forwarderDid'      => 'forwarder_did',
        'orderAmounts'      => 'order_amounts',
        'orderBookings'     => 'order_bookings',
        'orderNo'           => 'order_no',
        'settleDid'         => 'settle_did',
    ];

    public function validate()
    {
        Model::validateRequired('carrierDid', $this->carrierDid, true);
        Model::validateRequired('deadlineAmount', $this->deadlineAmount, true);
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('orderAmounts', $this->orderAmounts, true);
        Model::validateRequired('orderBookings', $this->orderBookings, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('settleDid', $this->settleDid, true);
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
        if (null !== $this->carrierDid) {
            $res['carrier_did'] = $this->carrierDid;
        }
        if (null !== $this->deadlineAmount) {
            $res['deadline_amount'] = $this->deadlineAmount;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->orderAmounts) {
            $res['order_amounts'] = [];
            if (null !== $this->orderAmounts && \is_array($this->orderAmounts)) {
                $n = 0;
                foreach ($this->orderAmounts as $item) {
                    $res['order_amounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orderBookings) {
            $res['order_bookings'] = [];
            if (null !== $this->orderBookings && \is_array($this->orderBookings)) {
                $n = 0;
                foreach ($this->orderBookings as $item) {
                    $res['order_bookings'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->settleDid) {
            $res['settle_did'] = $this->settleDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadBizOrderRequest
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
        if (isset($map['carrier_did'])) {
            $model->carrierDid = $map['carrier_did'];
        }
        if (isset($map['deadline_amount'])) {
            $model->deadlineAmount = $map['deadline_amount'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['order_amounts'])) {
            if (!empty($map['order_amounts'])) {
                $model->orderAmounts = [];
                $n                   = 0;
                foreach ($map['order_amounts'] as $item) {
                    $model->orderAmounts[$n++] = null !== $item ? UploadOrderAmount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['order_bookings'])) {
            if (!empty($map['order_bookings'])) {
                $model->orderBookings = [];
                $n                    = 0;
                foreach ($map['order_bookings'] as $item) {
                    $model->orderBookings[$n++] = null !== $item ? UploadOrderBooking::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['settle_did'])) {
            $model->settleDid = $map['settle_did'];
        }

        return $model;
    }
}
