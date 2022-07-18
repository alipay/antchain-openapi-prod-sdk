<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributedeviceBydeviceidRequest extends Model
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

    // 厂商名
    /**
     * @var string
     */
    public $corpName;

    // 数据模型Id
    /**
     * @var string
     */
    public $deviceDataModelId;

    // 设备Id
    /**
     * @var string
     */
    public $deviceId;

    // 设备imei号
    /**
     * @var string
     */
    public $deviceImei;

    // 设备名称
    /**
     * @var string
     */
    public $deviceName;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
    /**
     * @var string
     */
    public $deviceFeature;

    // 当用已发行设备发行时返回已发行id或返回错误
    /**
     * @var bool
     */
    public $withExistDeviceId;

    // 设备类型编码
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

    // 额外信息
    /**
     * @var string
     */
    public $extraInfo;

    // 资产所有人标识（统一社会信用代码）
    /**
     * @var string
     */
    public $owner;

    // 资产所有人名称
    /**
     * @var string
     */
    public $ownerName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'corpName'          => 'corp_name',
        'deviceDataModelId' => 'device_data_model_id',
        'deviceId'          => 'device_id',
        'deviceImei'        => 'device_imei',
        'deviceName'        => 'device_name',
        'scene'             => 'scene',
        'deviceFeature'     => 'device_feature',
        'withExistDeviceId' => 'with_exist_device_id',
        'deviceTypeCode'    => 'device_type_code',
        'initialPrice'      => 'initial_price',
        'factoryTime'       => 'factory_time',
        'releaseTime'       => 'release_time',
        'extraInfo'         => 'extra_info',
        'owner'             => 'owner',
        'ownerName'         => 'owner_name',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDataModelId', $this->deviceDataModelId, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('ownerName', $this->ownerName, true);
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
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->deviceDataModelId) {
            $res['device_data_model_id'] = $this->deviceDataModelId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->deviceImei) {
            $res['device_imei'] = $this->deviceImei;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceFeature) {
            $res['device_feature'] = $this->deviceFeature;
        }
        if (null !== $this->withExistDeviceId) {
            $res['with_exist_device_id'] = $this->withExistDeviceId;
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
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributedeviceBydeviceidRequest
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
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['device_data_model_id'])) {
            $model->deviceDataModelId = $map['device_data_model_id'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['device_imei'])) {
            $model->deviceImei = $map['device_imei'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['device_feature'])) {
            $model->deviceFeature = $map['device_feature'];
        }
        if (isset($map['with_exist_device_id'])) {
            $model->withExistDeviceId = $map['with_exist_device_id'];
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
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }

        return $model;
    }
}
