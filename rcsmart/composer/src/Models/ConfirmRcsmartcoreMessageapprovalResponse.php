<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RCSMART\Models;

use AlibabaCloud\Tea\Model;

class ConfirmRcsmartcoreMessageapprovalResponse extends Model
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

    // 结果码
    /**
     * @var string
     */
    public $code;

    // 返回码描述
    /**
     * @var string
     */
    public $msg;

    // 业务处理结果码
    /**
     * @var string
     */
    public $subCode;

    // 返回的提示信息
    /**
     * @var string
     */
    public $subMsg;

    // 是否可重试
    /**
     * @var bool
     */
    public $retry;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'code'       => 'code',
        'msg'        => 'msg',
        'subCode'    => 'sub_code',
        'subMsg'     => 'sub_msg',
        'retry'      => 'retry',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }
        if (null !== $this->retry) {
            $res['retry'] = $this->retry;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmRcsmartcoreMessageapprovalResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }
        if (isset($map['retry'])) {
            $model->retry = $map['retry'];
        }

        return $model;
    }
}
