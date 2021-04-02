<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class StartEvidenceStoreResponse extends Model
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

    // API消耗时间（毫秒单位）
    /**
     * @var int
     */
    public $costMillis;

    // 暂保留
    /**
     * @var string
     */
    public $dataIndex;

    // 上链附加备注信息，不做上链存储。
    /**
     * @var string
     */
    public $extInfo;

    // 交易ID，等于输入参数同名字段
    /**
     * @var string
     */
    public $nonce;

    // 本地unix时间戳（毫秒单位）
    /**
     * @var int
     */
    public $timestamp;

    // unix链上存储时间戳
    /**
     * @var int
     */
    public $txTimestamp;

    // 链上交易地址txHash
    /**
     * @var string
     */
    public $txHash;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'costMillis'  => 'cost_millis',
        'dataIndex'   => 'data_index',
        'extInfo'     => 'ext_info',
        'nonce'       => 'nonce',
        'timestamp'   => 'timestamp',
        'txTimestamp' => 'tx_timestamp',
        'txHash'      => 'tx_hash',
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
        if (null !== $this->costMillis) {
            $res['cost_millis'] = $this->costMillis;
        }
        if (null !== $this->dataIndex) {
            $res['data_index'] = $this->dataIndex;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->txTimestamp) {
            $res['tx_timestamp'] = $this->txTimestamp;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartEvidenceStoreResponse
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
        if (isset($map['cost_millis'])) {
            $model->costMillis = $map['cost_millis'];
        }
        if (isset($map['data_index'])) {
            $model->dataIndex = $map['data_index'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['tx_timestamp'])) {
            $model->txTimestamp = $map['tx_timestamp'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
