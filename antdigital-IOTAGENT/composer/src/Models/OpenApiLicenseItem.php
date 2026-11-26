<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiLicenseItem extends Model {
    protected $_name = [
        'licenseCode' => 'license_code',
        'activationState' => 'activation_state',
        'deviceId' => 'device_id',
        'resourceType' => 'resource_type',
        'unit' => 'unit',
        'used' => 'used',
        'remaining' => 'remaining',
    ];
    public function validate() {
        Model::validateRequired('licenseCode', $this->licenseCode, true);
        Model::validateRequired('activationState', $this->activationState, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('unit', $this->unit, true);
        Model::validateRequired('used', $this->used, true);
        Model::validateRequired('remaining', $this->remaining, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->licenseCode) {
            $res['license_code'] = $this->licenseCode;
        }
        if (null !== $this->activationState) {
            $res['activation_state'] = $this->activationState;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }
        if (null !== $this->remaining) {
            $res['remaining'] = $this->remaining;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiLicenseItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['license_code'])){
            $model->licenseCode = $map['license_code'];
        }
        if(isset($map['activation_state'])){
            $model->activationState = $map['activation_state'];
        }
        if(isset($map['device_id'])){
            $model->deviceId = $map['device_id'];
        }
        if(isset($map['resource_type'])){
            $model->resourceType = $map['resource_type'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['used'])){
            $model->used = $map['used'];
        }
        if(isset($map['remaining'])){
            $model->remaining = $map['remaining'];
        }
        return $model;
    }
    // 仅认证租户可见，不记日志
    /**
     * @example undefined
     * @var string
     */
    public $licenseCode;

    // 枚举:INACTIVE,ACTIVE,EXPIRED
    /**
     * @example undefined
     * @var string
     */
    public $activationState;

    /**
     * @example undefined
     * @var string
     */
    public $deviceId;

    // 枚举:AGENT_REQUEST
    /**
     * @example undefined
     * @var string
     */
    public $resourceType;

    // 枚举:QUOTA_POINT
    /**
     * @example undefined
     * @var string
     */
    public $unit;

    /**
     * @example undefined
     * @var int
     */
    public $used;

    // total-used，保留负值
    /**
     * @example undefined
     * @var int
     */
    public $remaining;

}
