<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CapitalInfo extends Model
{
    // 记录流水额度
    /**
     * @example 15.9
     *
     * @var string
     */
    public $balanceLog;

    // 商户id
    /**
     * @example testid
     *
     * @var string
     */
    public $shopId;

    // 记录时间
    /**
     * @example 12.2
     *
     * @var int
     */
    public $timeLog;

    // 链上地址
    /**
     * @example 123
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'balanceLog' => 'balance_log',
        'shopId'     => 'shop_id',
        'timeLog'    => 'time_log',
        'txHash'     => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('balanceLog', $this->balanceLog, true);
        Model::validateRequired('shopId', $this->shopId, true);
        Model::validateRequired('timeLog', $this->timeLog, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->balanceLog) {
            $res['balance_log'] = $this->balanceLog;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->timeLog) {
            $res['time_log'] = $this->timeLog;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CapitalInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['balance_log'])) {
            $model->balanceLog = $map['balance_log'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['time_log'])) {
            $model->timeLog = $map['time_log'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
