<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class Peripheral extends Model
{
    // 外围设备Id
    /**
     * @example 123
     *
     * @var string
     */
    public $peripheralId;

    // 数据模型id
    //
    /**
     * @example 123456
     *
     * @var string
     */
    public $peripheralDataModelId;

    // 场景码
    //
    /**
     * @example scene1
     *
     * @var string
     */
    public $scene;

    // 外围设备名称
    //
    /**
     * @example 锂电池1
     *
     * @var string
     */
    public $peripheralName;

    // 厂商名称
    //
    /**
     * @example 宁德时代1
     *
     * @var string
     */
    public $corpName;

    // 链上外围设备Id
    //
    /**
     * @example 123123
     *
     * @var string
     */
    public $chainPeripheralId;

    // 链上哈希
    /**
     * @example txhash123
     *
     * @var string
     */
    public $txHash;

    // 上链时间
    /**
     * @example 1605076751000
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
     * @example 3000
     *
     * @var int
     */
    public $deviceTypeCode;

    // 单价，单位分
    /**
     * @example 1000
     *
     * @var int
     */
    public $initialPrice;

    // 出厂时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $factoryTime;

    // 投放时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $releaseTime;
    protected $_name = [
        'peripheralId'          => 'peripheral_id',
        'peripheralDataModelId' => 'peripheral_data_model_id',
        'scene'                 => 'scene',
        'peripheralName'        => 'peripheral_name',
        'corpName'              => 'corp_name',
        'chainPeripheralId'     => 'chain_peripheral_id',
        'txHash'                => 'tx_hash',
        'txTime'                => 'tx_time',
        'deviceTypeCode'        => 'device_type_code',
        'initialPrice'          => 'initial_price',
        'factoryTime'           => 'factory_time',
        'releaseTime'           => 'release_time',
    ];

    public function validate()
    {
        Model::validateRequired('peripheralId', $this->peripheralId, true);
        Model::validateRequired('peripheralDataModelId', $this->peripheralDataModelId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('chainPeripheralId', $this->chainPeripheralId, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('txTime', $this->txTime, true);
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
        if (null !== $this->peripheralId) {
            $res['peripheral_id'] = $this->peripheralId;
        }
        if (null !== $this->peripheralDataModelId) {
            $res['peripheral_data_model_id'] = $this->peripheralDataModelId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->peripheralName) {
            $res['peripheral_name'] = $this->peripheralName;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->chainPeripheralId) {
            $res['chain_peripheral_id'] = $this->chainPeripheralId;
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
     * @return Peripheral
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['peripheral_id'])) {
            $model->peripheralId = $map['peripheral_id'];
        }
        if (isset($map['peripheral_data_model_id'])) {
            $model->peripheralDataModelId = $map['peripheral_data_model_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['peripheral_name'])) {
            $model->peripheralName = $map['peripheral_name'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['chain_peripheral_id'])) {
            $model->chainPeripheralId = $map['chain_peripheral_id'];
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
        if (isset($map['factory_time'])) {
            $model->factoryTime = $map['factory_time'];
        }
        if (isset($map['release_time'])) {
            $model->releaseTime = $map['release_time'];
        }

        return $model;
    }
}
