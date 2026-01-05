<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryDepositOrderInfoResponse extends Model
{
    // 订单id
    /**
     * @example 202512301338236627142T870720
     *
     * @var string
     */
    public $orderId;

    // 订单类型
    /**
     * @example DEPOSIT
     *
     * @var string
     */
    public $orderType;

    // 区块链名称
    /**
     * @example Ethereum
     *
     * @var string
     */
    public $blockchain;

    // 代币名称
    /**
     * @example USDC
     *
     * @var string
     */
    public $tokenSymbol;

    // deposit数量
    /**
     * @example 100.001
     *
     * @var string
     */
    public $amount;

    // deposit交易hash
    /**
     * @example 0xa95311ca68c47ceac58cfa63581ffe60d492e6daa5b1726758103cdc52e85095
     *
     * @var string
     */
    public $txHash;

    // 交易发起地址，为白名单地址
    /**
     * @example 0xf5be944e4829aa055957e45bdf1b41175744f0a2
     *
     * @var string
     */
    public $fromAddress;

    // 交易接收地址，为托管钱包地址
    /**
     * @example 0xf5be944e4829aa055957e45bdf1b41175744f0a2
     *
     * @var string
     */
    public $toAddress;

    // 订单创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;

    // 订单状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $orderStatus;

    // 订单备注
    /**
     * @example test
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'orderId'     => 'order_id',
        'orderType'   => 'order_type',
        'blockchain'  => 'blockchain',
        'tokenSymbol' => 'token_symbol',
        'amount'      => 'amount',
        'txHash'      => 'tx_hash',
        'fromAddress' => 'from_address',
        'toAddress'   => 'to_address',
        'createTime'  => 'create_time',
        'orderStatus' => 'order_status',
        'remark'      => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('blockchain', $this->blockchain, true);
        Model::validateRequired('tokenSymbol', $this->tokenSymbol, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('fromAddress', $this->fromAddress, true);
        Model::validateRequired('toAddress', $this->toAddress, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('remark', $this->remark, true);
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->blockchain) {
            $res['blockchain'] = $this->blockchain;
        }
        if (null !== $this->tokenSymbol) {
            $res['token_symbol'] = $this->tokenSymbol;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->fromAddress) {
            $res['from_address'] = $this->fromAddress;
        }
        if (null !== $this->toAddress) {
            $res['to_address'] = $this->toAddress;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDepositOrderInfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['blockchain'])) {
            $model->blockchain = $map['blockchain'];
        }
        if (isset($map['token_symbol'])) {
            $model->tokenSymbol = $map['token_symbol'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['from_address'])) {
            $model->fromAddress = $map['from_address'];
        }
        if (isset($map['to_address'])) {
            $model->toAddress = $map['to_address'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
