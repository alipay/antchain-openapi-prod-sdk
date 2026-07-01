<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class JudicialBankInfo extends Model
{
    // 开户行
    /**
     * @example 开户银行
     *
     * @var string
     */
    public $accountBank;

    // 开户账号
    /**
     * @example f3232sdj32fl312ksdj
     *
     * @var string
     */
    public $accountNumber;

    // 开户名称
    /**
     * @example 示例开户名称
     *
     * @var string
     */
    public $accountName;

    // 开户联系电话
    /**
     * @example 15000000000
     *
     * @var string
     */
    public $accountContactPhone;
    protected $_name = [
        'accountBank'         => 'account_bank',
        'accountNumber'       => 'account_number',
        'accountName'         => 'account_name',
        'accountContactPhone' => 'account_contact_phone',
    ];

    public function validate()
    {
        Model::validateRequired('accountBank', $this->accountBank, true);
        Model::validateRequired('accountNumber', $this->accountNumber, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('accountContactPhone', $this->accountContactPhone, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountBank) {
            $res['account_bank'] = $this->accountBank;
        }
        if (null !== $this->accountNumber) {
            $res['account_number'] = $this->accountNumber;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->accountContactPhone) {
            $res['account_contact_phone'] = $this->accountContactPhone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudicialBankInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_bank'])) {
            $model->accountBank = $map['account_bank'];
        }
        if (isset($map['account_number'])) {
            $model->accountNumber = $map['account_number'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['account_contact_phone'])) {
            $model->accountContactPhone = $map['account_contact_phone'];
        }

        return $model;
    }
}
