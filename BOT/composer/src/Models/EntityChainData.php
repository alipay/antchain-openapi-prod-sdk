<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EntityChainData extends Model
{
    // 实体ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $entityId;

    // 数据原文
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // 数据原文对应的签名
    /**
     * @example 1ac3dfe2
     *
     * @var string
     */
    public $sign;

    // 数据原文上链哈希
    /**
     * @example 1f2a9ec2b
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'entityId' => 'entity_id',
        'content'  => 'content',
        'sign'     => 'sign',
        'txHash'   => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('entityId', $this->entityId, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('sign', $this->sign, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->entityId) {
            $res['entity_id'] = $this->entityId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->sign) {
            $res['sign'] = $this->sign;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EntityChainData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['entity_id'])) {
            $model->entityId = $map['entity_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['sign'])) {
            $model->sign = $map['sign'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
