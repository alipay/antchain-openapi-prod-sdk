<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SettlementmodifyDubbridgeAlipayMerchantRequest extends Model
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

    // 订单号
    // request请求单号，每次请求唯一，如uuid
    /**
     * @var string
     */
    public $orderNo;

    // 门店唯一ID
    /**
     * @var string
     */
    public $externalId;

    // 004:数科入驻
    // 001:支付宝入驻
    // 没有默认：001
    /**
     * @var string
     */
    public $enterType;

    // 社会统一信用代码
    // 配合traffic_platform
    /**
     * @var string
     */
    public $usci;

    // 子品牌 配合usci
    /**
     * @var string
     */
    public $trafficPlatform;

    // 结算支付宝账户
    /**
     * @var string
     */
    public $alipayLogonId;

    // 对公-开户行名称
    /**
     * @var string
     */
    public $bankName;

    // 对公-开户银行编码
    /**
     * @var string
     */
    public $bankCode;

    // 对公-支行名称	STRING
    /**
     * @var string
     */
    public $branchName;

    // 对公-联行号
    /**
     * @var string
     */
    public $cnapsCode;

    // 对公-银行账户名称
    /**
     * @var string
     */
    public $accountName;

    // 对公-银行账户号
    /**
     * @var string
     */
    public $accountNumber;

    // 对公-开户行所在省，浙江、北京
    /**
     * @var string
     */
    public $bankProvince;

    // 对公-开户行所在市，杭州、北京
    /**
     * @var string
     */
    public $bankCity;

    // 对私-银行卡号
    /**
     * @var string
     */
    public $payeeBankCard;

    // 对私-银行名称
    /**
     * @var string
     */
    public $payeeBankName;

    // 对私-银行编码
    /**
     * @var string
     */
    public $payeeBankCode;

    // 蚂蚁数科入驻账号
    /**
     * @var string
     */
    public $loginTenant;

    // 入驻时间，yyyy-MM-dd
    /**
     * @var string
     */
    public $loginDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'externalId'        => 'external_id',
        'enterType'         => 'enter_type',
        'usci'              => 'usci',
        'trafficPlatform'   => 'traffic_platform',
        'alipayLogonId'     => 'alipay_logon_id',
        'bankName'          => 'bank_name',
        'bankCode'          => 'bank_code',
        'branchName'        => 'branch_name',
        'cnapsCode'         => 'cnaps_code',
        'accountName'       => 'account_name',
        'accountNumber'     => 'account_number',
        'bankProvince'      => 'bank_province',
        'bankCity'          => 'bank_city',
        'payeeBankCard'     => 'payee_bank_card',
        'payeeBankName'     => 'payee_bank_name',
        'payeeBankCode'     => 'payee_bank_code',
        'loginTenant'       => 'login_tenant',
        'loginDate'         => 'login_date',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('enterType', $this->enterType, true);
        Model::validateRequired('usci', $this->usci, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->enterType) {
            $res['enter_type'] = $this->enterType;
        }
        if (null !== $this->usci) {
            $res['usci'] = $this->usci;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->alipayLogonId) {
            $res['alipay_logon_id'] = $this->alipayLogonId;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->branchName) {
            $res['branch_name'] = $this->branchName;
        }
        if (null !== $this->cnapsCode) {
            $res['cnaps_code'] = $this->cnapsCode;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->accountNumber) {
            $res['account_number'] = $this->accountNumber;
        }
        if (null !== $this->bankProvince) {
            $res['bank_province'] = $this->bankProvince;
        }
        if (null !== $this->bankCity) {
            $res['bank_city'] = $this->bankCity;
        }
        if (null !== $this->payeeBankCard) {
            $res['payee_bank_card'] = $this->payeeBankCard;
        }
        if (null !== $this->payeeBankName) {
            $res['payee_bank_name'] = $this->payeeBankName;
        }
        if (null !== $this->payeeBankCode) {
            $res['payee_bank_code'] = $this->payeeBankCode;
        }
        if (null !== $this->loginTenant) {
            $res['login_tenant'] = $this->loginTenant;
        }
        if (null !== $this->loginDate) {
            $res['login_date'] = $this->loginDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SettlementmodifyDubbridgeAlipayMerchantRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['external_id'])) {
            $model->externalId = $map['external_id'];
        }
        if (isset($map['enter_type'])) {
            $model->enterType = $map['enter_type'];
        }
        if (isset($map['usci'])) {
            $model->usci = $map['usci'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['alipay_logon_id'])) {
            $model->alipayLogonId = $map['alipay_logon_id'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }
        if (isset($map['branch_name'])) {
            $model->branchName = $map['branch_name'];
        }
        if (isset($map['cnaps_code'])) {
            $model->cnapsCode = $map['cnaps_code'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['account_number'])) {
            $model->accountNumber = $map['account_number'];
        }
        if (isset($map['bank_province'])) {
            $model->bankProvince = $map['bank_province'];
        }
        if (isset($map['bank_city'])) {
            $model->bankCity = $map['bank_city'];
        }
        if (isset($map['payee_bank_card'])) {
            $model->payeeBankCard = $map['payee_bank_card'];
        }
        if (isset($map['payee_bank_name'])) {
            $model->payeeBankName = $map['payee_bank_name'];
        }
        if (isset($map['payee_bank_code'])) {
            $model->payeeBankCode = $map['payee_bank_code'];
        }
        if (isset($map['login_tenant'])) {
            $model->loginTenant = $map['login_tenant'];
        }
        if (isset($map['login_date'])) {
            $model->loginDate = $map['login_date'];
        }

        return $model;
    }
}
