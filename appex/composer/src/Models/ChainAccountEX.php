<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class ChainAccountEX extends Model
{
    // 账户名称
    /**
     * @example 无
     *
     * @var string
     */
    public $accountName;

    // 账户地址
    /**
     * @example 无
     *
     * @var string
     */
    public $accountAddress;

    // 账户类型，枚举，MYCHAIN|ETH
    /**
     * @example 无
     *
     * @var string
     */
    public $accountType;

    // 链ID
    /**
     * @example 无
     *
     * @var string
     */
    public $chainId;
    protected $_name = [
        'accountName'    => 'account_name',
        'accountAddress' => 'account_address',
        'accountType'    => 'account_type',
        'chainId'        => 'chain_id',
    ];

    public function validate()
    {
        Model::validateRequired('accountAddress', $this->accountAddress, true);
        Model::validateRequired('accountType', $this->accountType, true);
        Model::validateRequired('chainId', $this->chainId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->accountAddress) {
            $res['account_address'] = $this->accountAddress;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainAccountEX
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['account_address'])) {
            $model->accountAddress = $map['account_address'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }

        return $model;
    }
}
