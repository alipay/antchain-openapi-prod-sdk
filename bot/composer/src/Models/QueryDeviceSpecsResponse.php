<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceSpecsResponse extends Model
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

    // 设备规格描述
    /**
     * @var IotBasicDeviceSpecs
     */
    public $deviceSpecs;

    // 硬件模块集合
    /**
     * @var IotBasicDeviceHardWareModule[]
     */
    public $hardwareModuleList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'deviceSpecs'        => 'device_specs',
        'hardwareModuleList' => 'hardware_module_list',
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
        if (null !== $this->deviceSpecs) {
            $res['device_specs'] = null !== $this->deviceSpecs ? $this->deviceSpecs->toMap() : null;
        }
        if (null !== $this->hardwareModuleList) {
            $res['hardware_module_list'] = [];
            if (null !== $this->hardwareModuleList && \is_array($this->hardwareModuleList)) {
                $n = 0;
                foreach ($this->hardwareModuleList as $item) {
                    $res['hardware_module_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceSpecsResponse
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
        if (isset($map['device_specs'])) {
            $model->deviceSpecs = IotBasicDeviceSpecs::fromMap($map['device_specs']);
        }
        if (isset($map['hardware_module_list'])) {
            if (!empty($map['hardware_module_list'])) {
                $model->hardwareModuleList = [];
                $n                         = 0;
                foreach ($map['hardware_module_list'] as $item) {
                    $model->hardwareModuleList[$n++] = null !== $item ? IotBasicDeviceHardWareModule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
