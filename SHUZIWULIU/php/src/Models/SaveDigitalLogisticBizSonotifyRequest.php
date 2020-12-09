<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\SoNotifyBookingParam;

class SaveDigitalLogisticBizSonotifyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'bookingParams' => 'booking_params',
        'contactName' => 'contact_name',
        'contactType' => 'contact_type',
        'dischargePort' => 'discharge_port',
        'forwarderDid' => 'forwarder_did',
        'loadingPort' => 'loading_port',
        'orderNo' => 'order_no',
        'soNotifyCode' => 'so_notify_code',
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
        if (null !== $this->bookingParams) {
            $res['booking_params'] = [];
            if(null !== $this->bookingParams && is_array($this->bookingParams)){
                $n = 0;
                foreach($this->bookingParams as $item){
                    $res['booking_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactType) {
            $res['contact_type'] = $this->contactType;
        }
        if (null !== $this->dischargePort) {
            $res['discharge_port'] = $this->dischargePort;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->loadingPort) {
            $res['loading_port'] = $this->loadingPort;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->soNotifyCode) {
            $res['so_notify_code'] = $this->soNotifyCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveDigitalLogisticBizSonotifyRequest
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
        if(isset($map['booking_params'])){
            if(!empty($map['booking_params'])){
                $model->bookingParams = [];
                $n = 0;
                foreach($map['booking_params'] as $item) {
                    $model->bookingParams[$n++] = null !== $item ? SoNotifyBookingParam::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['contact_name'])){
            $model->contactName = $map['contact_name'];
        }
        if(isset($map['contact_type'])){
            $model->contactType = $map['contact_type'];
        }
        if(isset($map['discharge_port'])){
            $model->dischargePort = $map['discharge_port'];
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['loading_port'])){
            $model->loadingPort = $map['loading_port'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['so_notify_code'])){
            $model->soNotifyCode = $map['so_notify_code'];
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

    // so通知关联的订舱单 (业务必填)
    /**
     * @var SoNotifyBookingParam[]
     */
    public $bookingParams;

    // 联系人
    /**
     * @var string
     */
    public $contactName;

    // 联系方式
    /**
     * @var string
     */
    public $contactType;

    // 卸货港 业务必填
    // 
    /**
     * @var string
     */
    public $dischargePort;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 起运港 业务必填
    // 
    /**
     * @var string
     */
    public $loadingPort;

    // 
    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // soNotify 唯一标识code
    /**
     * @var string
     */
    public $soNotifyCode;

}
