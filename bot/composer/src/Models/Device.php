<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class Device extends Model
{
    // 设备实体唯一Id
    /**
     * @example 123ABC
     *
     * @var string
     */
    public $deviceId;

    // 数据模型Id
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
    //
    //
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

    // 设备链上Id
    /**
     * @example 223344
     *
     * @var string
     */
    public $chainDeviceId;

    // 上链哈希
    /**
     * @example 3344
     *
     * @var string
     */
    public $txHash;

    // 上链时间
    /**
     * @example 224455
     *
     * @var int
     */
    public $txTime;

    // 设备类型编码，必填，对应资管平台中的设备类型
    //
    // 枚举值：
    //
    // 车辆 1000
    // 车辆 四轮车 1001
    // 车辆 四轮车 纯电四轮车 1002
    // 车辆 四轮车 混动四轮车 1003
    // 车辆 四轮车 燃油四轮车 1004
    // 车辆 两轮车 1011
    // 车辆 两轮车 两轮单车 1012
    // 车辆 两轮车 两轮助力车 1013
    //
    // 换电柜 2000
    // 换电柜 二轮车换电柜 2001
    //
    // 电池 3000
    // 电池 磷酸铁电池 3001
    // 电池 三元锂电池 3002
    //
    // 回收设备 4000
    //
    // 垃圾分类回收 4001
    //
    // 洗车机 5000
    /**
     * @example 5000
     *
     * @var int
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
    protected $_name = [
        'deviceId'          => 'device_id',
        'deviceDataModelId' => 'device_data_model_id',
        'scene'             => 'scene',
        'deviceImei'        => 'device_imei',
        'deviceName'        => 'device_name',
        'corpName'          => 'corp_name',
        'deviceIccid'       => 'device_iccid',
        'extraInfo'         => 'extra_info',
        'chainDeviceId'     => 'chain_device_id',
        'txHash'            => 'tx_hash',
        'txTime'            => 'tx_time',
        'deviceTypeCode'    => 'device_type_code',
        'initialPrice'      => 'initial_price',
        'releaseTime'       => 'release_time',
        'factoryTime'       => 'factory_time',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('deviceDataModelId', $this->deviceDataModelId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceImei', $this->deviceImei, true);
        Model::validateRequired('chainDeviceId', $this->chainDeviceId, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('txTime', $this->txTime, true);
        Model::validateRequired('deviceTypeCode', $this->deviceTypeCode, true);
        Model::validateRequired('initialPrice', $this->initialPrice, true);
        Model::validateRequired('releaseTime', $this->releaseTime, true);
        Model::validateRequired('factoryTime', $this->factoryTime, true);
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
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
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
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
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

        return $model;
    }
}
