<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NotaryTransaction extends Model
{
    // 如果存证类型为text, 则为存证内容
    // 如果存证类型为file,则为存证文件临时下载地址
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // 链上存证哈希
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
     *
     * @var string
     */
    public $transactionHash;

    // 存证类型
    /**
     * @example text,file
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'content'         => 'content',
        'transactionHash' => 'transaction_hash',
        'type'            => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('transactionHash', $this->transactionHash, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->transactionHash) {
            $res['transaction_hash'] = $this->transactionHash;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryTransaction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['transaction_hash'])) {
            $model->transactionHash = $map['transaction_hash'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
