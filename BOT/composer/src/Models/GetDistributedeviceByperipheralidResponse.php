<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetDistributedeviceByperipheralidResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 发行设备信息数组
    /**
     * @var DistributeDevice[]
     */
    public $distributeDeviceList;

    // 发行设备信息不存在的外围设备ID集合
    /**
     * @var string[]
     */
    public $missPeripheralIdList;

    // 获取外围设备信息成功的外围设备ID集合
    /**
     * @var string[]
     */
    public $successPeripheralIdList;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'distributeDeviceList'    => 'distribute_device_list',
        'missPeripheralIdList'    => 'miss_peripheral_id_list',
        'successPeripheralIdList' => 'success_peripheral_id_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->distributeDeviceList) {
            $res['distribute_device_list'] = [];
            if (null !== $this->distributeDeviceList && \is_array($this->distributeDeviceList)) {
                $n = 0;
                foreach ($this->distributeDeviceList as $item) {
                    $res['distribute_device_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->missPeripheralIdList) {
            $res['miss_peripheral_id_list'] = $this->missPeripheralIdList;
        }
        if (null !== $this->successPeripheralIdList) {
            $res['success_peripheral_id_list'] = $this->successPeripheralIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDistributedeviceByperipheralidResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['distribute_device_list'])) {
            if (!empty($map['distribute_device_list'])) {
                $model->distributeDeviceList = [];
                $n                           = 0;
                foreach ($map['distribute_device_list'] as $item) {
                    $model->distributeDeviceList[$n++] = null !== $item ? DistributeDevice::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['miss_peripheral_id_list'])) {
            if (!empty($map['miss_peripheral_id_list'])) {
                $model->missPeripheralIdList = $map['miss_peripheral_id_list'];
            }
        }
        if (isset($map['success_peripheral_id_list'])) {
            if (!empty($map['success_peripheral_id_list'])) {
                $model->successPeripheralIdList = $map['success_peripheral_id_list'];
            }
        }

        return $model;
    }
}
