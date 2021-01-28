<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class NotaryCheckResult extends Model {
    protected $_name = [
        'blockHeight' => 'block_height',
        'errorCode' => 'error_code',
        'errorMessage' => 'error_message',
        'notaryTime' => 'notary_time',
        'notaryType' => 'notary_type',
        'result' => 'result',
        'transactionId' => 'transaction_id',
        'txHash' => 'tx_hash',
        'blockHash' => 'block_hash',
        'phase' => 'phase',
    ];
    public function validate() {
        Model::validateRequired('blockHeight', $this->blockHeight, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
        Model::validateRequired('notaryTime', $this->notaryTime, true);
        Model::validateRequired('notaryType', $this->notaryType, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('blockHash', $this->blockHash, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateMinimum('blockHeight', $this->blockHeight, 0);
        Model::validatePattern('notaryTime', $this->notaryTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->notaryTime) {
            $res['notary_time'] = $this->notaryTime;
        }
        if (null !== $this->notaryType) {
            $res['notary_type'] = $this->notaryType;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotaryCheckResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['block_height'])){
            $model->blockHeight = $map['block_height'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
        }
        if(isset($map['notary_time'])){
            $model->notaryTime = $map['notary_time'];
        }
        if(isset($map['notary_type'])){
            $model->notaryType = $map['notary_type'];
        }
        if(isset($map['result'])){
            $model->result = $map['result'];
        }
        if(isset($map['transaction_id'])){
            $model->transactionId = $map['transaction_id'];
        }
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        if(isset($map['block_hash'])){
            $model->blockHash = $map['block_hash'];
        }
        if(isset($map['phase'])){
            $model->phase = $map['phase'];
        }
        return $model;
    }
    // 存证所在区块高度
    /**
     * @example 8888
     * @var int
     */
    public $blockHeight;

    // 核验结果错误码
    /**
     * @example 错误码
     * @var int
     */
    public $errorCode;

    // 错误信息
    /**
     * @example Permission denied
     * @var string
     */
    public $errorMessage;

    // 存证时间
    /**
     * @example 2020-01-08 11:48:21
     * @var string
     */
    public $notaryTime;

    // 存证类型
    /**
     * @example FileNotary
     * @var string
     */
    public $notaryType;

    // 核验是否成功
    /**
     * @example true, false
     * @var bool
     */
    public $result;

    // 存证事务ID
    /**
     * @example 1a273ba1-b4c2-4bfe-93fc-c5997f3bcee9
     * @var string
     */
    public $transactionId;

    // 交易哈希
    /**
     * @example aac0cf38b6072352f6b3be4cc0a3cf3950058472eacdda91e6723d75e2994567
     * @var string
     */
    public $txHash;

    // 区块哈希
    /**
     * @example c3a50d4a7b521d4de13cefb02e5368b616e619d8fab5469298facacfbb39239b
     * @var string
     */
    public $blockHash;

    // 存证阶段
    /**
     * @example start
     * @var string
     */
    public $phase;

}
