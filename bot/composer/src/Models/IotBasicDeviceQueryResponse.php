<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicDeviceQueryResponse extends Model
{
    // 设备名称
    //
    /**
     * @example 智能防疫一体机
     *
     * @var string
     */
    public $deviceName;

    // 设备序列号
    /**
     * @example CN12300x
     *
     * @var string
     */
    public $deviceSn;

    // 设备品类名称
    /**
     * @example 智能防疫机
     *
     * @var string
     */
    public $deviceCategoryName;

    // 设备型号
    /**
     * @example PL10
     *
     * @var string
     */
    public $deviceModel;

    // 设备状态
    /**
     * @example online
     *
     * @var string
     */
    public $deviceStatus;

    // 设备安装位置
    /**
     * @example 浙江省杭州市西湖区
     *
     * @var string
     */
    public $location;

    // 设备注册时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $registerTime;

    // 设备厂商
    /**
     * @example 蚂蚁数科
     *
     * @var string
     */
    public $corpName;

    // 租户ID
    /**
     * @example 2088xx
     *
     * @var string
     */
    public $tenantId;

    // 客户名称
    /**
     * @example 测试客户xx
     *
     * @var string
     */
    public $customerName;

    // 异常错误码
    /**
     * @example SMILE_INIT_ERROR
     *
     * @var string
     */
    public $abnormalCode;

    // 设备唯一身份id
    /**
     * @example did:private:12dsadadadf
     *
     * @var string
     */
    public $deviceDid;

    // 账号ID
    /**
     * @example 12321321
     *
     * @var string
     */
    public $accountId;

    // 账户名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $accountName;

    // 设备服务状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $serviceStatus;

    // 应用版本号
    /**
     * @example 1.1.13
     *
     * @var string
     */
    public $appVersion;

    // 服务有效期
    /**
     * @example 2024-4-01
     *
     * @var string
     */
    public $validityTime;
    protected $_name = [
        'deviceName'         => 'device_name',
        'deviceSn'           => 'device_sn',
        'deviceCategoryName' => 'device_category_name',
        'deviceModel'        => 'device_model',
        'deviceStatus'       => 'device_status',
        'location'           => 'location',
        'registerTime'       => 'register_time',
        'corpName'           => 'corp_name',
        'tenantId'           => 'tenant_id',
        'customerName'       => 'customer_name',
        'abnormalCode'       => 'abnormal_code',
        'deviceDid'          => 'device_did',
        'accountId'          => 'account_id',
        'accountName'        => 'account_name',
        'serviceStatus'      => 'service_status',
        'appVersion'         => 'app_version',
        'validityTime'       => 'validity_time',
    ];

    public function validate()
    {
        Model::validateRequired('deviceName', $this->deviceName, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('deviceCategoryName', $this->deviceCategoryName, true);
        Model::validateRequired('deviceModel', $this->deviceModel, true);
        Model::validateRequired('registerTime', $this->registerTime, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('serviceStatus', $this->serviceStatus, true);
        Model::validateRequired('appVersion', $this->appVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->deviceCategoryName) {
            $res['device_category_name'] = $this->deviceCategoryName;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->registerTime) {
            $res['register_time'] = $this->registerTime;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->abnormalCode) {
            $res['abnormal_code'] = $this->abnormalCode;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->serviceStatus) {
            $res['service_status'] = $this->serviceStatus;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->validityTime) {
            $res['validity_time'] = $this->validityTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicDeviceQueryResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['device_category_name'])) {
            $model->deviceCategoryName = $map['device_category_name'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['register_time'])) {
            $model->registerTime = $map['register_time'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['abnormal_code'])) {
            $model->abnormalCode = $map['abnormal_code'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['service_status'])) {
            $model->serviceStatus = $map['service_status'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['validity_time'])) {
            $model->validityTime = $map['validity_time'];
        }

        return $model;
    }
}
