<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceRegisterresultResponse extends Model
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

    // 操作是否成功
    /**
     * @var bool
     */
    public $success;

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // 设备秘钥
    /**
     * @var string
     */
    public $privateKey;

    // 设备sn
    /**
     * @var string
     */
    public $deviceSn;

    // 设备认证密钥密文，需要下发安全认证SDK完成设备激活
    /**
     * @var string
     */
    public $secKey;

    // 设备认证密钥状态
    /**
     * @var string
     */
    public $serviceStatus;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'success'       => 'success',
        'deviceDid'     => 'device_did',
        'privateKey'    => 'private_key',
        'deviceSn'      => 'device_sn',
        'secKey'        => 'sec_key',
        'serviceStatus' => 'service_status',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->secKey) {
            $res['sec_key'] = $this->secKey;
        }
        if (null !== $this->serviceStatus) {
            $res['service_status'] = $this->serviceStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceRegisterresultResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['sec_key'])) {
            $model->secKey = $map['sec_key'];
        }
        if (isset($map['service_status'])) {
            $model->serviceStatus = $map['service_status'];
        }

        return $model;
    }
}
