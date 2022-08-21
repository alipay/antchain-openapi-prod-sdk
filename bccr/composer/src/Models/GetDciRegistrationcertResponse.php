<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class GetDciRegistrationcertResponse extends Model
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

    // 证书状态
    /**
     * @var string
     */
    public $certStatus;

    // 证书下载链接
    /**
     * @var string
     */
    public $certificateUrl;

    // 剩余下载次数
    /**
     * @var int
     */
    public $downloadTimesLeft;

    // 错误原因
    /**
     * @var string
     */
    public $errorReason;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'certStatus'        => 'cert_status',
        'certificateUrl'    => 'certificate_url',
        'downloadTimesLeft' => 'download_times_left',
        'errorReason'       => 'error_reason',
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
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }
        if (null !== $this->downloadTimesLeft) {
            $res['download_times_left'] = $this->downloadTimesLeft;
        }
        if (null !== $this->errorReason) {
            $res['error_reason'] = $this->errorReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDciRegistrationcertResponse
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
        if (isset($map['cert_status'])) {
            $model->certStatus = $map['cert_status'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }
        if (isset($map['download_times_left'])) {
            $model->downloadTimesLeft = $map['download_times_left'];
        }
        if (isset($map['error_reason'])) {
            $model->errorReason = $map['error_reason'];
        }

        return $model;
    }
}
