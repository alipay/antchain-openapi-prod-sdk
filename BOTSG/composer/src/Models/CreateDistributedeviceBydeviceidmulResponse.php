<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOTSG\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributedeviceBydeviceidmulResponse extends Model
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

    // 可信设备ID集合
    /**
     * @var TrustiotDeviceIdMap[]
     */
    public $trustiotDeviceIdList;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'trustiotDeviceIdList' => 'trustiot_device_id_list',
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
        if (null !== $this->trustiotDeviceIdList) {
            $res['trustiot_device_id_list'] = [];
            if (null !== $this->trustiotDeviceIdList && \is_array($this->trustiotDeviceIdList)) {
                $n = 0;
                foreach ($this->trustiotDeviceIdList as $item) {
                    $res['trustiot_device_id_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributedeviceBydeviceidmulResponse
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
        if (isset($map['trustiot_device_id_list'])) {
            if (!empty($map['trustiot_device_id_list'])) {
                $model->trustiotDeviceIdList = [];
                $n                           = 0;
                foreach ($map['trustiot_device_id_list'] as $item) {
                    $model->trustiotDeviceIdList[$n++] = null !== $item ? TrustiotDeviceIdMap::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
