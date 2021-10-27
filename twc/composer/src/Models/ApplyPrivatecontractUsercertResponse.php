<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyPrivatecontractUsercertResponse extends Model
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

    // 注册是否成功
    /**
     * @var bool
     */
    public $success;

    // 返回code,200成功，其他均为失败
    /**
     * @var string
     */
    public $code;

    // 返回信息，成功返回success，错误时会返回详细信息。
    /**
     * @var string
     */
    public $message;

    // 用户的CA证书办法机构
    /**
     * @var string
     */
    public $certAuthOrg;

    // 用户的CA证书序列号
    /**
     * @var string
     */
    public $certSerialNumber;

    // 用户证书过期时间
    /**
     * @var int
     */
    public $certEndTime;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'success'          => 'success',
        'code'             => 'code',
        'message'          => 'message',
        'certAuthOrg'      => 'cert_auth_org',
        'certSerialNumber' => 'cert_serial_number',
        'certEndTime'      => 'cert_end_time',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->certAuthOrg) {
            $res['cert_auth_org'] = $this->certAuthOrg;
        }
        if (null !== $this->certSerialNumber) {
            $res['cert_serial_number'] = $this->certSerialNumber;
        }
        if (null !== $this->certEndTime) {
            $res['cert_end_time'] = $this->certEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyPrivatecontractUsercertResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['cert_auth_org'])) {
            $model->certAuthOrg = $map['cert_auth_org'];
        }
        if (isset($map['cert_serial_number'])) {
            $model->certSerialNumber = $map['cert_serial_number'];
        }
        if (isset($map['cert_end_time'])) {
            $model->certEndTime = $map['cert_end_time'];
        }

        return $model;
    }
}
