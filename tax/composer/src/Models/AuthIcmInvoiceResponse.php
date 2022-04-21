<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class AuthIcmInvoiceResponse extends Model
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

    // 授权是否成功：true：成功 false：失败
    /**
     * @var string
     */
    public $success;

    // 透传字段
    /**
     * @var string
     */
    public $bizContext;

    // 纳税人识别号
    /**
     * @var string
     */
    public $nsrsbh;

    // 过期时间
    /**
     * @var string
     */
    public $expiredTime;

    // 业务请求id
    /**
     * @var string
     */
    public $requestId;

    // 错误码
    /**
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @var string
     */
    public $errorMsg;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'success'     => 'success',
        'bizContext'  => 'biz_context',
        'nsrsbh'      => 'nsrsbh',
        'expiredTime' => 'expired_time',
        'requestId'   => 'request_id',
        'errorCode'   => 'error_code',
        'errorMsg'    => 'error_msg',
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
        if (null !== $this->bizContext) {
            $res['biz_context'] = $this->bizContext;
        }
        if (null !== $this->nsrsbh) {
            $res['nsrsbh'] = $this->nsrsbh;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthIcmInvoiceResponse
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
        if (isset($map['biz_context'])) {
            $model->bizContext = $map['biz_context'];
        }
        if (isset($map['nsrsbh'])) {
            $model->nsrsbh = $map['nsrsbh'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }

        return $model;
    }
}
