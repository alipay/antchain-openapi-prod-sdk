<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\HealthDeviceInfo;
use AntChain\SECURITYTECH\Models\DeviceLocationInfo;

class QueryHealthDeviceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'deviceInfo' => 'device_info',
        'locationInfo' => 'location_info',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->deviceInfo) {
            $res['device_info'] = null !== $this->deviceInfo ? $this->deviceInfo->toMap() : null;
        }
        if (null !== $this->locationInfo) {
            $res['location_info'] = null !== $this->locationInfo ? $this->locationInfo->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryHealthDeviceResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['device_info'])){
            $model->deviceInfo = HealthDeviceInfo::fromMap($map['device_info']);
        }
        if(isset($map['location_info'])){
            $model->locationInfo = DeviceLocationInfo::fromMap($map['location_info']);
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 设备详细信息
    /**
     * @var HealthDeviceInfo
     */
    public $deviceInfo;

    // 设备定位信息
    /**
     * @var DeviceLocationInfo
     */
    public $locationInfo;

}
