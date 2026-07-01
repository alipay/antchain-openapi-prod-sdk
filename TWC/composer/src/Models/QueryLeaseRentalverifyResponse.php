<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseRentalverifyResponse extends Model
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

    // 错误信息
    /**
     * @var string
     */
    public $resultMessage;

    // 不匹配的时候，相应的信息
    /**
     * @var string
     */
    public $responseData;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'resultMessage' => 'result_message',
        'responseData'  => 'response_data',
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
        if (null !== $this->resultMessage) {
            $res['result_message'] = $this->resultMessage;
        }
        if (null !== $this->responseData) {
            $res['response_data'] = $this->responseData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseRentalverifyResponse
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
        if (isset($map['result_message'])) {
            $model->resultMessage = $map['result_message'];
        }
        if (isset($map['response_data'])) {
            $model->responseData = $map['response_data'];
        }

        return $model;
    }
}
