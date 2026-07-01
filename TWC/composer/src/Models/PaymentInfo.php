<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PaymentInfo extends Model
{
    // 收款账户-户名 不超过64字符
    /**
     * @example XX
     *
     * @var string
     */
    public $accountName;

    // 收款账户-开户银行 不超过64字符
    /**
     * @example xx银行
     *
     * @var string
     */
    public $bankName;

    // 收款账户-收款账户银行账号 不超过64字符
    /**
     * @example 622848XXX1232123
     *
     * @var string
     */
    public $bankNum;
    protected $_name = [
        'accountName' => 'account_name',
        'bankName'    => 'bank_name',
        'bankNum'     => 'bank_num',
    ];

    public function validate()
    {
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('bankNum', $this->bankNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankNum) {
            $res['bank_num'] = $this->bankNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaymentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_num'])) {
            $model->bankNum = $map['bank_num'];
        }

        return $model;
    }
}
