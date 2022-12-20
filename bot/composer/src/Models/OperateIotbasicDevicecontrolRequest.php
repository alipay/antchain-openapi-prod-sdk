<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicDevicecontrolRequest extends Model
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

    // 设备did 集合
    /**
     * @var string
     */
    public $deviceDidList;

    // 设备did 集合
    /**
     * @var DeviceOperateInfo[]
     */
    public $deviceOperateInfos;

    // 设备操作类型
    /**
     * @var string
     */
    public $deviceOperation;

    // 所属账号名称
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'deviceDidList'      => 'device_did_list',
        'deviceOperateInfos' => 'device_operate_infos',
        'deviceOperation'    => 'device_operation',
        'userId'             => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('deviceOperation', $this->deviceOperation, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->deviceDidList) {
            $res['device_did_list'] = $this->deviceDidList;
        }
        if (null !== $this->deviceOperateInfos) {
            $res['device_operate_infos'] = [];
            if (null !== $this->deviceOperateInfos && \is_array($this->deviceOperateInfos)) {
                $n = 0;
                foreach ($this->deviceOperateInfos as $item) {
                    $res['device_operate_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deviceOperation) {
            $res['device_operation'] = $this->deviceOperation;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicDevicecontrolRequest
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
        if (isset($map['device_did_list'])) {
            $model->deviceDidList = $map['device_did_list'];
        }
        if (isset($map['device_operate_infos'])) {
            if (!empty($map['device_operate_infos'])) {
                $model->deviceOperateInfos = [];
                $n                         = 0;
                foreach ($map['device_operate_infos'] as $item) {
                    $model->deviceOperateInfos[$n++] = null !== $item ? DeviceOperateInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['device_operation'])) {
            $model->deviceOperation = $map['device_operation'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
