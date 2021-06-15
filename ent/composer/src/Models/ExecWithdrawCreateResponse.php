<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class ExecWithdrawCreateResponse extends Model
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

    // 兑现状态：ACCEPTED / FAILED
    /**
     * @var string
     */
    public $withdrawStatus;

    // 税优签约链接
    /**
     * @var string
     */
    public $signUrl;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'withdrawStatus' => 'withdraw_status',
        'signUrl'        => 'sign_url',
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
        if (null !== $this->withdrawStatus) {
            $res['withdraw_status'] = $this->withdrawStatus;
        }
        if (null !== $this->signUrl) {
            $res['sign_url'] = $this->signUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecWithdrawCreateResponse
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
        if (isset($map['withdraw_status'])) {
            $model->withdrawStatus = $map['withdraw_status'];
        }
        if (isset($map['sign_url'])) {
            $model->signUrl = $map['sign_url'];
        }

        return $model;
    }
}
