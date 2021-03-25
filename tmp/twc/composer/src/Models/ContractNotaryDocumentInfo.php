<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryDocumentInfo extends Model
{
    // 签署完成的合同hash
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // 签署人ID（支持多个，不同ID间用“,”分隔开）
    /**
     * @example account_id_1,account_id_2
     *
     * @var string
     */
    public $signatories;

    // 存证结束时间，UNIX时间戳(毫秒)
    /**
     * @example 1589198173000
     *
     * @var string
     */
    public $timestamp;

    // 存证凭据，仅在批量核验时需要填写
    /**
     * @example 95a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1c92
     *
     * @var string
     */
    public $txHash;

    // 签署的文件ID
    /**
     * @example 6afb5aa2679c5284444698a9790099269
     *
     * @var string
     */
    public $fileId;
    protected $_name = [
        'content'     => 'content',
        'signatories' => 'signatories',
        'timestamp'   => 'timestamp',
        'txHash'      => 'tx_hash',
        'fileId'      => 'file_id',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('signatories', $this->signatories, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('fileId', $this->fileId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->signatories) {
            $res['signatories'] = $this->signatories;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractNotaryDocumentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['signatories'])) {
            $model->signatories = $map['signatories'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }

        return $model;
    }
}
