<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicDeviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备不可操作列表
    /**
     * @var DeviceDisableData[]
     */
    public $deviceDisableList;

    // 不允许操作类型
    // DISABLE_CHAGE：不允许变更租户
    // DISABLE_EDIT：不允许编辑设备
    // DISABLE_DEL：不允许删除设备
    /**
     * @var string
     */
    public $disableOperateType;

    // 操作状态
    /**
     * @var string
     */
    public $status;

    // 不允许操作提示，操作状态为true时必须有值
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'deviceDisableList'  => 'device_disable_list',
        'disableOperateType' => 'disable_operate_type',
        'status'             => 'status',
        'message'            => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDisableList', $this->deviceDisableList, true);
        Model::validateRequired('disableOperateType', $this->disableOperateType, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceDisableList) {
            $res['device_disable_list'] = [];
            if (null !== $this->deviceDisableList && \is_array($this->deviceDisableList)) {
                $n = 0;
                foreach ($this->deviceDisableList as $item) {
                    $res['device_disable_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->disableOperateType) {
            $res['disable_operate_type'] = $this->disableOperateType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicDeviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['device_disable_list'])) {
            if (!empty($map['device_disable_list'])) {
                $model->deviceDisableList = [];
                $n                        = 0;
                foreach ($map['device_disable_list'] as $item) {
                    $model->deviceDisableList[$n++] = null !== $item ? DeviceDisableData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['disable_operate_type'])) {
            $model->disableOperateType = $map['disable_operate_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
