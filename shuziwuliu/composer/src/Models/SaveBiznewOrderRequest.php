<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBiznewOrderRequest extends Model
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

    // 托运订单号
    /**
     * @var string
     */
    public $orderNo;

    // 托运人did [业务必填]
    /**
     * @var string
     */
    public $consignorDid;

    // 承运人did [业务必填]
    /**
     * @var string
     */
    public $carrierDid;

    // 订舱单号列表
    /**
     * @var BookingNoInfo[]
     */
    public $bookingInfoList;

    // 拖车单号
    /**
     * @var string[]
     */
    public $vehicleCodeList;

    // 报关单号
    /**
     * @var string[]
     */
    public $customsCodeList;

    // 订单确认 CREATE/FINISH (创建/确认)  [业务必填]
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'consignorDid'      => 'consignor_did',
        'carrierDid'        => 'carrier_did',
        'bookingInfoList'   => 'booking_info_list',
        'vehicleCodeList'   => 'vehicle_code_list',
        'customsCodeList'   => 'customs_code_list',
        'status'            => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->carrierDid) {
            $res['carrier_did'] = $this->carrierDid;
        }
        if (null !== $this->bookingInfoList) {
            $res['booking_info_list'] = [];
            if (null !== $this->bookingInfoList && \is_array($this->bookingInfoList)) {
                $n = 0;
                foreach ($this->bookingInfoList as $item) {
                    $res['booking_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->vehicleCodeList) {
            $res['vehicle_code_list'] = $this->vehicleCodeList;
        }
        if (null !== $this->customsCodeList) {
            $res['customs_code_list'] = $this->customsCodeList;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBiznewOrderRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['consignor_did'])) {
            $model->consignorDid = $map['consignor_did'];
        }
        if (isset($map['carrier_did'])) {
            $model->carrierDid = $map['carrier_did'];
        }
        if (isset($map['booking_info_list'])) {
            if (!empty($map['booking_info_list'])) {
                $model->bookingInfoList = [];
                $n                      = 0;
                foreach ($map['booking_info_list'] as $item) {
                    $model->bookingInfoList[$n++] = null !== $item ? BookingNoInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['vehicle_code_list'])) {
            if (!empty($map['vehicle_code_list'])) {
                $model->vehicleCodeList = $map['vehicle_code_list'];
            }
        }
        if (isset($map['customs_code_list'])) {
            if (!empty($map['customs_code_list'])) {
                $model->customsCodeList = $map['customs_code_list'];
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
