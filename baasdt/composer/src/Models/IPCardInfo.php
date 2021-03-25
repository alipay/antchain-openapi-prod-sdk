<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCardInfo extends Model
{
    // 卡户名
    /**
     * @example 马老师
     *
     * @var string
     */
    public $accountHolderName;

    // 卡号
    /**
     * @example 6214855710610408
     *
     * @var string
     */
    public $accountNo;

    // 银行名称
    /**
     * @example 招商银行
     *
     * @var string
     */
    public $accountInstName;

    // 银行缩写
    /**
     * @example CMB
     *
     * @var string
     */
    public $accountInstId;

    // 联行号
    /**
     * @example 103290003044
     *
     * @var string
     */
    public $bankCode;

    // 开户行所在省份
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $accountInstProvince;

    // 开户行所在城市
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $accountInstCity;

    // 开户行支行名称
    /**
     * @example 招商银行杭州高新支行
     *
     * @var string
     */
    public $accountBranchName;
    protected $_name = [
        'accountHolderName'   => 'account_holder_name',
        'accountNo'           => 'account_no',
        'accountInstName'     => 'account_inst_name',
        'accountInstId'       => 'account_inst_id',
        'bankCode'            => 'bank_code',
        'accountInstProvince' => 'account_inst_province',
        'accountInstCity'     => 'account_inst_city',
        'accountBranchName'   => 'account_branch_name',
    ];

    public function validate()
    {
        Model::validateRequired('accountHolderName', $this->accountHolderName, true);
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('accountInstName', $this->accountInstName, true);
        Model::validateRequired('accountInstId', $this->accountInstId, true);
        Model::validateRequired('accountInstProvince', $this->accountInstProvince, true);
        Model::validateRequired('accountInstCity', $this->accountInstCity, true);
        Model::validateRequired('accountBranchName', $this->accountBranchName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountHolderName) {
            $res['account_holder_name'] = $this->accountHolderName;
        }
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->accountInstName) {
            $res['account_inst_name'] = $this->accountInstName;
        }
        if (null !== $this->accountInstId) {
            $res['account_inst_id'] = $this->accountInstId;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->accountInstProvince) {
            $res['account_inst_province'] = $this->accountInstProvince;
        }
        if (null !== $this->accountInstCity) {
            $res['account_inst_city'] = $this->accountInstCity;
        }
        if (null !== $this->accountBranchName) {
            $res['account_branch_name'] = $this->accountBranchName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCardInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_holder_name'])) {
            $model->accountHolderName = $map['account_holder_name'];
        }
        if (isset($map['account_no'])) {
            $model->accountNo = $map['account_no'];
        }
        if (isset($map['account_inst_name'])) {
            $model->accountInstName = $map['account_inst_name'];
        }
        if (isset($map['account_inst_id'])) {
            $model->accountInstId = $map['account_inst_id'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }
        if (isset($map['account_inst_province'])) {
            $model->accountInstProvince = $map['account_inst_province'];
        }
        if (isset($map['account_inst_city'])) {
            $model->accountInstCity = $map['account_inst_city'];
        }
        if (isset($map['account_branch_name'])) {
            $model->accountBranchName = $map['account_branch_name'];
        }

        return $model;
    }
}
