<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseAsynccallResponse extends Model
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

    // 上链状态
    // TOBE_CHAIN(待上链)
    // CHAINING（上链中）SUCCESS(上链成功)
    // FAIL(上链失败)
    /**
     * @var string
     */
    public $status;

    // 成功的时候返回txHash
    /**
     * @var string
     */
    public $txHash;

    // 上链失败信息，status为FAIL时返回
    /**
     * @var string
     */
    public $chainFailMessage;

    // 对应的加密后的具体信息,异步查询场景会有值
    /**
     * @var string
     */
    public $responseData;

    // 结果码，OK表示成功
    /**
     * @var string
     */
    public $code;

    // 结果描述
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'status'           => 'status',
        'txHash'           => 'tx_hash',
        'chainFailMessage' => 'chain_fail_message',
        'responseData'     => 'response_data',
        'code'             => 'code',
        'message'          => 'message',
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
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->chainFailMessage) {
            $res['chain_fail_message'] = $this->chainFailMessage;
        }
        if (null !== $this->responseData) {
            $res['response_data'] = $this->responseData;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseAsynccallResponse
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
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['chain_fail_message'])) {
            $model->chainFailMessage = $map['chain_fail_message'];
        }
        if (isset($map['response_data'])) {
            $model->responseData = $map['response_data'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
