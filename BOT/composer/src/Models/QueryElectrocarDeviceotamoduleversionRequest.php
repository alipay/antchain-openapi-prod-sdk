<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarDeviceotamoduleversionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
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
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
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
     * @return QueryElectrocarDeviceotamoduleversionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
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
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备定位基准：TUID / TRUST_DEVICE_ID / TRUST_PRODUCT_DEVICE
    /**
     * @var string
     */
    public $locatorType;

    // EKYT 全局唯一设备 ID
    /**
     * @var string
     */
    public $tuid;

    // 可信设备唯一id
    /**
     * @var string
     */
    public $trustDeviceId;

    // 可信唯一产品标识
    /**
     * @var string
     */
    public $trustProductKey;

    // 设备名称
    /**
     * @var string
     */
    public $deviceName;

}
