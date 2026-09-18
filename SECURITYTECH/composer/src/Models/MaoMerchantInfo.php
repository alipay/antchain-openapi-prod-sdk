<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\MaoOperateAddress;
use AntChain\SECURITYTECH\Models\MaoImages;
use AntChain\SECURITYTECH\Models\MaoSettleAccount;
use AntChain\SECURITYTECH\Models\MaoContact;
use AntChain\SECURITYTECH\Models\MaoQualification;
use AntChain\SECURITYTECH\Models\MaoLicenseValidPeriod;

class MaoMerchantInfo extends Model {
    protected $_name = [
        'merchantName' => 'merchant_name',
        'merchantShortName' => 'merchant_short_name',
        'enterType' => 'enter_type',
        'merchantRole' => 'merchant_role',
        'legalPerson' => 'legal_person',
        'legalPersonIdCard' => 'legal_person_id_card',
        'legalPersonPhone' => 'legal_person_phone',
        'operateAddress' => 'operate_address',
        'images' => 'images',
        'settleAccount' => 'settle_account',
        'contacts' => 'contacts',
        'industryFields' => 'industry_fields',
        'licenseValidPeriod' => 'license_valid_period',
        'isChain' => 'is_chain',
        'storeType' => 'store_type',
        'extraInfo' => 'extra_info',
        'businessScope' => 'business_scope',
        'specialIndustryLicenseName' => 'special_industry_license_name',
        'specialIndustryLicenseValidPeriod' => 'special_industry_license_valid_period',
    ];
    public function validate() {
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('merchantShortName', $this->merchantShortName, true);
        Model::validateRequired('enterType', $this->enterType, true);
        Model::validateRequired('merchantRole', $this->merchantRole, true);
        Model::validateRequired('legalPerson', $this->legalPerson, true);
        Model::validateRequired('legalPersonIdCard', $this->legalPersonIdCard, true);
        Model::validateRequired('legalPersonPhone', $this->legalPersonPhone, true);
        Model::validateRequired('operateAddress', $this->operateAddress, true);
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('settleAccount', $this->settleAccount, true);
        Model::validateRequired('contacts', $this->contacts, true);
        Model::validateRequired('businessScope', $this->businessScope, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantShortName) {
            $res['merchant_short_name'] = $this->merchantShortName;
        }
        if (null !== $this->enterType) {
            $res['enter_type'] = $this->enterType;
        }
        if (null !== $this->merchantRole) {
            $res['merchant_role'] = $this->merchantRole;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }
        if (null !== $this->legalPersonIdCard) {
            $res['legal_person_id_card'] = $this->legalPersonIdCard;
        }
        if (null !== $this->legalPersonPhone) {
            $res['legal_person_phone'] = $this->legalPersonPhone;
        }
        if (null !== $this->operateAddress) {
            $res['operate_address'] = null !== $this->operateAddress ? $this->operateAddress->toMap() : null;
        }
        if (null !== $this->images) {
            $res['images'] = null !== $this->images ? $this->images->toMap() : null;
        }
        if (null !== $this->settleAccount) {
            $res['settle_account'] = null !== $this->settleAccount ? $this->settleAccount->toMap() : null;
        }
        if (null !== $this->contacts) {
            $res['contacts'] = [];
            if(null !== $this->contacts && is_array($this->contacts)){
                $n = 0;
                foreach($this->contacts as $item){
                    $res['contacts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->industryFields) {
            $res['industry_fields'] = [];
            if(null !== $this->industryFields && is_array($this->industryFields)){
                $n = 0;
                foreach($this->industryFields as $item){
                    $res['industry_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->licenseValidPeriod) {
            $res['license_valid_period'] = null !== $this->licenseValidPeriod ? $this->licenseValidPeriod->toMap() : null;
        }
        if (null !== $this->isChain) {
            $res['is_chain'] = $this->isChain;
        }
        if (null !== $this->storeType) {
            $res['store_type'] = $this->storeType;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->businessScope) {
            $res['business_scope'] = $this->businessScope;
        }
        if (null !== $this->specialIndustryLicenseName) {
            $res['special_industry_license_name'] = $this->specialIndustryLicenseName;
        }
        if (null !== $this->specialIndustryLicenseValidPeriod) {
            $res['special_industry_license_valid_period'] = null !== $this->specialIndustryLicenseValidPeriod ? $this->specialIndustryLicenseValidPeriod->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoMerchantInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['merchant_name'])){
            $model->merchantName = $map['merchant_name'];
        }
        if(isset($map['merchant_short_name'])){
            $model->merchantShortName = $map['merchant_short_name'];
        }
        if(isset($map['enter_type'])){
            $model->enterType = $map['enter_type'];
        }
        if(isset($map['merchant_role'])){
            $model->merchantRole = $map['merchant_role'];
        }
        if(isset($map['legal_person'])){
            $model->legalPerson = $map['legal_person'];
        }
        if(isset($map['legal_person_id_card'])){
            $model->legalPersonIdCard = $map['legal_person_id_card'];
        }
        if(isset($map['legal_person_phone'])){
            $model->legalPersonPhone = $map['legal_person_phone'];
        }
        if(isset($map['operate_address'])){
            $model->operateAddress = MaoOperateAddress::fromMap($map['operate_address']);
        }
        if(isset($map['images'])){
            $model->images = MaoImages::fromMap($map['images']);
        }
        if(isset($map['settle_account'])){
            $model->settleAccount = MaoSettleAccount::fromMap($map['settle_account']);
        }
        if(isset($map['contacts'])){
            if(!empty($map['contacts'])){
                $model->contacts = [];
                $n = 0;
                foreach($map['contacts'] as $item) {
                    $model->contacts[$n++] = null !== $item ? MaoContact::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['industry_fields'])){
            if(!empty($map['industry_fields'])){
                $model->industryFields = [];
                $n = 0;
                foreach($map['industry_fields'] as $item) {
                    $model->industryFields[$n++] = null !== $item ? MaoQualification::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['license_valid_period'])){
            $model->licenseValidPeriod = MaoLicenseValidPeriod::fromMap($map['license_valid_period']);
        }
        if(isset($map['is_chain'])){
            $model->isChain = $map['is_chain'];
        }
        if(isset($map['store_type'])){
            $model->storeType = $map['store_type'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['business_scope'])){
            $model->businessScope = $map['business_scope'];
        }
        if(isset($map['special_industry_license_name'])){
            $model->specialIndustryLicenseName = $map['special_industry_license_name'];
        }
        if(isset($map['special_industry_license_valid_period'])){
            $model->specialIndustryLicenseValidPeriod = MaoLicenseValidPeriod::fromMap($map['special_industry_license_valid_period']);
        }
        return $model;
    }
    // 营业执照登记名称
    /**
     * @example 营业执照登记名称
     * @var string
     */
    public $merchantName;

    // 简称
    /**
     * @example 简称
     * @var string
     */
    public $merchantShortName;

    // 企业类型
    /**
     * @example ENTERPRISE
     * @var string
     */
    public $enterType;

    // 商户角色
    /**
     * @example SI_STORE
     * @var string
     */
    public $merchantRole;

    // 法人姓名
    /**
     * @example 法人姓名
     * @var string
     */
    public $legalPerson;

    // 法人身份证号
    /**
     * @example 法人身份证号
     * @var string
     */
    public $legalPersonIdCard;

    // 法人手机号
    /**
     * @example 法人手机号
     * @var string
     */
    public $legalPersonPhone;

    // 经营地址
    /**
     * @example undefined
     * @var MaoOperateAddress
     */
    public $operateAddress;

    // 图片
    /**
     * @example undefined
     * @var MaoImages
     */
    public $images;

    // 结算账户
    /**
     * @example undefined
     * @var MaoSettleAccount
     */
    public $settleAccount;

    // 联系人列表
    /**
     * @example undefined
     * @var MaoContact[]
     */
    public $contacts;

    // 行业资质
    /**
     * @example undefined
     * @var MaoQualification[]
     */
    public $industryFields;

    // 执照有效期
    /**
     * @example 
     * @var MaoLicenseValidPeriod
     */
    public $licenseValidPeriod;

    // 是否连锁企业
    /**
     * @example 是否连锁企业
     * @var string
     */
    public $isChain;

    // 门店经营模式
    /**
     * @example 门店经营模式
     * @var string
     */
    public $storeType;

    // 扩展字段
    /**
     * @example 扩展字段
     * @var string
     */
    public $extraInfo;

    // 门店经营范围
    /**
     * @example 门店经营范围
     * @var string
     */
    public $businessScope;

    // 特殊行业许可证名称
    /**
     * @example 特殊行业许可证名称
     * @var string
     */
    public $specialIndustryLicenseName;

    // 特殊行业许可证有效期
    /**
     * @example 特殊行业许可证有效期
     * @var MaoLicenseValidPeriod
     */
    public $specialIndustryLicenseValidPeriod;

}
