<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class SubUserVirtualAccountDetailVO extends Model
{
    // 明细ID
    /**
     * @example 3e695195a5634f0c856a6c30358c9f5b
     *
     * @var string
     */
    public $id;

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

    // 交易类型(TRANSFER_IN、TRANSFER_OUT)
    /**
     * @example TRANSFER_IN
     *
     * @var string
     */
    public $transactionType;

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
        'preBalance'        => 'pre_balance',
        'transactionAmount' => 'transaction_amount',
        'postBalance'       => 'post_balance',
        'transactionType'   => 'transaction_type',
        'gmtCreated'        => 'gmt_created',
        'gmtModified'       => 'gmt_modified',
        'transactionStatus' => 'transaction_status',
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
     * @return SubUserVirtualAccountDetailVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
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
