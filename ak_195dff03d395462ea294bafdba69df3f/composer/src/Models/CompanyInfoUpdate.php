<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CompanyInfoUpdate extends Model
{
    // 营业执照文件信息
    /**
     * @example
     *
     * @var FileInfo
     */
    public $businessLicenseFile;

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

    // 商户类型： 01：企业；07：个体工商户 默认不填为01
    /**
     * @example 01
     *
     * @var string
     */
    public $merchantType;
    protected $_name = [
        'businessLicenseFile' => 'business_license_file',
        'productMainClass'    => 'product_main_class',
        'companyName'         => 'company_name',
        'companyAliasName'    => 'company_alias_name',
        'tenantId'            => 'tenant_id',
        'companyMobile'       => 'company_mobile',
        'companyAddress'      => 'company_address',
        'contactName'         => 'contact_name',
        'contactMobile'       => 'contact_mobile',
        'merchantType'        => 'merchant_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->businessLicenseFile) {
            $res['business_license_file'] = null !== $this->businessLicenseFile ? $this->businessLicenseFile->toMap() : null;
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
        if (null !== $this->merchantType) {
            $res['merchant_type'] = $this->merchantType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CompanyInfoUpdate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['business_license_file'])) {
            $model->businessLicenseFile = FileInfo::fromMap($map['business_license_file']);
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
        if (isset($map['merchant_type'])) {
            $model->merchantType = $map['merchant_type'];
        }

        return $model;
    }
}
