<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryInfo extends Model
{
    // 存证的内容哈希值
    //
    /**
     * @example 存证的内容哈希值
     *
     * @var string
     */
    public $contentHash;

    // 存证相关联的文档ID
    //
    /**
     * @example 存证相关联的文档ID
     *
     * @var string
     */
    public $docId;

    // 存证事务ID
    //
    /**
     * @example 存证事务ID
     *
     * @var string
     */
    public $transactionId;

    // 存证地址
    /**
     * @example 存证地址
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'contentHash'   => 'content_hash',
        'docId'         => 'doc_id',
        'transactionId' => 'transaction_id',
        'txHash'        => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('contentHash', $this->contentHash, true);
        Model::validateRequired('docId', $this->docId, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contentHash) {
            $res['content_hash'] = $this->contentHash;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractNotaryInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content_hash'])) {
            $model->contentHash = $map['content_hash'];
        }
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
