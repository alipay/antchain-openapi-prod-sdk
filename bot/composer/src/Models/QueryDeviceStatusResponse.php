<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceStatusResponse extends Model
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

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // 操作是否成功
    /**
     * @var bool
     */
    public $success;

    // 设备状态
    /**
     * @var string
     */
    public $deviceStatus;

    // 设备认证状态
    /**
     * @var string
     */
    public $authStatus;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'deviceDid'    => 'device_did',
        'success'      => 'success',
        'deviceStatus' => 'device_status',
        'authStatus'   => 'auth_status',
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
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceStatusResponse
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
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }

        return $model;
    }
}
