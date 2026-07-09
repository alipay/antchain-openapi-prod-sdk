<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateAcsDeviceResponse extends Model
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

    // 链上设备Id
    /**
     * @var string
     */
    public $chainDeviceid;

    // 发行设备ID
    /**
     * @var string
     */
    public $distributeDeviceId;

    // 设备激活文本-设备直连上链方式使用
    /**
     * @var string
     */
    public $activeData;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'chainDeviceid'      => 'chain_deviceid',
        'distributeDeviceId' => 'distribute_device_id',
        'activeData'         => 'active_data',
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
        if (null !== $this->chainDeviceid) {
            $res['chain_deviceid'] = $this->chainDeviceid;
        }
        if (null !== $this->distributeDeviceId) {
            $res['distribute_device_id'] = $this->distributeDeviceId;
        }
        if (null !== $this->activeData) {
            $res['active_data'] = $this->activeData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAcsDeviceResponse
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
        if (isset($map['chain_deviceid'])) {
            $model->chainDeviceid = $map['chain_deviceid'];
        }
        if (isset($map['distribute_device_id'])) {
            $model->distributeDeviceId = $map['distribute_device_id'];
        }
        if (isset($map['active_data'])) {
            $model->activeData = $map['active_data'];
        }

        return $model;
    }
}
