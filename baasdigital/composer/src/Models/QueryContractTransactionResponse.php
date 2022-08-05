<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class QueryContractTransactionResponse extends Model
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

    // 交易所在区块高度
    /**
     * @var int
     */
    public $blockNumber;

    // 交易hash
    /**
     * @var string
     */
    public $hash;

    // 该笔交易输入参数(base64编码)
    /**
     * @var string
     */
    public $input;

    // 交易时间戳
    /**
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'blockNumber' => 'block_number',
        'hash'        => 'hash',
        'input'       => 'input',
        'timestamp'   => 'timestamp',
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
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractTransactionResponse
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
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['input'])) {
            $model->input = $map['input'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
