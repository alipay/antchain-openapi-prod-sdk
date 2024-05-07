<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateDevicecorpDevicecontrolRequest extends Model
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

    // 设备列表
    /**
     * @var DeviceOperateInfo[]
     */
    public $deviceInfos;

    // 设备管控操作；OPEN：设备开启；CLOSE：设备关闭；RESET：设备重置。
    /**
     * @var string
     */
    public $deviceOperation;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceInfos'       => 'device_infos',
        'deviceOperation'   => 'device_operation',
    ];

    public function validate()
    {
        Model::validateRequired('deviceInfos', $this->deviceInfos, true);
        Model::validateRequired('deviceOperation', $this->deviceOperation, true);
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
        if (null !== $this->deviceInfos) {
            $res['device_infos'] = [];
            if (null !== $this->deviceInfos && \is_array($this->deviceInfos)) {
                $n = 0;
                foreach ($this->deviceInfos as $item) {
                    $res['device_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deviceOperation) {
            $res['device_operation'] = $this->deviceOperation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateDevicecorpDevicecontrolRequest
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
        if (isset($map['device_infos'])) {
            if (!empty($map['device_infos'])) {
                $model->deviceInfos = [];
                $n                  = 0;
                foreach ($map['device_infos'] as $item) {
                    $model->deviceInfos[$n++] = null !== $item ? DeviceOperateInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['device_operation'])) {
            $model->deviceOperation = $map['device_operation'];
        }

        return $model;
    }
}
