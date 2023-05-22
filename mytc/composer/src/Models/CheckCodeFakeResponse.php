<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class CheckCodeFakeResponse extends Model
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

    // 验真是否成功
    /**
     * @var bool
     */
    public $detectSuccess;

    // 返回编码
    /**
     * @var string
     */
    public $detectCode;

    // 调用返回信息
    /**
     * @var string
     */
    public $detectMessage;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'detectSuccess' => 'detect_success',
        'detectCode'    => 'detect_code',
        'detectMessage' => 'detect_message',
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
        if (null !== $this->detectSuccess) {
            $res['detect_success'] = $this->detectSuccess;
        }
        if (null !== $this->detectCode) {
            $res['detect_code'] = $this->detectCode;
        }
        if (null !== $this->detectMessage) {
            $res['detect_message'] = $this->detectMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckCodeFakeResponse
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
        if (isset($map['detect_success'])) {
            $model->detectSuccess = $map['detect_success'];
        }
        if (isset($map['detect_code'])) {
            $model->detectCode = $map['detect_code'];
        }
        if (isset($map['detect_message'])) {
            $model->detectMessage = $map['detect_message'];
        }

        return $model;
    }
}
