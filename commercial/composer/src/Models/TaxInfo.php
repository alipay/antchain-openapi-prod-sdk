<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class TaxInfo extends Model
{
    // 纳税人名称
    /**
     * @example 数科有限公司
     *
     * @var string
     */
    public $taxpayerName;

    // 纳税人识别号
    /**
     * @example 2021032410730500140A00330000088993
     *
     * @var string
     */
    public $taxpayerNo;

    // 开户行名称
    /**
     * @example 北京银行海淀支行
     *
     * @var string
     */
    public $bankName;

    // 开户行账号
    /**
     * @example 20884231521232548
     *
     * @var string
     */
    public $bankAccount;

    // 开户行地址
    /**
     * @example 东三种中路1号
     *
     * @var string
     */
    public $address;

    // 开户行电话
    /**
     * @example 01085442125
     *
     * @var string
     */
    public $telephone;
    protected $_name = [
        'taxpayerName' => 'taxpayer_name',
        'taxpayerNo'   => 'taxpayer_no',
        'bankName'     => 'bank_name',
        'bankAccount'  => 'bank_account',
        'address'      => 'address',
        'telephone'    => 'telephone',
    ];

    public function validate()
    {
        Model::validateRequired('taxpayerName', $this->taxpayerName, true);
        Model::validateRequired('taxpayerNo', $this->taxpayerNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taxpayerName) {
            $res['taxpayer_name'] = $this->taxpayerName;
        }
        if (null !== $this->taxpayerNo) {
            $res['taxpayer_no'] = $this->taxpayerNo;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankAccount) {
            $res['bank_account'] = $this->bankAccount;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->telephone) {
            $res['telephone'] = $this->telephone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaxInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['taxpayer_name'])) {
            $model->taxpayerName = $map['taxpayer_name'];
        }
        if (isset($map['taxpayer_no'])) {
            $model->taxpayerNo = $map['taxpayer_no'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_account'])) {
            $model->bankAccount = $map['bank_account'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['telephone'])) {
            $model->telephone = $map['telephone'];
        }

        return $model;
    }
}
