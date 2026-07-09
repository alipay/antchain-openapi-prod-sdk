<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CustomerDeviceItem extends Model
{
    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 租户id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // 账号id
    /**
     * @example 账号id
     *
     * @var string
     */
    public $accountId;

    // 设备品类-型号-规格
    /**
     * @example  设备品类-型号-规格
     *
     * @var string
     */
    public $deviceType;

    // 设备sn
    /**
     * @example SN
     *
     * @var string
     */
    public $deviceSn;

    // 设备did
    /**
     * @example dasdf
     *
     * @var string
     */
    public $deviceDid;

    // 服务有效期
    /**
     * @example 服务有效期
     *
     * @var string
     */
    public $valideTime;

    // 设备状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $deviceStatus;

    // 服务状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $serviceStatus;

    // 屏幕状态 开屏、锁屏
    /**
     * @example 屏幕状态
     *
     * @var string
     */
    public $screenStatus;
    protected $_name = [
        'id'            => 'id',
        'tenantId'      => 'tenant_id',
        'accountId'     => 'account_id',
        'deviceType'    => 'device_type',
        'deviceSn'      => 'device_sn',
        'deviceDid'     => 'device_did',
        'valideTime'    => 'valide_time',
        'deviceStatus'  => 'device_status',
        'serviceStatus' => 'service_status',
        'screenStatus'  => 'screen_status',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('deviceType', $this->deviceType, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('valideTime', $this->valideTime, true);
        Model::validateRequired('deviceStatus', $this->deviceStatus, true);
        Model::validateRequired('serviceStatus', $this->serviceStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->valideTime) {
            $res['valide_time'] = $this->valideTime;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->serviceStatus) {
            $res['service_status'] = $this->serviceStatus;
        }
        if (null !== $this->screenStatus) {
            $res['screen_status'] = $this->screenStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerDeviceItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['valide_time'])) {
            $model->valideTime = $map['valide_time'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['service_status'])) {
            $model->serviceStatus = $map['service_status'];
        }
        if (isset($map['screen_status'])) {
            $model->screenStatus = $map['screen_status'];
        }

        return $model;
    }
}
