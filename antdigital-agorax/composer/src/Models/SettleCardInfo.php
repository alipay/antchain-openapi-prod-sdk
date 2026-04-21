<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class SettleCardInfo extends Model
{
    // 开户支行名
    /**
     * @example 招商银行杭州高新支行
     *
     * @var string
     */
    public $accountBranchName;

    // 卡户名
    /**
     * @example 张三
     *
     * @var string
     */
    public $accountHolderName;

    // 开户行所在地-市
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $accountInstCity;

    // 开户行简称缩写
    /**
     * @example CMB
     *
     * @var string
     */
    public $accountInstId;

    // 银行名称
    /**
     * @example 招商银行
     *
     * @var string
     */
    public $accountInstName;

    // 开户行所在地-省
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $accountInstProvince;

    // 银行卡号
    /**
     * @example 6214855710610408
     *
     * @var string
     */
    public $accountNo;

    // 卡类型
    /**
     * @example DC
     *
     * @var string
     */
    public $accountType;

    // 账号使用类型
    /**
     * @example 01
     *
     * @var string
     */
    public $usageType;
    protected $_name = [
        'accountBranchName'   => 'account_branch_name',
        'accountHolderName'   => 'account_holder_name',
        'accountInstCity'     => 'account_inst_city',
        'accountInstId'       => 'account_inst_id',
        'accountInstName'     => 'account_inst_name',
        'accountInstProvince' => 'account_inst_province',
        'accountNo'           => 'account_no',
        'accountType'         => 'account_type',
        'usageType'           => 'usage_type',
    ];

    public function validate()
    {
        Model::validateRequired('accountBranchName', $this->accountBranchName, true);
        Model::validateRequired('accountHolderName', $this->accountHolderName, true);
        Model::validateRequired('accountInstCity', $this->accountInstCity, true);
        Model::validateRequired('accountInstId', $this->accountInstId, true);
        Model::validateRequired('accountInstName', $this->accountInstName, true);
        Model::validateRequired('accountInstProvince', $this->accountInstProvince, true);
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('accountType', $this->accountType, true);
        Model::validateRequired('usageType', $this->usageType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountBranchName) {
            $res['account_branch_name'] = $this->accountBranchName;
        }
        if (null !== $this->accountHolderName) {
            $res['account_holder_name'] = $this->accountHolderName;
        }
        if (null !== $this->accountInstCity) {
            $res['account_inst_city'] = $this->accountInstCity;
        }
        if (null !== $this->accountInstId) {
            $res['account_inst_id'] = $this->accountInstId;
        }
        if (null !== $this->accountInstName) {
            $res['account_inst_name'] = $this->accountInstName;
        }
        if (null !== $this->accountInstProvince) {
            $res['account_inst_province'] = $this->accountInstProvince;
        }
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->usageType) {
            $res['usage_type'] = $this->usageType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SettleCardInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_branch_name'])) {
            $model->accountBranchName = $map['account_branch_name'];
        }
        if (isset($map['account_holder_name'])) {
            $model->accountHolderName = $map['account_holder_name'];
        }
        if (isset($map['account_inst_city'])) {
            $model->accountInstCity = $map['account_inst_city'];
        }
        if (isset($map['account_inst_id'])) {
            $model->accountInstId = $map['account_inst_id'];
        }
        if (isset($map['account_inst_name'])) {
            $model->accountInstName = $map['account_inst_name'];
        }
        if (isset($map['account_inst_province'])) {
            $model->accountInstProvince = $map['account_inst_province'];
        }
        if (isset($map['account_no'])) {
            $model->accountNo = $map['account_no'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['usage_type'])) {
            $model->usageType = $map['usage_type'];
        }

        return $model;
    }
}
