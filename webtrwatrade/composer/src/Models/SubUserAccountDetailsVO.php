<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class SubUserAccountDetailsVO extends Model
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

    // 交易类别
    /**
     * @example ISSUE
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
     * @var string
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
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('transactionHash', $this->transactionHash, true);
        Model::validateRequired('preBalance', $this->preBalance, true);
        Model::validateRequired('transactionAmount', $this->transactionAmount, true);
        Model::validateRequired('postBalance', $this->postBalance, true);
        Model::validateRequired('transactionType', $this->transactionType, true);
        Model::validateRequired('counterAddress', $this->counterAddress, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
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
     * @return SubUserAccountDetailsVO
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
