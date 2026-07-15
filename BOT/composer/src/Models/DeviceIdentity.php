<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceIdentity extends Model {
    protected $_name = [
        'tuid' => 'tuid',
        'trustProductKey' => 'trust_product_key',
        'trustDeviceId' => 'trust_device_id',
        'deviceName' => 'device_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->trustDeviceId) {
            $res['trust_device_id'] = $this->trustDeviceId;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeviceIdentity
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['trust_device_id'])){
            $model->trustDeviceId = $map['trust_device_id'];
        }
        if(isset($map['device_name'])){
            $model->deviceName = $map['device_name'];
        }
        return $model;
    }
    // EKYT 全局唯一设备 ID
    /**
     * @example FF9999995FF1020260610262F9D641B9
     * @var string
     */
    public $tuid;

    // 可信唯一产品标识
    /**
     * @example 5C7ku13XSCK1a7AKzR
     * @var string
     */
    public $trustProductKey;

    // 可信唯一设备标识
    /**
     * @example device_7480821483460534272
     * @var string
     */
    public $trustDeviceId;

    // 设备名称
    /**
     * @example 02:27:06:a6:10:ae
     * @var string
     */
    public $deviceName;

}
