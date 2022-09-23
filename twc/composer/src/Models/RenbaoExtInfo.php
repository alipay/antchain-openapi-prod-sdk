<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class RenbaoExtInfo extends Model
{
    // 银行区域代码，可网上查询各银行最新对应的区域代码，比如杭州的区域代码为：3301
    /**
     * @example 3301
     *
     * @var string
     */
    public $recBankAreaCode;

    // 投保人收款账号
    /**
     * @example 8765123556748921
     *
     * @var string
     */
    public $accountNo;

    // 完整银行名称，不需要具体到分行
    /**
     * @example 工商银行
     *
     * @var string
     */
    public $bankName;

    // 投保人户名
    /**
     * @example XXXXX有限公司
     *
     * @var string
     */
    public $accountName;

    // 联行号
    /**
     * @example 827330119378
     *
     * @var string
     */
    public $cnaps;

    // 统一社会信用代码
    /**
     * @example 173829930011029381
     *
     * @var string
     */
    public $identifyNo;
    protected $_name = [
        'recBankAreaCode' => 'rec_bank_area_code',
        'accountNo'       => 'account_no',
        'bankName'        => 'bank_name',
        'accountName'     => 'account_name',
        'cnaps'           => 'cnaps',
        'identifyNo'      => 'identify_no',
    ];

    public function validate()
    {
        Model::validateRequired('recBankAreaCode', $this->recBankAreaCode, true);
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('cnaps', $this->cnaps, true);
        Model::validateRequired('identifyNo', $this->identifyNo, true);
        Model::validateMaxLength('recBankAreaCode', $this->recBankAreaCode, 8);
        Model::validateMaxLength('accountNo', $this->accountNo, 32);
        Model::validateMaxLength('bankName', $this->bankName, 32);
        Model::validateMaxLength('accountName', $this->accountName, 64);
        Model::validateMaxLength('cnaps', $this->cnaps, 16);
        Model::validateMaxLength('identifyNo', $this->identifyNo, 32);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->recBankAreaCode) {
            $res['rec_bank_area_code'] = $this->recBankAreaCode;
        }
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->cnaps) {
            $res['cnaps'] = $this->cnaps;
        }
        if (null !== $this->identifyNo) {
            $res['identify_no'] = $this->identifyNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RenbaoExtInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rec_bank_area_code'])) {
            $model->recBankAreaCode = $map['rec_bank_area_code'];
        }
        if (isset($map['account_no'])) {
            $model->accountNo = $map['account_no'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['cnaps'])) {
            $model->cnaps = $map['cnaps'];
        }
        if (isset($map['identify_no'])) {
            $model->identifyNo = $map['identify_no'];
        }

        return $model;
    }
}
