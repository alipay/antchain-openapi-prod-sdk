<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class DebitWallet extends Model
{
    // 钱包余额(单位:元, 精确到小数点后4位)
    /**
     * @example 100.0000
     *
     * @var string
     */
    public $balance;

    // 开户名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $bankAccountName;

    // 开户地
    /**
     * @example 杭州市西湖区***
     *
     * @var string
     */
    public $bankAddress;

    // 开户银行分支机构名称
    /**
     * @example 招商银行高新支行
     *
     * @var string
     */
    public $bankBranchName;

    // 开户卡号
    /**
     * @example 53486234329475
     *
     * @var string
     */
    public $bankCardId;

    // 开户行名称
    /**
     * @example ***银行
     *
     * @var string
     */
    public $bankName;

    // 其他信息（例举：联行号）
    /**
     * @example 扩展信息
     *
     * @var string
     */
    public $extInfo;

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

    // 钱包类型（0:debit,1:credit）
    /**
     * @example 0
     *
     * @var int
     */
    public $walletType;
    protected $_name = [
        'balance'         => 'balance',
        'bankAccountName' => 'bank_account_name',
        'bankAddress'     => 'bank_address',
        'bankBranchName'  => 'bank_branch_name',
        'bankCardId'      => 'bank_card_id',
        'bankName'        => 'bank_name',
        'extInfo'         => 'ext_info',
        'fundManagerId'   => 'fund_manager_id',
        'trusteeId'       => 'trustee_id',
        'walletType'      => 'wallet_type',
    ];

    public function validate()
    {
        Model::validateRequired('balance', $this->balance, true);
        Model::validateRequired('bankAccountName', $this->bankAccountName, true);
        Model::validateRequired('bankAddress', $this->bankAddress, true);
        Model::validateRequired('bankBranchName', $this->bankBranchName, true);
        Model::validateRequired('bankCardId', $this->bankCardId, true);
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('fundManagerId', $this->fundManagerId, true);
        Model::validateRequired('trusteeId', $this->trusteeId, true);
        Model::validateRequired('walletType', $this->walletType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->bankAccountName) {
            $res['bank_account_name'] = $this->bankAccountName;
        }
        if (null !== $this->bankAddress) {
            $res['bank_address'] = $this->bankAddress;
        }
        if (null !== $this->bankBranchName) {
            $res['bank_branch_name'] = $this->bankBranchName;
        }
        if (null !== $this->bankCardId) {
            $res['bank_card_id'] = $this->bankCardId;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->fundManagerId) {
            $res['fund_manager_id'] = $this->fundManagerId;
        }
        if (null !== $this->trusteeId) {
            $res['trustee_id'] = $this->trusteeId;
        }
        if (null !== $this->walletType) {
            $res['wallet_type'] = $this->walletType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DebitWallet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['bank_account_name'])) {
            $model->bankAccountName = $map['bank_account_name'];
        }
        if (isset($map['bank_address'])) {
            $model->bankAddress = $map['bank_address'];
        }
        if (isset($map['bank_branch_name'])) {
            $model->bankBranchName = $map['bank_branch_name'];
        }
        if (isset($map['bank_card_id'])) {
            $model->bankCardId = $map['bank_card_id'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['fund_manager_id'])) {
            $model->fundManagerId = $map['fund_manager_id'];
        }
        if (isset($map['trustee_id'])) {
            $model->trusteeId = $map['trustee_id'];
        }
        if (isset($map['wallet_type'])) {
            $model->walletType = $map['wallet_type'];
        }

        return $model;
    }
}
