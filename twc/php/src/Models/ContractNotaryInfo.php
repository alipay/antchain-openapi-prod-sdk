<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryInfo extends Model {
    protected $_name = [
        'txHash' => 'tx_hash',
        'docId' => 'doc_id',
        'contentHash' => 'content_hash',
        'transactionId' => 'transaction_id',
    ];
    public function validate() {
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->contentHash) {
            $res['content_hash'] = $this->contentHash;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContractNotaryInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        if(isset($map['doc_id'])){
            $model->docId = $map['doc_id'];
        }
        if(isset($map['content_hash'])){
            $model->contentHash = $map['content_hash'];
        }
        if(isset($map['transaction_id'])){
            $model->transactionId = $map['transaction_id'];
        }
        return $model;
    }
    // 存证地址
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
     * @var string
     */
    public $txHash;

    // 存证相关联的文档ID
    /**
     * @example 6afb5aa2679c5284444698a9790099269
     * @var string
     */
    public $docId;

    // 存证的内容哈希值
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
     * @var string
     */
    public $contentHash;

    // 存证事务ID
    /**
     * @example 61d0147c-5e6d-46e8-8030-5c2fedb6cbc9
     * @var string
     */
    public $transactionId;

}
