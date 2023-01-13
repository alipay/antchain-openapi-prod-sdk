<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightBlock extends Model
{
    // 链ID
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $bizId;

    // 链名称
    /**
     * @example 数字资产
     *
     * @var string
     */
    public $bizIdName;

    // 链ID
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $chain;

    // 所在子网
    /**
     * @example _default
     *
     * @var string
     */
    public $network;

    // 区块高度
    /**
     * @example 123
     *
     * @var int
     */
    public $number;

    // 区块Hash
    /**
     * @example 11f9f576952714aafb14c6f06ec1796b9ce2553c4c319657bd814fe3ad2d9c19
     *
     * @var string
     */
    public $hash;

    // 区块创建时间戳
    /**
     * @example 1665561926620
     *
     * @var int
     */
    public $createTime;

    // 上一个区块Hash
    /**
     * @example 5238b4903d2622b38f04015f7e062c0450d07bfadd8f153327629542e82640e3
     *
     * @var string
     */
    public $previousHash;

    // 区块内交易列表
    /**
     * @example
     *
     * @var ChainInsightTransaction[]
     */
    public $transactions;

    // 区块的json序列化string
    /**
     * @example {}
     *
     * @var string
     */
    public $data;
    protected $_name = [
        'bizId'        => 'biz_id',
        'bizIdName'    => 'biz_id_name',
        'chain'        => 'chain',
        'network'      => 'network',
        'number'       => 'number',
        'hash'         => 'hash',
        'createTime'   => 'create_time',
        'previousHash' => 'previous_hash',
        'transactions' => 'transactions',
        'data'         => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('chain', $this->chain, true);
        Model::validateRequired('network', $this->network, true);
        Model::validateRequired('number', $this->number, true);
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('previousHash', $this->previousHash, true);
        Model::validateRequired('transactions', $this->transactions, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizIdName) {
            $res['biz_id_name'] = $this->bizIdName;
        }
        if (null !== $this->chain) {
            $res['chain'] = $this->chain;
        }
        if (null !== $this->network) {
            $res['network'] = $this->network;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->previousHash) {
            $res['previous_hash'] = $this->previousHash;
        }
        if (null !== $this->transactions) {
            $res['transactions'] = [];
            if (null !== $this->transactions && \is_array($this->transactions)) {
                $n = 0;
                foreach ($this->transactions as $item) {
                    $res['transactions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightBlock
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_id_name'])) {
            $model->bizIdName = $map['biz_id_name'];
        }
        if (isset($map['chain'])) {
            $model->chain = $map['chain'];
        }
        if (isset($map['network'])) {
            $model->network = $map['network'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['previous_hash'])) {
            $model->previousHash = $map['previous_hash'];
        }
        if (isset($map['transactions'])) {
            if (!empty($map['transactions'])) {
                $model->transactions = [];
                $n                   = 0;
                foreach ($map['transactions'] as $item) {
                    $model->transactions[$n++] = null !== $item ? ChainInsightTransaction::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
