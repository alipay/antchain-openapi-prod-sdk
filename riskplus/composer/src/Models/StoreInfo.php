<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class StoreInfo extends Model
{
    // 品牌
    /**
     * @example xxx
     *
     * @var string
     */
    public $storeBrand;

    // 门店ID
    /**
     * @example xxxx
     *
     * @var string
     */
    public $storeId;

    // 门店名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $storeName;

    // 统一社会信用代码
    /**
     * @example xxx
     *
     * @var string
     */
    public $usci;

    // 门店-省，浙江省
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $province;

    // 门店-市，杭州市
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $city;

    // 门店-区，滨江区
    /**
     * @example 滨江区
     *
     * @var string
     */
    public $district;

    // 门店-详细地址，
    // 望江路万达广场一层001号
    /**
     * @example 望江路万达广场一层001号
     *
     * @var string
     */
    public $address;

    // 营业执照-开始时间，yyyy-MM-dd
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $storeStartDate;

    // 营业执照-结束时间，yyyy-MM-dd，长期上送：9999-12-31
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $storeEndDate;

    // 门店类型，
    // 个体、企业、其他
    /**
     * @example 个体
     *
     * @var string
     */
    public $storeType;

    // 法人-姓名
    /**
     * @example xxx
     *
     * @var string
     */
    public $legalPersonName;

    // 法人-身份证号
    /**
     * @example xxx
     *
     * @var string
     */
    public $legalPersonIdCard;

    // 法人-手机号
    /**
     * @example xxx
     *
     * @var string
     */
    public $legalPersonMobile;

    // 法人-身份证有效期，，身份证反面格式：如yyyy.MM.dd-长期
    /**
     * @example yyyy.MM.dd-长期
     *
     * @var string
     */
    public $effectiveDate;

    // 对公-开户行名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $bankName;

    // 对公-支行名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $branchName;

    // 对公-联行号
    /**
     * @example xxx
     *
     * @var string
     */
    public $cnapsCode;

    // 对公-银行账户名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $accountName;

    // 对公-银行账户号
    /**
     * @example xxx
     *
     * @var string
     */
    public $accountNumber;

    // 对公-开户行所在省，浙江
    /**
     * @example 浙江
     *
     * @var string
     */
    public $bankProvince;

    // 对公-开户行所在市，杭州
    /**
     * @example 杭州
     *
     * @var string
     */
    public $bankCity;

    // 对私-银行卡号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $payeeBankCard;

    // 对私-银行名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $payeeBankName;

    // 蚂蚁数科入驻账号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $loginTenant;

    // 入驻时间
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $loginDate;
    protected $_name = [
        'storeBrand'        => 'store_brand',
        'storeId'           => 'store_id',
        'storeName'         => 'store_name',
        'usci'              => 'usci',
        'province'          => 'province',
        'city'              => 'city',
        'district'          => 'district',
        'address'           => 'address',
        'storeStartDate'    => 'store_start_date',
        'storeEndDate'      => 'store_end_date',
        'storeType'         => 'store_type',
        'legalPersonName'   => 'legal_person_name',
        'legalPersonIdCard' => 'legal_person_id_card',
        'legalPersonMobile' => 'legal_person_mobile',
        'effectiveDate'     => 'effective_date',
        'bankName'          => 'bank_name',
        'branchName'        => 'branch_name',
        'cnapsCode'         => 'cnaps_code',
        'accountName'       => 'account_name',
        'accountNumber'     => 'account_number',
        'bankProvince'      => 'bank_province',
        'bankCity'          => 'bank_city',
        'payeeBankCard'     => 'payee_bank_card',
        'payeeBankName'     => 'payee_bank_name',
        'loginTenant'       => 'login_tenant',
        'loginDate'         => 'login_date',
    ];

    public function validate()
    {
        Model::validateRequired('storeBrand', $this->storeBrand, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('storeName', $this->storeName, true);
        Model::validateRequired('usci', $this->usci, true);
        Model::validateRequired('province', $this->province, true);
        Model::validateRequired('city', $this->city, true);
        Model::validateRequired('district', $this->district, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('storeStartDate', $this->storeStartDate, true);
        Model::validateRequired('storeEndDate', $this->storeEndDate, true);
        Model::validateRequired('storeType', $this->storeType, true);
        Model::validateRequired('legalPersonName', $this->legalPersonName, true);
        Model::validateRequired('legalPersonIdCard', $this->legalPersonIdCard, true);
        Model::validateRequired('legalPersonMobile', $this->legalPersonMobile, true);
        Model::validateRequired('effectiveDate', $this->effectiveDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->storeBrand) {
            $res['store_brand'] = $this->storeBrand;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->storeName) {
            $res['store_name'] = $this->storeName;
        }
        if (null !== $this->usci) {
            $res['usci'] = $this->usci;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->district) {
            $res['district'] = $this->district;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->storeStartDate) {
            $res['store_start_date'] = $this->storeStartDate;
        }
        if (null !== $this->storeEndDate) {
            $res['store_end_date'] = $this->storeEndDate;
        }
        if (null !== $this->storeType) {
            $res['store_type'] = $this->storeType;
        }
        if (null !== $this->legalPersonName) {
            $res['legal_person_name'] = $this->legalPersonName;
        }
        if (null !== $this->legalPersonIdCard) {
            $res['legal_person_id_card'] = $this->legalPersonIdCard;
        }
        if (null !== $this->legalPersonMobile) {
            $res['legal_person_mobile'] = $this->legalPersonMobile;
        }
        if (null !== $this->effectiveDate) {
            $res['effective_date'] = $this->effectiveDate;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
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
     * @return StoreInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['store_brand'])) {
            $model->storeBrand = $map['store_brand'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['store_name'])) {
            $model->storeName = $map['store_name'];
        }
        if (isset($map['usci'])) {
            $model->usci = $map['usci'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['district'])) {
            $model->district = $map['district'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['store_start_date'])) {
            $model->storeStartDate = $map['store_start_date'];
        }
        if (isset($map['store_end_date'])) {
            $model->storeEndDate = $map['store_end_date'];
        }
        if (isset($map['store_type'])) {
            $model->storeType = $map['store_type'];
        }
        if (isset($map['legal_person_name'])) {
            $model->legalPersonName = $map['legal_person_name'];
        }
        if (isset($map['legal_person_id_card'])) {
            $model->legalPersonIdCard = $map['legal_person_id_card'];
        }
        if (isset($map['legal_person_mobile'])) {
            $model->legalPersonMobile = $map['legal_person_mobile'];
        }
        if (isset($map['effective_date'])) {
            $model->effectiveDate = $map['effective_date'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
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
        if (isset($map['login_tenant'])) {
            $model->loginTenant = $map['login_tenant'];
        }
        if (isset($map['login_date'])) {
            $model->loginDate = $map['login_date'];
        }

        return $model;
    }
}
