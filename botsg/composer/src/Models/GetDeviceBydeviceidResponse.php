<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOTSG\Models;

use AlibabaCloud\Tea\Model;

class GetDeviceBydeviceidResponse extends Model
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

    //
    // 设备详情
    /**
     * @var Device[]
     */
    public $deviceList;

    // 设备信息不存在的deviceId集合
    /**
     * @var string[]
     */
    public $missDeviceIdList;

    // 成功获取到设备信息的deviceid集合
    /**
     * @var string[]
     */
    public $successDeviceIdList;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'deviceList'          => 'device_list',
        'missDeviceIdList'    => 'miss_device_id_list',
        'successDeviceIdList' => 'success_device_id_list',
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
        if (null !== $this->deviceList) {
            $res['device_list'] = [];
            if (null !== $this->deviceList && \is_array($this->deviceList)) {
                $n = 0;
                foreach ($this->deviceList as $item) {
                    $res['device_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->missDeviceIdList) {
            $res['miss_device_id_list'] = $this->missDeviceIdList;
        }
        if (null !== $this->successDeviceIdList) {
            $res['success_device_id_list'] = $this->successDeviceIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDeviceBydeviceidResponse
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
        if (isset($map['device_list'])) {
            if (!empty($map['device_list'])) {
                $model->deviceList = [];
                $n                 = 0;
                foreach ($map['device_list'] as $item) {
                    $model->deviceList[$n++] = null !== $item ? Device::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['miss_device_id_list'])) {
            if (!empty($map['miss_device_id_list'])) {
                $model->missDeviceIdList = $map['miss_device_id_list'];
            }
        }
        if (isset($map['success_device_id_list'])) {
            if (!empty($map['success_device_id_list'])) {
                $model->successDeviceIdList = $map['success_device_id_list'];
            }
        }

        return $model;
    }
}
