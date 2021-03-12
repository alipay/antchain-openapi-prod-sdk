<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class EPTradeInfo extends Model
{
    // 版通代码
    /**
     * @example 000111
     *
     * @var string
     */
    public $epCode;

    // 版通交易号
    /**
     * @example 123123
     *
     * @var string
     */
    public $txCode;

    // 卖方账户
    /**
     * @example testAccount
     *
     * @var string
     */
    public $txFrom;

    // 交易时间戳
    /**
     * @example 1560827725
     *
     * @var int
     */
    public $txTime;

    // 买方账户
    /**
     * @example testAccount
     *
     * @var string
     */
    public $txTo;

    // 交易数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $txValue;
    protected $_name = [
        'epCode'  => 'ep_code',
        'txCode'  => 'tx_code',
        'txFrom'  => 'tx_from',
        'txTime'  => 'tx_time',
        'txTo'    => 'tx_to',
        'txValue' => 'tx_value',
    ];

    public function validate()
    {
        Model::validateRequired('epCode', $this->epCode, true);
        Model::validateRequired('txCode', $this->txCode, true);
        Model::validateRequired('txFrom', $this->txFrom, true);
        Model::validateRequired('txTime', $this->txTime, true);
        Model::validateRequired('txTo', $this->txTo, true);
        Model::validateRequired('txValue', $this->txValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->epCode) {
            $res['ep_code'] = $this->epCode;
        }
        if (null !== $this->txCode) {
            $res['tx_code'] = $this->txCode;
        }
        if (null !== $this->txFrom) {
            $res['tx_from'] = $this->txFrom;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }
        if (null !== $this->txTo) {
            $res['tx_to'] = $this->txTo;
        }
        if (null !== $this->txValue) {
            $res['tx_value'] = $this->txValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EPTradeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ep_code'])) {
            $model->epCode = $map['ep_code'];
        }
        if (isset($map['tx_code'])) {
            $model->txCode = $map['tx_code'];
        }
        if (isset($map['tx_from'])) {
            $model->txFrom = $map['tx_from'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }
        if (isset($map['tx_to'])) {
            $model->txTo = $map['tx_to'];
        }
        if (isset($map['tx_value'])) {
            $model->txValue = $map['tx_value'];
        }

        return $model;
    }
}
