<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceLocator extends Model {
    protected $_name = [
        'locatorType' => 'locator_type',
        'tuid' => 'tuid',
        'trustDeviceId' => 'trust_device_id',
        'trustProductKey' => 'trust_product_key',
        'deviceName' => 'device_name',
    ];
    public function validate() {
        Model::validateRequired('locatorType', $this->locatorType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->locatorType) {
            $res['locator_type'] = $this->locatorType;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->trustDeviceId) {
            $res['trust_device_id'] = $this->trustDeviceId;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeviceLocator
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['locator_type'])){
            $model->locatorType = $map['locator_type'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['trust_device_id'])){
            $model->trustDeviceId = $map['trust_device_id'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['device_name'])){
            $model->deviceName = $map['device_name'];
        }
        return $model;
    }
    // 设备唯一标识定位方式：TUID / TRUST_DEVICE_ID / TRUST_PRODUCT_DEVICE
    /**
     * @example TUID
     * @var string
     */
    public $locatorType;

    // EKYT 全局唯一设备 ID
    /**
     * @example FF9999995FF1020260610262F9D641B9
     * @var string
     */
    public $tuid;

    // 可信物联设备唯一标识
    /**
     * @example device_7470008018051342336
     * @var string
     */
    public $trustDeviceId;

    // 可信物联产品唯一标识
    /**
     * @example 5C7ku13XSCK1a7AKzR
     * @var string
     */
    public $trustProductKey;

    // 设备名称
    /**
     * @example 863091061327685
     * @var string
     */
    public $deviceName;

}
