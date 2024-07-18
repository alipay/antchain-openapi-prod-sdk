<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

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

    // 绑定企业支付宝账号
    /**
     * @example 绑定企业支付宝账号
     *
     * @var string
     */
    public $bindAlipayNo;

    // 结算企业支付宝账号
    /**
     * @example 结算企业支付宝账号
     *
     * @var string
     */
    public $settleAlipayNo;

    // 绑定支付宝uid
    /**
     * @example 绑定支付宝uid
     *
     * @var string
     */
    public $bindAlipayUid;
    protected $_name = [
        'businessLicenseFile' => 'business_license_file',
        'productMainClass'    => 'product_main_class',
        'companyName'         => 'company_name',
        'companyAliasName'    => 'company_alias_name',
        'tenantId'            => 'tenant_id',
        'merchantId'          => 'merchant_id',
        'merchantType'        => 'merchant_type',
        'companyMobile'       => 'company_mobile',
        'companyAddress'      => 'company_address',
        'contactName'         => 'contact_name',
        'contactMobile'       => 'contact_mobile',
        'bindAlipayNo'        => 'bind_alipay_no',
        'settleAlipayNo'      => 'settle_alipay_no',
        'bindAlipayUid'       => 'bind_alipay_uid',
    ];

    public function validate()
    {
        Model::validateRequired('businessLicenseFile', $this->businessLicenseFile, true);
        Model::validateRequired('productMainClass', $this->productMainClass, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('companyAliasName', $this->companyAliasName, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('companyMobile', $this->companyMobile, true);
        Model::validateRequired('companyAddress', $this->companyAddress, true);
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactMobile', $this->contactMobile, true);
        Model::validateRequired('bindAlipayNo', $this->bindAlipayNo, true);
        Model::validateRequired('settleAlipayNo', $this->settleAlipayNo, true);
        Model::validateRequired('bindAlipayUid', $this->bindAlipayUid, true);
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
        if (null !== $this->bindAlipayNo) {
            $res['bind_alipay_no'] = $this->bindAlipayNo;
        }
        if (null !== $this->settleAlipayNo) {
            $res['settle_alipay_no'] = $this->settleAlipayNo;
        }
        if (null !== $this->bindAlipayUid) {
            $res['bind_alipay_uid'] = $this->bindAlipayUid;
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
        if (isset($map['bind_alipay_no'])) {
            $model->bindAlipayNo = $map['bind_alipay_no'];
        }
        if (isset($map['settle_alipay_no'])) {
            $model->settleAlipayNo = $map['settle_alipay_no'];
        }
        if (isset($map['bind_alipay_uid'])) {
            $model->bindAlipayUid = $map['bind_alipay_uid'];
        }

        return $model;
    }
}
