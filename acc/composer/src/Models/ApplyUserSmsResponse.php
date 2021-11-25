<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class ApplyUserSmsResponse extends Model
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

    // 短信重新触发url
    //
    //
    /**
     * @var string
     */
    public $smsResendUrl;

    // 核验id
    //
    //
    /**
     * @var string
     */
    public $verifyId;

    // did_24c93459216945468fdf1d899c521910
    /**
     * @var string
     */
    public $did;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'smsResendUrl' => 'sms_resend_url',
        'verifyId'     => 'verify_id',
        'did'          => 'did',
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
        if (null !== $this->smsResendUrl) {
            $res['sms_resend_url'] = $this->smsResendUrl;
        }
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyUserSmsResponse
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
        if (isset($map['sms_resend_url'])) {
            $model->smsResendUrl = $map['sms_resend_url'];
        }
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
