<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class SubUserBonusAccountDetailVO extends Model
{
    // 明细ID
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 交易链上Hash
    /**
     * @example 0x9fe688e456d3c4b15edceff3c23380300d71b48649ae8d61c6a9e513bb095262
     *
     * @var string
     */
    public $transactionHash;

    // 交易前余额
    /**
     * @example 1.0
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
     * @example 1.0
     *
     * @var string
     */
    public $postBalance;

    // 交易类别（REPAY/TRANSFER/LOCK/UNLOCK/WITHDRAW/OTC_TRANSFER/TRANSFER_TO_VIRTUAL/WITHDRAW_FROM_VIRTUAL）
    /**
     * @example REPAY
     *
     * @var string
     */
    public $transactionType;

    // 对手地址
    /**
     * @example 0x9f6a540f4079d29ff5a9c5985e9ee87f3b713117
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

    // 交易状态（PENDING/CONFIRMED/INVALID）
    /**
     * @example PENDING
     *
     * @var string
     */
    public $transactionStatus;
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
        'transactionStatus' => 'transaction_status',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('transactionHash', $this->transactionHash, true);
        Model::validateRequired('preBalance', $this->preBalance, true);
        Model::validateRequired('transactionAmount', $this->transactionAmount, true);
        Model::validateRequired('postBalance', $this->postBalance, true);
        Model::validateRequired('transactionType', $this->transactionType, true);
        Model::validateRequired('counterAddress', $this->counterAddress, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('transactionStatus', $this->transactionStatus, true);
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
        if (null !== $this->transactionStatus) {
            $res['transaction_status'] = $this->transactionStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubUserBonusAccountDetailVO
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
        if (isset($map['transaction_status'])) {
            $model->transactionStatus = $map['transaction_status'];
        }

        return $model;
    }
}
