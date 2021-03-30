<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBiznewVehicleRequest extends Model
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
    //
    //
    /**
     * @var string
     */
    public $orderNo;

    // 拖车单号
    //
    //
    /**
     * @var string
     */
    public $vehicleCode;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 拖车总金额 [业务必填]
    /**
     * @var string
     */
    public $vehicleTotalAmount;

    // 拖车运费金额 [业务必填]
    /**
     * @var string
     */
    public $vehicleAmount;

    // 拖车杂费金额 [业务必填]
    /**
     * @var string
     */
    public $vehicleCharges;

    // 币种 [业务必填]
    /**
     * @var string
     */
    public $currency;

    // 箱号箱ID
    //
    //
    /**
     * @var ContainerIdInfo[]
     */
    public $containerIdInfoList;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'orderNo'             => 'order_no',
        'vehicleCode'         => 'vehicle_code',
        'forwarderDid'        => 'forwarder_did',
        'vehicleTotalAmount'  => 'vehicle_total_amount',
        'vehicleAmount'       => 'vehicle_amount',
        'vehicleCharges'      => 'vehicle_charges',
        'currency'            => 'currency',
        'containerIdInfoList' => 'container_id_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('vehicleCode', $this->vehicleCode, true);
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
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
        if (null !== $this->vehicleCode) {
            $res['vehicle_code'] = $this->vehicleCode;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->vehicleTotalAmount) {
            $res['vehicle_total_amount'] = $this->vehicleTotalAmount;
        }
        if (null !== $this->vehicleAmount) {
            $res['vehicle_amount'] = $this->vehicleAmount;
        }
        if (null !== $this->vehicleCharges) {
            $res['vehicle_charges'] = $this->vehicleCharges;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->containerIdInfoList) {
            $res['container_id_info_list'] = [];
            if (null !== $this->containerIdInfoList && \is_array($this->containerIdInfoList)) {
                $n = 0;
                foreach ($this->containerIdInfoList as $item) {
                    $res['container_id_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBiznewVehicleRequest
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
        if (isset($map['vehicle_code'])) {
            $model->vehicleCode = $map['vehicle_code'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['vehicle_total_amount'])) {
            $model->vehicleTotalAmount = $map['vehicle_total_amount'];
        }
        if (isset($map['vehicle_amount'])) {
            $model->vehicleAmount = $map['vehicle_amount'];
        }
        if (isset($map['vehicle_charges'])) {
            $model->vehicleCharges = $map['vehicle_charges'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['container_id_info_list'])) {
            if (!empty($map['container_id_info_list'])) {
                $model->containerIdInfoList = [];
                $n                          = 0;
                foreach ($map['container_id_info_list'] as $item) {
                    $model->containerIdInfoList[$n++] = null !== $item ? ContainerIdInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
