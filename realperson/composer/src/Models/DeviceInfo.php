<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class DeviceInfo extends Model
{
    // 设备指纹
    /**
     * @example eYOIkkL8SJv0Vr6YxZqaLQ/deHNIc00rQr8zp8Upj6djHBW9oC9RJcdG
     *
     * @var string
     */
    public $deviceFingerprint;

    // 设备制造商
    /**
     * @example xiaomi
     *
     * @var string
     */
    public $deviceBrand;

    // 设备具体型号
    /**
     * @example 2210132C
     *
     * @var string
     */
    public $deviceModel;

    // 操作系统类型
    /**
     * @example android
     *
     * @var string
     */
    public $os;

    // 操作系统版本
    /**
     * @example android 16
     *
     * @var string
     */
    public $osVersion;

    // 设备rom版本
    /**
     * @example 3.0.3.0.WMBCNXM
     *
     * @var string
     */
    public $romModel;

    // 设备硬盘信息
    /**
     * @example 246455967744
     *
     * @var string
     */
    public $hardDisk;

    // 内存容量
    /**
     * @example 7603436
     *
     * @var string
     */
    public $memory;

    // 设备网络ip
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $cameraInfo;

    // 网关入口ip
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $gatewayIp;
    protected $_name = [
        'deviceFingerprint' => 'device_fingerprint',
        'deviceBrand'       => 'device_brand',
        'deviceModel'       => 'device_model',
        'os'                => 'os',
        'osVersion'         => 'os_version',
        'romModel'          => 'rom_model',
        'hardDisk'          => 'hard_disk',
        'memory'            => 'memory',
        'cameraInfo'        => 'camera_info',
        'gatewayIp'         => 'gateway_ip',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceFingerprint) {
            $res['device_fingerprint'] = $this->deviceFingerprint;
        }
        if (null !== $this->deviceBrand) {
            $res['device_brand'] = $this->deviceBrand;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->os) {
            $res['os'] = $this->os;
        }
        if (null !== $this->osVersion) {
            $res['os_version'] = $this->osVersion;
        }
        if (null !== $this->romModel) {
            $res['rom_model'] = $this->romModel;
        }
        if (null !== $this->hardDisk) {
            $res['hard_disk'] = $this->hardDisk;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->cameraInfo) {
            $res['camera_info'] = $this->cameraInfo;
        }
        if (null !== $this->gatewayIp) {
            $res['gateway_ip'] = $this->gatewayIp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_fingerprint'])) {
            $model->deviceFingerprint = $map['device_fingerprint'];
        }
        if (isset($map['device_brand'])) {
            $model->deviceBrand = $map['device_brand'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['os'])) {
            $model->os = $map['os'];
        }
        if (isset($map['os_version'])) {
            $model->osVersion = $map['os_version'];
        }
        if (isset($map['rom_model'])) {
            $model->romModel = $map['rom_model'];
        }
        if (isset($map['hard_disk'])) {
            $model->hardDisk = $map['hard_disk'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['camera_info'])) {
            $model->cameraInfo = $map['camera_info'];
        }
        if (isset($map['gateway_ip'])) {
            $model->gatewayIp = $map['gateway_ip'];
        }

        return $model;
    }
}
