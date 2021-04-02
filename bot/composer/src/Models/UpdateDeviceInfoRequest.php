<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateDeviceInfoRequest extends Model
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

    // 链上设备Id
    /**
     * @var string
     */
    public $chainDeviceId;

    // 设备imei号
    /**
     * @var string
     */
    public $deviceImei;

    // 设备数据模型Id
    //
    //
    /**
     * @var string
     */
    public $dataModelId;

    // 设备ICCID
    //
    //
    /**
     * @var string
     */
    public $deviceIccid;

    // deviceTypeCode 枚举
    //
    // 车辆: 1000
    // 四轮车: 1001
    // 纯电四轮车:1002
    // 混动四轮车 1003
    // 燃油四轮车 : 1004
    //
    // 两轮车:1011
    // 两轮单车:1012
    // 两轮助力车:1013
    //
    // 换电柜 :2000
    // 二轮车换电柜:2001
    //
    // 电池 :3000
    // 磷酸铁电池:3001
    // 三元锂电池:3002
    //
    // 回收设备:4000
    // 垃圾分类回收:4001
    //
    // 洗车机 :5000
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
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainDeviceId'     => 'chain_device_id',
        'deviceImei'        => 'device_imei',
        'dataModelId'       => 'data_model_id',
        'deviceIccid'       => 'device_iccid',
        'deviceTypeCode'    => 'device_type_code',
        'initialPrice'      => 'initial_price',
        'factoryTime'       => 'factory_time',
        'releaseTime'       => 'release_time',
    ];

    public function validate()
    {
        Model::validateRequired('chainDeviceId', $this->chainDeviceId, true);
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
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
        }
        if (null !== $this->deviceImei) {
            $res['device_imei'] = $this->deviceImei;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->deviceIccid) {
            $res['device_iccid'] = $this->deviceIccid;
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
     * @return UpdateDeviceInfoRequest
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
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
        }
        if (isset($map['device_imei'])) {
            $model->deviceImei = $map['device_imei'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['device_iccid'])) {
            $model->deviceIccid = $map['device_iccid'];
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
