<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\BizStatusInfoOp;

class SyncIotbasicDevicestatusRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceDid' => 'device_did',
        'deviceStatus' => 'device_status',
        'deviceSignature' => 'device_signature',
        'bizStatusInfo' => 'biz_status_info',
    ];
    public function validate() {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('deviceSignature', $this->deviceSignature, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->deviceSignature) {
            $res['device_signature'] = $this->deviceSignature;
        }
        if (null !== $this->bizStatusInfo) {
            $res['biz_status_info'] = null !== $this->bizStatusInfo ? $this->bizStatusInfo->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncIotbasicDevicestatusRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['device_did'])){
            $model->deviceDid = $map['device_did'];
        }
        if(isset($map['device_status'])){
            $model->deviceStatus = $map['device_status'];
        }
        if(isset($map['device_signature'])){
            $model->deviceSignature = $map['device_signature'];
        }
        if(isset($map['biz_status_info'])){
            $model->bizStatusInfo = BizStatusInfoOp::fromMap($map['biz_status_info']);
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // 设备状态
    /**
     * @var string
     */
    public $deviceStatus;

    // 设备签名
    /**
     * @var string
     */
    public $deviceSignature;

    // 业务状态
    /**
     * @var BizStatusInfoOp
     */
    public $bizStatusInfo;

}
