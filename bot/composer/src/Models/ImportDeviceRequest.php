<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportDeviceRequest extends Model
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

    // 设备Id
    /**
     * @var string
     */
    public $deviceId;

    // 数据模型id
    /**
     * @var string
     */
    public $deviceDataModelId;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 设备imei
    /**
     * @var string
     */
    public $deviceImei;

    // 设备名称
    /**
     * @var string
     */
    public $deviceName;

    // 厂商名称
    /**
     * @var string
     */
    public $corpName;

    // 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
    /**
     * @var string
     */
    public $deviceFeature;

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
     * @var int
     */
    public $deviceTypeCode;

    // 设备单价 单位：分
    /**
     * @var int
     */
    public $initialPrice;

    // 出厂时间
    /**
     * @var string
     */
    public $factoryTime;

    // 投放时间
    /**
     * @var string
     */
    public $releaseTime;

    // 设备类型，需要提前约定好
    /**
     * @var string
     */
    public $deviceTypeId;

    // 可信根派生公钥
    /**
     * @var string
     */
    public $devicePublicKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'deviceDataModelId' => 'device_data_model_id',
        'scene'             => 'scene',
        'deviceImei'        => 'device_imei',
        'deviceName'        => 'device_name',
        'corpName'          => 'corp_name',
        'deviceFeature'     => 'device_feature',
        'deviceTypeCode'    => 'device_type_code',
        'initialPrice'      => 'initial_price',
        'factoryTime'       => 'factory_time',
        'releaseTime'       => 'release_time',
        'deviceTypeId'      => 'device_type_id',
        'devicePublicKey'   => 'device_public_key',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('deviceDataModelId', $this->deviceDataModelId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceImei', $this->deviceImei, true);
        Model::validateRequired('deviceFeature', $this->deviceFeature, true);
        Model::validateRequired('deviceTypeCode', $this->deviceTypeCode, true);
        Model::validateRequired('initialPrice', $this->initialPrice, true);
        Model::validateRequired('factoryTime', $this->factoryTime, true);
        Model::validateRequired('releaseTime', $this->releaseTime, true);
        Model::validatePattern('factoryTime', $this->factoryTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('releaseTime', $this->releaseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->deviceFeature) {
            $res['device_feature'] = $this->deviceFeature;
        }
        if (null !== $this->deviceTypeCode) {
            $res['device_type_code'] = $this->deviceTypeCode;
        }
        if (null !== $this->initialPrice) {
            $res['initial_price'] = $this->initialPrice;
        }
        if (null !== $this->factoryTime) {
            $res['factory_time'] = $this->factoryTime;
        }
        if (null !== $this->releaseTime) {
            $res['release_time'] = $this->releaseTime;
        }
        if (null !== $this->deviceTypeId) {
            $res['device_type_id'] = $this->deviceTypeId;
        }
        if (null !== $this->devicePublicKey) {
            $res['device_public_key'] = $this->devicePublicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportDeviceRequest
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
        if (isset($map['device_feature'])) {
            $model->deviceFeature = $map['device_feature'];
        }
        if (isset($map['device_type_code'])) {
            $model->deviceTypeCode = $map['device_type_code'];
        }
        if (isset($map['initial_price'])) {
            $model->initialPrice = $map['initial_price'];
        }
        if (isset($map['factory_time'])) {
            $model->factoryTime = $map['factory_time'];
        }
        if (isset($map['release_time'])) {
            $model->releaseTime = $map['release_time'];
        }
        if (isset($map['device_type_id'])) {
            $model->deviceTypeId = $map['device_type_id'];
        }
        if (isset($map['device_public_key'])) {
            $model->devicePublicKey = $map['device_public_key'];
        }

        return $model;
    }
}
