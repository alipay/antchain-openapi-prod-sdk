<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class CrossChainBonusAccountsDetailVO extends Model
{
    // 明细ID
    /**
     * @example 3e695195a5634f0c856a6c30358c9f5b
     *
     * @var string
     */
    public $id;

    // 交易链上Hash
    /**
     * @example 0xeede426617346ebe76481ab4a8f0fad46997e8f38f13d1c4cc6135cdc1d7553c
     *
     * @var string
     */
    public $transactionHash;

    // 交易前余额
    /**
     * @example 7
     *
     * @var string
     */
    public $preBalance;

    // 交易数量
    /**
     * @example 1
     *
     * @var string
     */
    public $transactionAmount;

    // 交易后余额
    /**
     * @example 8
     *
     * @var string
     */
    public $postBalance;

    // 交易类型(LOCK_MINT_BONUS/BURN_RETRIEVE_BONUS/INNER_TRANSFER_BONUS/OTC_TRANSFER_BONUS)
    /**
     * @example INNER_TRANSFER_BONUS
     *
     * @var string
     */
    public $transactionType;

    // 对手地址
    /**
     * @example 0x644081f8086c1e9ad9597d8fef6249f5f2d80563
     *
     * @var string
     */
    public $counterAddress;

    // 创建时间
    /**
     * @example 1755754919690
     *
     * @var int
     */
    public $gmtCreated;

    // 更新时间
    /**
     * @example 1755754919690
     *
     * @var int
     */
    public $gmtModified;
    protected $_name = [
        'id'                => 'id',
        'transactionHash'   => 'transaction_hash',
        'preBalance'        => 'pre_balance',
        'transactionAmount' => 'transaction_amount',
        'postBalance'       => 'post_balance',
        'transactionType'   => 'transaction_type',
        'counterAddress'    => 'counter_address',
        'gmtCreated'        => 'gmt_created',
        'gmtModified'       => 'gmt_modified',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->transactionHash) {
            $res['transaction_hash'] = $this->transactionHash;
        }
        if (null !== $this->preBalance) {
            $res['pre_balance'] = $this->preBalance;
        }
        if (null !== $this->transactionAmount) {
            $res['transaction_amount'] = $this->transactionAmount;
        }
        if (null !== $this->postBalance) {
            $res['post_balance'] = $this->postBalance;
        }
        if (null !== $this->transactionType) {
            $res['transaction_type'] = $this->transactionType;
        }
        if (null !== $this->counterAddress) {
            $res['counter_address'] = $this->counterAddress;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrossChainBonusAccountsDetailVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['transaction_hash'])) {
            $model->transactionHash = $map['transaction_hash'];
        }
        if (isset($map['pre_balance'])) {
            $model->preBalance = $map['pre_balance'];
        }
        if (isset($map['transaction_amount'])) {
            $model->transactionAmount = $map['transaction_amount'];
        }
        if (isset($map['post_balance'])) {
            $model->postBalance = $map['post_balance'];
        }
        if (isset($map['transaction_type'])) {
            $model->transactionType = $map['transaction_type'];
        }
        if (isset($map['counter_address'])) {
            $model->counterAddress = $map['counter_address'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
