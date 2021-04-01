<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisTransactionResponse extends Model
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

    // 区块高度
    /**
     * @var int
     */
    public $blockNumber;

    // 交易数据，hex格式
    /**
     * @var string
     */
    public $data;

    // 交易发起方
    /**
     * @var string
     */
    public $from;

    // 交易单据信息
    /**
     * @var BlockReceipt
     */
    public $receipt;

    // 交易时间戳
    /**
     * @var string
     */
    public $timestamp;

    // 交易接收方
    /**
     * @var string
     */
    public $to;

    // 交易hash
    /**
     * @var string
     */
    public $txHash;

    // 交易类型
    /**
     * @var int
     */
    public $txType;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'blockNumber' => 'block_number',
        'data'        => 'data',
        'from'        => 'from',
        'receipt'     => 'receipt',
        'timestamp'   => 'timestamp',
        'to'          => 'to',
        'txHash'      => 'tx_hash',
        'txType'      => 'tx_type',
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->receipt) {
            $res['receipt'] = null !== $this->receipt ? $this->receipt->toMap() : null;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txType) {
            $res['tx_type'] = $this->txType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockanalysisTransactionResponse
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
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['receipt'])) {
            $model->receipt = BlockReceipt::fromMap($map['receipt']);
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_type'])) {
            $model->txType = $map['tx_type'];
        }

        return $model;
    }
}
