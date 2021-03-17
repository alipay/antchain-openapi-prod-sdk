<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotarySignInfo extends Model
{
    // 本阶段存证内容哈希值
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // 电子合同文件hash，可能一次性签署多个文件，不同文件的hash间用“,”分隔开
    /**
     * @example hash1,hash2
     *
     * @var string
     */
    public $contractHash;

    // 签署人ID
    /**
     * @example account_id_of_signatory
     *
     * @var string
     */
    public $signatory;

    // 存证阶段发生时间，UNIX时间戳(毫秒)
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
    protected $_name = [
        'content'      => 'content',
        'contractHash' => 'contract_hash',
        'signatory'    => 'signatory',
        'timestamp'    => 'timestamp',
        'txHash'       => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('contractHash', $this->contractHash, true);
        Model::validateRequired('signatory', $this->signatory, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->contractHash) {
            $res['contract_hash'] = $this->contractHash;
        }
        if (null !== $this->signatory) {
            $res['signatory'] = $this->signatory;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractNotarySignInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['contract_hash'])) {
            $model->contractHash = $map['contract_hash'];
        }
        if (isset($map['signatory'])) {
            $model->signatory = $map['signatory'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
