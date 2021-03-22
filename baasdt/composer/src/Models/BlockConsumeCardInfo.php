<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BlockConsumeCardInfo extends Model
{
    // 外部系统对该个人/机构用户的内部编号,用于唯一识别该用户
    /**
     * @example userId001
     *
     * @var string
     */
    public $userId;

    // 用户的链上账户Id
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $accountId;

    // 开户行名称
    /**
     * @example 招商银行杭州高新支行
     *
     * @var string
     */
    public $bankName;

    // 消费卡开通绑定的银行卡卡号
    /**
     * @example 6259093871597124
     *
     * @var string
     */
    public $bankCardId;

    // 开户名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $accountName;

    // 账户余额(元)
    /**
     * @example 15.76
     *
     * @var string
     */
    public $debitAmount;

    // 信用余额(元)
    /**
     * @example 54.14
     *
     * @var string
     */
    public $creditAmount;

    // 资产的来源<来源账户ID_余额/信用额, 数量>, 例如: "accountId1_Debit": 11000表示这笔资产来源于accountId1,是accountId1这个账户通过Debit余额发行的资产。
    /**
     * @example {"accountId1_Debit": 11000, "accountId2_Credit": 10000}
     *
     * @var string
     */
    public $assetMap;
    protected $_name = [
        'userId'       => 'user_id',
        'accountId'    => 'account_id',
        'bankName'     => 'bank_name',
        'bankCardId'   => 'bank_card_id',
        'accountName'  => 'account_name',
        'debitAmount'  => 'debit_amount',
        'creditAmount' => 'credit_amount',
        'assetMap'     => 'asset_map',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('bankCardId', $this->bankCardId, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('debitAmount', $this->debitAmount, true);
        Model::validateRequired('creditAmount', $this->creditAmount, true);
        Model::validateRequired('assetMap', $this->assetMap, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankCardId) {
            $res['bank_card_id'] = $this->bankCardId;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->debitAmount) {
            $res['debit_amount'] = $this->debitAmount;
        }
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->assetMap) {
            $res['asset_map'] = $this->assetMap;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockConsumeCardInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_card_id'])) {
            $model->bankCardId = $map['bank_card_id'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['debit_amount'])) {
            $model->debitAmount = $map['debit_amount'];
        }
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['asset_map'])) {
            $model->assetMap = $map['asset_map'];
        }

        return $model;
    }
}
