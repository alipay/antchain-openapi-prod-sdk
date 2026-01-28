<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CompanyInfo extends Model
{
    // 营业执照文件信息
    /**
     * @example
     *
     * @var FileInfo
     */
    public $businessLicenseFile;

    // 证件是否长期有效
    // true：长期，false：非长期
    // payChannel =JDPAY必填
    /**
     * @example true, false
     *
     * @var bool
     */
    public $businessLicenseCertExpireFlag;

    // 证件有效期开始日期(payChannel =JDPAY)
    // 1.certExpireFlag=false时必填，时间格式:yyyy-MM-dd
    // 2. 商户为企业个体户时，无论certExpireFlag是否长期，该字段均必填
    /**
     * @example 2024-10-17
     *
     * @var string
     */
    public $businessLicenseCertEffectDate;

    // 证件有效期结束日期（payChannel =JDPAY选填参数）
    // certExpireFlag为false必填，时间格式：yyyy-MM-dd
    /**
     * @example 2024-10-17
     *
     * @var string
     */
    public $businessLicenseCertExpireDate;

    // 业务类型 枚举
    /**
     * @example 业务类型
     *
     * @var string
     */
    public $productMainClass;

    // 公司名称
    /**
     * @example xx公司
     *
     * @var string
     */
    public $companyName;

    // 公司别名
    /**
     * @example 公司别名
     *
     * @var string
     */
    public $companyAliasName;

    // 公司数科租户id
    /**
     * @example ASSDDDAS
     *
     * @var string
     */
    public $tenantId;

    // 统一社会信用代码
    /**
     * @example 9121asd231231231231
     *
     * @var string
     */
    public $merchantId;

    // 商户类型： 01：企业；07：个体工商户
    // 默认不填为01
    /**
     * @example 01
     *
     * @var string
     */
    public $merchantType;

    // 公司联系电话
    /**
     * @example 1231xx2322
     *
     * @var string
     */
    public $companyMobile;

    // 公司联系地址
    /**
     * @example xx市xx区
     *
     * @var string
     */
    public $companyAddress;

    // 联系人姓名
    /**
     * @example 李xx
     *
     * @var string
     */
    public $contactName;

    // 联系人手机号码
    /**
     * @example 132xx2312312
     *
     * @var string
     */
    public $contactMobile;

    // 联系地址-省份code(payChannel =JDPAY必填)
    /**
     * @example 430000
     *
     * @var string
     */
    public $contactAddressProvinceCode;

    // 联系地址-省份名称（payChannel =JDPAY必填）
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $contactAddressProvinceName;

    // 联系地址-市code（payChannel =JDPAY必填）
    //
    /**
     * @example 403100
     *
     * @var string
     */
    public $contactAddressCityCode;

    // 联系人地址-市名称（payChannel =JDPAY必填）
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $contactAddressCityName;

    // 联系人详细地址（payChannel =JDPAY必填）
    /**
     * @example 杭州市余杭区xxx
     *
     * @var string
     */
    public $contactAddressDetail;

    // 联系人邮箱（pay_channel=JDPAY必填）
    /**
     * @example 123123122134@163.com
     *
     * @var string
     */
    public $contactEmail;

    // 绑定企业支付宝账号（pay_channel=ALIPAY必填）
    /**
     * @example 绑定企业支付宝账号
     *
     * @var string
     */
    public $bindAlipayNo;

    // 结算企业支付宝账号（pay_channel=ALIPAY必填）
    /**
     * @example 结算企业支付宝账号
     *
     * @var string
     */
    public $settleAlipayNo;

    // 绑定支付宝uid（pay_channel=ALIPAY必填）
    /**
     * @example 绑定支付宝uid
     *
     * @var string
     */
    public $bindAlipayUid;

    // 经营范围
    // payChannel =JDPAY必填
    /**
     * @example 经营租赁等业务
     *
     * @var string
     */
    public $businessScope;

    // 开户许可证（payChannel =JDPAY必填）
    //
    /**
     * @example
     *
     * @var FileInfo
     */
    public $bankOpeningLicenseFile;

    // 商户和租赁平台合作协议图片（pay_channel=JDPAY必填）
    //
    /**
     * @example
     *
     * @var FileInfo
     */
    public $cooperationAgreementFile;
    protected $_name = [
        'businessLicenseFile'           => 'business_license_file',
        'businessLicenseCertExpireFlag' => 'business_license_cert_expire_flag',
        'businessLicenseCertEffectDate' => 'business_license_cert_effect_date',
        'businessLicenseCertExpireDate' => 'business_license_cert_expire_date',
        'productMainClass'              => 'product_main_class',
        'companyName'                   => 'company_name',
        'companyAliasName'              => 'company_alias_name',
        'tenantId'                      => 'tenant_id',
        'merchantId'                    => 'merchant_id',
        'merchantType'                  => 'merchant_type',
        'companyMobile'                 => 'company_mobile',
        'companyAddress'                => 'company_address',
        'contactName'                   => 'contact_name',
        'contactMobile'                 => 'contact_mobile',
        'contactAddressProvinceCode'    => 'contact_address_province_code',
        'contactAddressProvinceName'    => 'contact_address_province_name',
        'contactAddressCityCode'        => 'contact_address_city_code',
        'contactAddressCityName'        => 'contact_address_city_name',
        'contactAddressDetail'          => 'contact_address_detail',
        'contactEmail'                  => 'contact_email',
        'bindAlipayNo'                  => 'bind_alipay_no',
        'settleAlipayNo'                => 'settle_alipay_no',
        'bindAlipayUid'                 => 'bind_alipay_uid',
        'businessScope'                 => 'business_scope',
        'bankOpeningLicenseFile'        => 'bank_opening_license_file',
        'cooperationAgreementFile'      => 'cooperation_agreement_file',
    ];

    public function validate()
    {
        Model::validateRequired('businessLicenseFile', $this->businessLicenseFile, true);
        Model::validateRequired('productMainClass', $this->productMainClass, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('companyAliasName', $this->companyAliasName, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactMobile', $this->contactMobile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->businessLicenseFile) {
            $res['business_license_file'] = null !== $this->businessLicenseFile ? $this->businessLicenseFile->toMap() : null;
        }
        if (null !== $this->businessLicenseCertExpireFlag) {
            $res['business_license_cert_expire_flag'] = $this->businessLicenseCertExpireFlag;
        }
        if (null !== $this->businessLicenseCertEffectDate) {
            $res['business_license_cert_effect_date'] = $this->businessLicenseCertEffectDate;
        }
        if (null !== $this->businessLicenseCertExpireDate) {
            $res['business_license_cert_expire_date'] = $this->businessLicenseCertExpireDate;
        }
        if (null !== $this->productMainClass) {
            $res['product_main_class'] = $this->productMainClass;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->companyAliasName) {
            $res['company_alias_name'] = $this->companyAliasName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantType) {
            $res['merchant_type'] = $this->merchantType;
        }
        if (null !== $this->companyMobile) {
            $res['company_mobile'] = $this->companyMobile;
        }
        if (null !== $this->companyAddress) {
            $res['company_address'] = $this->companyAddress;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactMobile) {
            $res['contact_mobile'] = $this->contactMobile;
        }
        if (null !== $this->contactAddressProvinceCode) {
            $res['contact_address_province_code'] = $this->contactAddressProvinceCode;
        }
        if (null !== $this->contactAddressProvinceName) {
            $res['contact_address_province_name'] = $this->contactAddressProvinceName;
        }
        if (null !== $this->contactAddressCityCode) {
            $res['contact_address_city_code'] = $this->contactAddressCityCode;
        }
        if (null !== $this->contactAddressCityName) {
            $res['contact_address_city_name'] = $this->contactAddressCityName;
        }
        if (null !== $this->contactAddressDetail) {
            $res['contact_address_detail'] = $this->contactAddressDetail;
        }
        if (null !== $this->contactEmail) {
            $res['contact_email'] = $this->contactEmail;
        }
        if (null !== $this->bindAlipayNo) {
            $res['bind_alipay_no'] = $this->bindAlipayNo;
        }
        if (null !== $this->settleAlipayNo) {
            $res['settle_alipay_no'] = $this->settleAlipayNo;
        }
        if (null !== $this->bindAlipayUid) {
            $res['bind_alipay_uid'] = $this->bindAlipayUid;
        }
        if (null !== $this->businessScope) {
            $res['business_scope'] = $this->businessScope;
        }
        if (null !== $this->bankOpeningLicenseFile) {
            $res['bank_opening_license_file'] = null !== $this->bankOpeningLicenseFile ? $this->bankOpeningLicenseFile->toMap() : null;
        }
        if (null !== $this->cooperationAgreementFile) {
            $res['cooperation_agreement_file'] = null !== $this->cooperationAgreementFile ? $this->cooperationAgreementFile->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CompanyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['business_license_file'])) {
            $model->businessLicenseFile = FileInfo::fromMap($map['business_license_file']);
        }
        if (isset($map['business_license_cert_expire_flag'])) {
            $model->businessLicenseCertExpireFlag = $map['business_license_cert_expire_flag'];
        }
        if (isset($map['business_license_cert_effect_date'])) {
            $model->businessLicenseCertEffectDate = $map['business_license_cert_effect_date'];
        }
        if (isset($map['business_license_cert_expire_date'])) {
            $model->businessLicenseCertExpireDate = $map['business_license_cert_expire_date'];
        }
        if (isset($map['product_main_class'])) {
            $model->productMainClass = $map['product_main_class'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['company_alias_name'])) {
            $model->companyAliasName = $map['company_alias_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_type'])) {
            $model->merchantType = $map['merchant_type'];
        }
        if (isset($map['company_mobile'])) {
            $model->companyMobile = $map['company_mobile'];
        }
        if (isset($map['company_address'])) {
            $model->companyAddress = $map['company_address'];
        }
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['contact_mobile'])) {
            $model->contactMobile = $map['contact_mobile'];
        }
        if (isset($map['contact_address_province_code'])) {
            $model->contactAddressProvinceCode = $map['contact_address_province_code'];
        }
        if (isset($map['contact_address_province_name'])) {
            $model->contactAddressProvinceName = $map['contact_address_province_name'];
        }
        if (isset($map['contact_address_city_code'])) {
            $model->contactAddressCityCode = $map['contact_address_city_code'];
        }
        if (isset($map['contact_address_city_name'])) {
            $model->contactAddressCityName = $map['contact_address_city_name'];
        }
        if (isset($map['contact_address_detail'])) {
            $model->contactAddressDetail = $map['contact_address_detail'];
        }
        if (isset($map['contact_email'])) {
            $model->contactEmail = $map['contact_email'];
        }
        if (isset($map['bind_alipay_no'])) {
            $model->bindAlipayNo = $map['bind_alipay_no'];
        }
        if (isset($map['settle_alipay_no'])) {
            $model->settleAlipayNo = $map['settle_alipay_no'];
        }
        if (isset($map['bind_alipay_uid'])) {
            $model->bindAlipayUid = $map['bind_alipay_uid'];
        }
        if (isset($map['business_scope'])) {
            $model->businessScope = $map['business_scope'];
        }
        if (isset($map['bank_opening_license_file'])) {
            $model->bankOpeningLicenseFile = FileInfo::fromMap($map['bank_opening_license_file']);
        }
        if (isset($map['cooperation_agreement_file'])) {
            $model->cooperationAgreementFile = FileInfo::fromMap($map['cooperation_agreement_file']);
        }

        return $model;
    }
}
