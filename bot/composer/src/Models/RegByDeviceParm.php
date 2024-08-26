<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RegByDeviceParm extends Model
{
    // 一般是业务上唯一的设备ID/资产编码
    //
    /**
     * @example 1122
     *
     * @var string
     */
    public $deviceId;

    // 数据模型ID
    /**
     * @example 7033986596836630528
     *
     * @var string
     */
    public $deviceDataModelId;

    // 设备端经过蚂蚁SDK或模组初始化得到的注册信息
    /**
     * @example 73546f6b656e323031323131313332393235303230303033
     *
     * @var string
     */
    public $deviceRegContent;

    // 蚂蚁侧SDK或模组对device_reg_content的签名
    /**
     * @example a573546f6b656e323031323131313332393235303230303033
     *
     * @var string
     */
    public $deviceRegSignature;

    // sdk版本号，由蚂蚁侧提供
    /**
     * @example ma1-t1-0.1.1-00.04.54
     *
     * @var string
     */
    public $sdkId;

    // 设备类型编码，联系蚂蚁侧获取设备类型编码
    //
    /**
     * @example 1001
     *
     * @var int
     */
    public $deviceTypeCode;

    // 设备单价 单位：分
    //
    /**
     * @example 1000
     *
     * @var int
     */
    public $initialPrice;

    // 出厂时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $factoryTime;

    // 投放时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $releaseTime;

    // 额外信息，联系蚂蚁侧获取参数格式
    //
    /**
     * @example {...}
     *
     * @var string
     */
    public $extraInfo;

    // 资产所有人标识（统一社会信用代码）
    //
    /**
     * @example 91310101MA1FPCXA3G
     *
     * @var string
     */
    public $owner;

    // 资产所有人名称
    /**
     * @example 蚂蚁区块链科技（上海）有限公司
     *
     * @var string
     */
    public $ownerName;

    // 设备名称/型号
    /**
     * @example 64.0V30AH
     *
     * @var string
     */
    public $deviceName;

    // 设备IMEI
    /**
     * @example 823456712312345
     *
     * @var string
     */
    public $deviceImei;
    protected $_name = [
        'deviceId'           => 'device_id',
        'deviceDataModelId'  => 'device_data_model_id',
        'deviceRegContent'   => 'device_reg_content',
        'deviceRegSignature' => 'device_reg_signature',
        'sdkId'              => 'sdk_id',
        'deviceTypeCode'     => 'device_type_code',
        'initialPrice'       => 'initial_price',
        'factoryTime'        => 'factory_time',
        'releaseTime'        => 'release_time',
        'extraInfo'          => 'extra_info',
        'owner'              => 'owner',
        'ownerName'          => 'owner_name',
        'deviceName'         => 'device_name',
        'deviceImei'         => 'device_imei',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('deviceRegContent', $this->deviceRegContent, true);
        Model::validateRequired('deviceRegSignature', $this->deviceRegSignature, true);
        Model::validateRequired('sdkId', $this->sdkId, true);
        Model::validateRequired('deviceTypeCode', $this->deviceTypeCode, true);
        Model::validatePattern('factoryTime', $this->factoryTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('releaseTime', $this->releaseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->deviceRegContent) {
            $res['device_reg_content'] = $this->deviceRegContent;
        }
        if (null !== $this->deviceRegSignature) {
            $res['device_reg_signature'] = $this->deviceRegSignature;
        }
        if (null !== $this->sdkId) {
            $res['sdk_id'] = $this->sdkId;
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
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->deviceImei) {
            $res['device_imei'] = $this->deviceImei;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegByDeviceParm
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
        if (isset($map['device_reg_content'])) {
            $model->deviceRegContent = $map['device_reg_content'];
        }
        if (isset($map['device_reg_signature'])) {
            $model->deviceRegSignature = $map['device_reg_signature'];
        }
        if (isset($map['sdk_id'])) {
            $model->sdkId = $map['sdk_id'];
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
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['device_imei'])) {
            $model->deviceImei = $map['device_imei'];
        }

        return $model;
    }
}
