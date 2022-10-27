<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SyncIotbasicDevicegenerateResponse extends Model
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

    // 设备私钥
    /**
     * @var string
     */
    public $deviceKey;

    // 设备认证id
    /**
     * @var string
     */
    public $secId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'deviceKey'  => 'device_key',
        'secId'      => 'sec_id',
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
        if (null !== $this->deviceKey) {
            $res['device_key'] = $this->deviceKey;
        }
        if (null !== $this->secId) {
            $res['sec_id'] = $this->secId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncIotbasicDevicegenerateResponse
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
        if (isset($map['device_key'])) {
            $model->deviceKey = $map['device_key'];
        }
        if (isset($map['sec_id'])) {
            $model->secId = $map['sec_id'];
        }

        return $model;
    }
}
