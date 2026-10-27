<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class HealthDeviceInfo extends Model {
    protected $_name = [
        'channelId' => 'channel_id',
        'tuid' => 'tuid',
        'sn' => 'sn',
        'deviceType' => 'device_type',
        'deviceModel' => 'device_model',
        'deviceName' => 'device_name',
        'status' => 'status',
        'battery' => 'battery',
        'wear' => 'wear',
        'extraInfo' => 'extra_info',
    ];
    public function validate() {
        Model::validateRequired('channelId', $this->channelId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->battery) {
            $res['battery'] = $this->battery;
        }
        if (null !== $this->wear) {
            $res['wear'] = $this->wear;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return HealthDeviceInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['channel_id'])){
            $model->channelId = $map['channel_id'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['sn'])){
            $model->sn = $map['sn'];
        }
        if(isset($map['device_type'])){
            $model->deviceType = $map['device_type'];
        }
        if(isset($map['device_model'])){
            $model->deviceModel = $map['device_model'];
        }
        if(isset($map['device_name'])){
            $model->deviceName = $map['device_name'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['battery'])){
            $model->battery = $map['battery'];
        }
        if(isset($map['wear'])){
            $model->wear = $map['wear'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        return $model;
    }
    // 品牌方渠道标识
    /**
     * @example YIHU
     * @var string
     */
    public $channelId;

    // 设备唯一id
    /**
     * @example 123
     * @var string
     */
    public $tuid;

    // 设备sn号
    /**
     * @example 
     * @var string
     */
    public $sn;

    // 设备类型 WATCH-手表
    /**
     * @example WATCH
     * @var string
     */
    public $deviceType;

    // 设备型号
    /**
     * @example 
     * @var string
     */
    public $deviceModel;

    // 设备名称
    /**
     * @example 爸爸的手表
     * @var string
     */
    public $deviceName;

    // 设备状态：0-未激活 1-在线 2-离线
    /**
     * @example 1
     * @var int
     */
    public $status;

    // 电量百分比（0~100）
    /**
     * @example 20
     * @var int
     */
    public $battery;

    // 佩戴状态：true-已佩戴 false-未佩戴
    /**
     * @example true
     * @var bool
     */
    public $wear;

    // 预留可扩展字段json
    /**
     * @example 
     * @var string
     */
    public $extraInfo;

}
