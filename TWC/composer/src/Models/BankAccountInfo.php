<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BankAccountInfo extends Model
{
    // 开户名称
    /**
     * @example 张某某
     *
     * @var string
     */
    public $accountName;

    // 开户行
    /**
     * @example 某某银行
     *
     * @var string
     */
    public $accountBank;

    // 开户账号
    /**
     * @example 6234242342343456
     *
     * @var string
     */
    public $accountNumber;

    // 联系电话
    /**
     * @example 132312312xx
     *
     * @var string
     */
    public $accountPhone;
    protected $_name = [
        'accountName'   => 'account_name',
        'accountBank'   => 'account_bank',
        'accountNumber' => 'account_number',
        'accountPhone'  => 'account_phone',
    ];

    public function validate()
    {
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('accountBank', $this->accountBank, true);
        Model::validateRequired('accountNumber', $this->accountNumber, true);
        Model::validateRequired('accountPhone', $this->accountPhone, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->accountBank) {
            $res['account_bank'] = $this->accountBank;
        }
        if (null !== $this->accountNumber) {
            $res['account_number'] = $this->accountNumber;
        }
        if (null !== $this->accountPhone) {
            $res['account_phone'] = $this->accountPhone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BankAccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['account_bank'])) {
            $model->accountBank = $map['account_bank'];
        }
        if (isset($map['account_number'])) {
            $model->accountNumber = $map['account_number'];
        }
        if (isset($map['account_phone'])) {
            $model->accountPhone = $map['account_phone'];
        }

        return $model;
    }
}
