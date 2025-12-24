<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class MerchantSettleInfo extends Model
{
    // 结算银行卡账号
    /**
     * @example 123123122134
     *
     * @var string
     */
    public $bankNum;

    // 联行号
    /**
     * @example 123123122134
     *
     * @var string
     */
    public $bankCnap;

    // 结算账户类型
    // merchant_type=01企业时：ENTERPRISE
    // 03:民办非企业：ENTERPRISE
    // 07个体工商户时：PERSON或 ENTERPRISE
    /**
     * @example ENTERPRISE
     *
     * @var string
     */
    public $bankAccountType;
    protected $_name = [
        'bankNum'         => 'bank_num',
        'bankCnap'        => 'bank_cnap',
        'bankAccountType' => 'bank_account_type',
    ];

    public function validate()
    {
        Model::validateRequired('bankNum', $this->bankNum, true);
        Model::validateRequired('bankCnap', $this->bankCnap, true);
        Model::validateRequired('bankAccountType', $this->bankAccountType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bankNum) {
            $res['bank_num'] = $this->bankNum;
        }
        if (null !== $this->bankCnap) {
            $res['bank_cnap'] = $this->bankCnap;
        }
        if (null !== $this->bankAccountType) {
            $res['bank_account_type'] = $this->bankAccountType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantSettleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bank_num'])) {
            $model->bankNum = $map['bank_num'];
        }
        if (isset($map['bank_cnap'])) {
            $model->bankCnap = $map['bank_cnap'];
        }
        if (isset($map['bank_account_type'])) {
            $model->bankAccountType = $map['bank_account_type'];
        }

        return $model;
    }
}
