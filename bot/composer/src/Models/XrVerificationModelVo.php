<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class XrVerificationModelVo extends Model
{
    // 核销资源生成的实例，xr设备对应设备did
    /**
     * @example qsdfskjes
     *
     * @var string
     */
    public $instanceId;

    // 生成的实例名称，xr设备就的对应的具体设备sn
    /**
     * @example 设备sn
     *
     * @var string
     */
    public $instanceName;

    // 线下场有效期
    /**
     * @example 2022-10-02 09:10:09
     *
     * @var string
     */
    public $validTime;

    // 服务状态：INIT初始化、SERVICING服务中、PAUSED已暂停、EXPIRED停用
    /**
     * @example INIT
     *
     * @var string
     */
    public $seviceStatus;

    // 设备状态：INIT 初始化、ONLINE 在线、OFFLINE 离线、FAULT 故障、ACTIVATED 激活
    /**
     * @example ONLINE
     *
     * @var string
     */
    public $deviceStatus;

    // 唯一ID，对应线下场code
    /**
     * @example 唯一ID，对应线下场code
     *
     * @var string
     */
    public $resourceId;

    // 对应线下场名称
    /**
     * @example 对应线下场名称
     *
     * @var string
     */
    public $resourceName;

    // 核销类型
    /**
     * @example XR_DEVICE
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'instanceId'   => 'instance_id',
        'instanceName' => 'instance_name',
        'validTime'    => 'valid_time',
        'seviceStatus' => 'sevice_status',
        'deviceStatus' => 'device_status',
        'resourceId'   => 'resource_id',
        'resourceName' => 'resource_name',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('instanceName', $this->instanceName, true);
        Model::validateRequired('validTime', $this->validTime, true);
        Model::validateRequired('seviceStatus', $this->seviceStatus, true);
        Model::validateRequired('deviceStatus', $this->deviceStatus, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('resourceName', $this->resourceName, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->seviceStatus) {
            $res['sevice_status'] = $this->seviceStatus;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XrVerificationModelVo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['sevice_status'])) {
            $model->seviceStatus = $map['sevice_status'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
