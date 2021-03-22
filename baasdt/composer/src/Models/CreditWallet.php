<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreditWallet extends Model
{
    // 最大授信额度(单位:元,精确到小数点后4位)
    /**
     * @example 100.0000
     *
     * @var string
     */
    public $maxBalance;

    // 已经使用的授信额度(单位:元,精确到小数点后4位)
    /**
     * @example 100.0000
     *
     * @var string
     */
    public $usedBalance;

    // 钱包类型（0:debit,1:credit）
    /**
     * @example 1
     *
     * @var int
     */
    public $walletType;

    // 资金管理员
    /**
     * @example 53487152345234132
     *
     * @var string
     */
    public $fundManagerId;

    // 资金托管员
    /**
     * @example 52345213423742
     *
     * @var string
     */
    public $trusteeId;

    // 其他信息（例举：联行号）
    /**
     * @example 扩展信息
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'maxBalance'    => 'max_balance',
        'usedBalance'   => 'used_balance',
        'walletType'    => 'wallet_type',
        'fundManagerId' => 'fund_manager_id',
        'trusteeId'     => 'trustee_id',
        'extInfo'       => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('maxBalance', $this->maxBalance, true);
        Model::validateRequired('usedBalance', $this->usedBalance, true);
        Model::validateRequired('walletType', $this->walletType, true);
        Model::validateRequired('fundManagerId', $this->fundManagerId, true);
        Model::validateRequired('trusteeId', $this->trusteeId, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->maxBalance) {
            $res['max_balance'] = $this->maxBalance;
        }
        if (null !== $this->usedBalance) {
            $res['used_balance'] = $this->usedBalance;
        }
        if (null !== $this->walletType) {
            $res['wallet_type'] = $this->walletType;
        }
        if (null !== $this->fundManagerId) {
            $res['fund_manager_id'] = $this->fundManagerId;
        }
        if (null !== $this->trusteeId) {
            $res['trustee_id'] = $this->trusteeId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreditWallet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['max_balance'])) {
            $model->maxBalance = $map['max_balance'];
        }
        if (isset($map['used_balance'])) {
            $model->usedBalance = $map['used_balance'];
        }
        if (isset($map['wallet_type'])) {
            $model->walletType = $map['wallet_type'];
        }
        if (isset($map['fund_manager_id'])) {
            $model->fundManagerId = $map['fund_manager_id'];
        }
        if (isset($map['trustee_id'])) {
            $model->trusteeId = $map['trustee_id'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
