<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryTxtransactionChaindataResponse extends Model
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

    // 请求结果
    /**
     * @var bool
     */
    public $success;

    // 区块hash
    /**
     * @var string
     */
    public $blockHash;

    // 父区块hash
    /**
     * @var string
     */
    public $parentBlockHash;

    // 交易时间戳
    /**
     * @var string
     */
    public $timestamp;

    // 该交易所能消耗的最大gas
    /**
     * @var int
     */
    public $gas;

    // 交易发起方账户
    /**
     * @var string
     */
    public $from;

    // 交易接收方账户
    /**
     * @var string
     */
    public $to;

    // 交易类型
    /**
     * @var string
     */
    public $txType;

    // 交易返回的数据
    /**
     * @var QueryChainDataTransactionResultData
     */
    public $data;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'success'         => 'success',
        'blockHash'       => 'block_hash',
        'parentBlockHash' => 'parent_block_hash',
        'timestamp'       => 'timestamp',
        'gas'             => 'gas',
        'from'            => 'from',
        'to'              => 'to',
        'txType'          => 'tx_type',
        'data'            => 'data',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->parentBlockHash) {
            $res['parent_block_hash'] = $this->parentBlockHash;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->gas) {
            $res['gas'] = $this->gas;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->txType) {
            $res['tx_type'] = $this->txType;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTxtransactionChaindataResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['parent_block_hash'])) {
            $model->parentBlockHash = $map['parent_block_hash'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['gas'])) {
            $model->gas = $map['gas'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['tx_type'])) {
            $model->txType = $map['tx_type'];
        }
        if (isset($map['data'])) {
            $model->data = QueryChainDataTransactionResultData::fromMap($map['data']);
        }

        return $model;
    }
}
