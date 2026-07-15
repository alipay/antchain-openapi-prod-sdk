<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotxDeviceResponse extends Model {
    protected $_name = [
        'id' => 'id',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'tenantId' => 'tenant_id',
        'usageTenantId' => 'usage_tenant_id',
        'deviceName' => 'device_name',
        'productKey' => 'product_key',
        'productName' => 'product_name',
        'nickName' => 'nick_name',
        'deviceSecret' => 'device_secret',
        'deviceStatus' => 'device_status',
        'disableStatus' => 'disable_status',
        'tuid' => 'tuid',
        'trustProductKey' => 'trust_product_key',
        'trustDeviceId' => 'trust_device_id',
        'otaVersion' => 'ota_version',
        'registTime' => 'regist_time',
        'activeTime' => 'active_time',
        'lastOnlineTime' => 'last_online_time',
        'lastOfflineTime' => 'last_offline_time',
        'lastCommunicationTime' => 'last_communication_time',
    ];
    public function validate() {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('registTime', $this->registTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('activeTime', $this->activeTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('lastOnlineTime', $this->lastOnlineTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('lastOfflineTime', $this->lastOfflineTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('lastCommunicationTime', $this->lastCommunicationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->usageTenantId) {
            $res['usage_tenant_id'] = $this->usageTenantId;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->deviceSecret) {
            $res['device_secret'] = $this->deviceSecret;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->disableStatus) {
            $res['disable_status'] = $this->disableStatus;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->trustDeviceId) {
            $res['trust_device_id'] = $this->trustDeviceId;
        }
        if (null !== $this->otaVersion) {
            $res['ota_version'] = $this->otaVersion;
        }
        if (null !== $this->registTime) {
            $res['regist_time'] = $this->registTime;
        }
        if (null !== $this->activeTime) {
            $res['active_time'] = $this->activeTime;
        }
        if (null !== $this->lastOnlineTime) {
            $res['last_online_time'] = $this->lastOnlineTime;
        }
        if (null !== $this->lastOfflineTime) {
            $res['last_offline_time'] = $this->lastOfflineTime;
        }
        if (null !== $this->lastCommunicationTime) {
            $res['last_communication_time'] = $this->lastCommunicationTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IotxDeviceResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['usage_tenant_id'])){
            $model->usageTenantId = $map['usage_tenant_id'];
        }
        if(isset($map['device_name'])){
            $model->deviceName = $map['device_name'];
        }
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['nick_name'])){
            $model->nickName = $map['nick_name'];
        }
        if(isset($map['device_secret'])){
            $model->deviceSecret = $map['device_secret'];
        }
        if(isset($map['device_status'])){
            $model->deviceStatus = $map['device_status'];
        }
        if(isset($map['disable_status'])){
            $model->disableStatus = $map['disable_status'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['trust_device_id'])){
            $model->trustDeviceId = $map['trust_device_id'];
        }
        if(isset($map['ota_version'])){
            $model->otaVersion = $map['ota_version'];
        }
        if(isset($map['regist_time'])){
            $model->registTime = $map['regist_time'];
        }
        if(isset($map['active_time'])){
            $model->activeTime = $map['active_time'];
        }
        if(isset($map['last_online_time'])){
            $model->lastOnlineTime = $map['last_online_time'];
        }
        if(isset($map['last_offline_time'])){
            $model->lastOfflineTime = $map['last_offline_time'];
        }
        if(isset($map['last_communication_time'])){
            $model->lastCommunicationTime = $map['last_communication_time'];
        }
        return $model;
    }
    // 主键id
    /**
     * @example 656431049086242816
     * @var string
     */
    public $id;

    // 创建时间
    /**
     * @example 2026-07-14 15:54:45
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2026-07-14 15:54:45
     * @var string
     */
    public $gmtModified;

    // 租户id
    /**
     * @example XQBKTRQV
     * @var string
     */
    public $tenantId;

    // 使用租户id
    /**
     * @example XQBKTRQV
     * @var string
     */
    public $usageTenantId;

    // 设备名称
    /**
     * @example FF9999995FF1020260409B6305762869
     * @var string
     */
    public $deviceName;

    // 产品key
    /**
     * @example iiH0DAhcM46xR1Bm
     * @var string
     */
    public $productKey;

    // 产品名称
    /**
     * @example 产品名称
     * @var string
     */
    public $productName;

    // 设备昵称
    /**
     * @example 604C6472CDA911149D5F88D869452848
     * @var string
     */
    public $nickName;

    // 设备秘钥
    /**
     * @example 7f0f205e13d2a3fbe6e2117dc0771745
     * @var string
     */
    public $deviceSecret;

    // 设备状态
    /**
     * @example ONLINE
     * @var string
     */
    public $deviceStatus;

    // 禁用状态：0-未禁用；1-已禁用
    /**
     * @example 0
     * @var string
     */
    public $disableStatus;

    // ekyt设备唯一标识
    /**
     * @example FF9999995FF1020260409A0C53CC331F
     * @var string
     */
    public $tuid;

    // 可信产品唯一标识
    /**
     * @example rSJhq6L0DcALjUlEW0
     * @var string
     */
    public $trustProductKey;

    // 可信物联唯一设备标识
    /**
     * @example device_7447891005096624128
     * @var string
     */
    public $trustDeviceId;

    // ota固件版本号
    /**
     * @example {"CAT1_OTA":"1.0.4","BLE":"1.0.2"}
     * @var string
     */
    public $otaVersion;

    // 设备注册时间
    /**
     * @example 2026-04-09 14:21:14
     * @var string
     */
    public $registTime;

    // 设备激活时间
    /**
     * @example 2026-04-14 12:40:24
     * @var string
     */
    public $activeTime;

    // 最近在线时间
    /**
     * @example 2026-04-15 09:51:48
     * @var string
     */
    public $lastOnlineTime;

    // 最近离线时间
    /**
     * @example 2026-04-15 09:51:49
     * @var string
     */
    public $lastOfflineTime;

    // 最近通讯时间
    /**
     * @example 2026-04-15 09:51:47
     * @var string
     */
    public $lastCommunicationTime;

}
