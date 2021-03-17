<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractMerchantindirectzftResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 传入参数内容
    /**
     * @var string
     */
    public $body;

    // 错误码
    /**
     * @var int
     */
    public $code;

    // 错误信息描述
    /**
     * @var string
     */
    public $message;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 支付宝返回的二级错误信息
    /**
     * @var string
     */
    public $subCode;

    // 支付宝返回的二级错误信息描述
    /**
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'body'       => 'body',
        'code'       => 'code',
        'message'    => 'message',
        'orderId'    => 'order_id',
        'subCode'    => 'sub_code',
        'subMsg'     => 'sub_msg',
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
        if (null !== $this->body) {
            $res['body'] = $this->body;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractMerchantindirectzftResponse
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
        if (isset($map['body'])) {
            $model->body = $map['body'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}
