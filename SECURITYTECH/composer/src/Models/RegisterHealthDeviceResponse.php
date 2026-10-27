<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RegisterHealthDeviceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'channelId' => 'channel_id',
        'tuid' => 'tuid',
        'sn' => 'sn',
        'bindStatus' => 'bind_status',
        'deviceType' => 'device_type',
        'deviceModel' => 'device_model',
        'extraInfo' => 'extra_info',
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
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->bindStatus) {
            $res['bind_status'] = $this->bindStatus;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RegisterHealthDeviceResponse
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
        if(isset($map['channel_id'])){
            $model->channelId = $map['channel_id'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['sn'])){
            $model->sn = $map['sn'];
        }
        if(isset($map['bind_status'])){
            $model->bindStatus = $map['bind_status'];
        }
        if(isset($map['device_type'])){
            $model->deviceType = $map['device_type'];
        }
        if(isset($map['device_model'])){
            $model->deviceModel = $map['device_model'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
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

    // 品牌方渠道标识
    /**
     * @var string
     */
    public $channelId;

    // 设备唯一id
    /**
     * @var string
     */
    public $tuid;

    // 设备sn号
    /**
     * @var string
     */
    public $sn;

    // 绑定状态
    /**
     * @var string
     */
    public $bindStatus;

    // 设备类型 WATCH-手表
    /**
     * @var string
     */
    public $deviceType;

    // 设备型号
    /**
     * @var string
     */
    public $deviceModel;

    // 预留可扩展字段json
    /**
     * @var string
     */
    public $extraInfo;

}
