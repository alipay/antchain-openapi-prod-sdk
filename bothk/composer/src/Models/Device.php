<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOTHK\Models;

use AlibabaCloud\Tea\Model;

class Device extends Model
{
    // 设备ID，一般是设备的出厂编码或业务上的资产ID
    /**
     * @example 123ABC
     *
     * @var string
     */
    public $deviceId;

    // 物模型事件ID
    /**
     * @example 112233
     *
     * @var string
     */
    public $deviceDataModelId;

    // 场景码
    /**
     * @example SCENE1
     *
     * @var string
     */
    public $scene;

    // imei号
    /**
     * @example 223344
     *
     * @var string
     */
    public $deviceImei;

    // 设备名称
    /**
     * @example 设备1号
     *
     * @var string
     */
    public $deviceName;

    // 设备厂商名称
    /**
     * @example 浙江一厂
     *
     * @var string
     */
    public $corpName;

    // 设备ICCID
    /**
     * @example a1234
     *
     * @var string
     */
    public $deviceIccid;

    // 设备扩展信息
    /**
     * @example {“”:""}
     *
     * @var string
     */
    public $extraInfo;

    // 设备类型编码
    /**
     * @example 5000
     *
     * @var string
     */
    public $deviceTypeCode;

    // 单价
    /**
     * @example 1000
     *
     * @var int
     */
    public $initialPrice;

    // 投放时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $releaseTime;

    // 出厂时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $factoryTime;

    // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $deviceStatus;

    // 可信设备ID
    /**
     * @example 7006071575276187649
     *
     * @var int
     */
    public $trustiotDeviceId;
    protected $_name = [
        'deviceId'          => 'device_id',
        'deviceDataModelId' => 'device_data_model_id',
        'scene'             => 'scene',
        'deviceImei'        => 'device_imei',
        'deviceName'        => 'device_name',
        'corpName'          => 'corp_name',
        'deviceIccid'       => 'device_iccid',
        'extraInfo'         => 'extra_info',
        'deviceTypeCode'    => 'device_type_code',
        'initialPrice'      => 'initial_price',
        'releaseTime'       => 'release_time',
        'factoryTime'       => 'factory_time',
        'deviceStatus'      => 'device_status',
        'trustiotDeviceId'  => 'trustiot_device_id',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('deviceDataModelId', $this->deviceDataModelId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceImei', $this->deviceImei, true);
        Model::validateRequired('deviceTypeCode', $this->deviceTypeCode, true);
        Model::validateRequired('initialPrice', $this->initialPrice, true);
        Model::validateRequired('releaseTime', $this->releaseTime, true);
        Model::validateRequired('factoryTime', $this->factoryTime, true);
        Model::validateRequired('trustiotDeviceId', $this->trustiotDeviceId, true);
        Model::validatePattern('releaseTime', $this->releaseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('factoryTime', $this->factoryTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->deviceDataModelId) {
            $res['device_data_model_id'] = $this->deviceDataModelId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceImei) {
            $res['device_imei'] = $this->deviceImei;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->deviceIccid) {
            $res['device_iccid'] = $this->deviceIccid;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->deviceTypeCode) {
            $res['device_type_code'] = $this->deviceTypeCode;
        }
        if (null !== $this->initialPrice) {
            $res['initial_price'] = $this->initialPrice;
        }
        if (null !== $this->releaseTime) {
            $res['release_time'] = $this->releaseTime;
        }
        if (null !== $this->factoryTime) {
            $res['factory_time'] = $this->factoryTime;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->trustiotDeviceId) {
            $res['trustiot_device_id'] = $this->trustiotDeviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Device
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['device_data_model_id'])) {
            $model->deviceDataModelId = $map['device_data_model_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['device_imei'])) {
            $model->deviceImei = $map['device_imei'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['device_iccid'])) {
            $model->deviceIccid = $map['device_iccid'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['device_type_code'])) {
            $model->deviceTypeCode = $map['device_type_code'];
        }
        if (isset($map['initial_price'])) {
            $model->initialPrice = $map['initial_price'];
        }
        if (isset($map['release_time'])) {
            $model->releaseTime = $map['release_time'];
        }
        if (isset($map['factory_time'])) {
            $model->factoryTime = $map['factory_time'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['trustiot_device_id'])) {
            $model->trustiotDeviceId = $map['trustiot_device_id'];
        }

        return $model;
    }
}
