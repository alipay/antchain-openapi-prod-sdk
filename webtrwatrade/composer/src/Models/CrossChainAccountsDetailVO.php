<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class CrossChainAccountsDetailVO extends Model
{
    // 明细ID
    /**
     * @example 0ef1c7f82ffb44989e8b6e6b6360a3a7
     *
     * @var string
     */
    public $id;

    // 交易链上Hash
    /**
     * @example 0xf1ada29c07fd95444030d9001ad09b7fd2111aed063ee0753e181fb2a3f53057
     *
     * @var string
     */
    public $transactionHash;

    // 交易前余额
    /**
     * @example 1000.000000000
     *
     * @var string
     */
    public $preBalance;

    // 交易数量
    /**
     * @example 1000.000000000
     *
     * @var string
     */
    public $transactionAmount;

    // 交易后余额
    /**
     * @example 2000.000000000
     *
     * @var string
     */
    public $postBalance;

    // 交易类别(LOCK_MINT/BURN_RETRIEVE/INNER_TRANSFER/OTC_TRANSFER)
    /**
     * @example LOCK_MINT
     *
     * @var string
     */
    public $transactionType;

    // 对手地址
    /**
     * @example 0x5639ede048dc910b917b518ae8d3cbb184fc749d
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
     * @return CrossChainAccountsDetailVO
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
