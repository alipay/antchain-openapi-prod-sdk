<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\VehicleContainerParam;

class SaveDigitalLogisticBizVehicleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'containerParams' => 'container_params',
        'forwarderDid' => 'forwarder_did',
        'orderNo' => 'order_no',
        'vehicleCode' => 'vehicle_code',
        'vehicleNo' => 'vehicle_no',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->containerParams) {
            $res['container_params'] = [];
            if(null !== $this->containerParams && is_array($this->containerParams)){
                $n = 0;
                foreach($this->containerParams as $item){
                    $res['container_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->vehicleCode) {
            $res['vehicle_code'] = $this->vehicleCode;
        }
        if (null !== $this->vehicleNo) {
            $res['vehicle_no'] = $this->vehicleNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveDigitalLogisticBizVehicleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['action'])){
            $model->action = $map['action'];
        }
        if(isset($map['container_params'])){
            if(!empty($map['container_params'])){
                $model->containerParams = [];
                $n = 0;
                foreach($map['container_params'] as $item) {
                    $model->containerParams[$n++] = null !== $item ? VehicleContainerParam::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['vehicle_code'])){
            $model->vehicleCode = $map['vehicle_code'];
        }
        if(isset($map['vehicle_no'])){
            $model->vehicleNo = $map['vehicle_no'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @var string
     */
    public $action;

    // 箱子信息 业务必填
    /**
     * @var VehicleContainerParam[]
     */
    public $containerParams;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 拖车单号
    /**
     * @var string
     */
    public $vehicleCode;

    // 车牌号
    /**
     * @var string
     */
    public $vehicleNo;

}
