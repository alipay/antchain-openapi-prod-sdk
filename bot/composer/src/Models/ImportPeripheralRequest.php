<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportPeripheralRequest extends Model
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

    // 厂商名称
    /**
     * @var string
     */
    public $corpName;

    // 数据模型id
    /**
     * @var string
     */
    public $peripheralDataModelId;

    // 外围设备ID
    /**
     * @var string
     */
    public $peripheralId;

    // 外围设备名称
    /**
     * @var string
     */
    public $peripheralName;

    // 场景码
    /**
     * @var string
     */
    public $scene;

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
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'corpName'              => 'corp_name',
        'peripheralDataModelId' => 'peripheral_data_model_id',
        'peripheralId'          => 'peripheral_id',
        'peripheralName'        => 'peripheral_name',
        'scene'                 => 'scene',
        'deviceTypeCode'        => 'device_type_code',
        'initialPrice'          => 'initial_price',
        'factoryTime'           => 'factory_time',
        'releaseTime'           => 'release_time',
    ];

    public function validate()
    {
        Model::validateRequired('peripheralDataModelId', $this->peripheralDataModelId, true);
        Model::validateRequired('peripheralId', $this->peripheralId, true);
        Model::validateRequired('scene', $this->scene, true);
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
        if (null !== $this->peripheralDataModelId) {
            $res['peripheral_data_model_id'] = $this->peripheralDataModelId;
        }
        if (null !== $this->peripheralId) {
            $res['peripheral_id'] = $this->peripheralId;
        }
        if (null !== $this->peripheralName) {
            $res['peripheral_name'] = $this->peripheralName;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportPeripheralRequest
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
        if (isset($map['peripheral_data_model_id'])) {
            $model->peripheralDataModelId = $map['peripheral_data_model_id'];
        }
        if (isset($map['peripheral_id'])) {
            $model->peripheralId = $map['peripheral_id'];
        }
        if (isset($map['peripheral_name'])) {
            $model->peripheralName = $map['peripheral_name'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
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

        return $model;
    }
}
