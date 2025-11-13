<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class BindMerchantexpandSettlecardRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 银行卡号
    /**
     * @var string
     */
    public $accountNo;

    // 银行账户名称
    /**
     * @var string
     */
    public $accountName;

    // 开户行所在省
    /**
     * @var string
     */
    public $bankProvince;

    // 开户行所在地-市
    /**
     * @var string
     */
    public $bankCity;

    // 账号使用类型
    // 对公: 01
    // 对私: 02
    /**
     * @var string
     */
    public $usageType;

    // 卡类型
    // 借记卡: DC
    // 信用卡: CC
    /**
     * @var string
     */
    public $accountType;

    // 开户支行名
    /**
     * @var string
     */
    public $bankBranchName;

    // 银行名称
    /**
     * @var string
     */
    public $bankName;

    // 开户行简称缩写
    /**
     * @var string
     */
    public $bankInstId;

    // 联行号
    /**
     * @var string
     */
    public $bankCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'accountNo'         => 'account_no',
        'accountName'       => 'account_name',
        'bankProvince'      => 'bank_province',
        'bankCity'          => 'bank_city',
        'usageType'         => 'usage_type',
        'accountType'       => 'account_type',
        'bankBranchName'    => 'bank_branch_name',
        'bankName'          => 'bank_name',
        'bankInstId'        => 'bank_inst_id',
        'bankCode'          => 'bank_code',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('bankProvince', $this->bankProvince, true);
        Model::validateRequired('bankCity', $this->bankCity, true);
        Model::validateRequired('usageType', $this->usageType, true);
        Model::validateRequired('accountType', $this->accountType, true);
        Model::validateRequired('bankBranchName', $this->bankBranchName, true);
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('bankInstId', $this->bankInstId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->bankProvince) {
            $res['bank_province'] = $this->bankProvince;
        }
        if (null !== $this->bankCity) {
            $res['bank_city'] = $this->bankCity;
        }
        if (null !== $this->usageType) {
            $res['usage_type'] = $this->usageType;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->bankBranchName) {
            $res['bank_branch_name'] = $this->bankBranchName;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankInstId) {
            $res['bank_inst_id'] = $this->bankInstId;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindMerchantexpandSettlecardRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['account_no'])) {
            $model->accountNo = $map['account_no'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['bank_province'])) {
            $model->bankProvince = $map['bank_province'];
        }
        if (isset($map['bank_city'])) {
            $model->bankCity = $map['bank_city'];
        }
        if (isset($map['usage_type'])) {
            $model->usageType = $map['usage_type'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['bank_branch_name'])) {
            $model->bankBranchName = $map['bank_branch_name'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_inst_id'])) {
            $model->bankInstId = $map['bank_inst_id'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }

        return $model;
    }
}
