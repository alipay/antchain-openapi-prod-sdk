<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class DeviceRiskInfo extends Model
{
    // 设备是否root
    /**
     * @example
     *
     * @var bool
     */
    public $isDeviceRooted;

    // 设备是否hook
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isDeviceHooked;

    // 设备是否使用定制rom
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isCustomRom;

    // 设备是否是云手机
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isCloudPhone;

    // 是否为模拟器
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isEmulator;

    // 设备是否支持虚拟摄像头
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasVirtualCamera;

    // 设备是否使用虚拟摄像头
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isUsingVirtualCamera;

    // 设备是否有重打包风险
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasRepackRisk;

    // 设备是否多开
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isMultiInstance;

    // 设备是否开启虚拟定位
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isFakeLocation;

    // 有其他注入行为
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasOtherInjection;

    // 设备是否有其他自动化工具
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasAtuomationTools;

    // 风险sdk的JSON格式数据
    /**
     * @example {}
     *
     * @var string
     */
    public $riskSdkJson;
    protected $_name = [
        'isDeviceRooted'       => 'is_device_rooted',
        'isDeviceHooked'       => 'is_device_hooked',
        'isCustomRom'          => 'is_custom_rom',
        'isCloudPhone'         => 'is_cloud_phone',
        'isEmulator'           => 'is_emulator',
        'hasVirtualCamera'     => 'has_virtual_camera',
        'isUsingVirtualCamera' => 'is_using_virtual_camera',
        'hasRepackRisk'        => 'has_repack_risk',
        'isMultiInstance'      => 'is_multi_instance',
        'isFakeLocation'       => 'is_fake_location',
        'hasOtherInjection'    => 'has_other_injection',
        'hasAtuomationTools'   => 'has_atuomation_tools',
        'riskSdkJson'          => 'risk_sdk_json',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isDeviceRooted) {
            $res['is_device_rooted'] = $this->isDeviceRooted;
        }
        if (null !== $this->isDeviceHooked) {
            $res['is_device_hooked'] = $this->isDeviceHooked;
        }
        if (null !== $this->isCustomRom) {
            $res['is_custom_rom'] = $this->isCustomRom;
        }
        if (null !== $this->isCloudPhone) {
            $res['is_cloud_phone'] = $this->isCloudPhone;
        }
        if (null !== $this->isEmulator) {
            $res['is_emulator'] = $this->isEmulator;
        }
        if (null !== $this->hasVirtualCamera) {
            $res['has_virtual_camera'] = $this->hasVirtualCamera;
        }
        if (null !== $this->isUsingVirtualCamera) {
            $res['is_using_virtual_camera'] = $this->isUsingVirtualCamera;
        }
        if (null !== $this->hasRepackRisk) {
            $res['has_repack_risk'] = $this->hasRepackRisk;
        }
        if (null !== $this->isMultiInstance) {
            $res['is_multi_instance'] = $this->isMultiInstance;
        }
        if (null !== $this->isFakeLocation) {
            $res['is_fake_location'] = $this->isFakeLocation;
        }
        if (null !== $this->hasOtherInjection) {
            $res['has_other_injection'] = $this->hasOtherInjection;
        }
        if (null !== $this->hasAtuomationTools) {
            $res['has_atuomation_tools'] = $this->hasAtuomationTools;
        }
        if (null !== $this->riskSdkJson) {
            $res['risk_sdk_json'] = $this->riskSdkJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceRiskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_device_rooted'])) {
            $model->isDeviceRooted = $map['is_device_rooted'];
        }
        if (isset($map['is_device_hooked'])) {
            $model->isDeviceHooked = $map['is_device_hooked'];
        }
        if (isset($map['is_custom_rom'])) {
            $model->isCustomRom = $map['is_custom_rom'];
        }
        if (isset($map['is_cloud_phone'])) {
            $model->isCloudPhone = $map['is_cloud_phone'];
        }
        if (isset($map['is_emulator'])) {
            $model->isEmulator = $map['is_emulator'];
        }
        if (isset($map['has_virtual_camera'])) {
            $model->hasVirtualCamera = $map['has_virtual_camera'];
        }
        if (isset($map['is_using_virtual_camera'])) {
            $model->isUsingVirtualCamera = $map['is_using_virtual_camera'];
        }
        if (isset($map['has_repack_risk'])) {
            $model->hasRepackRisk = $map['has_repack_risk'];
        }
        if (isset($map['is_multi_instance'])) {
            $model->isMultiInstance = $map['is_multi_instance'];
        }
        if (isset($map['is_fake_location'])) {
            $model->isFakeLocation = $map['is_fake_location'];
        }
        if (isset($map['has_other_injection'])) {
            $model->hasOtherInjection = $map['has_other_injection'];
        }
        if (isset($map['has_atuomation_tools'])) {
            $model->hasAtuomationTools = $map['has_atuomation_tools'];
        }
        if (isset($map['risk_sdk_json'])) {
            $model->riskSdkJson = $map['risk_sdk_json'];
        }

        return $model;
    }
}
