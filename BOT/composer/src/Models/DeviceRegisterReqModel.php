<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceRegisterReqModel extends Model
{
    // 保留
    /**
     * @example 0
     *
     * @var int
     */
    public $authLevel;

    // 设备属性字符串，
    // 阿里云设备类型，填入三元组
    /**
     * @example "设备属性"
     *
     * @var string
     */
    public $deviceAttribute;

    // 物模型ID，参考其他文档
    /**
     * @example "模型ID"
     *
     * @var string
     */
    public $deviceModelId;

    // 可传入自定义信息
    /**
     * @example "自定义字段"
     *
     * @var string
     */
    public $otherInfo;

    // 业务自定义，可以传入该实体的w3c服务节点
    /**
     * @example "服务端点"
     *
     * @var string
     */
    public $serviceEndpoint;

    // 保留，默认
    // STATUS_REGISTERED(3)
    /**
     * @example null
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'authLevel'       => 'auth_level',
        'deviceAttribute' => 'device_attribute',
        'deviceModelId'   => 'device_model_id',
        'otherInfo'       => 'other_info',
        'serviceEndpoint' => 'service_endpoint',
        'status'          => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authLevel) {
            $res['auth_level'] = $this->authLevel;
        }
        if (null !== $this->deviceAttribute) {
            $res['device_attribute'] = $this->deviceAttribute;
        }
        if (null !== $this->deviceModelId) {
            $res['device_model_id'] = $this->deviceModelId;
        }
        if (null !== $this->otherInfo) {
            $res['other_info'] = $this->otherInfo;
        }
        if (null !== $this->serviceEndpoint) {
            $res['service_endpoint'] = $this->serviceEndpoint;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceRegisterReqModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_level'])) {
            $model->authLevel = $map['auth_level'];
        }
        if (isset($map['device_attribute'])) {
            $model->deviceAttribute = $map['device_attribute'];
        }
        if (isset($map['device_model_id'])) {
            $model->deviceModelId = $map['device_model_id'];
        }
        if (isset($map['other_info'])) {
            $model->otherInfo = $map['other_info'];
        }
        if (isset($map['service_endpoint'])) {
            $model->serviceEndpoint = $map['service_endpoint'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
