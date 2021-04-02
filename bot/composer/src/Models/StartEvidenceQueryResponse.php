<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class StartEvidenceQueryResponse extends Model
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

    // 交易在区块链所在块高度
    /**
     * @var int
     */
    public $blockHeight;

    // API消耗时间（毫秒单位）
    /**
     * @var int
     */
    public $costMillis;

    // 唯一ID，等于输入同名参数
    /**
     * @var string
     */
    public $nonce;

    // unix时间戳(毫秒单位)
    /**
     * @var int
     */
    public $timestamp;

    // 区块链交易地址txHash
    /**
     * @var string
     */
    public $txHash;

    // 交易存储区块链的链上unix时间戳
    /**
     * @var int
     */
    public $txTimestamp;

    // 信物链查询链上获取的数据，参考结构体定义
    /**
     * @var EvidenceBaseModel
     */
    public $data;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'blockHeight' => 'block_height',
        'costMillis'  => 'cost_millis',
        'nonce'       => 'nonce',
        'timestamp'   => 'timestamp',
        'txHash'      => 'tx_hash',
        'txTimestamp' => 'tx_timestamp',
        'data'        => 'data',
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
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->costMillis) {
            $res['cost_millis'] = $this->costMillis;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txTimestamp) {
            $res['tx_timestamp'] = $this->txTimestamp;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartEvidenceQueryResponse
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
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['cost_millis'])) {
            $model->costMillis = $map['cost_millis'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_timestamp'])) {
            $model->txTimestamp = $map['tx_timestamp'];
        }
        if (isset($map['data'])) {
            $model->data = EvidenceBaseModel::fromMap($map['data']);
        }

        return $model;
    }
}
