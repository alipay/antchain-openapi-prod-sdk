<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicDeviceRegisterInfo extends Model
{
    // 设备规格
    /**
     * @example xxx
     *
     * @var string
     */
    public $deviceSpecs;

    // 设备型号
    /**
     * @example xxx
     *
     * @var string
     */
    public $deviceModel;

    // 设备名称
    /**
     * @example test
     *
     * @var string
     */
    public $deviceName;

    // 设备sn
    /**
     * @example xx
     *
     * @var string
     */
    public $deviceSn;

    // 设备标签
    /**
     * @example telpo
     *
     * @var string
     */
    public $nickName;

    // 安装位置
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $location;

    // 设备扩展信息
    /**
     * @example [{ "txHash" : "2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2" }]
     *
     * @var string
     */
    public $deviceExt;

    // 设备安全认证ID
    /**
     * @example secid
     *
     * @var string
     */
    public $secId;
    protected $_name = [
        'deviceSpecs' => 'device_specs',
        'deviceModel' => 'device_model',
        'deviceName'  => 'device_name',
        'deviceSn'    => 'device_sn',
        'nickName'    => 'nick_name',
        'location'    => 'location',
        'deviceExt'   => 'device_ext',
        'secId'       => 'sec_id',
    ];

    public function validate()
    {
        Model::validateRequired('deviceSpecs', $this->deviceSpecs, true);
        Model::validateRequired('deviceModel', $this->deviceModel, true);
        Model::validateRequired('deviceName', $this->deviceName, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceSpecs) {
            $res['device_specs'] = $this->deviceSpecs;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->deviceExt) {
            $res['device_ext'] = $this->deviceExt;
        }
        if (null !== $this->secId) {
            $res['sec_id'] = $this->secId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicDeviceRegisterInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_specs'])) {
            $model->deviceSpecs = $map['device_specs'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['device_ext'])) {
            $model->deviceExt = $map['device_ext'];
        }
        if (isset($map['sec_id'])) {
            $model->secId = $map['sec_id'];
        }

        return $model;
    }
}
