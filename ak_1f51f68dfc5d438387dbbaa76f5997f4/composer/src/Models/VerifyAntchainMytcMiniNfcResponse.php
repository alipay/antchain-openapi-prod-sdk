<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_1f51f68dfc5d438387dbbaa76f5997f4\Models;

use AlibabaCloud\Tea\Model;

class VerifyAntchainMytcMiniNfcResponse extends Model
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

    // 校验结果
    /**
     * @var string
     */
    public $status;

    // 校验信息
    /**
     * @var string
     */
    public $message;

    // 校验解析溯源码
    /**
     * @var string
     */
    public $code;

    // NFC UID
    /**
     * @var string
     */
    public $uid;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'status'     => 'status',
        'message'    => 'message',
        'code'       => 'code',
        'uid'        => 'uid',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyAntchainMytcMiniNfcResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }

        return $model;
    }
}
