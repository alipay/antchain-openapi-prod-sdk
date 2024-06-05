<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6f8b0e7502ec49d28cd8ad0e5807bbf9\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoAcopmAtoWithholdResponse extends Model
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

    // 协议生效时间
    /**
     * @var string
     */
    public $validTime;

    // 协议当前状态 1. UNSIGNED：未签约 2. SIG...
    //
    /**
     * @var string
     */
    public $status;

    // 协议失效时间
    /**
     * @var string
     */
    public $invalidTime;

    // 协议签署时间
    /**
     * @var string
     */
    public $signTime;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'validTime'   => 'valid_time',
        'status'      => 'status',
        'invalidTime' => 'invalid_time',
        'signTime'    => 'sign_time',
    ];

    public function validate()
    {
        Model::validatePattern('validTime', $this->validTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('invalidTime', $this->invalidTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('signTime', $this->signTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDemoAcopmAtoWithholdResponse
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
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }

        return $model;
    }
}
